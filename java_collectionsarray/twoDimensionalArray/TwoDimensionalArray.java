package practice.twoDimensionalArray;

public class TwoDimensionalArray {

    public static final char SYMBOL = 'X';

    public static char[][] getTwoDimensionalArray(int size) {

        char [][] cross = new char[size][size];
        for (int i = 0; i < cross.length; i++){
            for (int j = 0; j < cross[i].length; j++ ) {
                cross[i][j] = (i == j || j == cross.length - 1 - i) ? SYMBOL : ' ';
                System.out.print(cross[i][j]);
            }
            System.out.println();
        }
        return cross;
    }
}
