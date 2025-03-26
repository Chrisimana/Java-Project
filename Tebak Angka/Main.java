import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Random rand = new Random();
            boolean mainLagi = true;
            System.out.println("Selamat datang di game Tebak Angka!");

            while (mainLagi) {
                // Generate angka acak antara 1 dan 100
                int angkaYangHarusDitebak = rand.nextInt(100) + 1;
                int tebakanPemain;
                int jumlahTebakan = 0;
                boolean sudahTebak = false;

                System.out.println("\nSaya telah memilih sebuah angka antara 1 dan 100.");
                System.out.println("Coba tebak angka tersebut!");

                // Loop sampai pemain menebak dengan benar
                while (!sudahTebak) {
                    System.out.print("Masukkan tebakan Anda: ");
                    tebakanPemain = input.nextInt();
                    jumlahTebakan++;

                    if (tebakanPemain == angkaYangHarusDitebak) {
                        System.out.println("Selamat! Anda menebak dengan benar dalam " + jumlahTebakan + " kali tebakan.");
                        sudahTebak = true;
                    } else if (tebakanPemain < angkaYangHarusDitebak) {
                        System.out.println("Terlalu rendah! Coba lagi.");
                    } else {
                        System.out.println("Terlalu tinggi! Coba lagi.");
                    }
                }

                System.out.print("Apakah Anda ingin bermain lagi? (ya/tidak): ");
                String jawaban = input.next();
                mainLagi = jawaban.equalsIgnoreCase("ya");
            }

            System.out.println("Terima kasih sudah bermain!");
        }
    }
}
