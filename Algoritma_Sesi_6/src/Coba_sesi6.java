import java.util.ArrayList;
public class Coba_sesi6 {
    public static void main(String[] args) throws Exception {
    ArrayList<String>Negara = new ArrayList<String>(); 
    Negara.add("Indonesia");
    Negara.add("Singapura");
    Negara.add("Malaysia");
    Negara.add("Jepang");
    Negara.add("Jerman");
    Negara.add(2,"Nepal");
    Negara.add(0, "Amerika");
    Negara.add("Turki");
    Negara.add("Vietnam");
    Negara.add("India");
        Negara.remove(8);
    System.out.println(Negara);
        System.out.println(Negara.size());
    }
}