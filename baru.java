class Handphone {
    String seri;
    String ram;
    String merk;
    String penyimpanan;
    String warna;
};

class Hp extends Handphone {
    Hp(String Seri,  String Ram, String Merk, String Storage, String Warna) {
        seri = Seri;
        ram = Ram;
        merk = Merk;
        penyimpanan = Storage;
        warna = Warna;
    }

    String spesifikasi() {
        return "Nomor Seri: " + seri + ", Merk: " + merk + ", RAM: "+ ram +
                ", Storage : " + penyimpanan + ", Warna: " + warna;
    }
};

class Tampil {
    public static void main(String args[]){
        Hp pertama = new Hp("1","8 GB","Samsung","516 GB","Ungu");
        Hp kedua = new Hp("2","16 GB","Asus","516 GB","Putih");
        Hp ketiga = new Hp("3","4 GB","Vivo","256 GB","Putih");
        Hp keempat = new Hp("4","3 GB","Iphone","64 GB","Hijau");
        Hp kelima = new Hp("5","4 GB","Iphone","128 GB","Merah");

        System.out.println(pertama.spesifikasi());
        System.out.println(kedua.spesifikasi());
        System.out.println(ketiga.spesifikasi());
        System.out.println(keempat.spesifikasi());
        System.out.println(kelima.spesifikasi());

    }
}