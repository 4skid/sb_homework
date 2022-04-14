package practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBook myPhoneBook = new PhoneBook();
        System.out.println("Введите номер, имя или команду");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("LIST")) {
                myPhoneBook.getAllContacts();
            }
            if (input.matches(myPhoneBook.NUMBER_VALIDATION)) {
                if (myPhoneBook.phoneBook.containsKey(input)) {
                    System.out.println("Данный номер телефона уже содержится в телефонной книге");
                    System.out.println(myPhoneBook.getContactByPhone(input));
                    continue;
                }
                System.out.println("Введите имя контакта для номера " + input.trim());
                String nameInput = scanner.nextLine();
                myPhoneBook.addContact(input, nameInput);
            }
            if (input.matches(myPhoneBook.NAME_VALIDATION)) {
                String nameInput = input.trim();
                if (myPhoneBook.phoneBook.containsValue(nameInput)) {
                    System.out.println(myPhoneBook.getContactByName(nameInput));
                    System.out.println("Данный контакт уже есть в телефонной книге," +
                            " впишите дополнительный номер телефона:");
                    String keyInput = scanner.nextLine();
                    myPhoneBook.addContact(keyInput, nameInput);
                } else {
                    System.out.println("Контакта с именем " + nameInput +
                            " нет в телефонной книге, введите номер телефона для сохранения");
                    String keyInput = scanner.nextLine();
                    myPhoneBook.addContact(keyInput, nameInput);
                }
            }
        }
    }
}