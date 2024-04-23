import java.util.Locale;
import java.util.Scanner;

public class pure_method_vowels {
    public static void main(String[] args) {
        pure_method_vowels obj = new pure_method_vowels();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string ");
        String str = sc.nextLine();
        int count = 0;
        str =str.toLowerCase(Locale.ROOT);
        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);
            boolean c = obj.isvowel(ch1);
            if(c==true){
                count++;
            }
        }
        System.out.println("no. of vowels is "+count);
    }

    boolean isvowel(char ch4) {
        boolean b = true;
        boolean c=false;
        char ch5 = ch4;
        if ((ch5 == 'a' || ch5 == 'e' || ch5 == 'i' || ch5 == 'o' || ch5 == 'u')) {
            return b;
        }
        else
        {
            return c;
        }
    }
}
