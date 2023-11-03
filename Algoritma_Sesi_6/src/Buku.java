public class Buku {
    int id;
    String Judul;
    String Pengarang;
    String Penerbit;
    int KategoriId;
    int Tahun;
    

    Buku (int id, String Judul, String pengarang, String Penerbit, int KategoriId, int Tahun){
        this.id = id;
        this.Judul = Judul;
        this.Pengarang = pengarang;
        this.Penerbit = Penerbit;
        this.KategoriId = KategoriId;
        this.Tahun = Tahun;
    }
}
