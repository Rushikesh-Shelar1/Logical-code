import java.util.Scanner;

public class palindrome_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] =new int[10];
        int c[] =new int[10];
        int rem,n,temp, r=0, count=0;
        int t[];

        System.out.println("Enter the array elements");
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        System.out.println(" ");
        for (int i=0;i<a.length;i++) {
            n=a[i];
            temp=n;
            int sum=0;
            while (n> 0) {
                rem = n % 10;
                sum = (sum * 10) + rem;
                n = n / 10;

            }
                if (temp == sum) {
                    c[r]=sum;
                    r++;
                    }
                else
                    count++;
                }
        t=new int[r];//dynamic creation of array
        for (int i = 0; i < r; i++) {
            t[i] = c[i];
        }
        if(count==0) {
            System.out.println("palindrome no.s in an array are:");
            for (int i = 0; i < t.length; i++) {
                System.out.print(t[i] + " ");
            }
        }
        else
            System.out.println("no elements found to be palindrome no.");
    }
}
