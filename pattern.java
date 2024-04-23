public class pattern {
    public static void main(String[] args) {

                int i, j, k = 0,m,n=1, sum=1,p=0;

        /*

        *  *  *  *  *
        *  *  *  *  *
        *  *  *  *  *
        *  *  *  *  *
        *  *  *  *  *


        for (i=1;i<=5;i++)
        {
            for (j=1;j<=5;j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }*/

        /*
        1
        12
        123
        1234
        12345

        for (i=1;i<=5;i++)
        {
            for (j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }*/

        /*
        5
        54
        543
        5432
        54321

        for (i=5;i>=1;i--)
        {
            for (j=5;j>=i;j--){
                System.out.print(j);
            }
            System.out.println(" ");
        }*/

        /*


         1
         ??
         123
         ????
         12345



        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                if (i % 2 != 0) {
                    System.out.print(j);
                } else {
                    System.out.print("?");
                }
            }
            System.out.println(" ");

        }*/

        /*
        0
        k k
        0 5 10
        k k k k
        0 5 10 15 20

        for (i = 1; i <= 5; i++) {
            k=0;
            for (j = 1; j <= i; j++) {
                if (i%2!=0){
                    System.out.print(k + " ");
                    k = k + 5;
                }
                else {
                    System.out.print("k ");
                }
            }
            System.out.println(" ");

        }*/


/*

         *  *  *  *  *
         *  *  *  *
         *  *  *
         *  *
         *

        for(i=5;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }*/

        /*
        for(i=5;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print("  ");
            }
            System.out.println("*");
        }

        /*
                 *
                **
               ***
              ****
             *****

            for (i = 1; i <= 5; i++) {
                for (j = 5; j >= i; j--) {
                    System.out.print(" ");
                }
                for (n=1;n<=i;n++){
                    System.out.print("*");

                }
                System.out.println(" ");
            }

        /*
        1
        12
        123
        1234
        12345
        1234
        123
        12
        1

        for(i=1;i<=5;i++){
            for (j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
        for (i=4;i>=1;i--){
            for (j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        } */



        /*

     *
    **
   ****
  ******
 ********




        for (i = 1; i <= 5; i++) {
            for (j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            if(n==1){
                for (n=1;n<=i;n++) {
                    System.out.print("*");
                }
            }
            else {
                for (n = 2; n <= i; n++) {
                    System.out.print("*");
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }*/

/*
 **********
  ********
   ******
    ****
     **


        for (i = 5; i >= 1; i--) {
            for (j = 5; j >= i; j--) {
                System.out.print(" ");
            }

                for (n = 1; n <= i; n++) {
                    System.out.print("*");
                    System.out.print("*");
                }
            System.out.println(" ");
        }

 */

        /*
        1
        12
        123
        1234
        12345


        for (i = 1; i <= 5; i++) {
            for (j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (n=1;n<=i;n++){
                System.out.print(n);

            }
            System.out.println(" ");
        }*/


        /*
        5
        54
        543
        5432
        54321

        for (i = 5; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (n=5;n>=i;n--){
                System.out.print(n);

            }
            System.out.println(" ");
        }*/


        /*

        2
        4 6
        8 10 12
        14 16 18 20
        22 24 26 28 30
        32 34 36 38 40 42

        */

        /*
        for (i = 0; i <= 5; i++) {
            for (j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (n=0;n<=i;n++){
                p=p+2;
                System.out.print(p+" ");

            }
            System.out.println(" ");
        }
        */
/*
        1
        01
        101
        0101
        10101


        for (i=1;i<=5;i++)
        {
            for (j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");

                }
                else{
                    System.out.print("0");

                }
            }
            System.out.println(" ");
        }*/
/*
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1

        for (i = 1; i <= 5; i++) {
            for (j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (n=1;n<=i;n++){
                if ((i+n)%2==0) {
                    System.out.print("1 ");
                }
                else
                    System.out.print("0 ");

            }
            System.out.println(" ");
        }*/


        /*

     *
    * *
   * * *
  * * * *
 * * * * *
  * * * *
   * * *
    * *
     *
        for (i = 1; i <= 5; i++) {
            for (j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (n=1;n<=i;n++){

                    System.out.print("* ");
            }
            System.out.println(" ");
        }
        for (i = 2; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (n = 5; n >= i; n--) {

                System.out.print("* ");
            }
            System.out.println(" ");
        }*/

    }
}
