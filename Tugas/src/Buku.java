public class Buku{
    public String Judul;
    public String Author;
    public String Penerbit;
    public Double Kategori;
    public String Keterangan;
    public int Tahun;

    public Buku(String Judul, String Author, String Penerbit, Double Kategori, int Tahun){
        this.Judul = Judul.length() < 8 ? Judul + "\t" : Judul;
        this.Author = Author.length() < 8 ? Author + "\t" : Author;
        this.Penerbit = Penerbit.length() < 8 ? Penerbit+ "\t" : (Penerbit.length() <16 ? Penerbit + "\t" : Penerbit);
        this.Kategori = Kategori;
        this.Tahun = Tahun;
        if (Kategori == 1){
            this.Keterangan = "Teknik";
        } else if (Kategori == 2){
            this.Keterangan = "Manajemen";
        } else if (Kategori == 3){
            this.Keterangan = "Fiksi"; 
        } else {
            this.Keterangan = "Lainnya";
        }
    }

}