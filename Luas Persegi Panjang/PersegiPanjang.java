public class PersegiPanjang {

    private final double panjang; // Panjang, persegi panjang
    private final double lebar; // Lebar, persegi panjang
    
    public PersegiPanjang(double p, double l) {
        this.panjang = p; // Panjang, persegi panjang
        this.lebar = l; // Lebar, persegi panjang
    }
    
    // Method untuk menghitung luas
    public double hitungLuas() { 
        return panjang * lebar; // Rumus luas persegi panjang
    }
    
    public static void main(String[] args) {

        // Membuat object persegi panjang
        PersegiPanjang pp1 = new PersegiPanjang(15.0, 5.0);
        
        // Memanggil method dan menampilkan hasil
        System.out.println("Luas persegi panjang: " + pp1.hitungLuas());
    }
}