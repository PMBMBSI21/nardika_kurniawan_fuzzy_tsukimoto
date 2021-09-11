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
public class permintaan {
    
    // Variabel Permintaan
    private static double minta;
    
    // Nilai dari grafik
    private static double kordinat1 = 0;
    private static double kordinat2 = 1000;
    private static double kordinat3 = 5000;
 
    // Agar bisa mengambil nilai permintaan
    public static double getPermintaan(){
        return minta;
    }
    
    // Memberikan/menentukan nilai nilai pada inputan
    public static void setMinta(double minta) {
        permintaan.minta = minta;
    }
    
    // Grafik fungsi Turun
    public static double turun(){
        if(minta >= kordinat1 && minta <= kordinat2) return 1;
        else if (minta > kordinat2 && minta < kordinat3) return (kordinat3 - minta)/(kordinat3 - kordinat2);
        else return 0;
    }
    
    // Grafik fungsi Naik
    public static double naik(){
        if(minta > kordinat2 && minta < kordinat3) return (minta - kordinat2)/(kordinat3 - kordinat2);
        else if (minta >= kordinat3) return 1;
        else return 0;
    }
}
