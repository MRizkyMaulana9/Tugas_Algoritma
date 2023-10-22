import  java.util.Scanner;
public class Tugas {
    public static void main(String[] args) throws Exception {
        Scanner data = new Scanner(System.in);
        System.out.println("Masukan Angka A");
      int Angka = data.nextInt();
      System.out.println("Masukan Angka B");
      int angka_b = data.nextInt();

          if(Angka + angka_b > 20){
           System.out.println("Lebih Besar dari 20");
          } else {
             System.out.println("Lebih Kecil dari 20");
          }
          data.close();
    }
}