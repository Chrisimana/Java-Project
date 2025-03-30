public class PrimaDoWhile {
    public static void main(String[] args) {
        
        System.out.println("Bilangan prima antara 1-1000 : ");
        int i = 2;
        
        do {
            boolean isPrima = true;
            int j = 2;
            
            do {
                if (j > Math.sqrt(i)) break;
                if (i % j == 0) {
                    isPrima = false;
                    break;
                }
                j++;
            } while (j <= Math.sqrt(i));
            
            if (isPrima) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= 1000);
    }
}