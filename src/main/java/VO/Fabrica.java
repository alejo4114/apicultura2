/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

/**
 *
 * @author Labing I5
 */
public class Fabrica {
    private int id_fabrica;
    private String nom_fabrica;

    public Fabrica() {
    }

    public Fabrica(int id_fabrica, String nom_fabrica) {
        this.id_fabrica = id_fabrica;
        this.nom_fabrica = nom_fabrica;
    }

    public int getId_fabrica() {
        return id_fabrica;
    }

    public void setId_fabrica(int id_fabrica) {
        this.id_fabrica = id_fabrica;
    }

    public String getNom_fabrica() {
        return nom_fabrica;
    }

    public void setNom_fabrica(String nom_fabrica) {
        this.nom_fabrica = nom_fabrica;
    }
    
    
}
