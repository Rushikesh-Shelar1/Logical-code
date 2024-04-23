import java.util.Arrays;
import java.util.Scanner;

public class string_sorting_using_selection_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentence ");
        String sentence=sc.nextLine();
        int len= 0;
        String temp=" ";
        String[] strArray = null;
        strArray = sentence.split(" ");
        for (int i = 0; i< strArray.length; i++){
            System.out.print(" "+strArray[i]);
            len++;
        }

        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(strArray[i].length()>strArray[j].length()){
                    temp=strArray[i];
                    strArray[i]=strArray[j];;
                    strArray[j]=temp;
                }
            }
        }
        System.out.println(" ");
        for (int i = 0; i< strArray.length; i++) {
            System.out.print(" "+strArray[i]);
        }


    }
}
