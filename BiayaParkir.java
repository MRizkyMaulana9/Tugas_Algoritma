import  java.util.Scanner;
public class BiayaParkir {
    public static void main(String[]args){
      Scanner data = new Scanner(System.in);
      int tarif = 2000;
      int total_jam_parkir;
      int hasil;
      System.out.println("===============================");
      System.out.println("SELAMAT DATANG DI SISTEM PARKIR");
      System.out.println("===============================\n");
      System.out.println("Masukan Jam Masuk");
      int jam_masuk = data.nextInt();
      System.out.println(" ");
      System.out.println("Masukan Jam Keluar");
      int jam_keluar = data.nextInt();
      total_jam_parkir = jam_keluar - jam_masuk;
      hasil = total_jam_parkir * tarif;
      System.out.println(" ");
      System.out.println("==================================");
      System.out.println("Total Yang Harus Di Bayar Rp." + hasil);
      System.out.println("==================================");
      data.close();

      //M. Rizky Maulana_Algoritma dan Struktur_TI B
    }
}