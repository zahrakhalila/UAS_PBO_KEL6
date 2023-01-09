/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hargaBahan;

/**
 *
 * @author WINDOWS 11
 */
public class HargaDasar extends HargaPerKemasan{
    
//    Harga per Kemasan / berat per kemasan
    public double hargaTepung(){
        return this.tepungTerigu() / 1000;
    }
    
    public double hargaGulaPasir(){
        return this.gulaPasir() / 1000;
    }
    
    public double hargaButter(){
        return this.butter() / 500;
    }
        
    public double hargaRagi(){
        return this.ragi() / 11;
    }
    
    public double hargaSusuBubuk(){
        return this.susuBubuk() / 1000;
    }
    
    public double hargaSusuCair(){
        return this.susuCair() / 1000;
    }
    
    public double hargaTelur(){
        return this.telur() / 1000;
    }
    
    public double hargaEsBatu(){
        return this.esBatu() / 1000;
    }
    
    public double hargaKeju(){
        return this.keju() / 250;
    }
    
    public double hargaCoklat(){
        return this.coklat() / 500;
    }
    
    public double hargaKrimVanilla(){
        return this.krim() / 500;
    }
    
    public double hargaSelaiRedBean(){
        return this.selai() / 500;
    }
    
    public double hargaSosis(){
        return this.sosis() / 1000;
    }
    
    public double hargaSmokedBeef(){
        return this.beef() / 1000;
    }
    
    public double hargaBawangBombay(){
        return this.bawang() / 500;
    }
       
}
