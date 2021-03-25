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
public class Sayfa extends Paylasim{ //teklifedenler

    public Sayfa(String isim) {
        super(isim);
    }

    @Override
    public void paylas(Post post) {
System.out.println(getIsim()+" sayfası "+post.getBaslik()+" paylaştı.");  
   tumunuBilgilendir(post);
    }

   
    
}
