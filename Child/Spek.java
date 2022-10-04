package Child;
import Parent.Komputer;

public class Spek extends Komputer {
    public void display(int Harga){
        System.out.println("Merek : "+ super.merek);
        System.out.println("Harga : "+ Harga);
    }
    public void display(){
        String prosessor = "Core i7";
        String GPU = "Nvidia RTX3090";
        String RAM = "16Gb";
        String SSD = "2TB";
    System.out.println("Merek : "+ super.merek);
    System.out.println("Tipe : "+ super.tipe);
    System.out.println("prosessor : "+ prosessor);
    System.out.println("GPU : "+ GPU);
    System.out.println("RAM : "+ RAM);
    System.out.println("SSD : "+ SSD);

    }
}
