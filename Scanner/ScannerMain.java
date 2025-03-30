import java.util.Scanner; 

public class ScannerMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Keliling lingkaran
        System.out.print("Masukkan jari-jari lingkaran: "); 
        double radius = input.nextDouble(); 
        double kelilingLingkaran = 2 * Math.PI * radius; // Rumus keliling lingkaran
        System.out.println("Keliling lingkaran: " + kelilingLingkaran); // Output keliling lingkaran
        
        // Luas trapesium
        System.out.print("Masukkan panjang sisi sejajar 1 trapesium: "); 
        double a = input.nextDouble();
        System.out.print("Masukkan panjang sisi sejajar 2 trapesium: "); 
        double b = input.nextDouble(); 
        System.out.print("Masukkan tinggi trapesium: "); 
        double tinggiTrapesium = input.nextDouble();
        double luasTrapesium = (a + b) * tinggiTrapesium / 2; // Rumus luas trapesium
        System.out.println("Luas trapesium: " + luasTrapesium); // Output luas trapesium
        
        // Luas prisma segitiga
        System.out.print("Masukkan alas segitiga: ");
        double alasSegitiga = input.nextDouble();
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggiSegitiga = input.nextDouble();
        System.out.print("Masukkan tinggi prisma: ");
        double tinggiPrisma = input.nextDouble();
        double luasPrisma = (alasSegitiga * tinggiSegitiga / 2) * tinggiPrisma; // Rumus luas prisma segitiga
        System.out.println("Luas prisma segitiga: " + luasPrisma); // Output luas prisma segitiga
        
        input.close(); 
    }
}