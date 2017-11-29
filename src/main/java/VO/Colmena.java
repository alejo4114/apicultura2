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
public class Colmena {
    private int id_colmena;
    private int id_apiario;
    private String reina;
    private String producc_miel;
    private int panal_cera;
    private int panal_alim;
    private int panal_cria;
    private int panal_vacio;

    public Colmena() {
    }

    public Colmena(int id_colmena, int id_apiario, String reina, String producc_miel, int panal_cera, int panal_alim, int panal_cria, int panal_vacio) {
        this.id_colmena = id_colmena;
        this.id_apiario = id_apiario;
        this.reina = reina;
        this.producc_miel = producc_miel;
        this.panal_cera = panal_cera;
        this.panal_alim = panal_alim;
        this.panal_cria = panal_cria;
        this.panal_vacio = panal_vacio;
    }

    public int getId_colmena() {
        return id_colmena;
    }

    public void setId_colmena(int id_colmena) {
        this.id_colmena = id_colmena;
    }

    public int getId_apiario() {
        return id_apiario;
    }

    public void setId_apiario(int id_apiario) {
        this.id_apiario = id_apiario;
    }

    public String getReina() {
        return reina;
    }

    public void setReina(String reina) {
        this.reina = reina;
    }

    public String getProducc_miel() {
        return producc_miel;
    }

    public void setProducc_miel(String producc_miel) {
        this.producc_miel = producc_miel;
    }

    public int getPanal_cera() {
        return panal_cera;
    }

    public void setPanal_cera(int panal_cera) {
        this.panal_cera = panal_cera;
    }

    public int getPanal_alim() {
        return panal_alim;
    }

    public void setPanal_alim(int panal_alim) {
        this.panal_alim = panal_alim;
    }

    public int getPanal_cria() {
        return panal_cria;
    }

    public void setPanal_cria(int panal_cria) {
        this.panal_cria = panal_cria;
    }

    public int getPanal_vacio() {
        return panal_vacio;
    }

    public void setPanal_vacio(int panal_vacio) {
        this.panal_vacio = panal_vacio;
    }
    
    
    
}
