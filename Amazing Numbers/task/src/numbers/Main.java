package numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Amazing Numbers!\n");
        System.out.println("Supported requests:\n" +
                "- enter a natural number to know its properties; \n" +
                "- enter two natural numbers to obtain the properties of the list:\n" +
                "  * the first parameter represents a starting number;\n" +
                "  * the second parameter shows how many consecutive numbers are to be printed;\n" +
                "- two natural numbers and a property to search for;\n" +
                "- two natural numbers and two properties to search for;\n" +
                "- separate the parameters with one space;\n" +
                "- enter 0 to exit.\n");
        menu(scanner);
    }

    private static void menu(Scanner scanner) {
        boolean askAgain = true;
        while (askAgain) {
            List<Long> numbers = getNumber(scanner);

            if (numbers.get(0) > 0) {


                if (numbers.size() == 3 && numbers.get(2).toString().matches("[0123456789]")) {

                    switch (numbers.get(2).intValue()) {
                        case 0: {
                            List<Long> evenNumbers = getEvenNumbers(numbers.get(0), numbers.get(1));
                            showOutput(evenNumbers);
                            break;
                        }
                        case 1: {
                            List<Long> oddNumbers = getOddNumbers(numbers.get(0), numbers.get(1));
                            showOutput(oddNumbers);
                            break;
                        }
                        case 2: {
                            List<Long> buzzNumbers = getBuzzNumbers(numbers.get(0), numbers.get(1));
                            showOutput(buzzNumbers);
                            break;
                        }
                        case 3: {
                            List<Long> duckNumbers = getDuckNumbers(numbers.get(0), numbers.get(1));
                            showOutput(duckNumbers);
                            break;
                        }
                        case 4: {
                            List<Long> palindromicNumbers = getPalindromicNumbers(numbers.get(0), numbers.get(1));
                            showOutput(palindromicNumbers);
                            break;
                        }
                        case 5: {
                            List<Long> gapfulNumbers = getGapfulNumbers(numbers.get(0), numbers.get(1));
                            showOutput(gapfulNumbers);
                            break;
                        }
                        case 6: {
                            List<Long> spyNumbers = getSpyNumbers(numbers.get(0), numbers.get(1));
                            showOutput(spyNumbers);
                            break;
                        }
                        case 7: {
                            List<Long> squareNumbers = getSquareNumbers(numbers.get(0), numbers.get(1));
                            showOutput(squareNumbers);
                            break;
                        }
                        case 8: {
                            List<Long> sunnyNumbers = getSunnyNumbers(numbers.get(0), numbers.get(1));
                            showOutput(sunnyNumbers);
                            break;
                        }
                        case 9: {
                            List<Long> jumpingNumbers = getJumpingNumbers(numbers.get(0), numbers.get(1));
                            showOutput(jumpingNumbers);
                            break;
                        }
                    }

                } else if (numbers.size() == 4
                        && numbers.get(2).toString().matches("[0123456789]")
                        && numbers.get(3).toString().matches("[0123456789]")) {


                    switch (numbers.get(2).intValue()) {
                        case 0: {
                            switch (numbers.get(3).intValue()) {
                                case 0:
                                case 1: {
                                    break;
                                }
                                case 2: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            0L,
                                            2L);
                                    showOutput(results);
                                    break;
                                }
                                case 3: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            0L,
                                            3L);
                                    showOutput(results);
                                    break;
                                }
                                case 4: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            0L,
                                            4L);
                                    showOutput(results);
                                    break;
                                }
                                case 5: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            0L,
                                            5);
                                    showOutput(results);
                                    break;
                                }
                                case 6: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            0L,
                                            6L);
                                    showOutput(results);
                                    break;
                                }
                                case 7: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            0L,
                                            7L);
                                    showOutput(results);
                                    break;
                                }
                                case 8: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            0L,
                                            8L);
                                    showOutput(results);
                                    break;
                                }
                            }
                            break;
                        }
                        case 1: {
                            switch (numbers.get(3).intValue()) {
                                case 0:
                                case 1: {
                                    break;
                                }
                                case 2: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            1L,
                                            2L);
                                    showOutput(results);
                                    break;
                                }
                                case 3: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            1L,
                                            3L);
                                    showOutput(results);
                                    break;
                                }
                                case 4: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            1L,
                                            4L);
                                    showOutput(results);
                                    break;
                                }
                                case 5: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            1L,
                                            5);
                                    showOutput(results);
                                    break;
                                }
                                case 6: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            1L,
                                            6L);
                                    showOutput(results);
                                    break;
                                }
                                case 7: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            1L,
                                            7L);
                                    showOutput(results);
                                    break;
                                }
                                case 8: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            1L,
                                            8L);
                                    showOutput(results);
                                    break;
                                }
                            }
                            break;
                        }
                        case 2: {
                            switch (numbers.get(3).intValue()) {
                                case 0: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            2L,
                                            0L);
                                    showOutput(results);
                                    break;
                                }
                                case 1: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            2L,
                                            1L);
                                    showOutput(results);
                                    break;
                                }
                                case 2: {
                                    break;
                                }
                                case 3: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            2L,
                                            3L);
                                    showOutput(results);
                                    break;
                                }
                                case 4: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            2L,
                                            4L);
                                    showOutput(results);
                                    break;
                                }
                                case 5: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            2L,
                                            5);
                                    showOutput(results);
                                    break;
                                }
                                case 6: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            2L,
                                            6L);
                                    showOutput(results);
                                    break;
                                }
                                case 7: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            2L,
                                            7L);
                                    showOutput(results);
                                    break;
                                }
                                case 8: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            2L,
                                            8L);
                                    showOutput(results);
                                    break;
                                }
                            }
                            break;
                        }
                        case 3: {
                            switch (numbers.get(3).intValue()) {
                                case 0: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            3L,
                                            0L);
                                    showOutput(results);
                                    break;
                                }
                                case 1: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            3L,
                                            1L);
                                    showOutput(results);
                                    break;
                                }
                                case 2: {
                                    break;
                                }
                                case 3: {
                                    break;
                                }
                                case 4: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            3L,
                                            4L);
                                    showOutput(results);
                                    break;
                                }
                                case 5: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            3L,
                                            5);
                                    showOutput(results);
                                    break;
                                }
                                case 6: {
                                    break;
                                }
                                case 7: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            3L,
                                            7L);
                                    showOutput(results);
                                    break;
                                }
                                case 8: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            3L,
                                            8L);
                                    showOutput(results);
                                    break;
                                }
                            }
                            break;
                        }
                        case 4: {
                            switch (numbers.get(3).intValue()) {
                                case 0: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            4L,
                                            0L);
                                    showOutput(results);
                                    break;
                                }
                                case 1: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            4L,
                                            1L);
                                    showOutput(results);
                                    break;
                                }
                                case 2: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            4L,
                                            2L);
                                    showOutput(results);
                                    break;
                                }
                                case 3: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            4L,
                                            3L);
                                    showOutput(results);
                                    break;
                                }
                                case 4: {
                                    break;
                                }
                                case 5: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            4L,
                                            5);
                                    showOutput(results);
                                    break;
                                }
                                case 6: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            4L,
                                            6L);
                                    showOutput(results);
                                    break;
                                }
                                case 7: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            4L,
                                            7L);
                                    showOutput(results);
                                    break;
                                }
                                case 8: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            4L,
                                            8L);
                                    showOutput(results);
                                    break;
                                }
                            }
                            break;
                        }
                        case 5: {
                            switch (numbers.get(3).intValue()) {
                                case 0: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            5L,
                                            0L);
                                    showOutput(results);
                                    break;
                                }
                                case 1: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            5L,
                                            1L);
                                    showOutput(results);
                                    break;
                                }
                                case 2: {
                                    break;
                                }
                                case 3: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            5L,
                                            3L);
                                    showOutput(results);
                                    break;
                                }
                                case 4: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            5L,
                                            4L);
                                    showOutput(results);
                                    break;
                                }
                                case 5: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            5L,
                                            5);
                                    showOutput(results);
                                    break;
                                }
                                case 6: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            5L,
                                            6L);
                                    showOutput(results);
                                    break;
                                }
                                case 7: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            5L,
                                            7L);
                                    showOutput(results);
                                    break;
                                }
                                case 8: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            5L,
                                            8L);
                                    showOutput(results);
                                    break;
                                }
                            }
                            break;
                        }
                        case 6: {
                            List<Long> spyNumbers = getSpyNumbers(numbers.get(0), numbers.get(1));
                            switch (numbers.get(3).intValue()) {
                                case 0: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            6L,
                                            0L);
                                    showOutput(results);
                                    break;
                                }
                                case 1: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            6L,
                                            1L);
                                    showOutput(results);
                                    break;
                                }
                                case 2: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            6L,
                                            2L);
                                    showOutput(results);
                                    break;
                                }
                                case 3: {
                                    break;
                                }
                                case 4: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            6L,
                                            4L);
                                    showOutput(results);
                                    break;
                                }
                                case 5: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            6L,
                                            5);
                                    showOutput(results);
                                    break;
                                }
                                case 6: {
                                    break;
                                }
                                case 7: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            6L,
                                            7L);
                                    showOutput(results);
                                    break;
                                }
                                case 8: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            6L,
                                            8L);
                                    showOutput(results);
                                    break;
                                }
                            }
                            break;
                        }
                        case 7: {
                            List<Long> squareNumbers = getSquareNumbers(numbers.get(0), numbers.get(1));
                            switch (numbers.get(3).intValue()) {
                                case 0: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            7L,
                                            0L);
                                    showOutput(results);
                                    break;
                                }
                                case 1: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            7L,
                                            1L);
                                    showOutput(results);
                                    break;
                                }
                                case 2: {
                                    break;
                                }
                                case 3: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            7L,
                                            3L);
                                    showOutput(results);
                                    break;
                                }
                                case 4: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            7L,
                                            4L);
                                    showOutput(results);
                                    break;
                                }
                                case 5: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            7L,
                                            5);
                                    showOutput(results);
                                    break;
                                }
                                case 6: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            7L,
                                            6L);
                                    showOutput(results);
                                    break;
                                }
                                case 7: {
                                    break;
                                }
                                case 8: {
                                    break;
                                }
                            }
                            break;
                        }
                        case 8: {
                            List<Long> sunnyNumbers = getSunnyNumbers(numbers.get(0), numbers.get(1));
                            switch (numbers.get(3).intValue()) {
                                case 0: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            8L,
                                            0L);
                                    showOutput(results);
                                    break;
                                }
                                case 1: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            8L,
                                            1L);
                                    showOutput(results);
                                    break;
                                }
                                case 2: {
                                    break;
                                }
                                case 3: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            8L,
                                            3L);
                                    showOutput(results);
                                    break;
                                }
                                case 4: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            8L,
                                            4L);
                                    showOutput(results);
                                    break;
                                }
                                case 5: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            8L,
                                            5);
                                    showOutput(results);
                                    break;
                                }
                                case 6: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            8L,
                                            6L);
                                    showOutput(results);
                                    break;
                                }
                                case 7: {
                                    break;
                                }
                                case 8: {
                                    break;
                                }
                            }
                            break;
                        }
                        case 9: {
                            List<Long> jumpingNumbers = getJumpingNumbers(numbers.get(0), numbers.get(1));
                            switch (numbers.get(3).intValue()) {
                                case 0: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            9L,
                                            0L);
                                    showOutput(results);
                                    break;
                                }
                                case 1: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            9L,
                                            1L);
                                    showOutput(results);
                                    break;
                                }
                                case 2: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            9L,
                                            2L);
                                    showOutput(results);
                                    break;
                                }
                                case 3: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            9L,
                                            3L);
                                    showOutput(results);
                                    break;
                                }
                                case 4: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            9L,
                                            4L);
                                    showOutput(results);
                                    break;
                                }
                                case 5: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            9L,
                                            5);
                                    showOutput(results);
                                    break;
                                }
                                case 6: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            9L,
                                            6L);
                                    showOutput(results);
                                    break;
                                }
                                case 7: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            9L,
                                            7L);
                                    showOutput(results);
                                    break;
                                }
                                case 8: {
                                    List<Long> results = manageNumbersWithTwoProperty(numbers.get(0), numbers.get(1),
                                            9L,
                                            8L);
                                    showOutput(results);
                                }
                                case 9: {
                                    break;
                                }
                            }
                            break;
                        }
                    }

                } else if (numbers.size() == 1) {

                    showOutput(numbers.get(0));
                } else {
                    showOutput(numbers);
                }
            } else if (numbers.get(0) == -1) {
                askAgain = true;
            } else if (numbers.get(0) == 0) {
                System.out.println("Goodbye!");
                askAgain = false;
            } else if (numbers.get(0) == -2) {
                System.out.println("Supported requests:\n" +
                        "- enter a natural number to know its properties; \n" +
                        "- enter two natural numbers to obtain the properties of the list:\n" +
                        "  * the first parameter represents a starting number;\n" +
                        "  * the second parameter shows how many consecutive numbers are to be printed;\n" +
                        "- two natural numbers and a property to search for;\n" +
                        "- two natural numbers and two properties to search for;\n" +
                        "- separate the parameters with one space;\n" +
                        "- enter 0 to exit.\n");
            }
        }
    }

    private static void showOutput(Long number) {
        boolean palindromeResults = false;
        boolean duckResults = false;
        boolean buzzResults = false;
        boolean parityResults = false;
        boolean gapfulResults = false;
        boolean spyResults = false;
        boolean squareResults = false;
        boolean sunnyResults = false;
        boolean jumpingResults = false;
        parityResults = calculateParity(number);
        buzzResults = isBuzzNumber(number);
        duckResults = isDuck(number);
        palindromeResults = isPalindrome(number);
        gapfulResults = isGapful(number);
        spyResults = isSpy(number);
        squareResults = isSquare(number);
        sunnyResults = isSunny(number);
        jumpingResults = isJumping(number);
        System.out.println(" Properties of " + number);
        System.out.println("\t       even: " + parityResults);
        System.out.println("\t        odd: " + !parityResults);
        System.out.println("\t       buzz: " + buzzResults);
        System.out.println("\t       duck: " + duckResults);
        System.out.println("\tpalindromic: " + palindromeResults);
        System.out.println("\t     gapful: " + gapfulResults);
        System.out.println("\t        spy: " + spyResults);
        System.out.println("\t     square: " + squareResults);
        System.out.println("\t      sunny: " + sunnyResults);
        System.out.println("\t    jumping: " + jumpingResults);
        System.out.println();
    }

    private static void showOutput(List<Long> numbers) {
        List<Boolean> palindromeResults = new ArrayList<>();
        List<Boolean> duckResults = new ArrayList<>();
        List<Boolean> buzzResults = new ArrayList<>();
        List<Boolean> parityResults = new ArrayList<>();
        List<Boolean> gapfulResults = new ArrayList<>();
        List<Boolean> spyResults = new ArrayList<>();
        List<Boolean> squareResults = new ArrayList<>();
        List<Boolean> sunnyResults = new ArrayList<>();
        List<Boolean> jumpingResults = new ArrayList<>();
        parityResults = calculateParity(numbers);
        buzzResults = isBuzzNumber(numbers);
        duckResults = isDuck(numbers);
        palindromeResults = isPalindrome(numbers);
        gapfulResults = isGapful(numbers);
        spyResults = isSpy(numbers);
        squareResults = isSquare(numbers);
        sunnyResults = isSunny(numbers);
        jumpingResults = isJumping(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i)
                    + " is "
                    + (parityResults.get(i) ? "even " : "odd ")
                    + (buzzResults.get(i) ? "buzz " : "")
                    + (duckResults.get(i) ? "duck " : "")
                    + (palindromeResults.get(i) ? "palindromic " : "")
                    + (gapfulResults.get(i) ? "gapful " : "")
                    + (spyResults.get(i) ? "spy " : "")
                    + (squareResults.get(i) ? "square " : "")
                    + (sunnyResults.get(i) ? "sunny" : "")
                    + (jumpingResults.get(i) ? "jumping" : ""));
        }
        System.out.println();
    }

    private static List<Boolean> isJumping(List<Long> numbers) {
        List<Boolean> jumpingResults = new ArrayList<>();
        for (Long element : numbers) {
            long difference = 0;
            boolean flag = true;

            //assigning num to n
            long n = element;
            //execute until the condition becomes false
            while (element != 0) {
                //determines the last digit from the given number
                long digit1 = element % 10;
                //removes the last digit
                element = element / 10;
                //checks if the number is equal to 0 or not
                if (element != 0) {
                    //if the above condition returns true
                    //determines the second last digit from the number
                    long digit2 = element % 10;
                    //subtract the digits and finds the absolute value
                    //after that checks if the difference of two adjacent digit is equal to 1 or not
                    if (Math.abs(digit1 - digit2) != 1) {
                        //if the difference is not equal to 1, set flag to false
                        flag = false;
                        //breaks the execution
                        break;
                    }   //end of if 2nd statement
                }   //end of if 1st statement
            }   //end of while

            jumpingResults.add(flag);
        }
        return jumpingResults;
    }

    private static boolean isJumping(Long number) {
        long difference = 0;
        boolean flag = true;

        //assigning num to n
        long n = number;
        //execute until the condition becomes false
        while (number != 0) {
            //determines the last digit from the given number
            long digit1 = number % 10;
            //removes the last digit
            number = number / 10;
            //checks if the number is equal to 0 or not
            if (number != 0) {
                //if the above condition returns true
                //determines the second last digit from the number
                long digit2 = number % 10;
                //subtract the digits and finds the absolute value
                //after that checks if the difference of two adjacent digit is equal to 1 or not
                if (Math.abs(digit1 - digit2) != 1) {
                    //if the difference is not equal to 1, set flag to false
                    flag = false;
                    //breaks the execution
                    break;
                }   //end of if 2nd statement
            }   //end of if 1st statement
        }   //end of while
        return flag;
    }

    private static List<Long> getJumpingNumbers(long a, long b) {
        List<Long> jumpingNumbers = new ArrayList<>();
        int counter = 0;
        while (counter < b) {
            if (isJumping(a)) {
                jumpingNumbers.add(a);
                counter++;
                a++;
            } else
                a++;
        }
        return jumpingNumbers;
    }

    private static List<Boolean> isSquare(List<Long> numbers) {
        List<Boolean> squareResults = new ArrayList<>();
        for (Long element : numbers) {
            double sqrt = Math.sqrt(element);
            //finds the floor value of the square root and comparing it with zero
            squareResults.add((sqrt - Math.floor(sqrt)) == 0);
        }
        return squareResults;
    }

    private static boolean isSquare(Long number) {
        double sqrt = Math.sqrt(number);
        //finds the floor value of the square root and comparing it with zero
        return ((sqrt - Math.floor(sqrt)) == 0);
    }

    private static List<Long> getSquareNumbers(long a, long b) {
        List<Long> squareNumbers = new ArrayList<>();
        int counter = 0;
        while (counter < b) {
            if (isSquare(a)) {
                squareNumbers.add(a);
                counter++;
                a++;
            } else
                a++;
        }
        return squareNumbers;
    }

    private static List<Long> getSquareNumbers(List<Long> numbers) {
        List<Long> squareResults = new ArrayList<>();
        for (Long element : numbers) {
            if (isSquare(element)) {
                squareResults.add(element);
            }
        }
        return squareResults;
    }

    private static List<Boolean> isSunny(List<Long> numbers) {
        List<Boolean> sunnyNumbers = new ArrayList<>();
        for (Long element : numbers) {
            double sqrt = Math.sqrt(element + 1);
            //finds the floor value of the square root and comparing it with zero
            sunnyNumbers.add((sqrt - Math.floor(sqrt)) == 0);
        }
        return sunnyNumbers;
    }

    private static boolean isSunny(Long number) {
        double sqrt = Math.sqrt(number + 1);
        //finds the floor value of the square root and comparing it with zero
        return ((sqrt - Math.floor(sqrt)) == 0);
    }

    private static List<Long> getSunnyNumbers(long a, long b) {
        List<Long> sunnyNumbers = new ArrayList<>();
        int counter = 0;
        while (counter < b) {
            if (isSunny(a)) {
                sunnyNumbers.add(a);
                counter++;
                a++;
            } else
                a++;
        }
        return sunnyNumbers;
    }

    private static List<Long> getSunnyNumbers(List<Long> numbers) {
        List<Long> sunnyResults = new ArrayList<>();
        for (Long element : numbers) {
            if (isSunny(element)) {
                sunnyResults.add(element);
            }
        }
        return sunnyResults;
    }

    private static List<Boolean> isGapful(List<Long> numbers) {
        List<Boolean> gapfulResults = new ArrayList<>();
        for (Long element : numbers) {
            char firstChar = String.valueOf(element).charAt(0);
            char lastChar = String.valueOf(element).charAt(String.valueOf(element).length() - 1);
            int firstDigit = Integer.parseInt(String.valueOf(firstChar));
            int lastDigit = Integer.parseInt(String.valueOf(lastChar));
            int divider = firstDigit * 10 + lastDigit;
            if (String.valueOf(element).length() >= 3 && element % divider == 0) {
                gapfulResults.add(true);
            } else {
                gapfulResults.add(false);
            }
        }
        return gapfulResults;
    }

    private static boolean isGapful(long number) {
        char firstChar = String.valueOf(number).charAt(0);
        char lastChar = String.valueOf(number).charAt(String.valueOf(number).length() - 1);
        int firstDigit = Integer.parseInt(String.valueOf(firstChar));
        int lastDigit = Integer.parseInt(String.valueOf(lastChar));
        int divider = firstDigit * 10 + lastDigit;
        return (String.valueOf(number).length() >= 3 && number % divider == 0);
    }

    private static List<Long> getGapfulNumbers(long a, long b) {
        List<Long> gapfulNumbers = new ArrayList<>();
        int counter = 0;
        if (b == 1) {
            if (isGapful(a))
                gapfulNumbers.add(a);
        } else {

            while (counter < b) {
                if (isGapful(a)) {
                    gapfulNumbers.add(a);
                    counter++;
                    a++;
                } else
                    a++;
            }
        }
        return gapfulNumbers;
    }

    private static List<Long> getGapfulNumbers(List<Long> numbers) {
        List<Long> gapfulResults = new ArrayList<>();
        for (Long element : numbers) {
            if (isGapful(element)) {
                gapfulResults.add(element);
            }
        }
        return gapfulResults;
    }


    private static List<Boolean> isPalindrome(List<Long> numbers) {
        List<Boolean> results = new ArrayList<>();
        for (Long element : numbers) {
            String original, reverse = "";
            original = String.valueOf(element);
            int length = original.length();
            for (int i = length - 1; i >= 0; i--)
                reverse = reverse + original.charAt(i);
            if (original.equals(reverse))
                results.add(true);
            else
                results.add(false);
        }
        return results;
    }

    private static boolean isPalindrome(long number) {
        String original, reverse = "";
        original = String.valueOf(number);
        int length = original.length();
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);
        return original.equals(reverse);
    }

    private static List<Long> getPalindromicNumbers(long a, long b) {
        List<Long> palindromicNumbers = new ArrayList<>();
        int counter = 0;
        while (counter < b) {
            if (isPalindrome(a)) {
                palindromicNumbers.add(a);
                counter++;
                a++;
            } else
                a++;
        }
        return palindromicNumbers;
    }

    private static List<Long> manageNumbersWithTwoProperty(long a, long b, long firstProperty, long secondProperty) {
        List<Long> resultWithTwoProperties = new ArrayList<>();
        switch ((int) firstProperty) {
            case 0: {
                switch ((int) secondProperty) {
                    case 0:
                    case 1: {
                        break;
                    }
                    case 2: {
                        int counter = 0;
                        while (counter < b) {
                            if (calculateParity(a) && isBuzzNumber(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 3: {
                        int counter = 0;
                        while (counter < b) {
                            if (calculateParity(a) && isDuck(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 4: {
                        int counter = 0;
                        while (counter < b) {
                            if (calculateParity(a) && isPalindrome(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 5: {
                        int counter = 0;
                        while (counter < b) {
                            if (calculateParity(a) && isGapful(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 6: {
                        int counter = 0;
                        while (counter < b) {
                            if (calculateParity(a) && isSpy(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 7: {
                        int counter = 0;
                        while (counter < b) {
                            if (calculateParity(a) && isSquare(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 8: {
                        int counter = 0;
                        while (counter < b) {
                            if (calculateParity(a) && isSunny(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                }
                break;
            }
            case 1: {
                switch ((int) secondProperty) {
                    case 0:
                    case 1: {
                        break;
                    }
                    case 2: {
                        int counter = 0;
                        while (counter < b) {
                            if (!calculateParity(a) && isBuzzNumber(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 3: {
                        int counter = 0;
                        while (counter < b) {
                            if (!calculateParity(a) && isDuck(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 4: {
                        int counter = 0;
                        while (counter < b) {
                            if (!calculateParity(a) && isPalindrome(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 5: {
                        int counter = 0;
                        while (counter < b) {
                            if (!calculateParity(a) && isGapful(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 6: {
                        int counter = 0;
                        while (counter < b) {
                            if (!calculateParity(a) && isSpy(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 7: {
                        int counter = 0;
                        while (counter < b) {
                            if (!calculateParity(a) && isSquare(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 8: {
                        int counter = 0;
                        while (counter < b) {
                            if (!calculateParity(a) && isSunny(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                }
                break;
            }
            case 2: {
                switch ((int) secondProperty) {
                    case 0: {
                        int counter = 0;
                        while (counter < b) {
                            if (isBuzzNumber(a) && calculateParity(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 1: {
                        int counter = 0;
                        while (counter < b) {
                            if (isBuzzNumber(a) && !calculateParity(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 2: {
                        break;
                    }
                    case 3: {
                        int counter = 0;
                        while (counter < b) {
                            if (isBuzzNumber(a) && isDuck(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 4: {
                        int counter = 0;
                        while (counter < b) {
                            if (isBuzzNumber(a) && isPalindrome(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 5: {
                        int counter = 0;
                        while (counter < b) {
                            if (isBuzzNumber(a) && isGapful(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 6: {
                        int counter = 0;
                        while (counter < b) {
                            if (isBuzzNumber(a) && isSpy(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 7: {
                        int counter = 0;
                        while (counter < b) {
                            if (isBuzzNumber(a) && isSquare(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 8: {
                        int counter = 0;
                        while (counter < b) {
                            if (isBuzzNumber(a) && isSunny(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                }
                break;
            }
            case 3: {
                switch ((int) secondProperty) {
                    case 0: {
                        int counter = 0;
                        while (counter < b) {
                            if (isDuck(a) && calculateParity(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 1: {
                        int counter = 0;
                        while (counter < b) {
                            if (isDuck(a) && !calculateParity(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 2: {
                        int counter = 0;
                        while (counter < b) {
                            if (isDuck(a) && isBuzzNumber(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 3: {
                        break;
                    }
                    case 4: {
                        int counter = 0;
                        while (counter < b) {
                            if (isDuck(a) && isPalindrome(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 5: {
                        int counter = 0;
                        while (counter < b) {
                            if (isDuck(a) && isGapful(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 6: {
                        break;
                    }
                    case 7: {
                        int counter = 0;
                        while (counter < b) {
                            if (isDuck(a) && isSquare(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 8: {
                        int counter = 0;
                        while (counter < b) {
                            if (isDuck(a) && isSunny(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                }
                break;
            }
            case 4: {
                switch ((int) secondProperty) {
                    case 0: {
                        int counter = 0;
                        while (counter < b) {
                            if (isPalindrome(a) && calculateParity(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 1: {
                        int counter = 0;
                        while (counter < b) {
                            if (isPalindrome(a) && !calculateParity(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 2: {
                        int counter = 0;
                        while (counter < b) {
                            if (isPalindrome(a) && isBuzzNumber(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 3: {
                        int counter = 0;
                        while (counter < b) {
                            if (isPalindrome(a) && isDuck(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 4: {
                        break;
                    }
                    case 5: {
                        int counter = 0;
                        while (counter < b) {
                            if (isPalindrome(a) && isGapful(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 6: {
                        int counter = 0;
                        while (counter < b) {
                            if (isPalindrome(a) && isSpy(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 7: {
                        int counter = 0;
                        while (counter < b) {
                            if (isPalindrome(a) && isSquare(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 8: {
                        int counter = 0;
                        while (counter < b) {
                            if (isPalindrome(a) && isSunny(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                }
                break;
            }
            case 5: {
                switch ((int) secondProperty) {
                    case 0: {
                        int counter = 0;
                        while (counter < b) {
                            if (isGapful(a) && calculateParity(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 1: {
                        int counter = 0;
                        while (counter < b) {
                            if (isGapful(a) && !calculateParity(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 2: {
                        int counter = 0;
                        while (counter < b) {
                            if (isGapful(a) && isBuzzNumber(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 3: {
                        int counter = 0;
                        while (counter < b) {
                            if (isGapful(a) && isDuck(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 4: {
                        int counter = 0;
                        while (counter < b) {
                            if (isGapful(a) && isPalindrome(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 5: {
                        break;
                    }
                    case 6: {
                        int counter = 0;
                        while (counter < b) {
                            if (isGapful(a) && isSpy(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 7: {
                        int counter = 0;
                        while (counter < b) {
                            if (isGapful(a) && isSquare(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 8: {
                        int counter = 0;
                        while (counter < b) {
                            if (isGapful(a) && isSunny(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                }
                break;
            }
            case 6: {
                switch ((int) secondProperty) {
                    case 0: {
                        int counter = 0;
                        while (counter < b) {
                            if (isSpy(a) && calculateParity(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 1: {
                        int counter = 0;
                        while (counter < b) {
                            if (isSpy(a) && !calculateParity(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 2: {
                        int counter = 0;
                        while (counter < b) {
                            if (isSpy(a) && isBuzzNumber(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 3: {
                        break;
                    }
                    case 4: {
                        int counter = 0;
                        while (counter < b) {
                            if (isSpy(a) && isPalindrome(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 5: {
                        break;
                    }
                    case 6: {
                        int counter = 0;
                        while (counter < b) {
                            if (isSpy(a) && isSpy(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 7: {
                        int counter = 0;
                        while (counter < b) {
                            if (isSpy(a) && isSquare(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 8: {
                        int counter = 0;
                        while (counter < b) {
                            if (isSpy(a) && isSunny(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                }
                break;
            }
            case 7: {
                switch ((int) secondProperty) {
                    case 0: {
                        int counter = 0;
                        while (counter < b) {
                            if (isSquare(a) && calculateParity(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 1: {
                        int counter = 0;
                        while (counter < b) {
                            if (isSquare(a) && !calculateParity(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 2: {
                        int counter = 0;
                        while (counter < b) {
                            if (isSquare(a) && isBuzzNumber(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 3: {
                        int counter = 0;
                        while (counter < b) {
                            if (isSquare(a) && isDuck(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 4: {
                        int counter = 0;
                        while (counter < b) {
                            if (isSquare(a) && isPalindrome(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 5: {
                        break;
                    }
                    case 6: {
                        int counter = 0;
                        while (counter < b) {
                            if (isSquare(a) && isSpy(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 7: {
                        break;
                    }
                    case 8: {
                        break;
                    }
                }
                break;
            }
            case 8: {
                switch ((int) secondProperty) {
                    case 0: {
                        int counter = 0;
                        while (counter < b) {
                            if (isSunny(a) && calculateParity(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 1: {
                        int counter = 0;
                        while (counter < b) {
                            if (isSunny(a) && !calculateParity(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 2: {
                        int counter = 0;
                        while (counter < b) {
                            if (isSunny(a) && isBuzzNumber(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 3: {
                        int counter = 0;
                        while (counter < b) {
                            if (isSunny(a) && isDuck(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 4: {
                        int counter = 0;
                        while (counter < b) {
                            if (isSunny(a) && isPalindrome(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 5: {
                        break;
                    }
                    case 6: {
                        int counter = 0;
                        while (counter < b) {
                            if (isSunny(a) && isSpy(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 7: {
                        break;
                    }
                    case 8: {
                        break;
                    }
                }
                break;
            }
            case 9: {
                switch ((int) secondProperty) {
                    case 0: {
                        int counter = 0;
                        while (counter < b) {
                            if (isJumping(a) && calculateParity(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 1: {
                        int counter = 0;
                        while (counter < b) {
                            if (isJumping(a) && !calculateParity(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 2: {
                        int counter = 0;
                        while (counter < b) {
                            if (isJumping(a) && isBuzzNumber(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 3: {
                        int counter = 0;
                        while (counter < b) {
                            if (isJumping(a) && isDuck(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 4: {
                        int counter = 0;
                        while (counter < b) {
                            if (isJumping(a) && isPalindrome(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 5: {
                        int counter = 0;
                        while (counter < b) {
                            if (isJumping(a) && isGapful(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 6: {
                        int counter = 0;
                        while (counter < b) {
                            if (isJumping(a) && isSpy(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 7: {
                        int counter = 0;
                        while (counter < b) {
                            if (isJumping(a) && isSquare(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 8: {
                        int counter = 0;
                        while (counter < b) {
                            if (isJumping(a) && isSunny(a)) {
                                resultWithTwoProperties.add(a);
                                counter++;
                                a++;
                            } else
                                a++;
                        }
                        return resultWithTwoProperties;
                    }
                    case 9: {
                        break;
                    }
                }
                break;
            }
        }
        return resultWithTwoProperties;
    }

    private static List<Long> getPalindromicNumbers(List<Long> numbers) {
        List<Long> palindromicResults = new ArrayList<>();
        for (Long element : numbers) {
            if (isPalindrome(element)) {
                palindromicResults.add(element);
            }
        }
        return palindromicResults;
    }

    public static List<Boolean> isSpy(List<Long> numbers) {
        List<Boolean> spyResults = new ArrayList<>();
        for (Long element : numbers) {
            long product = 1, sum = 0, lastDigit;
            while (element > 0) {
                //finds the last digit of the number
                lastDigit = element % 10;
                //adds last digit to the variable sum
                sum = sum + lastDigit;
                //calculates the product
                product = product * lastDigit;
                //removes the last digit from the given number
                element = element / 10;
            }
            //compares the sum and product
            if (sum == product) {
                spyResults.add(true);
            } else
                spyResults.add(false);
        }
        return spyResults;
    }

    public static boolean isSpy(long number) {
        long product = 1, sum = 0, lastDigit;

        while (number > 0) {
            //finds the last digit of the number
            lastDigit = number % 10;
            //adds last digit to the variable sum
            sum = sum + lastDigit;
            //calculates the product
            product = product * lastDigit;
            //removes the last digit from the given number
            number = number / 10;
        }
        //compares the sum and product
        return (sum == product);
    }

    private static List<Long> getSpyNumbers(long a, long b) {
        List<Long> spyNumbers = new ArrayList<>();
        int counter = 0;
        while (counter < b) {
            if (isSpy(a)) {
                spyNumbers.add(a);
                counter++;
                a++;
            } else
                a++;
        }
        return spyNumbers;
    }

    private static List<Long> getSpyNumbers(List<Long> numbers) {
        List<Long> spyResults = new ArrayList<>();
        for (Long element : numbers) {
            if (isSpy(element)) {
                spyResults.add(element);
            }
        }
        return spyResults;
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

    private static List<Long> getDuckNumbers(long a, long b) {
        List<Long> duckNumbers = new ArrayList<>();
        int counter = 0;
        while (counter < b) {
            if (isDuck(a)) {
                duckNumbers.add(a);
                counter++;
                a++;
            } else
                a++;
        }
        return duckNumbers;
    }

    private static List<Long> getDuckNumbers(List<Long> numbers) {
        List<Long> duckResults = new ArrayList<>();
        for (Long element : numbers) {
            if (isDuck(element)) {
                duckResults.add(element);
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

    private static boolean isBuzzNumber(long number) {
        String stringNumber = String.valueOf(number);
        if (number % 7 == 0 & stringNumber.endsWith("7")) {
            return true;
        } else if (number % 7 == 0) {
            return true;
        } else return stringNumber.endsWith("7");
    }

    private static List<Long> getBuzzNumbers(long a, long b) {
        List<Long> buzzNumbers = new ArrayList<>();
        int counter = 0;
        while (counter < b) {
            if (isBuzzNumber(a)) {
                buzzNumbers.add(a);
                counter++;
                a++;
            } else
                a++;
        }
        return buzzNumbers;
    }

    private static List<Long> getBuzzNumbers(List<Long> numbers) {
        List<Long> buzzResults = new ArrayList<>();
        for (Long element : numbers) {
            if (isBuzzNumber(element)) {
                buzzResults.add(element);
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

    private static boolean calculateParity(long number) {
        return number % 2 == 0;
    }

    private static List<Long> getEvenNumbers(long a, long b) {
        List<Long> evenNumbers = new ArrayList<>();
        int counter = 0;
        while (counter < b) {
            if (calculateParity(a)) {
                evenNumbers.add(a);
                counter++;
                a++;
            } else
                a++;
        }
        return evenNumbers;
    }

    private static List<Long> getEvenNumbers(List<Long> numbers) {
        List<Long> evenResults = new ArrayList<>();
        for (Long element : numbers) {
            if (calculateParity(element)) {
                evenResults.add(element);
            }
        }
        return evenResults;
    }

    private static List<Long> getOddNumbers(long a, long b) {
        List<Long> oddNumbers = new ArrayList<>();
        int counter = 0;
        while (counter < b) {
            if (!calculateParity(a)) {
                oddNumbers.add(a);
                counter++;
                a++;
            } else
                a++;
        }
        return oddNumbers;
    }

    private static List<Long> getOddNumbers(List<Long> numbers) {
        List<Long> oddResults = new ArrayList<>();
        for (Long element : numbers) {
            if (!calculateParity(element)) {
                oddResults.add(element);
            }
        }
        return oddResults;
    }

    private static List<Long> getNumber(Scanner scanner) {
        System.out.println("Enter a request: ");
        List<Long> list = new ArrayList<>();
        String[] array = scanner.nextLine().split(" ");
        if (array.length == 1) {
            return getNumberPart(list, array);
        }
//            if (array[0].equalsIgnoreCase("")) {
//                list.add(-2L);
//                return list;
//            }
//            try {
//                long l = Long.parseLong(array[0]);
//            } catch (NumberFormatException nfe) {
//                System.out.println();
//                System.out.println("The first parameter should be a natural number or zero.\n");
//                list.add(-1L);
//                return list;
//            }
//            if (Long.parseLong(array[0]) != 0) {
//                list.add(Long.parseLong(array[0]));
//                return list;
//            } else {
//                list.add(0L);
//                return list;
//            }
//        }
        else if (array.length == 2) {
            list = getNumberPart(list, array);
            if (list.size() == 1)
                return list;
            else
                return generateNumberRange(getNumberPart(list, array));

        } else {

        }
        // what if we want to find numbers that have a certain property
        if (array.length >= 3) {
            for (String s : array) {
                if (s.equalsIgnoreCase("")) {
                    list.add(-2L);
                    return list;
                }
            }
            try {
                long l1 = Long.parseLong(array[0]);
            } catch (NumberFormatException nfe) {
                System.out.println();
                System.out.println("The first parameter should be a natural number or zero.\n");
                list.add(-1L);
                return list;
            }
            try {
                long l1 = Long.parseLong(array[1]);
            } catch (NumberFormatException nfe) {
                System.out.println();
                System.out.println("The second parameter should be a natural number.\n");
                list.add(-1L);
                return list;
            }
            if (array.length >= 4) {
                for (int i = 2; i < array.length - 1; i++) {
                    if (!array[i].matches("even|odd|buzz|duck|palindromic|gapful|spy|square|sunny|jumping") &&
                            !array[i].matches("EVEN|ODD|BUZZ|DUCK|PALINDROMIC|GAPFUL|SPY|SQUARE|SUNNY|JUMPING") &&
                            !array[i + 1].matches("even|odd|buzz|duck|palindromic|gapful|spy|square|sunny|jumping") &&
                            !array[i + 1].matches("EVEN|ODD|BUZZ|DUCK|PALINDROMIC|GAPFUL|SPY|SQUARE|SUNNY|JUMPING")) {
                        System.out.println("The properties ["
                                + array[i].toUpperCase()
                                + ", "
                                + array[i + 1].toUpperCase() + "] are wrong.\n" +
                                "Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING]\n");
                        list.add(-1L);
                        return list;
                    }
                    if (array[i].matches("even|odd|buzz|duck|palindromic|gapful|spy|square|sunny|jumping") &&
                            array[i].matches("EVEN|ODD|BUZZ|DUCK|PALINDROMIC|GAPFUL|SPY|SQUARE|SUNNY|JUMPING") ||
                            !array[i + 1].matches("even|odd|buzz|duck|palindromic|gapful|spy|square|sunny|jumping") &&
                                    !array[i + 1].matches("EVEN|ODD|BUZZ|DUCK|PALINDROMIC|GAPFUL|SPY|SQUARE|SUNNY|JUMPING")) {
                        System.out.println("The property [" + String.valueOf(array[i + 1]).toUpperCase() + "] is wrong.\n" +
                                "Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING]\n");
                        list.add(-1L);
                        return list;
                    }
                    if (!array[i].matches("even|odd|buzz|duck|palindromic|gapful|spy|square|sunn|jumping") &&
                            !array[i].matches("EVEN|ODD|BUZZ|DUCK|PALINDROMIC|GAPFUL|SPY|SQUARE|SUNNY|JUMPING") ||
                            array[i + 1].matches("even|odd|buzz|duck|palindromic|gapful|spy|square|sunny|jumping") &&
                                    array[i + 1].matches("EVEN|ODD|BUZZ|DUCK|PALINDROMIC|GAPFUL|SPY|SQUARE|SUNNY|JUMPING")) {
                        System.out.println("The property [" + array[i].toUpperCase() + "] is wrong.\n" +
                                "Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING]\n");
                        list.add(-1L);
                        return list;
                    }
                    if (array[i].matches("even|EVEN") &&
                            array[i + 1].matches("odd|ODD") ||
                            array[i].matches("odd|ODD") &&
                                    array[i + 1].matches("even|EVEN")) {
                        System.out.println("The request contains mutually exclusive properties: ["
                                + array[i].toUpperCase()
                                + ", "
                                + array[i + 1].toUpperCase() + "] \n"
                                + "There are no numbers with these properties.\n");
                        list.add(-1L);
                        return list;
                    }
                    if (array[i].matches("duck|DUCK") &&
                            array[i + 1].matches("spy|SPY") ||
                            array[i].matches("SPY|spy") &&
                                    array[i + 1].matches("duck|DUCK")) {
                        System.out.println("The request contains mutually exclusive properties: ["
                                + array[i].toUpperCase()
                                + ", "
                                + array[i + 1].toUpperCase() + "] \n"
                                + "There are no numbers with these properties.\n");
                        list.add(-1L);
                        return list;
                    }
                    if (array[i].matches("SUNNY|sunny") &&
                            array[i + 1].matches("SQUARE|square") ||
                            array[i].matches("SQUARE|square") &&
                                    array[i + 1].matches("SUNNY|sunny")) {
                        System.out.println("The request contains mutually exclusive properties: ["
                                + array[i].toUpperCase()
                                + ", "
                                + array[i + 1].toUpperCase() + "] \n"
                                + "There are no numbers with these properties.\n");
                        list.add(-1L);
                        return list;
                    }

                }
            } else {
                if (!array[2].matches("even|odd|buzz|duck|palindromic|gapful|spy|square|sunny|jumping") &&
                        !array[2].matches("EVEN|ODD|BUZZ|DUCK|PALINDROMIC|GAPFUL|SPY|SQUARE|SUNNY|JUMPING")) {
                    System.out.println("The property [" + array[2].toUpperCase() + "] is wrong.\n" +
                            "Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING]\n");
                    list.add(-1L);
                    return list;
                }
            }
            if (Long.parseLong(array[0]) != 0 && Long.parseLong(array[1]) != 0) {
                list.add(Long.parseLong(array[0]));
                list.add(Long.parseLong(array[1]));
                switch (array[2].toLowerCase(Locale.ROOT)) {
                    case "even": {
                        list.add(0L);
                        break;
                    }
                    case "odd": {
                        list.add(1L);
                        break;
                    }
                    case "buzz": {
                        list.add(2L);
                        break;
                    }
                    case "duck": {
                        list.add(3L);
                        break;
                    }
                    case "palindromic": {
                        list.add(4L);
                        break;
                    }
                    case "gapful": {
                        list.add(5L);
                        break;
                    }
                    case "spy": {
                        list.add(6L);
                        break;
                    }
                    case "square": {
                        list.add(7L);
                        break;
                    }
                    case "sunny": {
                        list.add(8L);
                        break;
                    }
                    case "jumping": {
                        list.add(9L);
                        break;
                    }
                }
                if (array.length == 4) {

                    switch (array[3].toLowerCase(Locale.ROOT)) {
                        case "even": {
                            list.add(0L);
                            return list;
                        }
                        case "odd": {
                            list.add(1L);
                            return list;
                        }
                        case "buzz": {
                            list.add(2L);
                            return list;
                        }
                        case "duck": {
                            list.add(3L);
                            return list;
                        }
                        case "palindromic": {
                            list.add(4L);
                            return list;
                        }
                        case "gapful": {
                            list.add(5L);
                            return list;
                        }
                        case "spy": {
                            list.add(6L);
                            return list;
                        }
                        case "square": {
                            list.add(7L);
                            return list;
                        }
                        case "sunny": {
                            list.add(8L);
                            return list;
                        }
                        case "jumping": {
                            list.add(9L);
                            return list;
                        }
                    }
                }
            } else {
                list.add(0L);
            }
            return list;

        }
//        for (String element : array) {
//            if (element.equalsIgnoreCase("")) {
//                list.add(-2L);
//                return list;
//            }
//            try {
//                long l = Long.parseLong(element);
//            } catch (NumberFormatException nfe) {
//                System.out.println();
//                System.out.println("The first parameter should be a natural number or zero.\n");
//                list.add(-1L);
//                return list;
//            }
//            if (Long.parseLong(element) != 0) {
//                list.add(Long.parseLong(element));
//            } else {
//                list.add(0L);
//                return list;
//            }
//        }
//        if (list.size() == 1) {
//            if (list.get(0) == 0) {
//                return list;
//            } else if (list.get(0) < 0) {
//                list.clear();
//                System.out.println("The first parameter should be a natural number or zero.\n");
//                list.add(-1L);
//                return list;
//            } else {
//                return list;
//            }
//        }
//        else {
//            if (list.get(1) < 0) {
//                System.out.println("The second parameter should be a natural number.\n");
//                list.clear();
//                list.add(-1L);
//                return list;
//            } else {
//                long length = list.get(1);
//                list.remove(1);
//                if (length == 1) {
//                    list.add(list.get(0) + 1);
//                    return list;
//                }
//                for (long i = 1; i < length; i++) {
//                    list.add(list.get((int) i - 1) + 1);
//                }
//                return list;
//            }
//        }
        return null;
    }

    private static List<Long> generateNumberRange(List<Long> list) {
        long length = list.get(1);
        list.remove(1);
        if (length == 1) {
            list.add(list.get(0) + 1);
            return list;
        }
        for (long i = 1; i < length; i++) {
            list.add(list.get((int) i - 1) + 1);
        }
        return list;
    }

    private static List<Long> getNumberPart(List<Long> list, String[] array) {
        for (String element : array) {
            if (element.equalsIgnoreCase("")) {
                list.add(-2L);
                return list;
            }
            if (array.length == 1) {
                if (isNaturalOrZero(array[0])) {
                    System.out.println();
                    System.out.println("The first parameter should be a natural number or zero.\n");
                    list.add(-1L);
                    return list;
                }
            }
            if (array.length == 2) {
                if (isNaturalOrZero(array[0])) {
                    System.out.println();
                    System.out.println("The first parameter should be a natural number or zero.\n");
                    list.add(-1L);
                    return list;
                }
                if (isNaturalOrZero(array[1])) {
                    System.out.println();
                    System.out.println("The second parameter should be a natural number.\n");
                    list.clear();
                    list.add(-1L);
                    return list;
                }
            }
            if (Long.parseLong(element) != 0) {
                list.add(Long.parseLong(element));
            } else {
                list.add(0L);
                return list;
            }
        }
        return list;
    }

    private static boolean isNaturalOrZero(String str) {
        try {
            long l = Long.parseLong(str);
        } catch (NumberFormatException nfe) {
            return true;
        }
        return Long.parseLong(str) < 0;
    }

}
