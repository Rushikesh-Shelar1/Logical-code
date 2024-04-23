import java.util.Scanner;

public class palindome_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word ");
        String sentence=sc.nextLine();
        StringBuffer sb =new StringBuffer(sentence);
        sb.reverse();
        String str1 =sb.toString();
        if(sentence.equals(str1)){
            System.out.println("it is palindrome");
        }
        else
            System.out.println("not a palindrome");

    }
}
