import java.util.Scanner;
public class methods_example_prime_no {
    public static void main(String[] args) {

            int k;
            System.out.println("enter the no.");
            Scanner sc = new Scanner(System.in);
            k = sc.nextInt();
            methods_example_prime_no obj = new methods_example_prime_no();
            boolean b=obj.isprime(k);
            System.out.println(b);
            System.out.println("prime no.s 1-500 are ");
            int m, mount,s,i;
            for(s=1;s<=500;s++) {
                m=s;
                mount=0;
                for (i = 1; i <=m; i++) {
                    if (m % i == 0) {
                        mount++;
                }
            }
            if (mount == 2) {
                System.out.print( m+" ,");
            }
        }


        }

            boolean isprime (int k) {
            int count=0;
            for (int i = 1; i <= k; i++) {
                if (k % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                return true;
            }
            else {
                return false;
            }
        }
}
