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
            List<Long> number = getNumber(scanner);
            if (number.size() == 1) {
                if (number.get(0) > 0) {
                    showOutput(scanner, number.get(0));
                } else if (number.get(0) == -1) {
                    askAgain = true;
                } else if (number.get(0) == 0) {
                    System.out.println("Goodbye!");
                    askAgain = false;
                }
            } else {
                if (number.get(0) == -1) {
                    askAgain = true;
                } else if (number.get(1) == 1) {
                    showOutput(scanner, number.get(0));
                } else {
                    showOutputForMultipleNumbers(scanner, number);
                }
            }
        }
    }

    private static void showOutputForMultipleNumbers(Scanner scanner, List<Long> number) {

    }

    private static void showOutput(Scanner scanner, long number) {
        boolean[] results = new boolean[5];
        if (calculateParity(number)) {
            results[0] = true;
            results[1] = false;
        } else {
            results[0] = false;
            results[1] = true;
        }
        results[2] = isBuzzNumber(number);
        results[3] = isDuck(number);
        results[4] = isPalindrome(number);

        System.out.println("Properties of " + number);
        System.out.println("\t       even: " + results[0]);
        System.out.println("\t        odd: " + results[1]);
        System.out.println("\t       buzz: " + results[2]);
        System.out.println("\t       duck: " + results[3]);
        System.out.println("\tpalindromic: " + results[4]);
        System.out.println();
    }

    private static boolean isPalindrome(long number) {
        long r, sum = 0, temp;
        int n = 454;//It is the number variable to be checked for palindrome

        temp = number;
        while (number > 0) {
            r = number % 10;  //getting remainder
            sum = (sum * 10) + r;
            number = number / 10;
        }
        return temp == sum;
    }


    private static boolean isDuck(long number) {
        String stringNumber = String.valueOf(number);
        if (stringNumber.startsWith("0") & stringNumber.contains("0")) {
            return true;
        } else if (stringNumber.contains("0")) {
            return true;
        } else if (stringNumber.startsWith("0") & !stringNumber.contains("0")) {
            return false;
        } else {
            return false;
        }
    }

    private static boolean isBuzzNumber(long number) {
        String stringNumber = String.valueOf(number);
        if (number % 7 == 0 & stringNumber.endsWith("7")) {
            return true;
//            System.out.println("It is a Buzz number.");
//            System.out.println("Explanation:");
//            System.out.println(stringNumber + " is divisible by 7 and ends with 7.");
        } else if (number % 7 == 0) {
            return true;
//            System.out.println("It is a Buzz number.");
//            System.out.println("Explanation:");
//            System.out.println(stringNumber + " is divisible by 7.");
        } else if (stringNumber.endsWith("7")) {
            return true;
//            System.out.println("It is a Buzz number.");
//            System.out.println("Explanation:");
//            System.out.println(stringNumber + " ends with 7.");
        } else {
            return false;
//            System.out.println("It is not a Buzz number.");
//            System.out.println("Explanation:");
//            System.out.println(stringNumber + " is neither divisible by 7 nor does it end with 7.");
        }
    }

    private static boolean calculateParity(long number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
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
            }
            List<Long> numbers = new ArrayList<>();
            if (list.get(1) == 1) {
                return list;
            } else {
                numbers.add(list.get(0));
                for (int i = 1; i <= list.get(1) - 1; i++) {
                    numbers.add(list.get(0) + 1);
                }
                return numbers;
            }
        }
    }


}
