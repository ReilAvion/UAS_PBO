/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.sql.SQLException;
import java.util.*;
/**
 *
 * @author Axioo
 */
public class CRUD extends Connector{
    public CRUD(){
        super();
    }
    
    public void insertPemasukan(int pemasukan){
        query = "INSERT INTO `pemasukan` (`id_pemasukan`, `pemasukan`) "
                + "VALUES (NULL, '" + pemasukan + "')";
        try{
            st.execute(query);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void insertPengeluaran(int pengeluaran){
        query = "INSERT INTO `pengeluaran` (`id_pengeluaran`, `pengeluaran`) "
                + "VALUES (NULL, '" + pengeluaran + "')";
        try{
            st.execute(query);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void insertKeteranganTanggal(String keterangan, String tanggal){
        query = "INSERT INTO `saldo` (`saldo`,`keterangan`, `tanggal`) "
                + "VALUES (0, '" + keterangan + "', '" + tanggal + "')";
        System.out.println(query);
        try{
            st.execute(query);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    //mengambil data dalam DB
    public ArrayList<String> getTableData(String tableName){
        ArrayList<Pengeluaran> arr = new ArrayList<>();
        query = "SELECT  `pemasukan`.`pemasukan`, `pengeluaran`.`pengeluaran`, `saldo`.`saldo`, `saldo`.`keterangan`, `saldo`.`tanggal`\n" +
                "FROM `saldo`\n" + ", `pemasukan`\n" + ", `pengeluaran`;" + tableName;
        System.out.println(query);
        try{
            st.execute(query);
            while(rs.next()){
                
                        //Mendapatkan nilai pemasukan dari DB
                        Integer.parseInt(rs.getString(2));
                        //Mendapatkan nilai pengeluaran dari DB
                        Integer.parseInt(rs.getString(3));
                        //Mendapatkan nilai saldo dari DB
                        Integer.parseInt(rs.getString(4));
                        //Mendapatkan keterangan dari DB
                        rs.getString(5);
                        //Mendapatkan tanggal dari DB
                        rs.getString(6);
            }
        }catch(SQLException e){
            e.printStackTrace();
    }
    

    
   
