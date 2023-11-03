/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;
import model.mahasiswa;
import java.sql.*;
import databases.Database;
import imp.impmahasiswa;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;

/**
 *
 * @author Rangga
 */
public class Mahasiswa  implements impmahasiswa {
    Connection conn;
    final String insert = "INSERT INTO mahasiswa (NIM, Nama_Mahasiswa, Jenis_Kelamin, Alamat, NO_Telp) VALUES (?,?,?,?,?);";
    final String update = "UPDATE mahasiswa set Nama_Mahasiswa=?,Jenis_Kelamin=?, Alamat=?, NO_Telp=? where NIM=?;";
    final String delete = "DELETE FROM mahasiswa WHERE NIM=?;";
    final String select = "SELECT * FROM mahasiswa mahasiswa;";
    final String search = "SELECT * FROM mahasiswa where NIM like ?";
    
    public Mahasiswa(){
        conn = Database.configDB();
    }

    @Override
    public void insert (mahasiswa b){
        PreparedStatement statement = null;
        try{
            statement = conn.prepareStatement(insert);
            statement.setInt(1, b.getNIM());
            statement.setString(2, b.getNama_Mahasiswa());
            statement.setString(3, b.getJenis_Kelamin());
            statement.setString(4, b.getAlamat());
            statement.setString(5, b.getNo_telp());
            statement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally{
            try{
                statement.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public void update (mahasiswa b){
        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement(update);
            statement.setString(1, b.getNama_Mahasiswa());
            statement.setString(2, b.getJenis_Kelamin());
            statement.setString(3, b.getAlamat());
            statement.setString(4, b.getNo_telp());
            statement.setInt(5, b.getNIM());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    @Override
    public void delete (int NIM){
        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement(delete);
            statement.setInt(1, NIM);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    @Override
    public java.util.List<mahasiswa> getcarimahasiswa(String Nama_Mahasiswa){
        java.util.List<mahasiswa> lb = null;
        try {
            lb = new ArrayList<mahasiswa>();
            PreparedStatement st = conn.prepareStatement(search);
            st.setString(1, "%" + Nama_Mahasiswa + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                mahasiswa b = new mahasiswa();
                b.setNIM(rs.getInt("NIM"));
                b.setNama_Mahasiswa(rs.getString("Nama_Mahasiswa"));
                b.setJenis_Kelamin (rs.getString("Jenis_Kelamin"));
                b.setAlamat(rs.getString("Alamat"));
                b.setNo_telp(rs.getString("NO_Telp"));
                lb.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(mahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lb;
    }
    
    @Override
    public java.util.List<mahasiswa> getALL(){
        java.util.List<mahasiswa> lb = null;
        try {
            lb = new ArrayList<mahasiswa>();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()){
                mahasiswa b = new mahasiswa();
                b.setNIM(rs.getInt("NIM"));
                b.setNama_Mahasiswa(rs.getString("Nama_Mahasiswa"));
                b.setJenis_Kelamin(rs.getString("Jenis_Kelamin"));
                b.setAlamat(rs.getString("Alamat"));
                b.setNo_telp(rs.getString("NO_Telp"));
                lb.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(mahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lb;
    }
}
