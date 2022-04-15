package practice;

import java.util.*;

public class CoolNumbers {

    private static final String LETTERS = "АВЕКМНОРСТУХ";

    public static List<String> generateCoolNumbers() {
        List<String> coolNumbers = new ArrayList<>();

        for (int x = 0; x < LETTERS.length(); x++) {
            for (int n = 0; n < 10; n++) {
                for (int y = 0; y < LETTERS.length(); y++) {
                    for (int z = 0; z < LETTERS.length(); z++) {
                        for (int region = 1; region < 200; region++) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(LETTERS.charAt(x));
                            sb.append(n).append(n).append(n);
                            sb.append(LETTERS.charAt(y));
                            sb.append(LETTERS.charAt(z));
                            if (region < 10) {
                                sb.append(0).append(region);
                            } else {
                                sb.append(region);
                            }
                            coolNumbers.add(sb.toString());
                        }
                    }
                }
            }
        }

        return coolNumbers;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        List<String> coolNumbers = new ArrayList<>(list);
        boolean isFind = false;
        for (String coolNumber : coolNumbers) {
            if (coolNumber.equals(number)){
                isFind = true;
                break;
            }
        }
        return isFind;
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        int i = Collections.binarySearch(sortedList,number);
        boolean isFind = false;

        if (i >= 0){
            isFind = true;
        }
        return isFind;
    }

    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        return hashSet.contains(number);
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        return treeSet.contains(number);
    }

}
