
import java.util.Scanner;
public class Two_2D_array {
    public static void main(String[] args) {

        // array input and printing array

        /*
        Scanner sc = new Scanner(System.in);
        int a[][]=new int [3][3];
        System.out.println("enter the array");
        // taking array input
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }
        // printing array
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println(" ");

        }
        */
        // addition of colums in an matrix

        /*
        Scanner sc = new Scanner(System.in);
        int a[][]=new int [3][3];
        System.out.println("enter the array");
        // taking array input
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }
        // printing array
        for (int i=0;i<3;i++){
            int sum=0;
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+ " ");
                sum =sum+a[i][j];
            }
            System.out.print("=");
            System.out.print(sum);
            System.out.println(" ");
        }*/

        //finding largest and smallest no in an 3*3 matrix


        /*
        Scanner sc = new Scanner(System.in);
        int a[][]=new int [3][3];
        int lr=0,lc=0,sr=0,smc=0;
        int t=Integer.MAX_VALUE;
        int r=Integer.MIN_VALUE;
        System.out.println("enter the array");
        // taking array input
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }
        // printing array
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+ " ");
                if (a[i][j]<t){
                    t=a[i][j];
                    smc=j;
                    sr=i;
                }
                if (a[i][j]>r){
                    r=a[i][j];
                    lr=i;
                    lc=j;
                }
            }
            System.out.println(" ");
        }
        System.out.println("smallest value is "+t+" found at column "+smc+" and row "+sr);
        System.out.println("largest value is "+r+" found at column "+lc+" and row "+lr);

         */


        // transpose matrix
        /*
        Scanner sc = new Scanner(System.in);
        int a[][]=new int [3][3];
        System.out.println("enter the array");
        // taking array input
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }

        // printing array
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println(" ");
        }

        System.out.println("transpose matrix");
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[j][i]+ " ");
            }
            System.out.println(" ");
        } */


        //mirror matrix

        /*
        Scanner sc = new Scanner(System.in);
        int a[][]=new int [3][3];
        System.out.println("enter the array");
        // taking array input
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }

        // printing array
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println(" ");
        }

        System.out.println("mirror matrix");
        for (int i=0;i<3;i++){
            for(int j=2;j>=0;j--){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println(" ");
        }*/
        //to find weather a given matrix is identity matrix
/*
        Scanner sc = new Scanner(System.in);
        int a[][]=new int [3][3];
        System.out.println("enter the array");
        // taking array input
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }

 */


/*
        // printing array
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println(" ");
        }
        int count=0;
        int mount=0;
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(a[i][j]==a[j][i]&&a[i][j]==1){
                    count++;
                }
                 else if(a[i][j]==0){
                    mount++;
                }
            }
        }
        if(count==3&&mount==6){
            System.out.println("it is an identity matrix");
        }
        else
            System.out.println("it is not an identity matrix");

 */
    }
}
