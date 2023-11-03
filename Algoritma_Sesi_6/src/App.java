import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
    ArrayList<String>animals = new ArrayList<String>(); 
    // Ad Array
    animals.add("kodok");
    animals.add("kura-kura");
    animals.add(0,"Lumba-Lumba");
    animals.add("Burung");
    animals.add(0,"Katak");

    // Remove Array
    animals.remove(0);
    // clear array
    System.out.println(animals);

   }
}
