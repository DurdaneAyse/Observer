/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AYŞE
 */
public abstract class Paylasim {
    private String isim;
    private List <Takipci>  teklifEdenler;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    public Paylasim(String isim){
        setIsim(isim);
        teklifEdenler=new ArrayList<>();
    }
    
    public void tumunuBilgilendir(Post post){
        for(Takipci takipci: teklifEdenler){
            takipci.Bilgilendir(post);
         }
    }
    public abstract void paylas(Post post);
}
