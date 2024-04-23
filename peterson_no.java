import java.util.Scanner;
public class peterson_no {
    public static void main(String[] args) {

        int sum=0;
        int rem;
        System.out.println("enter the no.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int check=n;
        int i;
        while (n>0) {
            rem = n%10;
            int fact=1;
            i=1;
            while (i<=rem) {
                fact = fact * i;
                i++;
            }
            sum = sum + fact;
            n=n/10;
        }
        if (check==sum){
            System.out.println("it is a peterson no");
        }
        else
            System.out.println("it is not an peterson no");
    }
}
