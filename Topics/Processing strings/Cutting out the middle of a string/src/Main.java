import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder output = new StringBuilder();
        if (input.length() % 2 == 0) {
            output.append(input.substring(0, input.length() / 2 - 1));
            output.append(input.substring(input.length() / 2 + 1));
        } else {
            output.append(input.substring(0, input.length() / 2));
            output.append(input.substring(input.length() / 2 + 1));
        }
        System.out.println(output);
    }
}