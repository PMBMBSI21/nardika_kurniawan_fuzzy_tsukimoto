/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Variabel;

/**
 *
 * @author User
 */
public class produksi {
    // Variabel Permintaan
    private static double produk;
    
    // Nilai dari grafik
    private static double kordinat1 = 0;
    private static double kordinat2 = 2000;
    private static double kordinat3 = 7000;
 
    // Agar bisa mengambil nilai permintaan
    public static double getProduksi(){
        return produk;
    }
    
    // Memberikan/menentukan nilai nilai pada inputan
    public static void setProduksi(double produk) {
        produksi.produk = produk;
    }
    
    // Grafik fungsi Berkurang
    public static double berkurang(){
        if(produk >= kordinat1 && produk <= kordinat2) return 1;
        else if (produk > kordinat2 && produk < kordinat3) return (kordinat3 - produk)/(kordinat3 - kordinat2);
        else return 0;
    }
    
    // Grafik fungsi Bertambah
    public static double bertambah(){
        if(produk > kordinat2 && produk < kordinat3) return (produk - kordinat2)/(kordinat3 - kordinat2);
        else if (produk >= kordinat3) return 1;
        else return 0;
    }
    
    // Menghitung jumlah hasil produksi
    public static double berkurang(double in){
        return (kordinat3 - (in*(kordinat3-kordinat2)));
    }
    
    // Menghitung jumlah hasil produksi
    public static double bertambah(double in){
        return (kordinat2 + (in*(kordinat3-kordinat2)));
    }
}
