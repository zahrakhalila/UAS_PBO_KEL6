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
public class ManisVar3 extends Manis implements InterfaceBahan{
    String nama = "Roti Manis Varian 3";
    
    @Override
    public double filling() {
        double keju = this.hargaKeju() * 10;
        double sosis = this.hargaSosis() * 10;
        double harga = keju + sosis;
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
