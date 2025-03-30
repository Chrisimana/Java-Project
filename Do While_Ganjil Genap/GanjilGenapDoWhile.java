public class GanjilGenapDoWhile {
    public static void main(String[] args) {

        System.out.println("Bilangan ganjil antara 1-1000 : "); 
        int i = 1; 
        do {
            System.out.print(i + " "); 
            i += 2;
        } while (i <= 1000);
        
        System.out.println("\n\nBilangan genap antara 1-1000 : ");
        i = 2;
        do {
            System.out.print(i + " ");
            i += 2;
        } while (i <= 1000); 
    }
}