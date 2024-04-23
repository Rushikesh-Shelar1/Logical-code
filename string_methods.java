import java.util.Scanner;

public class string_methods {
    public static void main(String[] args) {

        //substring
        /*
        String str="CyberSuccess";
        String s1=str.substring(5);
        System.out.println(s1);
        String s2=str.substring(5,9);
        System.out.println(s2);

        */

        //PIGLATIN CONVERFSION


        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string ");
        String str=sc.nextLine();
        String s1="",s2="";
        for (int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                s1 = str.substring(i);
                break;
            }
             else {
                s2 = s2 + ch;
            }
        }
        String s3=s1+s2;
        System.out.println(s3+"ay");

        */
        //Convert Rushikesh Shelar to ( Mr. R. Shelar)
        /*


        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name ");
        String str=sc.nextLine();
        String s1="",s2="";
        char ch=' ',ch1=' ';
        for (int i=0;i<str.length();i++){
            ch = str.charAt(i);
            ch1=str.charAt(0);
            if (ch==' '){
                s1 = str.substring(i);
                break;
            }
        }
        System.out.println("Mr. "+ch1+"."+s1);

        */

        // similar code as above using indexOf method
        /*
        String str="Rushikesh Shelar";
        int i=str.indexOf(' ');
        String s1=str.substring(i);
        System.out.println("Mr. "+str.charAt(0)+"."+s1);
        */



        /*
        String str="success";
        int i =str.indexOf('s',3);
        System.out.println(i);

         */



        /*


        //convert chinnaswamy muthushwamy venugopal iyer to (Mr.c. m. v. iyer)


        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name ");
        String name=sc.nextLine();
        int i;
        String abbr=name.charAt(0)+". ";
        int first=name.indexOf(' ');
        int last=name.lastIndexOf(' ');
        for(i=first+1;i<last;){
            abbr=abbr + name.charAt(i)+". ";
            int d=name.indexOf(' ',i);
            i=d+1;
        }
        abbr=abbr+name.substring(last+1);
        System.out.println("Mr."+abbr);
         */
        //trim() method
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name ");
        String name=sc.nextLine();
        System.out.println(name.trim());

         */
        //equals() ,equalsIgnoreCase() method

        /*
        Scanner sc = new Scanner(System.in);
        String s1="hello";
        String s2="Hello";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

         */
        //concat() method

        /*
        Scanner sc = new Scanner(System.in);
        String s1="hello";
        String s2=" world";
        System.out.println(s1.concat(s2));

         */

        // endswith() method

        /*
        Scanner sc = new Scanner(System.in);
        String s1="hello welcome to cyber success";
        System.out.println(s1.endsWith("success"));
        System.out.println(s1.startsWith("success"));

         */

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name ");
        String name=sc.nextLine();
        String s1="an",s2="and",s3="",s4="";
        String abbr=name.charAt(0)+". ";
        String[] stringArray2 = new String[10];
        int first=name.lastIndexOf(' ');
        int last=name.lastIndexOf(' ');
        int i=0;
        char ch=' ',ch1=' ';
        for( i=0;i<=last;i++){
            int r=0;
            ch = name.charAt(i);
            if (ch==' '){
                s3=name.substring(i);
                System.out.println(s3);
                name=s3;
                break;
            }
            s4=name.substring(1,' ');
            System.out.println(s4);

           /* ch = name.charAt(i);
            int count=0;
            int mount=0;
            if(s1.equals(name))
                count++;
            else if(s2.equals(name))
                mount++;
            i=ch;
            */
        // contains() method

        /*

        String sentence="hello, welcome to cyber success";
        System.out.println(sentence.contains("welcome to cyber"));

         */
        //join () method

        /*

        String time=String.join(":","welcome","to","India");
        System.out.println(time);

         */

        //replace () method

        /*
        String str="Chinaswamy Muthuswami Venugopal Iyer";
        String name = str.replace("Iyer","Chidambarum");
        System.out.println(name);

         */

        // valueof() method used for converting any data type into string data type

        /*
        int a=10,b=20;
        int sum=a+b;
        System.out.println(sum);
        String s1=String.valueOf(a);
        String s2=String.valueOf(b);
        System.out.println(s1+s2)
         */

        //parseInt() method to convert string into Integer
        /*

        String s1="10";
        String s2="20";
        int a =Integer.parseInt(s1);
        int b=Integer.parseInt(s2);
        System.out.println(a+b);

         */

        /*
        // compareTo()

        String s1="E";
        String s2="A";
        System.out.println(s2.compareTo(s1));

         */

    }
}
