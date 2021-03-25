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
public class Kullanici extends Paylasim implements Takipci{
   
    private String mail;

   

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    public Kullanici(String isim,String mail){
         super(isim);
         setMail(mail);
    }

    @Override
    public void paylas(Post post) {
   System.out.println(getIsim()+" kullanıcısı "+post.getIsim()+" paylaşım yaptı");
    tumunuBilgilendir(post);
    }

    @Override
    public void Bilgilendir(Post post) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
