/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tawar;
import hargaBahan.InterfaceBahan;
import modal.Tawar; 
/**
 *
 * @author WINDOWS 11
 */
public class TawarVar2 extends Tawar implements InterfaceBahan{
    
    @Override
    public double filling() {
        double keju  = this.hargaKeju()* 80;
        double harga = keju;
        return harga;
    }
    
    @Override
    public double topping() {
        double harga = 0;
        return harga;
    }

    @Override
    public double modal() {
        double hargaTopFill = this.filling() + this.topping();
        double hargaBahan = this.hitungModal() / this.rotiPerAdonan();
        double modalTotal = hargaBahan + hargaTopFill;
        return modalTotal;
    }
    
    @Override
    public double hargaVarian(){
        double untung = this.modal() * 0.5;
        double harga = this.modal() + untung;
        return Math.round(harga);
    }
}
