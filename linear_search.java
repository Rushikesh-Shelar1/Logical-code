import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        int position=0;
        Scanner tc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int a[] =new int[10];
        System.out.println("Enter the array elements");
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the no you want to search");
        int search=tc.nextInt();
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
        for (int i =0;i<a.length;i++){
            if (search==a[i]){
                position=i+1;
                System.out.println("found at "+position);
               // break;
            }
        }
        int count=0;
        for (int i =0;i<a.length;i++){
            if (a[i]!=search){
                count++;
            }
        }
        if (count==a.length){
            System.out.println("element not found");
        }
    }
}
