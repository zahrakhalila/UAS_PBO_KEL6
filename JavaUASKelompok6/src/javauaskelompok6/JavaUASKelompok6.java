/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javauaskelompok6;
import manis.*;
import tawar.*;
import pizza.*;
/**
 *
 * @author WINDOWS 11
 */
public class JavaUASKelompok6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ManisVar1 mv1 = new ManisVar1();
        ManisVar2 mv2 = new ManisVar2();
        ManisVar3 mv3 = new ManisVar3();
        TawarVar1 tv1 = new TawarVar1();
        TawarVar2 tv2 = new TawarVar2();
        PizzaVar1 pv1 = new PizzaVar1();
         
//      Pesanan
        mv1.pesanan = 50;
        mv2.pesanan = 100;
        mv3.pesanan = 70;
        tv1.pesanan = 20;
        tv2.pesanan = 15;
        pv1.pesanan = 10;
        
//      Menghitung Total Kebutuhan tiap bahan 
     
        double kebutuhanTepung = mv1.hitungTerigu() + mv2.hitungTerigu() + mv3.hitungTerigu() + tv1.hitungTerigu() + tv2.hitungTerigu() + pv1.hitungTerigu();
        double kebutuhanGula = mv1.hitungGula() + mv2.hitungGula() + mv3.hitungGula() + tv1.hitungGula() + tv2.hitungGula() + pv1.hitungGula();
        double kebutuhanButter = mv1.hitungButter() + mv2.hitungButter() + mv3.hitungButter() + tv1.hitungButter() + tv2.hitungButter() + pv1.hitungButter();
        double kebutuhanRagi = mv1.hitungRagi() + mv2.hitungRagi() + mv3.hitungRagi() + tv1.hitungRagi() + tv2.hitungRagi() + pv1.hitungRagi();
        double kebutuhanSusuBubuk = mv1.hitungSusuBubuk() + mv2.hitungSusuBubuk() + mv3.hitungSusuBubuk() + tv1.hitungSusuBubuk() + tv2.hitungSusuBubuk() + pv1.hitungSusuBubuk();
        double kebutuhanSusuCair = mv1.hitungSusuCair() + mv2.hitungSusuCair() + mv3.hitungSusuCair() + tv1.hitungSusuCair() + tv2.hitungSusuCair() + pv1.hitungSusuCair();
        double kebutuhanTelur = mv1.hitungTelur() + mv2.hitungTelur() + mv3.hitungTelur() + tv1.hitungTelur() + tv2.hitungTelur() + pv1.hitungTelur();
        double kebutuhanEs = mv1.hitungEs() + mv2.hitungEs() + mv3.hitungEs() + tv1.hitungEs() + tv2.hitungEs() + pv1.hitungEs();
       
//      menampilkan harga tiap produk
        System.out.println("=============================================");
        System.out.println("Harga Jual Per Pcs");
        System.out.println("---------------------------------------------");
        System.out.println("Roti Manis Varian 1       Rp.  "+String.format("%,.0f",mv1.hargaVarian()));
        System.out.println("Roti Manis Varian 2       Rp.  "+String.format("%,.0f",mv2.hargaVarian()));
        System.out.println("Roti Manis Varian 3       Rp.  "+String.format("%,.0f",mv3.hargaVarian()));
        System.out.println("Roti Tawar Varian 1       Rp. " +String.format("%,.0f",tv1.hargaVarian()));
        System.out.println("Roti Tawar Varian 2       Rp. " +String.format("%,.0f",tv2.hargaVarian()));
        System.out.println("Pizza Varian 1            Rp. " +String.format("%,.0f",pv1.hargaVarian()));
        
//      Menampilkan kebutuhan barang / material yang dipakai
        System.out.println("=============================================");
        System.out.println("Total Kebutuhan Barang");
        System.out.println("---------------------------------------------");
        System.out.println("Kebutuhan Tepung  " + "         "+String.format("%,.0f",kebutuhanTepung) + " gr");
        System.out.println("Kebutuhan Gula  " + "            "+String.format("%,.0f",kebutuhanGula) + " gr");
        System.out.println("Kebutuhan Butter  " + "          "+String.format("%,.0f",kebutuhanButter) + " gr");
        System.out.println("Kebutuhan Ragi  " + "              "+String.format("%,.0f",kebutuhanRagi) + " gr");
        System.out.println("Kebutuhan Susu Bubuk  " + "      "+String.format("%,.0f",kebutuhanSusuBubuk) + " gr");
        System.out.println("Kebutuhan Susu Cair  " + "       "+String.format("%,.0f",kebutuhanSusuCair) + " gr"); 
        System.out.println("Kebutuhan Telur  " + "             "+String.format("%,.0f",kebutuhanTelur) + " gr");
        System.out.println("Kebutuhan Es Batu  " + "         "+String.format("%,.0f",kebutuhanEs) + " gr");

    }
     
}
