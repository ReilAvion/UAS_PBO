/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.sql.*;
import javax.swing.*;

public class Connector {

    final private String DRIVER = "com.mysql.jdbc.Driver";
    // Silahkan ganti variabel dibawah ini sesuai settingan database anda
    final private String URL = "jdbc:mysql://localhost:3306/";
    final private String DB = "pengeluaran";
    final private String USER = "root";
    final private String PASS = "";
    
    protected ResultSet rs;
    protected Statement st;
    protected Connection con;
    protected String query;
    
    public Connector() {
        try{
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL, USER, PASS);
            st = con.createStatement();
            st.execute("USE " + DB);
            JOptionPane.showMessageDialog(null, "Database Connected");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Database Failed to Connect, Exiting Now");
            e.printStackTrace();
            System.exit(0);
        }
    }
    
    //Membuat database baru, apabila database belum ada sebelumnya.
    //Jika sudah ada, maka proses pembuatan database pada method ini
    //Akan dibatalkan
    private void creatingDatabase(){
        query = "USE " + DB;
        try{
            st.execute(query);
            System.out.println("Database " + DB + " is ready");
        }catch(SQLException e){
            System.out.println("Database " + DB + " doesn't exist, creating now");
            query = "CREATE DATABASE " + DB + " "
                    + " USE " + DB;
            try{
                st.executeLargeUpdate(query);
                System.out.println("Database " + DB + " created successfuly");
            }catch(SQLException er){
                System.err.println("Failed to create database " + DB);
            }
        }
    }
}
