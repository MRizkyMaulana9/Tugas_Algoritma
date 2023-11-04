import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        ArrayList<Kategori> ListKategori = new ArrayList<Kategori>();
        ListKategori.add(new Kategori(1, "Teknik"));
        ListKategori.add(new Kategori(2, "Manajemen"));
        ListKategori.add(new Kategori(3, "Fiksi"));
        ListKategori.add(new Kategori(4, "Lawas"));
        ListKategori.add(new Kategori(5, "Baru"));
        ListKategori.add(new Kategori(6, "Lainnya"));

        ArrayList<Buku> ListBuku = new ArrayList<Buku>();
        ListBuku.add (new Buku(1, "PB0 Dengan Java", "Abdul Kadir", "Erlangga", 1, 2008));
        ListBuku.add (new Buku(2, "Dasar Pemrograman Java", "Abdul Kadir", "Erlangga", 1, 2008));
        ListBuku.add (new Buku(3, "Komputer & Pemrograman", "Abdul Kadir", "Erlangga", 3, 2008));

        ArrayList<Total> total = new ArrayList<Total>();
 
        for(Buku buku: ListBuku){
            total.add(new Total(buku.KategoriId-1,+1));
           System.out.println(buku.id + " " + buku.Judul + " " + buku.Pengarang + " " + buku.Penerbit + " " + buku.Tahun + " " + ListKategori.get(buku.KategoriId-1).NamaKategori);
        }
        for(Total tot: total){
            System.out.println("Buku " + ListKategori.get(tot.IdKategori).NamaKategori + " " + tot.jumlah);
        }
        //for(Total tot: total){
          //  System.out.println("Buku " + ListKategori.get(tot.IdKategori).NamaKategori + " " + tot.jumlah);
        //}

    }
}
       
        // List<String> combinedList = Stream.of(ListBuku, Kategori)
        // .flatMap(x -> x.stream())
        // .collect(Collectors.toList());

        // System.out.println(combinedList);
        // Kategoribuku.addAll(Kategori);  //Merge both lists
        //System.out.println(Kategori);