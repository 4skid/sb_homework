package practice.regex;

import java.util.Scanner;

public class PhoneCleanerRegex {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                scanner.close();
                break;
            }
            String phoneNumber = input.replaceAll("[\\+\\-()\\s]", "");
            if (!phoneNumber.matches("^(8|7)\\d{10}|^9\\d{9}")) {
                System.out.println("Неверный формат номера");
                continue;
            }
            if (phoneNumber.matches("^8\\d{10}")) {
                phoneNumber = phoneNumber.replaceFirst("8", "7");
            }
            if (phoneNumber.matches("^9\\d{9}")) {
                System.out.println("7" + phoneNumber);
            } else {
                System.out.println(phoneNumber);
            }

        }
    }
}
