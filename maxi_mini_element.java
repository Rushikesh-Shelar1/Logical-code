import java.util.Scanner;

public class maxi_mini_element {
    public static void main(String[] args) {
        int b=0, min=0,r=0, smallest=0,smallest_3,largest=0 ;
        Scanner sc = new Scanner(System.in);
        int a[] =new int[5];
        int c[] =new int[5];
        int k[]=new int [25];
        int p[]=new int[25];
        System.out.println("Enter the array elements");
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
            for (int i = 0; i < a.length; i++) {
                for (int y = 0; y < c.length; y++) {
                    k[i] = a[i] - c[y];
                    int absoluteValue = Math.abs(k[i]);
                    k[i] = absoluteValue;// take modulus of k[i] elements
                    if (smallest > k[i]) {
                        smallest = k[i];
                    }
                    p[r] = k[i];
                   r++;
                }
        }

        System.out.println(" ");
        for (int i=0;i<p.length;i++){
            System.out.print(p[i]+" ");
        }


        System.out.println(" ");
        for (int i=0;i<a.length;i++) {
            if (largest < a[i]) {
                largest = a[i];
                //position_1=i+1;
            }
        }
        int largest_1=largest;
        int smallest_2=largest;
        for (int i=0;i<a.length;i++) {
            if (smallest_2 > a[i]) {
                smallest_2 = a[i];
                //position_2=i+1;
            }
        }
        int max =largest_1-smallest_2;
        smallest_3=largest;
        for (int s=0;s<p.length;s++) {
            if (smallest_3 > p[s] && p[s]!=0) {
                smallest_3 = p[s];
            }
        }
        System.out.println(" ");
        System.out.println("smallest difference between the elements in array of no.s is "+smallest_3);
        System.out.println("largest difference between the elements in array of no.s is "+max);
    }
}
