public class exam {
    public static void main(String[] args) {
/*
        int i,j,n=0;


        int a=0;
        int start=0;
        int end=1;
        int p=0;
            for (i = 0; i < 5; i++) {
                for (j = 5; j >= i; j--) {
                    System.out.print(" ");
                }
                char ch[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O'};
                for (n=start;(n<=a+p)&&(n<ch.length);n++){
                    System.out.print(ch[n]+" ");
                    start=end+i;
                    end=a+end;
                }
                p=start;
                System.out.println(" ");
                a++;
            }
            int a1=4;
            int start1=0;
            int end1=1;
            int p1=0;
        for (i = 1; i < 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            char ch2[]={'P','Q','R','S','T','U','V','X','Y'};
            for (n = start;( n <=a+p1)&&(n<ch2.length); n--) {

                System.out.print(ch2[n]+" ");
                start1=end1+j;
                end1=a1+end1;
            }
            p1=start1;
            System.out.println(" ");
            a1--;
        }

 */
        char ch='A';
        int i,j,n;
        for ( i = 1; i <= 5; i++) {
            for ( j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for ( n=1;n<=i;n++){

                System.out.print(ch++ +" ");
            }
            System.out.println(" ");
        }
        /*

        for (i = 2; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (n = 5; n >= i; n--) {

                System.out.print("* ");
            }
            System.out.println(" ");
        }

         */




    }
}

/*
  for (n =start; n <=i+a; n++) {

                    System.out.print(ch[n]+" ");
                    start=end-start;
                }


                for (n=start;n<=a+i;n++){
                    System.out.print(ch[n]+" ");
                    start=end-start;
                    end=a+i;
                }
 */