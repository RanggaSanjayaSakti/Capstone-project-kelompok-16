/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;
import java.sql.*;
import databases.Database;
import imp.impkrs;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;
import model.KRS;

/**
 *
 * @author Rangga
 */
public class krs implements impkrs{
    Connection conn;
   
    final String select = "SELECT * FROM mata_kuliah;";
    
    public krs(){
        conn = Database.configDB();
    }
    

    
    @Override
    public java.util.List<KRS> getALL(){
        java.util.List<KRS> lb = null;
        try {
            lb = new ArrayList<KRS>();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()){
                KRS e = new KRS();
                e.setKode_Matkul("Kode_Matkul");
                e.setNama_Matkul(rs.getString("Nama_matkul"));
                e.setSKS(Integer.parseInt(rs.getString("SKS")));
                e.setSemester(rs.getString("Semester"));
                e.setTahun(rs.getString("Tahun_Ajaran"));
                lb.add(e);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KRS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lb;
    }

    @Override
    public void insert(KRS e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}