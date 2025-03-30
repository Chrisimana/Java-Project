import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Keliling lingkaran
        System.out.print("Masukkan jari-jari lingkaran: ");
        double radius = Double.parseDouble(br.readLine());
        double kelilingLingkaran = 2 * Math.PI * radius; // Rumus keliling lingkaran
        System.out.println("Keliling lingkaran: " + kelilingLingkaran);
        
        // Luas trapesium
        System.out.print("Masukkan panjang sisi sejajar 1 trapesium: ");
        double a = Double.parseDouble(br.readLine());
        System.out.print("Masukkan panjang sisi sejajar 2 trapesium: ");
        double b = Double.parseDouble(br.readLine());
        System.out.print("Masukkan tinggi trapesium: ");
        double tinggiTrapesium = Double.parseDouble(br.readLine());
        double luasTrapesium = (a + b) * tinggiTrapesium / 2; // Rumus luas trapesium
        System.out.println("Luas trapesium: " + luasTrapesium);
        
        // Luas prisma segitiga
        System.out.print("Masukkan alas segitiga: ");
        double alasSegitiga = Double.parseDouble(br.readLine());
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggiSegitiga = Double.parseDouble(br.readLine());
        System.out.print("Masukkan tinggi prisma: ");
        double tinggiPrisma = Double.parseDouble(br.readLine());
        double luasPrisma = (alasSegitiga * tinggiSegitiga / 2) * tinggiPrisma; // Rumus luas prisma segitiga
        System.out.println("Luas prisma segitiga: " + luasPrisma);
    }
}