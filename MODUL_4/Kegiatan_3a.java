package MODUL_4;
import java.util.scanner;;

public class Kegiatan_3a {
    public interface BangunDatar {
        public abstract double luas():
        public abstract double keliling();
        public double phi = 3.14;
    
        public class main {
            public static void main(String[] args) {
                Lingkaran round = new Lingkaran();
                round.setjari();
                round.display();

                Tabung tube = new Tabung();
                tube.setjari();
                tube.settinggi();
                tube.display();

                Persegi square = new Persegi();
                square.setSisi();
                square.display();

                Limas pyrmd = new Limas();
                pyrmd.setSisi();
                pyrmd.settinggi();
                pyrmd.setVolume();
                pyrmd.display();
        }
    }
}
