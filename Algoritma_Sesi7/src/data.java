import java.util.Stack;
public class data {
    public static void main(String[] args) throws Exception {
        Stack<String> jurusan = new Stack <String>();
        jurusan.push("Teknik Informatika");
        jurusan.push("Teknik Mesin");
        jurusan.push("Teknik Sipil");
        jurusan.push("Teknik Industri");
        System.out.println("Stack Items \t\t;" + jurusan);
        // jurusan.pop();

        System.out.println("Stack Items \t\t:" + jurusan);
        System.out.println("Peek \t\t:" + jurusan.peek());
        System.out.println("Check Apakah Kosong? \t :" + jurusan.empty());
        System.out.println("Check Apakah Kosong? \t:" + jurusan.isEmpty());
        System.out.println("Lihat data ke 2 \t:" + jurusan.get(1));
        System.out.println("Lihat data yang pertama \t:" + jurusan.firstElement());
        System.out.println("Lihat data yang terakhir \t:" + jurusan.lastElement());
    jurusan.remove(1);
    jurusan.clear();
    System.out.println("Stack Items \t\t:" + jurusan);
    }
}
