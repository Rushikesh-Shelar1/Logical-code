import java.util.Scanner;
public class largest_and_smallest_array {
    public static void main(String[] args) {
        int position_1=0,position_2=0,largest=0;
        Scanner sc = new Scanner(System.in);
        int a[] =new int[10];
        System.out.println("Enter the array elements");
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
        for (int i=0;i<a.length;i++) {
            if (largest < a[i]) {
                largest = a[i];
                position_1=i+1;
            }
        }
        int smallest=largest;
        for (int i=0;i<a.length;i++) {
            if (smallest > a[i]) {
                smallest = a[i];
                position_2=i+1;
            }
        }
        System.out.println("largest no is "+ largest+" at position "+position_1 );
        System.out.println("smallest no is "+ smallest+" at position "+position_2 );

    }
}
