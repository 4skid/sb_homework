package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    /*
    TODO:
     - реализовать методы класса CoolNumbers
     - посчитать время поиска введимого номера в консоль в каждой из структуры данных
     - проанализоровать полученные данные
     */

    public static void main(String[] args) {

        ArrayList<String> coolNumbers = new ArrayList<>(CoolNumbers.generateCoolNumbers());
        System.out.println("Введите номер для поиска");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        long t1 = System.nanoTime();
        CoolNumbers.bruteForceSearchInList(coolNumbers, input);
        long t11 = System.nanoTime();
        long t2 = System.nanoTime();
        boolean binarySearch = CoolNumbers.binarySearchInList(coolNumbers, input);
        long t22 = System.nanoTime();
        HashSet<String> coolHashSet = new HashSet<>(coolNumbers);
        long t3 = System.nanoTime();
        CoolNumbers.searchInHashSet(coolHashSet, input);
        long t33 = System.nanoTime();
        TreeSet<String> coolTreeSet = new TreeSet<>(coolNumbers);
        long t4  = System.nanoTime();
        CoolNumbers.searchInTreeSet(coolTreeSet, input);
        long t44 = System.nanoTime();

        if(binarySearch){
            System.out.println("Поиск перебором: номер найден, , поиск занял: " + (t11 - t1) + " нс");
            System.out.println("Бинарный поиск: номер найден, , поиск занял: " + (t22 - t2) + " нс");
            System.out.println("Поиск в HashSet: номер найден, , поиск занял: " + (t33 - t3) + " нс");
            System.out.println("Поиск в TreeSet: номер найден, , поиск занял: " + (t44 - t4) + " нс");
        } else {
            System.out.println("Поиск перебором: не номер найден, , поиск занял: " + (t11 - t1) + " нс");
            System.out.println("Бинарный поиск: не номер найден, , поиск занял: " + (t22 - t2) + " нс");
            System.out.println("Поиск в HashSet: не номер найден, , поиск занял: " + (t33 - t3) + " нс");
            System.out.println("Поиск в TreeSet: не номер найден, , поиск занял: " + (t44 - t4) + " нс");
        }
    }
}
