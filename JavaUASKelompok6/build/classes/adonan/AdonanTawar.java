/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adonan;

import hargaBahan.HargaDasar;
/**
 *
 * @author ADMIN
 */
public class AdonanTawar extends HargaDasar implements AdonanRoti{
    @Override
    public int tepungTerigu(){
        return 1000;
    }
    
    @Override
    public int gulaPasir(){
        return 125;
    }
    
    @Override
    public int butter(){
        return 100;
    }
    @Override
    public int ragi(){
        return 20;
    }
    @Override
    public int susuBubuk(){
        return 250;
    }
    @Override
    public int susuCair(){
        return 200;
    }
    @Override
    public int telur(){
        return 70;
    }
    @Override
    public int esBatu(){
        return 300;
    }
    @Override
    public int hitungBerat(){
        int total = this.tepungTerigu() + this.gulaPasir() + this.butter() + this.esBatu() + this.ragi() + this.susuBubuk() + this.susuCair() + this.telur();
        return total;
    }
}
