import java.util.Scanner;

public class word_extraction {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentence ");
        String sentence=sc.nextLine();
        int i,j,count=0,mount=0;
        int len= sentence.length();
        for(i=0;i<len;i=j+1){
            String word="";
            for (j=i;j<len&&sentence.charAt(j)!=' ';j++){
                word=word + sentence.charAt(j);
            }
            if(word.equalsIgnoreCase("an")){
                count++;
            }
            if (word.equalsIgnoreCase("and")) {
                mount++;
            }
        }

        System.out.println("An= "+count);
        System.out.println("And= "+mount);

         */

        //finding the largest word and the smallest word



        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentence ");
        String sentence=sc.nextLine();
        int i,j,an=0,and=0;
        int len= sentence.length();
        String word1_max="";
        String word2_min="";
        //to find largest word
        for(i=0;i<len;i=j+1){
            String word="";

            for (j=i;j<len&&sentence.charAt(j)!=' ';j++){
                word=word + sentence.charAt(j);

            }
            if(word1_max.length()<=word.length()){
                word1_max=word;

            }
        }
        //to find smallest word
        word2_min=word1_max;
        for(i=0;i<len;i=j+1) {
            String word3 = "";

            for (j = i; j < len && sentence.charAt(j) != ' '; j++) {
                word3 = word3 + sentence.charAt(j);

            }
            if (word2_min.length() > word3.length()) {
                word2_min = word3;
            }
        }
        System.out.println("largest word is  "+word1_max);
        System.out.println("smallest word is "+word2_min);

    }
}
