class Biodata {
    private String nama;
    private String nim;
    private String jurusan;
    private String fakultas;
    private String universitas;
    private String alamat;
    private String email;
    private String pekerjaan;
    private String hobi;
    private String keahlian;
    private String karya;
    
    // Getter methods
    public String getNama() { return nama; }
    public String getNim() { return nim; }
    public String getJurusan() { return jurusan; }
    public String getFakultas() { return fakultas; }
    public String getUniversitas() { return universitas; }
    public String getAlamat() { return alamat; }
    public String getEmail() { return email; }
    public String getPekerjaan() { return pekerjaan; }
    public String getHobi() { return hobi; }
    public String getKeahlian() { return keahlian; }
    public String getKarya() { return karya; }
    
    // Setter methods
    public void setNama(String nama) { this.nama = nama; }
    public void setNim(String nim) { this.nim = nim; }
    public void setJurusan(String jurusan) { this.jurusan = jurusan; }
    public void setFakultas(String fakultas) { this.fakultas = fakultas; }
    public void setUniversitas(String universitas) { this.universitas = universitas; }
    public void setAlamat(String alamat) { this.alamat = alamat; }
    public void setEmail(String email) { this.email = email; }
    public void setPekerjaan(String pekerjaan) { this.pekerjaan = pekerjaan; }
    public void setHobi(String hobi) { this.hobi = hobi; }
    public void setKeahlian(String keahlian) { this.keahlian = keahlian; }
    public void setKarya(String karya) { this.karya = karya; }
}

// Class Utama untuk menampilkan biodata
public class MainBiodata {
    public static void main(String[] args) {
        Biodata biodata = new Biodata();
        
        // Mengisi data biodata
        biodata.setNama("-");
        biodata.setNim("-");
        biodata.setJurusan("-");
        biodata.setFakultas("-");
        biodata.setUniversitas("-");
        biodata.setAlamat("-");
        biodata.setEmail("-");
        biodata.setPekerjaan("-");
        biodata.setHobi("-");
        biodata.setKeahlian("-");
        biodata.setKarya("-");
        
        // Menampilkan biodata
        System.out.println("BIODATA");
        System.out.println("Nama: " + biodata.getNama());
        System.out.println("NIM: " + biodata.getNim());
        System.out.println("Jurusan: " + biodata.getJurusan());
        System.out.println("Fakultas: " + biodata.getFakultas());
        System.out.println("Universitas: " + biodata.getUniversitas());
        System.out.println("Alamat: " + biodata.getAlamat());
        System.out.println("Email: " + biodata.getEmail());
        System.out.println("Pekerjaan: " + biodata.getPekerjaan());
        System.out.println("Hobi: " + biodata.getHobi());
        System.out.println("Keahlian: " + biodata.getKeahlian());
        System.out.println("Karya: " + biodata.getKarya());
    }
}