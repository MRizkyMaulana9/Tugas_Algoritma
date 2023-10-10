import java.util.Scanner;
public class Discount {
    public static void main(String[] args) throws Exception {
        double totalBelanja; 
        double discount;
        Scanner input = new Scanner (System.in);
        System.out.println("Masukan Total Belanja");
        totalBelanja = input.nextDouble();
        double bayar = totalBelanja;
        if (totalBelanja >= 1000000) {
           discount = 0.05 * totalBelanja;
           bayar = totalBelanja - discount;
        } else if ( totalBelanja < 1000000) {
           bayar = totalBelanja;
        }
        
        System.out.println("Maka Total Yang harus dibayar Rp. "+ bayar);
        input.close();
    }
}