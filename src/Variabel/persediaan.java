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
public class persediaan {
    // Variabel Permintaan
    private static double stock;
    
    // Nilai dari grafik
    private static double kordinat1 = 0;
    private static double kordinat2 = 100;
    private static double kordinat3 = 600;
 
    // Agar bisa mengambil nilai permintaan
    public static double getPersediaan(){
        return stock;
    }
    
    // Memberikan/menentukan nilai nilai pada inputan
    public static void setStock(double stock) {
        persediaan.stock = stock;
    }
    
    // Grafik fungsi Sedikit
    public static double sedikit(){
        if(stock >= kordinat1 && stock <= kordinat2) return 1;
        else if (stock > kordinat2 && stock < kordinat3) return (kordinat3 - stock) / (kordinat3 - kordinat2);
        else return 0;
    }
    
    // Grafik fungsi Banyak
    public static double banyak(){
        if(stock > kordinat2 && stock < kordinat3) return (stock - kordinat2)/(kordinat3 - kordinat2);
        else if (stock >= kordinat3) return 1;
        else return 0;
    }
}
