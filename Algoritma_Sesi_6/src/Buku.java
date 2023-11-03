import java.util.ArrayList;
public class Buku {
    int id;
    String Judul_buku;
    String Pengarang;
    String Penerbit;
    int Tahun;
    String Kategori;
    Buku (int id, String Judul_buku, String pengarang, String Penerbit, int Tahun, String Kategori){
        this.id = id;
        this.Judul_buku = Judul_buku;
        this.Pengarang = pengarang;
        this.Penerbit = Penerbit;
        this.Tahun = Tahun;
        this.Kategori = Kategori;
    } 
    public static void main(String[] args) throws Exception {
         ArrayList<Buku> Kategoribuku = new ArrayList<Buku>();
        
        Kategoribuku.add (new Buku(1, "PB0 Dengan Java", "Abdul Kadir", "Erlangga", 2008, "Teknik");  

        
        for(Handphone datahandphone : daftarHandphones){
            System.out.println(datahandphone.id + " " + datahandphone.nama_brand + " " + datahandphone.tipe_hp + " " + datahandphone.warna + " " + datahandphone.harga);
        }

    }
}