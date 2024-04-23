import java.util.Scanner;

public class Kaprikar_no_in_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no you want to search");
        int a=sc.nextInt();
        int b=a*a;
        String s1=String.valueOf(b);
        System.out.println("this is s1: "+s1);
        int mid=s1.length()/2;
        System.out.println("this is mid of s1 : "+mid);
        String s2=s1.substring(0,mid);
        String s3=s1.substring(mid);
        System.out.println(s2);
        System.out.println(s3);
        int c =Integer.parseInt(s2);
        int d=Integer.parseInt(s3);
        int e=c+d;
        if(a==e){
            System.out.println("it is an Kaprikar no. i.e "+e);
        }
        else
            System.out.println("it is not an Kaprikar no. "+e);

    }
}
