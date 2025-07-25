interface Switch{
    abstract void switchon();
    abstract void switchoff();
}
class Light implements Switch{
    @Override
    public void switchon(){
        System.out.println("Switch is on");
    }
    public void switchoff(){
        System.out.println("Switch is off");
    }

}
public class InterfaceExample {
    public static void main(String[] args) {


        Light l = new Light();
        l.switchon();
        l.switchoff();
    }
}
