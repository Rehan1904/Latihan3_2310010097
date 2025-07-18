package latihan3;

/**
 * Nama: [Muhammad Rayhan Ariadi]
 * NPM: [2310010097]
 * Kelas: [4D]
 */
public class Rumus {
    // Atribut
    int sisi;
    int panjang;
    int lebar;
    int hasil;
    
    // Konstruktor
    public Rumus() {
        this.sisi = 0;
        this.panjang = 0;
        this.lebar = 0;
        this.hasil = 0;
    }
    
    // Method menghitung luas persegi
    public void hitungLuasPersegi() {
        this.hasil = this.sisi * this.sisi;
    }
    
    // Method menghitung luas persegi panjang
    public void hitungLuasPersegiPanjang() {
        this.hasil = this.panjang * this.lebar;
    }
    
    // Accessor untuk mendapatkan nilai hasil
    public int getHasil() {
        return this.hasil;
    }
}