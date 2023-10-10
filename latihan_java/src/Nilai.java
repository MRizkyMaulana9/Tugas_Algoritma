import java.util.Scanner;
public class Nilai {
    public static void main(String[] args) throws Exception {
       Double Nilai;
       String indeksNilai;
       
       Scanner input = new Scanner (System.in);
       System.out.println("Masukan Nilai");
       Nilai = input.nextDouble();
       if (Nilai > 75) {
        indeksNilai = "A";
       } else if (Nilai > 65) {
        indeksNilai = "B";
       } else if (Nilai > 55) {
        indeksNilai = "C";
       } else {
        indeksNilai = "D";
       }

       System.out.println("Indeks nilai:" + indeksNilai);
       input.close();
    }  
}
