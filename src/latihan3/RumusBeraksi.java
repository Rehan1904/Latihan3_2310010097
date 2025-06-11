package latihan3;

public class RumusBeraksi {
    public static void main(String[] args) {
        // Membuat objek dengan nama panggilan saya
        Rumus rehan = new Rumus();
        
        // Menghitung luas persegi
        rehan.sisi = 5; // set nilai sisi
        rehan.hitungLuasPersegi();
        System.out.println("Luas Persegi dengan sisi " + rehan.sisi + " = " + rehan.getHasil());
        
        // Menghitung luas persegi panjang
        rehan.panjang = 8; // set nilai panjang
        rehan.lebar = 3;   // set nilai lebar
        rehan.hitungLuasPersegiPanjang();
        System.out.println("Luas Persegi Panjang " + rehan.panjang + "x" + rehan.lebar + " = " + rehan.getHasil());
    }
}