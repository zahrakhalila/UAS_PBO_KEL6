/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modal;
import adonan.AdonanTawar;
/**
 *
 * @author WINDOWS 11
 */
public class Tawar extends AdonanTawar implements ModalInterface{
    @Override
    public double hitungModal(){
        double modal = (this.tepungTerigu() * this.hargaTepung()) + (this.gulaPasir() * this.hargaGulaPasir()) + (this.butter() * this.hargaButter()) + (this.ragi() * this.hargaRagi()) + (this.susuBubuk() * this.hargaSusuBubuk()) + (this.susuCair() * this.hargaSusuCair()) + (this.telur() * this.hargaTelur()) + (this.esBatu() * this.hargaEsBatu());
        return modal;
    }
     
    @Override
    public int beratAdonan(){
        return 400;
    }
    
    @Override
    public double rotiPerAdonan(){
        return this.hitungBerat() / this.beratAdonan();
    }
    
//  HITUNG BANYAKNYA TIAP BAHAN UNTUK ROTI 
    
    public int pesanan;
 
    @Override
    public double hitungTerigu(){
        double hitung = this.tepungTerigu() / this.rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hitungGula() {
        double hitung = this.gulaPasir() / this.rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hitungButter() {
        double hitung = this.butter()/ this.rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hitungRagi() {
        double hitung = this.ragi() / this.rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hitungSusuBubuk() {
        double hitung = this.susuBubuk() / this.rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hitungSusuCair() {
        double hitung = this.susuCair() / this.rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hitungTelur() {
        double hitung = this.telur() / this.rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hitungEs() {
        double hitung = this.esBatu() / this.rotiPerAdonan() * pesanan;
        return hitung;
    }
}
