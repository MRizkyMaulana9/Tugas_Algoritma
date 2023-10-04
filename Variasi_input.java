import  java.util.Scanner;
public class Variasi_input {
    public static void main(String[]args){
      Scanner masukan_data = new Scanner(System.in);
      int tarif = 2000;
      int total_jam_parkir;
      int hasil;
      System.out.println("===============================");
      System.out.println("SELAMAT DATANG DI SISTEM PARKIR");
      System.out.println("===============================\n");
      System.out.println("Masukan Jam Masuk");
      int jam_masuk = masukan_data.nextInt();
      System.out.println(" ");
      System.out.println("Masukan Jam Keluar");
      int jam_keluar = masukan_data.nextInt();
      total_jam_parkir = jam_keluar - jam_masuk;
      hasil = total_jam_parkir * tarif;
      System.out.println(" ");
      System.out.println("===============================");
      System.out.println("Total Yang Harus Di Bayar Rp." + hasil);
      System.out.println("===============================");
      masukan_data.close();
    }
}
