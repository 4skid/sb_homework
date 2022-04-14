package practice;

import java.util.*;

public class PhoneBook {
    public final String NUMBER_VALIDATION = "[0-9]+";
    public final String NAME_VALIDATION = "^[а-яА-Я\\s]+";

    HashMap<String, String> phoneBook = new HashMap<>();

    public void addContact(String phone, String name) {
        if (phone.matches(NUMBER_VALIDATION) && name.matches(NAME_VALIDATION)) {
                phoneBook.put(phone, name);
                System.out.println("Контакт " + name + " сохранен");
        } else {
            System.out.println("Передан неверный формат телефонного номера");
        }
    }

    public String getContactByPhone(String phone) {
        String res = "";
        if (phoneBook.containsKey(phone)) {
            res = phoneBook.get(phone) + " - " + phone;
        }
        return res;
    }

    public Set<String> getContactByName(String name) {
        TreeSet<String> phonesByName = new TreeSet<>();
        boolean countPhones = false;
        String resultSearch = "";
        if (phoneBook.values().contains(name)) {
            for (String key : phoneBook.keySet()) {
                if (phoneBook.get(key).contains(name)) {
                    if (countPhones) {
                        resultSearch += ", " + key;
                        continue;
                    }
                    resultSearch += phoneBook.get(key) + " - " + key;
                    countPhones = true;
                }
            }
            phonesByName.add(resultSearch);
        }
        return phonesByName;
    }

    public Set<String> getAllContacts() {
        TreeSet<String> allContacts = new TreeSet<>();
        if (!phoneBook.isEmpty()) {
            for (String key : phoneBook.keySet()) {
                if (Collections.frequency(phoneBook.values(), phoneBook.get(key)) > 1) {
                    allContacts.addAll(getContactByName(phoneBook.get(key)));
                } else {
                    allContacts.add(phoneBook.get(key) + " - " + key);
                }
            }

        }
        return allContacts;
    }
}