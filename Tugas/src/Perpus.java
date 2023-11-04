import java.util.Scanner;
import java.util.ArrayList;
public class Perpus {
    public static void main(String[] args) throws Exception {
        
        Scanner Keyboard = new Scanner(System.in);
    
    /*System.out.print("Nomor :");
    int nomor = Keyboard.nextInt();
    System.out.print("Judul :");
    String Judul = Keyboard.next();
    System.out.print("Author :");
    String Author = Keyboard.next();
    System.out.print("Penerbit :");
    String Penerbit = Keyboard.next();
    System.out.print("Tahun :");
    String Tahun = Keyboard.next();*/
Keyboard.close();    
}
}
    class book {        
    String Kategori;
        book(String Kategori){
        this.Kategori = Kategori;
        }
    public static void main(String[] args) throws Exception {
    ArrayList<book> KategoriBuku = new ArrayList<book>(); 
    KategoriBuku.add(new book("Teknik"));
    KategoriBuku.add(new book("Manajemen"));
    KategoriBuku.add(new book("Fiksi"));
    KategoriBuku.add(new book("Lainnyak"));     
    //for(book Kategories : KategoriBuku){ 
    //System.out.println(Perpus.main();;  +" "+ Judul +" "+ Author +" "+ Penerbit +" "+ Tahun +" "+ Kategories.Kategori );
    }
    
}
