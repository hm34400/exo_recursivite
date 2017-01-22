/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo_recursive;

/**
 *
 * @author hicham
 */
public class Algo_recursive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creation des repertoires
        Repertoire racine = new Repertoire("D");
        Repertoire multi = new Repertoire("Multimedia");
        Repertoire doc = new Repertoire("Documents");
        Repertoire photo = new Repertoire("Photos");    
        Repertoire video = new Repertoire("Videos");
        Repertoire img = new Repertoire("Images");
        Repertoire pic = new Repertoire("Pictures");
        Repertoire douze = new Repertoire("2012");
        Repertoire vingt = new Repertoire("2020");
        Repertoire web = new Repertoire("web");
        Repertoire zoo = new Repertoire("Animaux");
        Repertoire dog = new Repertoire("Chiens");
        Repertoire taxe = new Repertoire("Facture");
        Repertoire excel = new Repertoire("Excel");
        Repertoire word = new Repertoire("Word");
        
        //Ajout des repertoires
//        racine.rep.add(multi);
//        racine.rep.add(docu);
//        multi.rep.add(photo);
//        multi.rep.add(pic);
//        multi.rep.add(video);
//        photo.rep.add(douze);
//        photo.rep.add(vingt);
//        pic.rep.add(web);
//        web.rep.add(zoo);
//        zoo.rep.add(dog);
//        
//        docu.rep.add(new Repertoire("Word"));
//        docu.rep.add(new Repertoire("Excel"));
//        docu.rep.add(new Repertoire("Facture"));
//
//        multi.rep.add(new Repertoire("Images"));
//        multi.rep.add(new Repertoire("Videos"));
//        
//        video.rep.add(new Repertoire("Films"));
//        video.rep.add(new Repertoire("Da"));
//
//        douze.rep.add(new Repertoire("01"));
//        douze.rep.add(new Repertoire("02"));
//
//        vingt.rep.add(new Repertoire("01"));
//        vingt.rep.add(new Repertoire("12"));
//
//        web.rep.add(new Repertoire("Hentai"));
//
//        zoo.rep.add(new Repertoire("Chats"));
//
//        dog.rep.add(new Repertoire("Poils long"));
//        dog.rep.add(new Repertoire("Poils court"));
//        
//        System.out.println(racine.nom + ":");
//        for (Repertoire r : racine.rep){
//            System.out.println("\t" + r.nom);
//            
//            for (Repertoire r1 : r.rep){
//                System.out.println("\t\t" + r1.nom);
//                
//                for (Repertoire r2 : r1.rep){
//                    System.out.println("\t\t\t" + r2.nom);
//                    
//                    for (Repertoire r3 : r2.rep){
//                        System.out.println("\t\t\t\t" + r3.nom);
//                        
//                        for (Repertoire r4 :r3.rep){
//                            System.out.println("\t\t\t\t\t" +r4.nom);
//                            
//                            for (Repertoire r5 :r4.rep){
//                                System.out.println("\t\t\t\t\t\t" +r5.nom);
//                            }
//                        }
//                    }
//                }
//            }
//        }
        racine.addChildren(doc);
        doc.addChildren(taxe);
        doc.addChildren(word);
        doc.addChildren(excel);
        racine.addChildren(multi);
        multi.addChildren(img);
        multi.addChildren(video);
        img.addChildren(photo);
        photo.addChildren(douze);
        photo.addChildren(vingt);
        img.addChildren(pic);
        pic.addChildren(web);
        web.addChildren(zoo);
        zoo.addChildren(dog);
        video.addChildren(new Repertoire("Films"));
        video.addChildren(new Repertoire("Animes"));
        douze.addChildren(new Repertoire("01"));
        douze.addChildren(new Repertoire("02"));
        vingt.addChildren(new Repertoire("01"));
        vingt.addChildren(new Repertoire("12"));
        web.addChildren(new Repertoire("Hentai"));
        zoo.addChildren(new Repertoire("Chats"));
        dog.addChildren(new Repertoire("Poils long"));
        dog.addChildren(new Repertoire("Poils court"));
        racine.afficheNom();
            
//            for (Repertoire r : racine.rep){
//                r.afficheNom();
//            }
        
        
    }
    
}
