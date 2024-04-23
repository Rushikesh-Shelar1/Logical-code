public class fibonacci_series {
    public static void main(String[] args) {
        int a=0,b=1;
        for(int i=0;i<15;i++){
            int sum =a+b;
            System.out.println(sum+" ");
            a=b;
            b=sum;

        }
    }
}
