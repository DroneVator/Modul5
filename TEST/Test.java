package TEST;

public class Test {
    public static void main(String[] args) {
        Limas volLimas = new Limas();
        Tabung volTabung = new Tabung();

        System.out.println("Volume Limas = " + volLimas.getVolume());
        System.out.println("Volume Tabung = " + volTabung.getVolume());
    }
}

interface BangunRuang {
    public double luas();

    public double keliling();
}

class Persegi implements BangunRuang {

    public int sisi = 7;
    public double luas = sisi * sisi, keliling = sisi * 4;

    public double luas() {
        return luas;
    }

    public double keliling() {
        return keliling;
    }
}

class Lingkaran implements BangunRuang {

    public int jari = 14;
    public double luas = Math.PI * Math.pow(jari, 2), keliling = Math.PI * 2 * jari;

    public double luas() {
        return luas;
    }

    public double keliling() {
        return keliling;
    }
}

class Tabung extends Lingkaran {

    public int tinggi = 10;

    public double getVolume() {
        return (super.luas() * tinggi);
    }
}

class Limas extends Persegi {
    public int tinggi = 10;

    public double getVolume() {
        return super.luas * tinggi;
    }
}
