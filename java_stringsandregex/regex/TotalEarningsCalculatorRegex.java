package practice.regex;

public class TotalEarningsCalculatorRegex {

  public static void main(String[] args) {

    System.out.println(calculateSalarySum("Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей"));

  }

  public static int calculateSalarySum(String text){


    text = text.replaceAll("[^\\d\\s]", "");
    String res [] = text.split("\\s+");
    int sum = 0;
    for (int i = 1; i < res.length; i++){
      sum += Integer.parseInt(res[i].trim());

    }
    return sum;
  }

}