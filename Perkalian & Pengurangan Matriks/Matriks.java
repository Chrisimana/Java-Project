import java.util.Scanner;

// Class utama untuk operasi matriks 2x2
public class Matriks {
    public static void main(String[] args) {

        // Membuat objek Scanner untuk input
        Scanner input = new Scanner(System.in);

        // Deklarasi matriks 2x2
        int[][] X = new int[2][2];
        int[][] Y = new int[2][2];
        int[][] hasil = new int[2][2];

        // Variabel untuk pilihan operasi
        int pilihan;

        // Input matriks X
        System.out.println("Masukkan Nilai Matriks X");
        System.out.println("========================");

        // Untuk baris matriks i
        for(int i = 0; i < 2; i++) {

            // Untuk kolom matriks j
            for(int j = 0; j < 2; j++) {

                // Meminta input matriks
                System.out.print("[" + (i+1) + "][" + (j+1) + "]: "); 
                X[i][j] = input.nextInt();
            }
        }

        // Input matriks Y
        System.out.println("\nMasukkan Nilai Matriks Y");
        System.out.println("========================");

        // Untuk baris matriks i
        for(int i = 0; i < 2; i++) {

            // Untuk kolom matriks j
            for(int j = 0; j < 2; j++) {

                // Meminta input matriks
                System.out.print("[" + (i+1) + "][" + (j+1) + "]: ");
                Y[i][j] = input.nextInt();
            }
        }

        // Menu operasi
        System.out.println("\nPilih Operasi Matriks:");
        System.out.println("1. Perkalian Matriks");
        System.out.println("2. Pengurangan Matriks");
        System.out.print("Masukkan pilihan (1/2): ");
        pilihan = input.nextInt();

        switch(pilihan) {
            case 1 -> {

                // Perkalian matriks
                // Untuk baris matriks hasil i
                for(int i = 0; i < 2; i++) { 

                    // Untuk kolom matriks hasil j
                    for(int j = 0; j < 2; j++) { 

                        // Inisialisasi hasil[i][j] dengan 0
                        hasil[i][j] = 0;

                        // Untuk perhitungan perkalian
                        for(int k = 0; k < 2; k++) {

                            // Rumus perkalian matriks
                            hasil[i][j] += X[i][k] * Y[k][j];
                        }
                    }
                }
                // Menampilkan hasil perkalian
                System.out.println("\nHasil Perkalian Matriks:");
            }
            case 2 -> {
                
                // Pengurangan matriks
                // Untuk baris matriks hasil i
                for(int i = 0; i < 2; i++) {

                    // Untuk kolom matriks hasil j
                    for(int j = 0; j < 2; j++) {

                        // Rumus pengurangan matriks
                        hasil[i][j] = X[i][j] - Y[i][j];
                    }
                }
                // Menampilkan hasil pengurangan
                System.out.println("\nHasil Pengurangan Matriks:");
            }
            default -> {
                // Jika pilihan tidak valid
                System.out.println("Pilihan tidak valid!");

                // Keluar dari program
                return; 
            }
        }

        // Menampilkan hasil
        System.out.println("=========================");

        // Untuk baris matriks hasil i
        for(int i = 0; i < 2; i++) {

            // Untuk kolom matriks hasil j
            for(int j = 0; j < 2; j++) {

                // Menampilkan hasil matriks
                System.out.print(hasil[i][j] + " ");
            }
            // Pindah ke baris berikutnya
            System.out.println();
        }
    }
}