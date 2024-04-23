import java.util.Scanner;

public class binary_search {
    public static void main(String[] args) {
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
        System.out.println("enter the no.s you want to search");
        int search=sc.nextInt();
        int l=0,u=9,mid=0,count=0;
        while (l<=u){
            mid=(l+u)/2;
            if(search>a[mid]){
                l=mid+1;
            }
            else if (search<a[mid]) {
                u=mid-1;
            }
            else {
                count++;
                break;
            }
        }
       if(count==1){
           System.out.println("search no.s found "+search+" found at "+(mid+1));
       }
       else
           System.out.println("search no.s not found");
    }
}
