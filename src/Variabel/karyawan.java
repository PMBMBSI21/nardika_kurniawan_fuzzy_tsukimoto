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
public class karyawan {
    
    private static double kerja;
    
    // Nilai dari grafik
    private static double kordinat1 = 0;
    private static double kordinat2 = 50;
    private static double kordinat3 = 200;
    
    public static double getKaryawan(){
        return kerja;
    }
    
    public static void setKaryawan(double kerja){
        karyawan.kerja = kerja;
    }
    
    // Grafik fungsi Turun
    public static double sedikit(){
        if(kerja >= kordinat1 && kerja <= kordinat2) return 1;
        else if (kerja > kordinat2 && kerja < kordinat3) return (kordinat3 - kerja)/(kordinat3 - kordinat2);
        else return 0;
    }
    
    // Grafik fungsi Naik
    public static double banyak(){
        if(kerja > kordinat2 && kerja < kordinat3) return (kerja - kordinat2)/(kordinat3 - kordinat2);
        else if (kerja >= kordinat3) return 1;
        else return 0;
    }
}
