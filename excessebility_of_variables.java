public class excessebility_of_variables {
    int c=300;//Global variable
    public static void main(String[] args) {
        int b=200;//instance variable
        excessebility_of_variables obj=new excessebility_of_variables();
        obj.display();
        obj.info();
        System.out.println(obj.c);

    }
    public void display(){
        int a =100;//local variable
        System.out.println(a);
    }
    public void info(){
        int x=400;//local variable
        System.out.println(x);
    }

}
