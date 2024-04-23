import java.util.Scanner;
import java.util.ArrayList;
import  java.io.*;
public class Avg_marks_of_students_array {
    public static void main(String[] args)throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        /*Scanner sc = new Scanner(System.in);
        //num =sc.nextInt();
        int num=2;
        ArrayList<String> lists[]=new ArrayList[num];
        int a[] =new int[5];
        System.out.println("Enter the array elements");
        for(int t=0;t<num;t++) {
            lists[t]=new ArrayList<>();
            System.out.println("enter the marks os 1st student "+lists[t]);
            for (int i = 0; i < a.length; i++) {
                lists[i] = sc.
            }
            for (int i = 0; i < a.length; i++) {
                System.out.print(lists[i] + " ");
            }
        }*/
        String stu []= new String[5];
        int s1[]=new int[5];
        int s2[]=new int[5];
        int s3[]=new int[5];
        int s4[]=new int[5];
        int s5[]=new int[5];
        int i;
        for(i=0;i<stu.length;i++){
            System.out.println("enter the student name");
            stu[i]=br.readLine();
            System.out.println("enter the marks ");
            s1[i]=Integer.parseInt(br.readLine());
            s2[i]=Integer.parseInt(br.readLine());
            s3[i]=Integer.parseInt(br.readLine());
            s3[i]=Integer.parseInt(br.readLine());
            s5[i]=Integer.parseInt(br.readLine());

        }
        for (i=0;i<stu.length;i++){
            int total=s1[i]+s2[i]+s3[i]+s4[i]+s5[i];
            double percentage= total/5;
            System.out.println("student= "+stu[i]);
            System.out.println("percentage= "+percentage+"%");
        }

    }
}
