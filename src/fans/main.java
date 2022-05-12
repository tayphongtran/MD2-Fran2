package fans;

public class main {
    public static void main(String[] args) {

        Fan fan1 = new Fan(3,true,10,"yellow");
        Fan fan2 = new Fan(2,false,5,"blue");
        fan1.setSatus(true);
        System.out.println(fan1);
        fan2.setSatus(false);
        System.out.println(fan2);
    }
}
