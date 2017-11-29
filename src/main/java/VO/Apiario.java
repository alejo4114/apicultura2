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
public class Apiario {
    private int id_apiario;
    private int id_muni;

    public Apiario() {
    }

    public Apiario(int id_apiario, int id_muni) {
        this.id_apiario = id_apiario;
        this.id_muni = id_muni;
    }

    public int getId_apiario() {
        return id_apiario;
    }

    public void setId_apiario(int id_apiario) {
        this.id_apiario = id_apiario;
    }

    public int getId_muni() {
        return id_muni;
    }

    public void setId_muni(int id_muni) {
        this.id_muni = id_muni;
    }
    
    
}
