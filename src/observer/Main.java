/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author AYŞE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kullanici kullanici1 = new Kullanici("sefa aras", "sefa@ktu.edu.tr");
        Kullanici kullanici2 = new Kullanici("hakan bozkurt", "hakan@ktu.edu.tr");
        Kullanici kullanici3 = new Kullanici("Tolga Kahraman", "tolga@ktu.edu.tr");
        Grup grup = new Grup("Yazılım");
        Sayfa sayfa = new Sayfa("oftekfak");
        
        kullanici1.takipciEkle(kullanici2);
        kullanici1.takipciEkle(kullanici3);
        kullanici1.takipciEkle(grup);
        sayfa.takipciEkle(kullanici1);
        sayfa.takipciEkle(kullanici2);
        sayfa.takipciEkle(kullanici3);
        sayfa.takipciCikar(kullanici2);
        sayfa.takipciEkle(grup);

        kullanici1.paylas(new Post("resim", getImage(), kullanici1));
        sayfa.paylas(new Post("Başlık", "İçerik", sayfa));
    }

    public static BufferedImage getImage() {
        String imagePath = "Test Image";
        try {
            return ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            return null;
        }
    }
}
