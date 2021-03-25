/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;


/**
 *
 * @author AYŞE
 */
public class Post { //urun
    private String isim;
    
  
    public Post(String isim){
        setIsim(isim);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    
}
