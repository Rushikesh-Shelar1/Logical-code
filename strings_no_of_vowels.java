import java.util.Scanner;

public class strings_no_of_vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string ");
        String str=sc.nextLine();
        char ch[]={'a','e','i','o','u'};
        int count=0,r=0;
        for (int i=0;i<str.length();i++) {
            int mount=0;
            for (int j = 0; j < ch.length; j++) {
                char ch1 = str.charAt(i);
                char ch2 = ch1;
                if (ch2 == ch[j]) {
                    count++;
                }
                else {
                    mount++;
                    r=mount-1;
                }
            }
        }
        if(count!=0) {
            System.out.println("the no of vowels and consonents are " + count +", "+ r);
        }
        else
            System.out.println("no vowels present only consonents "+r);
    }
}
