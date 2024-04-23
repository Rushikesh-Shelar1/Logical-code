import java.util.Scanner;
public class denomination_split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] ={500,200,100,50,20,10,5,2,1};
        int rem=0,rem_1,sum=0,total;
        System.out.println("Available denominations ");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
        System.out.println("Enter the money");
        int m=sc.nextInt();
        for (int i=0;i<a.length;i++) {

            do{
                rem = m / a[i];
                sum = rem * a[i];
                rem_1 = m % a[i];
                total = m - sum;
                m = total;
                if(sum!=0){
                    System.out.println(a[i] + "*" + rem + "=" + sum);
                }

            }while ( rem!=0);
        }
    }
}
