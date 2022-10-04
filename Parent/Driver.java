package Parent;
import Child.Spek;

public class Driver {
    public static void main(String[] args) {
        Spek spec = new Spek();
        spec.display(15000000);
        spec.display();
    }
}
