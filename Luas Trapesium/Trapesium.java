public class Trapesium {

    private final double alasAtas; // Alas atas trapesium
    private final double alasBawah; // Alas bawah trapesium
    private final double tinggi; // Tinggi trapesium
    
    public Trapesium(double a, double b, double t) {
        this.alasAtas = a; // Alas atas trapesium   
        this.alasBawah = b; // Alas bawah trapesium
        this.tinggi = t; // Tinggi trapesium
    }
    
    // Method untuk menghitung luas
    public double hitungLuas() {
        return 0.5 * (alasAtas + alasBawah) * tinggi; // Rumus luas trapesium
    }
    
    public static void main(String[] args) {

        // Membuat object trapesium
        Trapesium trap1 = new Trapesium(8.0, 5.0, 6.0);
        
        // Memanggil dan menampilkan hasil
        System.out.println("Luas trapesium: " + trap1.hitungLuas());
    }
}