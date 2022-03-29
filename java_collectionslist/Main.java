package practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static TodoList todoList = new TodoList();
    public static void main(String[] args) {
        // TODO: написать консольное приложение для работы со списком дел todoList
        System.out.println("Наберите команду \"HELP\" для просмотра возможных действий");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("STOP")) {
                break;
            }
            if (input.equals("LIST")) {
                todoList.getTodos();
            }
            if (input.matches("ADD\\s[\\D].+")) {
                todoList.add(input.replaceAll("ADD", "").trim());
            }
            if (input.matches("ADD\\s\\d+.+")) {
                Pattern addIndexPat = Pattern.compile("ADD\\s\\d+.");
                Matcher matcher = addIndexPat.matcher(input);
                matcher.find();
                int indexAdd = Integer.parseInt(matcher.group().replaceAll("ADD", "").trim());
                todoList.add(indexAdd, input.replaceAll("^ADD\\s[\\d]+", "").trim());
            }
            if (input.matches("EDIT\\s\\d+.+")) {
                Pattern editIndexPat = Pattern.compile("EDIT\\s\\d+.");
                Matcher matcher = editIndexPat.matcher(input);
                matcher.find();
                int indexEdit = Integer.parseInt(matcher.group().replaceAll("EDIT","").trim());
                todoList.edit(indexEdit, input.replaceAll("^EDIT\\s[\\d]+","").trim());
            }
            if (input.matches("DELETE\\s\\d+")) {
                Pattern deleteIndexPat = Pattern.compile("DELETE\\s\\d+");
                Matcher matcher = deleteIndexPat.matcher(input);
                matcher.find();
                int indexDelete = Integer.parseInt(matcher.group().replaceAll("DELETE","").trim());
                todoList.delete(indexDelete);
            }
        }
    }
}
