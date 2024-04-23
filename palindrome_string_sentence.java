import java.util.Scanner;

public class palindrome_string_sentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentence ");
        String sentence = sc.nextLine();
        int len = 0, count = 0;
        String[] strArray = null;
        String[] strArray2 = null;
        strArray = sentence.split(" ");
        strArray2 = sentence.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(" " + strArray[i]);
            len++;
        }
        for (int i = 0; i < strArray.length; i++) {
            StringBuffer sb = new StringBuffer(strArray[i]);
            sb.reverse();
            strArray[i] = sb.toString();
        }

        for (int i = 0; i < len; i++) {

            if (strArray[i].equals(strArray2[i])) {
                count++;
            }
        }
        System.out.println(" ");
        System.out.println(count);
    }
}
