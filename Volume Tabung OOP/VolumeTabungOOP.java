public class VolumeTabungOOP {

    private final double jariJari; // Jari-jari tabung
    private final double tinggi; // Tinggi tabung
    
    public VolumeTabungOOP(double r, double t) {
        this.jariJari = r; // Inisialisasi jari-jari
        this.tinggi = t; // Inisialisasi tinggi
    }
    
    // Method untuk menghitung volume
    public double hitungVolume() {
        return Math.PI * jariJari * jariJari * tinggi; // Rumus volume tabung: π * r^2 * t
    }
    
    public static void main(String[] args) {

        // Membuat object tabung
        VolumeTabungOOP tabung1 = new VolumeTabungOOP(7.0, 10.0);
        
        // Memanggil method dan menampilkan hasil
        System.out.println("Volume tabung (OOP): " + tabung1.hitungVolume());
    }
}