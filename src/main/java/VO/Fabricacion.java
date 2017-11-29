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
public class Fabricacion {
    private int id_fabricacion;
    private int id_fabrica;
    private String ubicacion;
    private int id_madre;

    public Fabricacion() {
    }

    public Fabricacion(int id_fabricacion, int id_fabrica, String ubicacion, int id_madre) {
        this.id_fabricacion = id_fabricacion;
        this.id_fabrica = id_fabrica;
        this.ubicacion = ubicacion;
        this.id_madre = id_madre;
    }

    public int getId_fabricacion() {
        return id_fabricacion;
    }

    public void setId_fabricacion(int id_fabricacion) {
        this.id_fabricacion = id_fabricacion;
    }

    public int getId_fabrica() {
        return id_fabrica;
    }

    public void setId_fabrica(int id_fabrica) {
        this.id_fabrica = id_fabrica;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getId_madre() {
        return id_madre;
    }

    public void setId_madre(int id_madre) {
        this.id_madre = id_madre;
    }
    
    
}
