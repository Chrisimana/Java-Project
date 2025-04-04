public class MahasiswaMethod {
    private String nama; // Nama mahasiswa
    private String nim; // Nomor Induk Mahasiswa
    private String jurusan; // Jurusan mahasiswa
    private String fakultas; // Fakultas mahasiswa
    private double ipSemester; // Indeks Prestasi Semester
    private double ipKumulatif; // Indeks Prestasi Kumulatif
    private String riwayatBeasiswa; // Riwayat beasiswa yang diterima

    // Method untuk menampilkan identitas mahasiswa
    public void tampilkanData() {
        System.out.println("Identitas Mahasiswa"); 
        System.out.println("Nama     : " + this.nama);
        System.out.println("NIM      : " + this.nim);
        System.out.println("Jurusan  : " + this.jurusan);
        System.out.println("Fakultas : " + this.fakultas);
    }

    // Overloading method untuk menampilkan prestasi akademik
    public void tampilkanDataPrestasi() {
        System.out.println("\nPrestasi Akademik");
        System.out.println("Nama             : " + this.nama);
        System.out.println("IP Semester      : " + this.ipSemester); 
        System.out.println("IP Kumulatif     : " + this.ipKumulatif);
        System.out.println("Riwayat Beasiswa : " + this.riwayatBeasiswa);
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) { 

        // Membuat objek MahasiswaMethod
        MahasiswaMethod mhs = new MahasiswaMethod(); 
        
        // Set data mahasiswa
        mhs.nama = "Christina Angelina"; // Data mahasiswa
        mhs.nim = "11211095"; // NIM mahasiswa
        mhs.jurusan = "Teknik Elektro, Informatika dan Bisnis"; // Jurusan mahasiswa
        mhs.fakultas = "FSTI"; // Fakultas mahasiswa
        mhs.ipSemester = 3.98; // IP Semester mahasiswa
        mhs.ipKumulatif = 3.99; // IP Kumulatif mahasiswa
        mhs.riwayatBeasiswa = "Beasiswa Unggulan 2024"; // Riwayat beasiswa mahasiswa

        // Menampilkan identitas mahasiswa
        mhs.tampilkanData();
        
        // Menampilkan prestasi akademik
        mhs.tampilkanDataPrestasi();
    }
}