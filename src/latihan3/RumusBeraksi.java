package latihan3;

public class RumusBeraksi {
    public static void main(String[] args) {
        // Membuat objek dengan nama panggilan saya
        Rumus alex = new Rumus();
        
        // Menghitung luas persegi
        alex.sisi = 5; // set nilai sisi
        alex.hitungLuasPersegi();
        System.out.println("Luas Persegi dengan sisi " + alex.sisi + " = " + alex.getHasil());
        
        // Menghitung luas persegi panjang
        alex.panjang = 8; // set nilai panjang
        alex.lebar = 3;   // set nilai lebar
        alex.hitungLuasPersegiPanjang();
        System.out.println("Luas Persegi Panjang " + alex.panjang + "x" + alex.lebar + " = " + alex.getHasil());
    }
}