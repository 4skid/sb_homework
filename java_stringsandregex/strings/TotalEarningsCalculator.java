package practice.strings;

public class TotalEarningsCalculator {

    public static void main(String[] args) {

    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
      String value1 = "ал ";
      int start1 = text.indexOf(value1) + value1.length();
      int end1 = text.indexOf(' ', start1);
      String encoding1 = text.substring(start1, end1);
      int val1 = Integer.parseInt(encoding1);
      String value2 = "я - ";
      int start2 = text.indexOf(value2) + value2.length();
      int end2 = text.indexOf(' ', start2);
      String encoding2 = text.substring(start2, end2);
      int val2 = Integer.parseInt(encoding2);
      String value3 = "а - ";
      int start3 = text.indexOf(value3) + value3.length();
      int end3 = text.indexOf(' ', start3);
      String encoding3 = text.substring(start3, end3);
      int val3 = Integer.parseInt(encoding3);
      System.out.println(val1 + val2 + val3);
  }

}