class description{
    private  String animal;
    private String capital;

    public description(String animal, String capital) {  //constuctors
        this.animal = animal;
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "description{" +
                "animal='" + animal + '\'' +
                ", capital='" + capital + '\'' +
                '}';
    }
}
class city1{
    private int pincode;
    private  String state;
    private description disp;

    public city1(int pincode, String state, description disp) {  //HAS-A Relationship
        this.pincode = pincode;
        this.state = state;
        this.disp = disp;
    }

    public void display(){
        System.out.println(state+" "+pincode);
        System.out.println(disp.toString());
    }
}

public class to_string_method {
    public static void main(String[] args) {
        description d1=new description("red panda","gangtok");
        city1 obj=new city1(235223,"sikkim",d1);
        obj.display();
    }
}
