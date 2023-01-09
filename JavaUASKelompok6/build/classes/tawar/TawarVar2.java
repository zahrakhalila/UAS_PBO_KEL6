/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tawar;
import hargaBahan.InterfaceBahan;
import modal.Tawar; 
/**
 *
 * @author ADMIN
 */
public class TawarVar2 extends Tawar implements InterfaceBahan{
    String nama = "Roti Tawar Varian 2";
    
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
