import java.util.ArrayList;
public class Buku2 {
    int id;
    String Judul_buku;
    String Pengarang;
    String Penerbit;
    int Tahun;
    String Kategori;
    Buku2 (int id, String Judul_buku, String pengarang, String Penerbit, int Tahun, String Kategori){
        this.id = id;
        this.Judul_buku = Judul_buku;
        this.Pengarang = pengarang;
        this.Penerbit = Penerbit;
        this.Tahun = Tahun;
        this.Kategori = Kategori;
    } 
    public static void main(String[] args) throws Exception {
         ArrayList<Buku2> Kategoribuku = new ArrayList<Buku2>();
        
        Kategoribuku.add (new Buku2(1, "PB0 Dengan Java", "Abdul Kadir", "Erlangga", 2008, "Teknik"));  

        
        for(Buku2 Datahp : Kategoribuku){
            System.out.println ( Datahp.id + " " + Datahp.Judul_buku + " " + Datahp.Pengarang + " " + Datahp.Penerbit + " " + Datahp.Tahun);
        }

    }
}