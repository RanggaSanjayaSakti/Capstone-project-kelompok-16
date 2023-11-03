/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kontrol;

import imp.impmatkul;
import GUI.matakuliah;
import java.sql.SQLException;
import java.util.List;
import menu.Matakuliah;
import model.tabelmatkul;
import javax.swing.JOptionPane;
import model.Mata_Kuliah;
/**
 *
 * @author Rangga
 */
public class crudmatkul {
    matakuliah matkul;
    impmatkul matkulimp;
    List<Mata_Kuliah> listmatkul;
    
    public crudmatkul(matakuliah matkul) throws SQLException{
        this.matkul = matkul;
        matkulimp = new Matakuliah();
        listmatkul = matkulimp.getALL();
    }

    public void reset(){
        matkul.getKode_matkul().setText("");
        matkul.getNama_matkul().setText("");
        matkul.getSks().setText("");
        matkul.getSemester().setText("");
        matkul.getTahunajaran().setText("");
    }
    
    public void table(){
        listmatkul = matkulimp.getALL();
        tabelmatkul tm = new tabelmatkul(listmatkul);
        matkul.getTablematkul().setModel(tm);
    }
    
    public void field(int row){
        matkul.getKode_matkul().setText(String.valueOf(listmatkul.get(row).getKode_Matkul1()));
        matkul.getNama_matkul().setText(listmatkul.get(row).getNama_Matkul());
        matkul.getSks().setText(String.valueOf(listmatkul.get(row).getSKS()));
        matkul.getSemester().setText(listmatkul.get(row).getSemester());
        matkul.getTahunajaran().setText(listmatkul.get(row).getTahun());
    }
    
    public void insertMataKuliah(){
        if(!matkul.getKode_matkul().getText().trim().isEmpty()&!matkul.getNama_matkul().getText().trim().isEmpty()& !matkul.getSks().getText().trim().isEmpty()){
            Mata_Kuliah mk = new Mata_Kuliah();
            mk.setKode_Matkul(matkul.getKode_matkul().getText());
            mk.setNama_Matkul(matkul.getNama_matkul().getText());
            mk.setSKS(Integer.parseInt(matkul.getSks().getText()));
            mk.setSemester(matkul.getSemester().getText());
            mk.setTahun(matkul.getTahunajaran().getText());
            matkulimp.insert(mk); // Memasukkan objek mk ke dalam database atau listmatkul, sesuai dengan kebutuhan
            table(); // Memperbarui tampilan tabel setelah penambahan data
            reset(); // Mereset inputan setelah penambahan data
            JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan!");
        } else {
            JOptionPane.showMessageDialog(null, "Nama mata kuliah dan SKS tidak boleh kosong!");
        }
    }
    
    public void update() {
        if (!matkul.getKode_matkul().getText().trim().isEmpty()) {
            Mata_Kuliah mk = new Mata_Kuliah();
            mk.setKode_Matkul(matkul.getKode_matkul().getText());
            mk.setNama_Matkul(matkul.getNama_matkul().getText());
            mk.setSKS(Integer.parseInt(matkul.getSks().getText()));
            mk.setSemester(matkul.getSemester().getText());
            mk.setTahun(matkul.getTahunajaran().getText());
            matkulimp.update(mk);
            JOptionPane.showMessageDialog(null, "Data terupdate");
        }else{
            JOptionPane.showMessageDialog(matkul, "Pilih data");
        }
    }
    public void delete() {
        if(!matkul.getKode_matkul().getText().trim().isEmpty()){
            String Kodematkul = (matkul.getKode_matkul().getText());
            matkulimp.delete(Kodematkul);
            JOptionPane.showMessageDialog(null, "Data Terhapus");
        }else {
            JOptionPane.showMessageDialog(matkul, "pilih data yang mau dihapus");
        }
    }
}
