/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai_nardikakurniawan_fuzzy_tsukomoto;

import Variabel.karyawan;
import Variabel.permintaan;
import Variabel.persediaan;
import Variabel.produksi;

/**
 *
 * @author User
 */
public class ruleBase {
    
    private static double [] x_produksi = new double[9];
    private static double [] y_produksi = new double[9];
    private static double jumlah;
    
    // rule base
    public static void menghitung_X(){
        x_produksi[0] = Math.min(permintaan.turun(), persediaan.banyak());
        x_produksi[0] = Math.min(x_produksi[0], karyawan.sedikit());
        
        x_produksi[1] = Math.min(permintaan.turun(), persediaan.banyak());
        x_produksi[1] = Math.min(x_produksi[1], karyawan.banyak());
        
        x_produksi[2] = Math.min(permintaan.turun(), persediaan.sedikit());
        x_produksi[2] = Math.min(x_produksi[2], karyawan.sedikit());
        
        x_produksi[3] = Math.min(permintaan.turun(), persediaan.sedikit());
        x_produksi[3] = Math.min(x_produksi[3], karyawan.banyak());
        
        x_produksi[4] = Math.min(permintaan.naik(), persediaan.banyak());
        x_produksi[4] = Math.min(x_produksi[4], karyawan.sedikit());
        
        x_produksi[5] = Math.min(permintaan.naik(), persediaan.banyak());
        x_produksi[5] = Math.min(x_produksi[5], karyawan.banyak());
        
        x_produksi[6] = Math.min(permintaan.naik(), persediaan.sedikit());
        x_produksi[6] = Math.min(x_produksi[6], karyawan.sedikit());
        
        x_produksi[7] = Math.min(permintaan.naik(), persediaan.sedikit());
        x_produksi[7] = Math.min(x_produksi[7], karyawan.banyak());
    }
    
    public static void menghitung_Y(){
        y_produksi[0] = produksi.berkurang( x_produksi[0]);       
        y_produksi[1] = produksi.bertambah( x_produksi[1]);
        y_produksi[2] = produksi.berkurang( x_produksi[2]);
        y_produksi[3] = produksi.berkurang( x_produksi[3]);
        y_produksi[4] = produksi.berkurang( x_produksi[4]);
        y_produksi[5] = produksi.bertambah( x_produksi[5]);
        y_produksi[6] = produksi.berkurang( x_produksi[6]);
        y_produksi[7] = produksi.berkurang( x_produksi[7]);
    }
    
    // Menghitung Nilai
    public static double hasilProduksi() {
        double atas = 0, bawah = 0;
        
        for(int i=0; i<9; i++) {
            System.out.println("y_produksike-" + i + ":" + y_produksi[i] );
            System.out.println("x_produksike-" + i + ":" + x_produksi[i] );
            atas += (x_produksi[i] * y_produksi[i]);
            bawah += x_produksi[i];
        }
        System.out.println(atas/bawah);
        return (atas/bawah);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
