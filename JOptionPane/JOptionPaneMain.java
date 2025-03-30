import javax.swing.JOptionPane;

public class JOptionPaneMain { 
    public static void main(String[] args) {

        // Keliling lingkaran
        String radiusStr = JOptionPane.showInputDialog("Masukkan jari-jari lingkaran:");
        double radius = Double.parseDouble(radiusStr);
        double kelilingLingkaran = 2 * Math.PI * radius; // Rumus keliling lingkaran
        JOptionPane.showMessageDialog(null, "Keliling lingkaran: " + kelilingLingkaran); 
        
        // Luas trapesium
        String aStr = JOptionPane.showInputDialog("Masukkan panjang sisi sejajar 1 trapesium:");
        double a = Double.parseDouble(aStr); 
        String bStr = JOptionPane.showInputDialog("Masukkan panjang sisi sejajar 2 trapesium:");
        double b = Double.parseDouble(bStr);
        String tinggiTrapesiumStr = JOptionPane.showInputDialog("Masukkan tinggi trapesium:");
        double tinggiTrapesium = Double.parseDouble(tinggiTrapesiumStr);
        double luasTrapesium = (a + b) * tinggiTrapesium / 2; // Rumus luas trapesium
        JOptionPane.showMessageDialog(null, "Luas trapesium: " + luasTrapesium);
        
        // Luas prisma segitiga
        String alasSegitigaStr = JOptionPane.showInputDialog("Masukkan alas segitiga:");
        double alasSegitiga = Double.parseDouble(alasSegitigaStr);
        String tinggiSegitigaStr = JOptionPane.showInputDialog("Masukkan tinggi segitiga:");
        double tinggiSegitiga = Double.parseDouble(tinggiSegitigaStr);
        String tinggiPrismaStr = JOptionPane.showInputDialog("Masukkan tinggi prisma:");
        double tinggiPrisma = Double.parseDouble(tinggiPrismaStr);
        double luasPrisma = (alasSegitiga * tinggiSegitiga / 2) * tinggiPrisma; // Rumus luas prisma segitiga
        JOptionPane.showMessageDialog(null, "Luas prisma segitiga: " + luasPrisma);
    }
}