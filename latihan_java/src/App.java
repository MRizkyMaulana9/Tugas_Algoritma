import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int tahun = 2023;
        int usia;
        System.out.println("Masukan tahun lahir");
        int tahun_lahir = input.nextInt();
        usia = tahun - tahun_lahir;
        System.out.println("Usia anda adalah" + usia);
        input.close();
    }
    
}
