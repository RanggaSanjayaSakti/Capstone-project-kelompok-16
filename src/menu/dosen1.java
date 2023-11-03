/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;
import java.sql.*;
import databases.Database;
import imp.impdosen;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;
import model.Dosen;
import imp.impdosen;
/**
 *
 * @author Rangga
 */
public class dosen1 implements impdosen{
    Connection conn;
    final String insert = "INSERT INTO dosen (Nip,nama_dosen, jabatan) VALUES (?,?,?);";
    final String update = "UPDATE dosen set nama_dosen=?, jabatan=?,where Nip=?;";
    final String delete = "DELETE FROM dosen WHERE Nip=?;";
    final String select = "SELECT * FROM dosen ;";
    final String search = "SELECT * FROM dosen where Nip like ?";
    
    public dosen1() throws SQLException{
        this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pbo","root","");
        conn = Database.configDB();
    }

    @Override
    public void insert (Dosen c){
        PreparedStatement statement = null;
        try{
            statement = conn.prepareStatement(insert);
            statement.setInt(1, c.getNIP());
            statement.setString(2, c.getNama_Dosen());
            statement.setString(3, c.getJabatan());
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
    public void update (Dosen c){
        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement(update);
            statement.setInt(1, c.getNIP());
            statement.setString(2, c.getNama_Dosen());
            statement.setString(3, c.getJabatan());
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
    public void delete (int Nip){
        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement(delete);
            statement.setInt(1, Nip);
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
    public java.util.List<Dosen> getcaridosen(String nama_dosen){
        java.util.List<Dosen> lb = null;
        try {
            lb = new ArrayList<Dosen>();
            PreparedStatement st = conn.prepareStatement(search);
            st.setString(1, "%" + nama_dosen + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                Dosen c = new Dosen();
                c.setNIP(rs.getInt("Nip"));
                c.setNama_Dosen(rs.getString("nama_dosen"));
                c.setJabatan(rs.getString("jabatan"));
                lb.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Dosen.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lb;
    }
    
    @Override
    public java.util.List<Dosen> getALL(){
        java.util.List<Dosen> ab = null;
        try {
            ab = new ArrayList<Dosen>();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()){
                Dosen c = new Dosen();
                c.setNIP(rs.getInt("Nip"));
                c.setNama_Dosen(rs.getString("nama_dosen"));
                c.setJabatan(rs.getString("jabatan"));
                ab.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Dosen.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ab;
    }
}
