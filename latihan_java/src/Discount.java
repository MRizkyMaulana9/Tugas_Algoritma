import java.util.Scanner;
public class Discount {
    public static void main(String[] args) throws Exception {
        Double totalBelanja, discount;
        Scanner input = new Scanner (System.in);
        System.out.print("Masukan Total Belanja");
        totalBelanja = input.nextDouble();

        if (totalBelanja >= 1000000) {
           discount = 5/100 * totalBelanja;
           totalBelanja = totalBelanja - discount;
        }

        System.out.print("Maka Total Yang harus dibayar Rp. "+ totalBelanja);
        input.close();
    }
}