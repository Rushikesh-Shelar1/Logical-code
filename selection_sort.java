import java.util.Scanner;

public class selection_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] =new int[5];
        int temp=0;
        System.out.println("Enter the array elements");
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){  // for desending order change the sign to '<'
                   temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
        //System.out.println("third shortest no is "+a[2]);
        //System.out.println("third largest no is "+a[7]);
    }
}
