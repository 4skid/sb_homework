package practice.strings;


import java.util.Scanner;

public class FullNameFormatter {


  public static  char[] digits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

  public static boolean isDigit(char ch) {
    for (char digit : digits) {
      if (ch == digit){
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    String lastName;
    String firstName;
    String middleName;

    Scanner scanner = new Scanner(System.in);
    while (true) {
      int spaceCount = 0;
      boolean readyToPrint = true;
      String input = scanner.nextLine();
      if (input.equals("0")) {
        scanner.close();
        break;
      }

      for(int i = 0; i < input.length(); i++){
        if (isDigit(input.charAt(i))){
          readyToPrint = false;
        }
        if (Character.isSpaceChar(input.charAt(i))){
          spaceCount++;
        }
      }
      if (spaceCount != 2){
        readyToPrint = false;
      }
      if (readyToPrint){
        lastName = input.substring(0, input.indexOf(' '));
        firstName = input.substring(input.indexOf(' '), input.lastIndexOf(' '));
        middleName = input.substring(input.lastIndexOf(' '));
        String fullName = lastName + firstName + middleName;
        StringBuilder sb = new StringBuilder("Фамилия: " + lastName).append("\nИмя:" +
                firstName).append("\nОтчество:" + middleName);
        System.out.println(sb);
      } else {
        System.out.println("Введенная строка не является ФИО");
      }
    }
  }

}