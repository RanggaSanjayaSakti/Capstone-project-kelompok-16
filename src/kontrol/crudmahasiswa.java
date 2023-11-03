/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kontrol;
import imp.impmahasiswa;
import java.util.List;
import menu.Mahasiswa;
import javax.swing.JOptionPane;
import model.mahasiswa;
import GUI.*;
import model.tabelmahasiswa;
/**
 *
 * @author Rangga
 */
public class crudmahasiswa {
    menuMahasiswa mahas;
    impmahasiswa mahasiswaimp;
    List<mahasiswa> listmahasiswa;
    
    public crudmahasiswa(menuMahasiswa mahasiswa1){
        this.mahas = mahasiswa1;
        mahasiswaimp = new menu.Mahasiswa();
        listmahasiswa = mahasiswaimp.getALL();
    }

    public void reset(){
        mahas.gettxtnim().setText("");
        mahas.getNamamahasiswa().setText("");
        mahas.getJenis_Kelaminm().setText("");
        mahas.getAlamat().setText("");
        mahas.getNotelp().setText("");
    }
    
    public void table(){
        listmahasiswa = mahasiswaimp.getALL();
        tabelmahasiswa nm = new tabelmahasiswa(listmahasiswa);
        mahas.getTablemahas().setModel(nm);
    }
    
    public void field(int row){
        mahas.gettxtnim().setText(String.valueOf(listmahasiswa.get(row).getNIM()));
        mahas.getNamamahasiswa().setText(listmahasiswa.get(row).getNama_Mahasiswa());
        mahas.getJenis_Kelaminm().setText(listmahasiswa.get(row).getJenis_Kelamin());
        mahas.getAlamat().setText(listmahasiswa.get(row).getAlamat());
        mahas.getNotelp().setText(listmahasiswa.get(row).getNo_telp());

    }
    
    public void insertMataKuliah(){
        if(!mahas.gettxtnim().getText().trim().isEmpty()&!mahas.getNamamahasiswa().getText().trim().isEmpty()){
            mahasiswa mh = new mahasiswa();
            mh.setNIM(Integer.parseInt(mahas.gettxtnim().getText()));
            mh.setNama_Mahasiswa(mahas.getNamamahasiswa().getText());
            mh.setJenis_Kelamin(mahas.getJenis_Kelaminm().getText());
            mh.setAlamat(mahas.getAlamat().getText());
            mh.setNo_telp(mahas.getNotelp().getText());
            mahasiswaimp.insert(mh); // Memasukkan objek mk ke dalam database atau listmatkul, sesuai dengan kebutuhan
            table(); // Memperbarui tampilan tabel setelah penambahan data
            reset(); // Mereset inputan setelah penambahan data
            JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan!");
        } else {
            JOptionPane.showMessageDialog(null, "Nama mata kuliah dan SKS tidak boleh kosong!");
        }
    }
    
    public void update() {
        if (!mahas.gettxtnim().getText().trim().isEmpty()) {
            mahasiswa mh = new mahasiswa();
            mh.setNIM(Integer.parseInt(mahas.gettxtnim().getText()));
            mh.setNama_Mahasiswa(mahas.getNamamahasiswa().getText());
            mh.setJenis_Kelamin(mahas.getJenis_Kelaminm().getText());
            mh.setAlamat(mahas.getAlamat().getText());
            mh.setNo_telp(mahas.getNotelp().getText());
            mahasiswaimp.update(mh);
            JOptionPane.showMessageDialog(null, "Data terupdate");
        }else{
            JOptionPane.showMessageDialog(mahas, "Pilih data");
        }
    }
    public void delete() {
        if(!mahas.gettxtnim().getText().trim().isEmpty()){
            int NIM = Integer.parseInt(mahas.gettxtnim().getText());
            mahasiswaimp.delete(NIM);
            JOptionPane.showMessageDialog(null, "Data Terhapus");
        }else {
            JOptionPane.showMessageDialog(mahas, "pilih data yang mau dihapus");
        }
    }
}
