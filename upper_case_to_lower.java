import java.sql.SQLOutput;
import java.util.Scanner;

public class upper_case_to_lower {
    public static void main(String[] args) {

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string ");
        String str=sc.nextLine();

        for (int i=0;i<str.length();i++) {
            char ch1 = str.charAt(i);
            if (ch1 >= 'A' && ch1 <= 'Z') {
                int d = ch1 +32;
                char y = (char) d;
                System.out.print(y);
            }
            else {
                int d = ch1 -32;
                char y = (char) d;
                System.out.print(y);
            }
        }*/

        //convert (Zba5cy) into (Bdc5ea) using ASCII CODE

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string ");
        String str=sc.nextLine();

        for (int i=0;i<str.length();i++) {
            char ch1 = str.charAt(i);// to access individual elements of a string
            if (ch1 >= 'a' && ch1 <= 'x'||ch1 >= 'A' && ch1 <= 'X') {
                int d = ch1 +2;//type casting char value into integer
                char y = (char) d;
                System.out.print(y);
            } else if (ch1>'x'&&ch1<='z' ||ch1>'X'&&ch1<='Z') {
                int d = ch1 -24;
                char y = (char) d;
                System.out.print(y);
            } else if (ch1>='0'&&ch1<='9') {
                int d = ch1;
                char y = (char) d;
                System.out.print(y);
            }
        }


    }
}


