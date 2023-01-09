/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manis;
import hargaBahan.InterfaceBahan;
import modal.Manis;
/**
 *
 * @author WINDOWS 11
 */
public class ManisVar2 extends Manis implements InterfaceBahan{    
    @Override
    public double filling() {
        double selaiRedBean = this.hargaSelaiRedBean()* 10;
        double harga = selaiRedBean;
        return harga;
    }
    
    @Override
    public double topping() {
        double krimVanilla  = this.hargaKrimVanilla()* 5;
        double harga = krimVanilla;
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
