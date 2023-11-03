import java.util.ArrayList;
public class Handphone {
    int id;
    String nama_brand;
    String tipe_hp;
    String warna;
    int harga;
    Handphone (int id, String nama_brand, String tipe_hp, String warna, int harga){
        this.id = id;
        this.nama_brand = nama_brand;
        this.tipe_hp = tipe_hp;
        this.warna = warna;
        this.harga = harga;
    }    
    public static void main(String[] args) throws Exception {
        ArrayList<Handphone> daftarHandphones = new ArrayList<Handphone>();
        
        daftarHandphones.add(new Handphone(1, "Realme", "Realme C55", "Putih", 2500000));
        daftarHandphones.add(new Handphone(2, "Xiaomi", "Redmi 5 pro", "Hitam", 2900000));
        daftarHandphones.add(new Handphone(3, "Samsung", "Samsung S23", "Putih", 9500000));
        daftarHandphones.add(new Handphone(4, "Itel", "Itel S23", "Biru", 2200000));
        daftarHandphones.add(new Handphone(5, "Advan", "Advan G5", "Abu", 1500000));
        daftarHandphones.add(new Handphone(6, "Sony", "Sony Experia", "Hitam", 1400000));
        daftarHandphones.add(new Handphone(7, "Tecno", "Tecno Pova", "Biru", 2800000));
        daftarHandphones.add(new Handphone(8, "OPPO", "OPPO Reno 5", "Hijau",  5500000));
        daftarHandphones.add(new Handphone(9, "Asus", "Asus ROG 5", "Abu", 8500000));
        daftarHandphones.add(new Handphone(10, "Vivo", "Vivo Z1 Pro", "Hijau", 4500000));
        
        for(Handphone datahandphone : daftarHandphones){
            System.out.println(datahandphone.id + " " + datahandphone.nama_brand + " " + datahandphone.tipe_hp + " " + datahandphone.warna + " " + datahandphone.harga);
        }

    }
}