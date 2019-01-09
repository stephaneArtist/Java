package exercice;

import java.util.ArrayList;
import java.lang.String;

public class exercice4 {

    public static void main(String[] args) {

        ArrayList alphabet = new ArrayList();
        alphabet.add('a');
        alphabet.add('b');
        alphabet.add('c');
        alphabet.add('d');
        alphabet.add('e');

        String[] string = {"debacbedabceb"};
        String leftRotate = "abcdef";
        String rightRotate = "ghijkl";

        /*System.out.println("IS FORMED\n");
        isFormed(alphabet, string);*/

        System.out.println("\nLEFT ROTATE");
        leftRotate(2, leftRotate);
        System.out.println("\nRIGHT ROTATE");
        rightRotate(2, rightRotate);

    }

    public static void isFormed(ArrayList alphabet, String[] string) {

        for (int i = 0; i < string.length; i++) {
            for (int j = 0; j < alphabet.size(); j++) {
                if (string[i] != alphabet.get(j)) {
                    System.out.println("String have wrong formation");
                }
            }
        }

    }

    public static void leftRotate(int N, String leftRotate) {
        System.out.println("START : " + leftRotate);
        System.out.println("END : " + leftRotate.substring(N, leftRotate.length()) + leftRotate.substring(0, N));
    }

    public static void rightRotate(int N, String rightRotate) {
        System.out.println("START : " + rightRotate);
        System.out.println("END : " + rightRotate.substring(rightRotate.length() - N, rightRotate.length()) + rightRotate.substring(0, rightRotate.length() - N));
    }


}
