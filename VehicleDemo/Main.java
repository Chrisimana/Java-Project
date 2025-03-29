// Abstract class Vehicle
abstract class Vehicle {

    // Variabel untuk menyimpan informasi kendaraan
    private String name; // Nama kendaraan
    private int speed; // Kecepatan kendaraan
    private double fuelLevel; // Level bahan bakar

    //konstruktor untuk inisialisasi kendaraan
    public Vehicle(String name, int speed, double fuelLevel) {
        if (speed < 0) throw new IllegalArgumentException("Kecepatan tidak boleh negatif"); 
        if (fuelLevel < 0 || fuelLevel > 100) throw new IllegalArgumentException("Level bahan bakar harus 0-100%");
        
        this.name = name; 
        this.speed = speed;
        this.fuelLevel = fuelLevel;
    }

    // Method untuk mendapatkan nama
    public String getName() { return name; }

    // Method untuk mendapatkan kecepatan
    public int getSpeed() { return speed; }

    // Method untuk mendapatkan level bahan bakar
    public double getFuelLevel() { return fuelLevel; }

    // Method untuk mengubah level bahan bakar
    protected void setFuelLevel(double fuelLevel) {

        // Level bahan bakar tidak boleh kurang dari 0 atau lebih dari 100
        if (fuelLevel < 0) this.fuelLevel = 0; // Jika kurang dari 0, set menjadi 0
        else if (fuelLevel > 100) this.fuelLevel = 100; // Jika lebih dari 100, set menjadi 100
        else this.fuelLevel = fuelLevel;
    }

    // Method untuk mengubah kecepatan
    protected void setSpeed(int speed) {
        if (speed < 0) throw new IllegalArgumentException("Kecepatan tidak boleh negatif");
        this.speed = speed;
    } 

    // Method abstrak yang harus diimplementasikan oleh subclass
    public abstract void move(); // Untuk menggerakkan kendaraan
    public abstract double calculateFuelConsumption(double distance); // Untuk menghitung konsumsi bahan bakar
    public abstract String getVehicleType(); // Mengembalikan jenis kendaraan
    
    // Method untuk menampilkan kendaraan
    public void displayStatus() {
        System.out.println("\n=== Kendaraan ==="); // Baris kosong untuk memisahkan setiap kendaraan
        System.out.println("Nama: " + getName()); // Menampilkan informasi kendaraan
        System.out.println("Jenis: " + getVehicleType()); // Menampilkan jenis kendaraan
        System.out.println("Kecepatan: " + getSpeed() + " km/jam"); // Menampilkan kecepatan
        System.out.printf("Bahan bakar: %.2f%%%n", getFuelLevel()); // Menampilkan level bahan bakar
    }
}

// Interface untuk kendaraan yang bisa diisi ulang
interface Refuelable {
    void refuel(double amount); // Mengisi bahan bakar
    boolean isFuelLow(); // Mengecek apakah bahan bakar rendah
}

// Interface untuk kendaraan yang bisa berhenti darurat
interface EmergencyStop {
    void emergencyStop(); // Untuk menghentikan kendaraan segera
}

// Subclass LandVehicle atau kendaraan darat
class LandVehicle extends Vehicle implements Refuelable, EmergencyStop {
    private int wheels; // Jumlah roda

    // Konstruktor untuk inisialisasi kendaraan darat
    public LandVehicle(String name, int speed, double fuelLevel, int wheels) {
        super(name, speed, fuelLevel);
        if (wheels <= 0) throw new IllegalArgumentException("Jumlah roda harus positif");
        this.wheels = wheels; // Set jumlah roda
    }

    // Implementasi cara bergerak di darat
    @Override
    public void move() {
        System.out.printf("%s bergerak di darat dengan %d roda pada kecepatan %d km/jam%n",
                         getName(), wheels, getSpeed()); 
    }

    // Implementasi cara menghitung konsumsi bahan bakar
    @Override
    public double calculateFuelConsumption(double distance) {

        // Konsumsi 10% bahan bakar untuk setiap 10 km
        double consumption = distance / 10; 
        double newFuelLevel = getFuelLevel() - consumption; 
        setFuelLevel(newFuelLevel); 
        System.out.printf("Konsumsi bahan bakar untuk %.1f km: %.2f%%, Sisa bahan bakar: %.2f%%%n", 
                         distance, consumption, getFuelLevel()); 
        return consumption; 
    }

    // Implementasi metode untuk mengisi bahan bakar
    @Override
    public void refuel(double amount) { // Mengisi bahan bakar
        if (amount <= 0) throw new IllegalArgumentException("Jumlah pengisian harus positif"); 

        // Tambahkan bahan bakar baru ke level bahan bakar
        double newFuelLevel = getFuelLevel() + amount; 
        setFuelLevel(newFuelLevel); 
        System.out.printf("Mengisi bahan bakar %.1f%%. Sisa bahan bakar sekarang: %.2f%%%n", 
                         amount, getFuelLevel()); 
    }

    // Implementasi metode untuk mengecek bahan bakar rendah
    @Override
    public boolean isFuelLow() { 
        return getFuelLevel() < 20; // Jika bahan bakar kurang dari 20%, dianggap rendah
    }

    // Implementasi metode untuk berhenti darurat
    @Override
    public void emergencyStop() {
        setSpeed(0); // Set kecepatan menjadi 0
        System.out.printf("%s melakukan pemberhentian darurat! Kecepatan sekarang: 0 km/jam%n", getName()); 
    }

    // Mengembalikan jenis kendaraan
    @Override
    public String getVehicleType() {
        return "Kendaraan Darat";
    }
}

// Subclass WaterVehicle atau kendaraan air
class WaterVehicle extends Vehicle implements Refuelable {
    private final boolean hasPropeller; // Memiliki baling-baling atau tidak

    // Konstruktor untuk kendaraan air
    public WaterVehicle(String name, int speed, double fuelLevel, boolean hasPropeller) {
        super(name, speed, fuelLevel); 
        this.hasPropeller = hasPropeller; // Set apakah kendaraan memiliki baling-baling
    }

    // Metode baru untuk mengatur kedalaman
    public void setDepth(double depth) {
        if (depth < 0) throw new IllegalArgumentException("Kedalaman tidak boleh negatif");
        System.out.printf("%s menyelam hingga kedalaman %.1f meter%n", getName(), depth);
    }

    // Implementasi metode untuk bergerak di air
    @Override
    public void move() {
        System.out.printf("%s bergerak di air dengan kecepatan %d km/jam, menggunakan baling-baling: %b%n", 
                         getName(), getSpeed(), hasPropeller); 
    }

    // Implementasi metode untuk menghitung konsumsi bahan bakar
    @Override
    public double calculateFuelConsumption(double distance) {

        // Konsumsi 12,5% bahan bakar untuk setiap 8 km
        double consumption = distance / 8;
        double newFuelLevel = getFuelLevel() - consumption;
        setFuelLevel(newFuelLevel);
        System.out.printf("Konsumsi bahan bakar untuk %.1f km: %.2f%%, Sisa bahan bakar: %.2f%%%n", 
                         distance, consumption, getFuelLevel());
        return consumption;
    }

    // Implementasi metode untuk mengisi bahan bakar
    @Override
    public void refuel(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Jumlah pengisian harus positif");
        
        double newFuelLevel = getFuelLevel() + amount;
        setFuelLevel(newFuelLevel);
        System.out.printf("Mengisi bahan bakar %.1f%%. Sisa bahan bakar sekarang: %.2f%%%n", 
                         amount, getFuelLevel());
    }

    // Implementasi metode untuk mengecek bahan bakar rendah
    @Override
    public boolean isFuelLow() {
        return getFuelLevel() < 20;
    }

    // Mengembalikan jenis kendaraan
    @Override
    public String getVehicleType() {
        return "Kendaraan Air";
    }
}

// Subclass FlyingVehicle atau kendaraan udara
class FlyingVehicle extends Vehicle implements Refuelable, EmergencyStop {
    private int engineCount; // Jumlah mesin

    // Konstruktor untuk kendaraan udara
    public FlyingVehicle(String name, int speed, double fuelLevel, int engineCount) {
        super(name, speed, fuelLevel);
        if (engineCount <= 0) throw new IllegalArgumentException("Jumlah mesin harus positif");
        this.engineCount = engineCount;
    }

    // Implementasi cara bergerak di udara
    @Override
    public void move() {
        System.out.printf("%s terbang di udara dengan kecepatan %d km/jam menggunakan %d mesin%n", 
                         getName(), getSpeed(), engineCount); 
    }

    // Implementasi cara menghitung konsumsi bahan bakar
    @Override
    public double calculateFuelConsumption(double distance) {
        double consumption = distance / 5; // Pesawat lebih boros bahan bakar
        double newFuelLevel = getFuelLevel() - consumption;
        setFuelLevel(newFuelLevel);
        System.out.printf("Konsumsi bahan bakar untuk %.1f km: %.2f%%, Sisa bahan bakar: %.2f%%%n", 
                         distance, consumption, getFuelLevel());
        return consumption;
    }

    // Implementasi metode untuk mengisi bahan bakar
    @Override
    public void refuel(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Jumlah pengisian harus positif");
        
        double newFuelLevel = getFuelLevel() + amount;
        setFuelLevel(newFuelLevel);
        System.out.printf("Mengisi bahan bakar %.1f%%. Sisa bahan bakar sekarang: %.2f%%%n", 
                         amount, getFuelLevel());
    }

    // Implementasi metode untuk mengecek bahan bakar rendah
    @Override
    public boolean isFuelLow() {
        return getFuelLevel() < 30; // Jika bahan bakar kurang dari 30%, dianggap rendah
    }

    // Implementasi metode untuk mendarat darurat
    @Override
    public void emergencyStop() {
        setSpeed(0); // Set kecepatan menjadi 0
        System.out.printf("%s Melakukan pendaratan darurat di Bandara Sepinggan%n", getName());
    }

    // Mengembalikan jenis kendaraan
    @Override
    public String getVehicleType() {
        return "Kendaraan Udara";
    }

}

// Kelas utama untuk menjalankan program
public class VehicleDemo {
    public static void main(String[] args) {

        // Buat berbagai jenis kendaraan
        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new LandVehicle("Mobil", 120, 100, 4);
        vehicles[1] = new WaterVehicle("Kapal", 80, 100, true);
        vehicles[2] = new LandVehicle("Truk", 90,20, 6);
        vehicles[3] = new FlyingVehicle("Pesawat", 1000, 80, 6);


        // Memproses setiap kendaraan
        for (Vehicle vehicle : vehicles) {
            vehicle.displayStatus(); // Menampilkan informasi kendaraan
            vehicle.move(); // Menggerakkan kendaraan
            vehicle.calculateFuelConsumption(50); // Menghitung konsumsi bahan bakar untuk jarak 100 km
            
            // Cek dan isi ulang bahan bakar jika hampir habis
            if (vehicle instanceof Refuelable refuelable) {
                if (refuelable.isFuelLow()) {
                    System.out.printf("PERINGATAN: Bahan bakar %s rendah (%.2f%%)! Mengisi ulang...%n", 
                                    vehicle.getName(), vehicle.getFuelLevel());
                    refuelable.refuel(30);
                }
            }
            
            // Berhenti darurat jika kecepatan melebihi 120 km/jam
            if (vehicle instanceof EmergencyStop emergencyStop) {
                if (vehicle.getSpeed() > 120) {
                    emergencyStop.emergencyStop();
                }
            }
            
            // Fitur khusus untuk WaterVehicle (Kendaraan Air)
            if (vehicle instanceof WaterVehicle waterVehicle) {
                waterVehicle.setDepth(10.5);
            }
            
            System.out.println();
        }
    }
}