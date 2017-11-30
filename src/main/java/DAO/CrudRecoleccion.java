/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.DbUtil;
import VO.*;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CrudRecoleccion {

    private Connection connection;

    public CrudRecoleccion() throws URISyntaxException {
        connection = DbUtil.getConnection();
    }

    public void agregarRecoleccion(Recoleccion rec) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into Recoleccion(id_recol,fecha,nom_reco,id_colmena,kilos_mile) values (?, ?, ?, ? , ?)");
            // Parameters start with 1

            preparedStatement.setInt(1, rec.getId_recol());
            preparedStatement.setString(2, rec.getFecha());
            preparedStatement.setString(3, rec.getNom_reco());
            preparedStatement.setInt(4, rec.getId_colmena());
            preparedStatement.setInt(5, rec.getKilo_miel());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateUser(Recoleccion rec) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update Recoleccion set fecha=?, nom_reco=?, id_colmena=?, kilos_miel=?"
                            + "where id_recol=?");
            // Parameters start with 1
            preparedStatement.setInt(1, rec.getId_recol());
            preparedStatement.setString(3, rec.getFecha());
            preparedStatement.setString(4, rec.getNom_reco());
            preparedStatement.setInt(5, rec.getId_colmena());
            preparedStatement.setInt(6, rec.getKilo_miel());

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Recoleccion> listarRecoleccion() {
        List<Recoleccion> users = new ArrayList<Recoleccion>();
        try {
            System.out.println("LLegue hasta aca");
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("select * from Recoleccion");
            while (rs.next()) {
                Recoleccion rec = new Recoleccion();
                rec.setId_recol(rs.getInt("id_recol"));
                rec.setFecha(rs.getString("fecha"));
                rec.setNom_reco(rs.getString("nom_reco"));
                rec.setId_colmena(rs.getInt("id_colmena"));
                rec.setKilo_miel(rs.getInt("kilo_miel"));
                users.add(rec);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }
    
    public List<Recoleccion> produccion() {
        List<Recoleccion> users = new ArrayList<Recoleccion>();
        try {
            System.out.println("LLegue hasta aca");
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("select id_colmena, kilos_miel from Recoleccion where (kilos_miel>2 and id_recol!=123456) order by kilos_miel ASC limit 10");
            while (rs.next()) {
                Recoleccion rec = new Recoleccion();
                rec.setId_colmena(rs.getInt("id_colmena"));
                rec.setKilo_miel(rs.getInt("kilos_miel"));
                users.add(rec);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

}
