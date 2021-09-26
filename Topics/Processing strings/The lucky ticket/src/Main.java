import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int firstDigit = Integer.parseInt(input.substring(0, 1));
        int secondDigit = Integer.parseInt(input.substring(1, 2));
        int thirdDigit = Integer.parseInt(input.substring(2, 3));
        int forthDigit = Integer.parseInt(input.substring(3, 4));
        int fifthDigit = Integer.parseInt(input.substring(4, 5));
        int sixthDigit = Integer.parseInt(input.substring(5, 6));
        if (firstDigit + secondDigit + thirdDigit == forthDigit + fifthDigit + sixthDigit) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }

    }
}