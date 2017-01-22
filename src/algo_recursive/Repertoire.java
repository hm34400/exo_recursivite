/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo_recursive;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author hicham
 */
public class Repertoire {
    public String nom ="";
    public Repertoire parent = null;
    List<Repertoire> rep = new ArrayList();
    
    public Repertoire(String n){
        this.nom = n;
    }
    public void addChildren(Repertoire r){
        r.parent = this;
        this.rep.add(r);
    }
    public void afficheNom() {
        String indent = "";
        for (int i = 0; i < getIndent(); i++) {
            indent += indentation();
        }
        System.out.println(indent+this.nom);
        for (Repertoire repertoire : rep) {
            repertoire.afficheNom();
        }
    }

    public int getIndent() {
        if (this.parent == null) {
            return 0;
        } else {
            return this.parent.getIndent() + 1;
        }
    }

    //retourne la tabulation
    public String indentation() {
        return "\t";
    }
}
