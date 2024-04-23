public class array_circulation {
    public static void main(String[] args) {
        int[] a =new int[5];
        int j=0;
        int[] b ={21,5,41,3,15};
        for (int i=0;i<b.length;i++){
            if(i<3) {
                a[j] = b[i + 2];
            }
            else {
                a[j] = b[i - 3];
            }
            j++;
        }
        for(int k=0;k<a.length;k++) {
            System.out.print(" " + a[k]);
        }

    }
}
