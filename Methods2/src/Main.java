public class Main {

    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel. ";
        String yeniMesaj = mesaj.substring(0,2);
        System.out.println(yeniMesaj);
        int hesapMak = topla(8,95);
        int hesap2 = topla2(2,3123,123,324,2424,35);
        System.out.println(hesap2);
        System.out.println(hesapMak);
    }

    public static void ekle() {
        System.out.println("Eklendi");

    }

    public static void sil() {
        System.out.println("Silindi");
    }

    public static void guncelle() {
        System.out.println("Güncellendi");
    }
    public static int topla(int sayi1,int sayi2) {
        int toplam = sayi1+sayi2;
        return toplam;
    }
    public static int topla2 (int... sayilar) {
        int toplam = 0;
        for(int sayi:sayilar) {
            toplam+=sayi;
        }
        return toplam;
    }
    public static String sehirVer() {
        return "Ankara";
    }
}
