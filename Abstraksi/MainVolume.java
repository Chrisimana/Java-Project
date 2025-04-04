abstract class Volume {
    abstract double hitungVolume();
}

// Class Volume untuk Balok
class Balok extends Volume {
    private final double panjang; // Panjang balok
    private final double lebar; // Lebar balok
    private final double tinggi; // Tinggi balok
    
    // Constructor untuk Balok
    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang; 
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    // Method untuk menghitung volume balok
    @Override
    double hitungVolume() {
        return panjang * lebar * tinggi;
    }
}

// Class Volume untuk Bola
class Bola extends Volume {
    private final double jariJari;
    
    // Constructor untuk Bola
    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }
    
    // Method untuk menghitung volume bola
    @Override
    double hitungVolume() {
        return (4.0/3.0) * Math.PI * Math.pow(jariJari, 3);
    }
}

// Class Utama untuk menjalankan program
public class MainVolume {
    public static void main(String[] args) {

        // Membuat objek balok dan bola
        Volume balok = new Balok(5, 3, 2);
        Volume bola = new Bola(7);
        
        // Menghitung dan menampilkan volume balok dan bola
        System.out.println("Volume Balok: " + balok.hitungVolume());
        System.out.println("Volume Bola: " + bola.hitungVolume());
    }
}