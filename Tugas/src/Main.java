import java.util.Scanner;
import java.util.Stack;
public class Main {
    private Stack <Buku> dataBuku;
    public static void main(String[] args) throws Exception {
        Main Screen = new Main();
        Screen.inputData();
        Screen.CetakData();
    }
    public void inputData(){
        Scanner scan = new Scanner(System.in);
        dataBuku = new Stack<Buku>();
        String Jawaban, Judul, Author, Penerbit;
        int Tahun;
        Double Kategori;
        int Nomor = 1;
        do {
            System.out.println("===========================================================");
            System.out.println("\tSelamat Datang Di Perpustakaan Sederhana");
            System.out.println("===========================================================");
            System.out.println("Silahkan Masukan Kriteria Buku\n");
            System.out.print("Judul : ");
            Judul = scan.next();
            System.out.print("Author : ");
            Author = scan.next();
            System.out.print("Penerbit : ");
            Penerbit = scan.next();
            System.out.print("Kategori (1-Teknik, 2-Manajemen, 3-Fiski, 4-Lainnya) : ");
            Kategori = scan.nextDouble();
            System.out.print("Tahun : ");
            Tahun = scan.nextInt();
            Buku buku = new Buku(Judul, Author, Penerbit, Kategori, Tahun );
            dataBuku.add(buku);
            System.out.print("Apakah Anda Ingin Menambah Lagi? (Y/N):");
            Jawaban=scan.next();
            Nomor++;
        } while (Jawaban.equals("Y") || Jawaban.equals("y"));
 scan.close();    
    }
     public void CetakData() {
        System.out.println("\n\n==========================");
        System.out.println("Daftar Buku Yang Tersedia");
        System.out.println("========================================================================");
        System.out.println("No\tJUDUL\t\tAUTHOR\t\tPENERBIT\tTAHUN\tKATEGORI");
        System.out.println("========================================================================");
        int t_sum = 0;
        int m_sum = 0;
        int f_sum = 0;
        int l_sum = 0;
        int b_sum = 0;
        for( int i = 0; i < dataBuku.size(); i++){
            System.out.println((i+1)+"\t"+dataBuku.get(i).Judul+"\t"+dataBuku.get(i).Author+"\t"+dataBuku.get(i).Penerbit+"\t"+dataBuku.get(i).Tahun+"\t"+dataBuku.get(i).Keterangan+"\t");
            if (dataBuku.get(i).Keterangan.equals("Teknik")) {
                t_sum++;
            } else if (dataBuku.get(i).Keterangan.equals("Manajemen")) {
                m_sum++;
            } else if (dataBuku.get(i).Keterangan.equals("Fiksi")){ 
                f_sum++;
            } else if (dataBuku.get(i).Keterangan.equals("Lainnya")) {
                l_sum++;
            }
            if (dataBuku.get(i).Tahun >= 2020){
                b_sum++;
            }
     }
        System.out.println("========================================================================");
        System.out.println("\n\nJumlah Buku : " + dataBuku.size());
        System.out.println("Jumlah Buku Teknik :"+t_sum);
        System.out.println("Jumlah Buku Manajemen :"+m_sum);
        System.out.println("Jumlah Buku Fiksi :"+f_sum);
        System.out.println("Jumlah Buku Lainnya :"+l_sum);
        System.out.println("Jumlah Buku Lawas :"+(dataBuku.size()-b_sum));
        System.out.println("Jumlah Buku Baru :"+b_sum);
    
    }
   
}
