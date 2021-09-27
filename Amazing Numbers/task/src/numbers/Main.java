package numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Amazing Numbers!\n");
        System.out.println("Supported requests:\n" +
                "- enter a natural number to know its properties;\n" +
                "- enter two natural numbers to obtain the properties of the list:\n" +
                "  * the first parameter represents a starting number;\n" +
                "  * the second parameters show how many consecutive numbers are to be processed;\n" +
                "- separate the parameters with one space;\n" +
                "- enter 0 to exit.\n");
        menu(scanner);
    }

    private static void menu(Scanner scanner) {
        boolean askAgain = true;
        while (askAgain) {
            List<Long> numbers = getNumber(scanner);

            if (numbers.get(0) > 0) {
                showOutput(scanner, numbers);
            } else if (numbers.get(0) == -1) {
                askAgain = true;
            } else if (numbers.get(0) == 0) {
                System.out.println("Goodbye!");
                askAgain = false;
            }
        }
    }

    private static void showOutput(Scanner scanner, List<Long> numbers) {
        List<Boolean> palindromeResults = new ArrayList<>();
        List<Boolean> duckResults = new ArrayList<>();
        List<Boolean> buzzResults = new ArrayList<>();
        List<Boolean> parityResults = new ArrayList<>();
        parityResults = calculateParity(numbers);
        buzzResults = isBuzzNumber(numbers);
        duckResults = isDuck(numbers);
        palindromeResults = isPalindrome(numbers);
        if (numbers.size() == 1) {
//            if (calculateParity(numbers)) {
//                results[0] = true;
//                results[1] = false;
//            } else {
//                results[0] = false;
//                results[1] = true;
//            }
            System.out.println("Properties of " + numbers.get(0));
            System.out.println("\t       even: " + parityResults.get(0));
            System.out.println("\t        odd: " + !parityResults.get(0));
            System.out.println("\t       buzz: " + buzzResults.get(0));
            System.out.println("\t       duck: " + duckResults.get(0));
            System.out.println("\tpalindromic: " + palindromeResults.get(0));
            System.out.println();
        } else {
            for (int i = 0; i < numbers.size(); i++) {
                System.out.println(numbers.get(i)
                        + " "
                        + (parityResults.get(i) ? "even " : "odd ")
                        + (buzzResults.get(i) ? "buzz " : "")
                        + (duckResults.get(i) ? "duck " : "")
                        + (palindromeResults.get(i) ? "palindrome " : "") + "\n");

            }
        }
    }

    private static List<Boolean> isGapful(List<Long> numbers) {

    }

    private static List<Boolean> isPalindrome(List<Long> numbers) {
        long r, sum = 0, temp;
        int n = 454;//It is the number variable to be checked for palindrome
        List<Boolean> results = new ArrayList<>();
        for (Long element : numbers) {
            temp = element;
            while (element > 0) {
                r = element % 10;  //getting remainder
                sum = (sum * 10) + r;
                element = element / 10;
            }
            results.add(temp == sum);
        }
        return results;
    }


    private static List<Boolean> isDuck(List<Long> numbers) {
        List<Boolean> duckResults = new ArrayList<>();
        for (Long element : numbers) {
            String stringNumber = String.valueOf(element);
            if (stringNumber.startsWith("0") & stringNumber.contains("0")) {
                duckResults.add(true);
            } else if (stringNumber.contains("0")) {
                duckResults.add(true);
            } else if (stringNumber.startsWith("0") & !stringNumber.contains("0")) {
                duckResults.add(false);
            } else {
                duckResults.add(false);
            }
        }
        return duckResults;
    }

    private static List<Boolean> isBuzzNumber(List<Long> numbers) {
        List<Boolean> buzzResults = new ArrayList<>();
        for (Long element : numbers) {
            String stringNumber = String.valueOf(element);
            if (element % 7 == 0 & stringNumber.endsWith("7")) {
                buzzResults.add(true);
            } else if (element % 7 == 0) {
                buzzResults.add(true);
            } else if (stringNumber.endsWith("7")) {
                buzzResults.add(true);
            } else {
                buzzResults.add(false);
            }
        }
        return buzzResults;
    }

    private static List<Boolean> calculateParity(List<Long> numbers) {
        List<Boolean> parityResults = new ArrayList<>();
        for (Long element : numbers) {
            if (element % 2 == 0) {
                parityResults.add(true);
            } else {
                parityResults.add(false);
            }
        }
        return parityResults;
    }

    private static List<Long> getNumber(Scanner scanner) {
        System.out.println("Enter a request: ");
        List<Long> list = new ArrayList<>();
        String[] array = scanner.nextLine().split(" ");
        for (String element : array) {
            if (element.equalsIgnoreCase("")) {
                list.add(-1L);
                return list;
            } else if (Long.parseLong(element) != 0) {
                list.add(Long.parseLong(element));
            } else {
                list.add(0L);
                return list;
            }
        }
        if (list.size() == 1) {
            if (list.get(0) == 0) {
                return list;
            } else if (list.get(0) < 0) {
                list.clear();
                System.out.println("The first parameter should be a natural number or zero.\n");
                list.add(-1L);
                return list;
            } else {
                return list;
            }
        } else {
            if (list.get(1) < 0) {
                System.out.println("The second parameter shows how many consecutive numbers");
                list.clear();
                list.add(-1L);
                return list;
            } else {
                long length = list.get(1);
                list.remove(1);
                for (long i = 1; i < length; i++) {
                    list.add(list.get((int) i - 1) + 1);
                }
                return list;
            }
        }
    }
}
