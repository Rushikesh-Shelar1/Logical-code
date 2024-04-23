import java.util.Scanner;

public class similar_elements_in_2_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][]=new int [3][3];
        int c[][]=new int [3][3];
        int p[]=new int[9];
        int t[];// dynamic creation of array
        int r=0, count=0;
        System.out.println("Enter the 1st array elements");
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the 2nd array elements");
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(c[i][j]+ " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println(" ");
        }


        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                for(int k=0;k<c.length;k++) {
                    for (int l = 0; l < c.length; l++) {
                        if (a[i][j] == c[k][l]) {
                            p[r] = a[i][j];
                            r++;
                        }
                        else
                            count++;
                    }
                }
            }
        }
        t=new int[r];//dynamic creation of array
        for (int i = 0; i < r; i++) {
            t[i] = p[i];
        }
        if(count==0) {
            System.out.println("similar element is/are ");
            for (int i = 0; i < t.length; i++) {

                System.out.print(t[i] + " ");
            }
        }
        else
            System.out.println("No similar elements found in two matrix");
    }
}
