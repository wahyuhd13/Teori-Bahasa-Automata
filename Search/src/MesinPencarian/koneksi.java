/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MesinPencarian;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class koneksi {
private static Connection mysqlkonek;
    public static Connection koneksiDB() throws SQLException {
        if(mysqlkonek==null){
        try {
            String DB="jdbc:mysql://localhost:/uas tba";
            String user="root"; // user database
            String pass=""; // password database
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            mysqlkonek = (Connection) DriverManager.getConnection(DB,user,pass);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Gagal Koneksi !");
        }
    }
    return mysqlkonek;
    }
}