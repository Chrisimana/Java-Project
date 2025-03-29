public class Tabung {

    private final double jariJari; // Jari-jari tabung
    private final double tinggi; // Tinggi tabung

    public Tabung(double r, double t) {
        this.jariJari = r; // Jari-jari tabung
        this.tinggi = t; // Tinggi tabung
    }
    
    // Method untuk menghitung luas tabung
    public double hitungLuas() {
        return 2 * Math.PI * jariJari * (jariJari + tinggi); // Rumus luas tabung
    }
    
    public static void main(String[] args) {

        // Membuat object tabung
        Tabung tabung1 = new Tabung(8.0, 15.0);
        
        // Memanggil dan menampilkan hasil
        System.out.println("Luas tabung: " + tabung1.hitungLuas());
    }
}