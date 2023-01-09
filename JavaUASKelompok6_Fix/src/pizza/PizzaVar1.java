/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizza;
import hargaBahan.InterfaceBahan;
import modal.Pizza;
/**
 *
 * @author WINDOWS 11
 */
public class PizzaVar1 extends Pizza implements InterfaceBahan{
    String nama = "Pizza Varian 1";
    
    @Override
    public double filling() {
        double harga = 0;
        return harga;
    }
    
    @Override
    public double topping() {
        double keju  = this.hargaKeju()* 30;
        double sosis  = this.hargaSosis()* 50;
        double smokedBeef  = this.hargaSmokedBeef()* 50;
        double bawangBombay  = this.hargaBawangBombay()* 30;
        double harga = keju + sosis + smokedBeef + bawangBombay;
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
