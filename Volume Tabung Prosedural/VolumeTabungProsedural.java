public class VolumeTabungProsedural {
    public static void main(String[] args) {
        double jariJari = 8.0; // Jari-jari tabung
        double tinggi = 15.0; // Tinggi tabung
        
        double volume = hitungVolume(jariJari, tinggi); // Menghitung volume tabung
        
        System.out.println("Volume tabung : " + volume); // Menampilkan hasil
    }
    
    public static double hitungVolume(double r, double t) {
        return Math.PI * r * r * t; // Rumus volume tabung: π * r^2 * t
    }
}