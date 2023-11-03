/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kontrol;
import imp.impdosen;
import GUI.dosen;
import java.sql.SQLException;
import java.util.List;
import menu.dosen1;
import model.tabeldosen;
import javax.swing.JOptionPane;
import model.Dosen;
/**
 *
 * @author Rangga
 */
public class cruddosen {
    dosen dsn;
    impdosen dsnimp;
    List<Dosen> listdosen;
    
    public cruddosen(dosen dsn) throws SQLException{
        this.dsn = dsn;
        dsnimp = new dosen1();
        listdosen = dsnimp.getALL();
    }

    public void reset(){
        dsn.getTxtnip().setText("");
        dsn.getTxtnmadsn().setText("");
        dsn.getTxtjbtn().setText("");
    }
    
    public void table(){
        listdosen = dsnimp.getALL();
        tabeldosen tm = new tabeldosen(listdosen);
        dsn.gettabeldosen1().setModel(tm);
    }
    
    public void fielddosen(int row){
        dsn.getTxtnip().setText(String.valueOf(listdosen.get(row).getNIP()));
        dsn.getTxtnmadsn().setText(listdosen.get(row).getNama_Dosen());
        dsn.getTxtjbtn().setText(listdosen.get(row).getJabatan());
    }
    
    public void insertdosen() {
        if(!dsn.getTxtnip().getText().trim().isEmpty()&!dsn.getTxtnmadsn().getText().trim().isEmpty()& !dsn.getTxtjbtn().getText().trim().isEmpty()){
            Dosen ds = new Dosen();
            ds.setNIP(Integer.parseInt(dsn.getTxtnip().getText()));
            ds.setNama_Dosen(dsn.getTxtnmadsn().getText());
            ds.setJabatan(dsn.getTxtjbtn().getText()); 
            dsnimp.insert(ds); // Memasukkan objek mk ke dalam database atau listmatkul, sesuai dengan kebutuhan
            table(); // Memperbarui tampilan tabel setelah penambahan data
            reset(); // Mereset inputan setelah penambahan data
            JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan!");
        } else {
            JOptionPane.showMessageDialog(null, "data tidak boleh kosong!");
        }
}
    
    public void updatedosen() {
        if (!dsn.getTxtnip().getText().trim().isEmpty()) {
            Dosen ds = new Dosen();
            ds.setNIP(Integer.parseInt(dsn.getTxtnip().getText()));
            ds.setNama_Dosen(dsn.getTxtnmadsn().getText());
            ds.setJabatan(dsn.getTxtjbtn().getText());
            dsnimp.update(ds);
            JOptionPane.showMessageDialog(null, "Data terupdate");
        }else{
            JOptionPane.showMessageDialog(dsn, "Pilih data");
        }
    }
    public void deletedosen() {
        if(!dsn.getTxtnip().getText().trim().isEmpty()){
            int Nip = (Integer.parseInt(dsn.getTxtnip().getText()));
            dsnimp.delete(Nip);
            JOptionPane.showMessageDialog(null, "Data Terhapus");
        }else {
            JOptionPane.showMessageDialog(dsn, "pilih data yang mau dihapus");
        }
    }
}
