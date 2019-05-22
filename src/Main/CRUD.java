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
    
    public void insertDetailSaldo(String keterangan, String tanggal){
        query = "INSERT INTO `saldo` (`saldo`,`keterangan`, `tanggal`) "
                + "VALUES (0, '" + keterangan + "', '" + tanggal + "')";
        System.out.println(query);
        try{
            st.execute(query);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public ArrayList<Integer> getPemasukan(){
        ArrayList<Integer> dataPemasukan = new ArrayList<>();
        query = "SELECT * FROM `pemasukan`";
        try{
            rs = st.executeQuery(query);
            while(rs.next()){
                //Mendapatkan nilai pemasukan dari DB;
                dataPemasukan.add(Integer.parseInt(rs.getString(2)));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return dataPemasukan;
    }
    
    public ArrayList<Integer> getPengeluaran(){
        ArrayList<Integer> dataPengeluaran = new ArrayList<>();
        query = "SELECT * FROM `pengeluaran`";
        try{
            rs = st.executeQuery(query);
            while(rs.next()){
                //Mendapatkan nilai pemasukan dari DB;
                dataPengeluaran.add(Integer.parseInt(rs.getString(2)));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return dataPengeluaran;
    }
    
    //mengambil data dalam DB
    public ArrayList<Hitung> getDetailSaldo(){
        ArrayList<Hitung> dataDetailSaldo = new ArrayList<>();
        query = "SELECT * FROM `saldo`";
        System.out.println(query);
        try{
            rs = st.executeQuery(query);
            while(rs.next()){ 
                dataDetailSaldo.add(new Hitung(
                        //Mendapatkan saldo
                        Integer.parseInt(rs.getString(2)),
                        //Mendapatkan keterangan
                        rs.getString(3),
                        //Mendapatkan tanggal
                        rs.getString(4)
                ));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    return dataDetailSaldo;
    }
}    

    

   
