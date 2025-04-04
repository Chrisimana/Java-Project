public class MahasiswaConstructor {
    private final String nama; // Nama mahasiswa
    private final String nim; // NIM Mahasiswa
    private final String jurusan; // Jurusan mahasiswa
    private final String fakultas; // Fakultas mahasiswa
    private final double ipSemester; // Indeks Prestasi Semester Mahasiswa
    private final double ipKumulatif; // Indeks Prestasi Kumulatif Mahasiswa

    // Constructor default
    public MahasiswaConstructor() {
        nama = "Christina Angelina"; // Data nama mahasiswa
        nim = "11211095"; // Data NIM mahasiswa
        jurusan = "Teknik Elektro, Informatika dan Bisnis"; // Data jurusan mahasiswa
        fakultas = "FSTI"; // Data fakultas mahasiswa
        ipSemester = 3.98; // Data IP Semester mahasiswa
        ipKumulatif = 3.99; // Data IP Kumulatif mahasiswa
    }

    // Constructor dengan semua parameter
    public MahasiswaConstructor(String nama, String nim, String jurusan, String fakultas, 
        double ipSemester, double ipKumulatif) {
        this.nama = nama; 
        this.nim = nim;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        this.ipSemester = ipSemester;
        this.ipKumulatif = ipKumulatif;
    }

    // Method untuk menampilkan data
    public void tampilkanData() {
        System.out.println("Identitas Mahasiswa");
        System.out.println("Nama         : " + nama); // Menampilkan nama mahasiswa
        System.out.println("NIM          : " + nim); // Menampilkan NIM mahasiswa
        System.out.println("Jurusan      : " + jurusan); // Menampilkan jurusan mahasiswa
        System.out.println("Fakultas     : " + fakultas); // Menampilkan fakultas mahasiswa
        System.out.println("IP Semester  : " + ipSemester); // Menampilkan IP Semester mahasiswa
        System.out.println("IP Kumulatif : " + ipKumulatif); // Menampilkan IP Kumulatif mahasiswa
    }

    public static void main(String[] args) {
        // Menggunakan constructor default
        MahasiswaConstructor mhs1 = new MahasiswaConstructor(); 
        System.out.println("Data Mahasiswa 1:");
        mhs1.tampilkanData();

        System.out.println("\n------------------------\n");
        
        // Menggunakan constructor dengan semaua parameter
        MahasiswaConstructor mhs2 = new MahasiswaConstructor(
            "Jessica Naura", "08231010", "Teknik Sipil dan Perencanaan", "FPB", 3.79, 3.80);
        System.out.println("Data Mahasiswa 2:");
        mhs2.tampilkanData();
        
        System.out.println("\n------------------------\n");

        // Menggunakan constructor dengan semua parameter
        MahasiswaConstructor mhs3 = new MahasiswaConstructor(
            "Alextrana Bryan", "05221005", "Rekayasa Industri", "FRTI", 3.80, 3.81);
        System.out.println("Data Mahasiswa 3:");
        mhs3.tampilkanData();
    }

    public String getNama() {
        return nama;
    }
}