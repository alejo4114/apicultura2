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
public class Municipio {
    private int id_muni;
    private String nom_muni;

    public Municipio(int id_muni, String nom_muni) {
        this.id_muni = id_muni;
        this.nom_muni = nom_muni;
    }

    public Municipio() {
    }

    public int getId_muni() {
        return id_muni;
    }

    public void setId_muni(int id_muni) {
        this.id_muni = id_muni;
    }

    public String getNom_muni() {
        return nom_muni;
    }

    public void setNom_muni(String nom_muni) {
        this.nom_muni = nom_muni;
    }
    
    
}
