/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Labing I5
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

public class CrudColmena {

    private Connection connection;

    public CrudColmena() throws URISyntaxException {
        connection = DbUtil.getConnection();
    }

    public void agregarColmena(Colmena col) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into Colmena(id_colmena,id_apiario,reina,producc_miel,panal_cera,panal_alim,panal_cria,panal_vacio) values (?, ?, ?, ? , ?, ?, ?, ?)");
            // Parameters start with 1

            preparedStatement.setInt(1, col.getId_colmena());
            preparedStatement.setInt(2, col.getId_apiario());
            preparedStatement.setString(3, col.getReina());
            preparedStatement.setString(4, col.getProducc_miel());
            preparedStatement.setInt(5, col.getPanal_cera());
            preparedStatement.setInt(6, col.getPanal_alim());
            preparedStatement.setInt(7, col.getPanal_cria());
            preparedStatement.setInt(8, col.getPanal_vacio());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateUser(Colmena col) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update Colmena set id_apiario=?, reina=?, producc_miel=?, panal_cera=?, panal_alim=?, panal_cria=?, panal_vacio=?"
                            + "where id_colmena=?");
            // Parameters start with 1
            preparedStatement.setInt(1, col.getId_colmena());
            preparedStatement.setInt(2, col.getId_apiario());
            preparedStatement.setString(3, col.getReina());
            preparedStatement.setString(4, col.getProducc_miel());
            preparedStatement.setInt(5, col.getPanal_cera());
            preparedStatement.setInt(6, col.getPanal_alim());
            preparedStatement.setInt(7, col.getPanal_cria());
            preparedStatement.setInt(8, col.getPanal_vacio());

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Colmena> listarColmenas() {
        List<Colmena> users = new ArrayList<Colmena>();
        try {
            System.out.println("LLegue hasta aca");
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("select * from Colmena");
            while (rs.next()) {
                Colmena col = new Colmena();
                col.setId_colmena(rs.getInt("id_colmena"));
                col.setId_apiario(rs.getInt("id_apiario"));
                col.setReina(rs.getString("reina"));
                col.setProducc_miel(rs.getString("producc_miel"));
                col.setPanal_cera(rs.getInt("panal_cera"));
                col.setPanal_alim(rs.getInt("panal_alim"));
                col.setPanal_cria(rs.getInt("panal_cria"));
                col.setPanal_vacio(rs.getInt("panal_vacio"));
                users.add(col);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

}
