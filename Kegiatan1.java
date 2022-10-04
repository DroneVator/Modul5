class Bus{
    String Ladju = "Ladju";
    String Akas = "Akas";
public void display(){
    System.out.println("PO : "+ this.Ladju);
    System.out.println("PO : "+ this.Akas);
}

}

class Tujuan extends Bus{
    String Malang = "malang";
    String Surabaya = "Surabaya";
public void display(){
    System.out.println("\nPO : "+ this.Ladju);
    System.out.println("PO : "+ this.Akas);
    System.out.println("Arah : "+ this.Malang);
    System.out.println("Arah : "+ this.Surabaya);
}

}

class Harga extends Bus{
    int hargaKarcisSBY = 15000;
    int hargaKarcisMLG = 20000;
public void display(){
    System.out.println("\nPO : "+ this.Ladju);
    System.out.println("PO : "+ this.Akas);
    System.out.println("Harga : "+ this.hargaKarcisMLG);
    System.out.println("Harga : "+ this.hargaKarcisSBY);
}

}

class Jadwal extends Bus{
    String Jam = "Siang";
public void display(){
    System.out.println("\nPO : "+ this.Ladju);
    System.out.println("PO : "+ this.Akas);
    System.out.println("Jadwal  : "+ this.Jam);
}

}

public class Kegiatan1{
    public static void main(String[] args) {
        Tujuan destiny = new Tujuan();
        destiny.display();
        Harga price = new Harga();
        price.display();
        Jadwal time = new Jadwal();
        time.display();
    }
}