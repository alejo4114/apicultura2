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
public class Recoleccion {
    private int id_recol;
    private String fecha;
    private String nom_reco;
    private int id_colmena;
    private int kilo_miel;

    public Recoleccion() {
    }

    public Recoleccion(int id_recol, String fecha, String nom_reco, int id_colmena, int kilo_miel) {
        this.id_recol = id_recol;
        this.fecha = fecha;
        this.nom_reco = nom_reco;
        this.id_colmena = id_colmena;
        this.kilo_miel = kilo_miel;
    }

    public int getId_recol() {
        return id_recol;
    }

    public void setId_recol(int id_recol) {
        this.id_recol = id_recol;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNom_reco() {
        return nom_reco;
    }

    public void setNom_reco(String nom_reco) {
        this.nom_reco = nom_reco;
    }

    public int getId_colmena() {
        return id_colmena;
    }

    public void setId_colmena(int id_colmena) {
        this.id_colmena = id_colmena;
    }

    public int getKilo_miel() {
        return kilo_miel;
    }

    public void setKilo_miel(int kilo_miel) {
        this.kilo_miel = kilo_miel;
    }
    
    
}
