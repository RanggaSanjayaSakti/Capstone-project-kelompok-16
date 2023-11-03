/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;
import java.sql.*;
import databases.Database;
import imp.impmatkul;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;
import model.Mata_Kuliah;
/**
 *
 * @author Rangga
 */
public class Matakuliah implements impmatkul{
    Connection conn;
    final String insert = "INSERT INTO mata_kuliah (Kode_Matkul, Nama_Matkul, SKS, Semester, Tahun_Ajaran) VALUES (?,?,?,?,?);";
    final String update = "UPDATE mata_kuliah set Nama_Matkul=?, SKS=?, Semester=?, Tahun_Ajaran=? where Kode_Matkul=?;";
    final String delete = "DELETE FROM mata_kuliah WHERE Kode_Matkul=?;";
    final String select = "SELECT * FROM  mata_kuliah;";
    final String search = "SELECT * FROM mata_kuliah where Kode_Matkul like ?";
    
    public Matakuliah() throws SQLException{
        this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pbo","root","");
        conn = Database.configDB();
    }
    @Override
    public void insert (Mata_Kuliah d){
        PreparedStatement statement = null;
        try{
            statement = conn.prepareStatement(insert);
            statement.setString(1, d.getKode_Matkul1());
            statement.setString(2, d.getNama_Matkul());
            statement.setInt(3, d.getSKS());
            statement.setString(4, d.getSemester());
            statement.setString(5, d.getTahun());
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
    public void update (Mata_Kuliah d){
        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement(update);
            statement.setString(1, d.getNama_Matkul());
            statement.setInt(2, d.getSKS());
            statement.setString(3, d.getSemester());
            statement.setString(4, d.getTahun());
            statement.setString(5, d.getKode_Matkul1());
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
    public void delete (String Kodematkul){
        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement(delete);
            statement.setString(1, Kodematkul);
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
    public java.util.List<Mata_Kuliah> getcarinamamatkul(String nama_matkul){
        java.util.List<Mata_Kuliah> lb = null;
        try {
            lb = new ArrayList<Mata_Kuliah>();
            PreparedStatement st = conn.prepareStatement(search);
            st.setString(1, "%" + nama_matkul + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                Mata_Kuliah d = new Mata_Kuliah();
                d.setKode_Matkul(rs.getString("Kode_Matkul"));
                d.setNama_Matkul(rs.getString("Nama_Matkul"));
                d.setSKS(rs.getInt("SKS"));
                d.setSemester(rs.getString("Semester"));
                d.setTahun(rs.getString("Tahun_Ajaran"));
                lb.add(d);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Mata_Kuliah.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lb;
    }
    
    @Override
    public java.util.List<Mata_Kuliah> getALL(){
        java.util.List<Mata_Kuliah> cb = null;
        try {
            cb = new ArrayList<Mata_Kuliah>();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()){
                Mata_Kuliah d = new Mata_Kuliah();
                d.setKode_Matkul(rs.getString("Kode_Matkul"));
                d.setNama_Matkul(rs.getString("Nama_Matkul"));
                d.setSKS(rs.getInt("SKS"));
                d.setSemester(rs.getString("Semester"));
                d.setTahun(rs.getString("Tahun_Ajaran"));
                cb.add(d);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Mata_Kuliah.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cb;
    }
}
