package MODUL_4;

public class kegiatan_2 {
    public static void main(String[] args) {
        gelas gelas = new gelas();
        gelas.getEsTeh().EsTehInfo();
    }
    
}

class EsTeh{
    void EsTehInfo(){
        int banyak = 1;
        String Jenis = "Teh Tarik";
        System.out.println("Banyak : "+banyak);
        System.out.println("Jenis "+Jenis);
    }

    }


class gelas{
    EsTeh IceTea = new EsTeh();
    gelas(){
    }

    public EsTeh getEsTeh() {
        return IceTea;
    }
}