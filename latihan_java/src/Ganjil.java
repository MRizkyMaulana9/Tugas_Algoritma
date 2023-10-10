import java.util.Scanner;
public class Ganjil {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        /*Menghitung bilangan ganjil/genap */
        System.out.println("Masukan Angka"); 
        int angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.print(angka + " Adalah Bilangan Genap"); 
        } else {
            System.out.print(angka + " Adalah Bilangan Ganjil");
        } input.close();
    }
}