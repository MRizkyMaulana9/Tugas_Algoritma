 import java.util.Stack;
public class cobastack {
   
    public static void main(String[] args) throws Exception {
        Stack<String> Binatang = new Stack <String>();
        Binatang.push("Ayam");
        Binatang.push("Tikus");
        Binatang.push("Kucing");
        Binatang.push("Buaya");
        Binatang.push("Harimau");
        Binatang.clear();
        if (Binatang.isEmpty()) {
            System.out.println("Stack Kosong");
        } else{
            System.out.println("Tidak Kosong");
        }
        
}
}