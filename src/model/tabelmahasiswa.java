/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Rangga
 */
public class tabelmahasiswa extends AbstractTableModel{
    List<mahasiswa> listmahasiswa;
    
    public tabelmahasiswa(List<mahasiswa> listMahasiswa){
        this.listmahasiswa = listMahasiswa;
    }

    @Override
    public int getRowCount() {
        return listmahasiswa.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch(columnIndex){
            case 0:
                return "NIM";
            case 1:
                return "Nama_Mahasiswa";
            case 2:
                return "Jenis_kelamin";
            case 3:
                return "Alamat";
            case 4:
                return "NO_Telp";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return listmahasiswa.get(rowIndex).getNIM();
            case 1:
                return listmahasiswa.get(rowIndex).getNama_Mahasiswa();
            case 2:
                return listmahasiswa.get(rowIndex).getJenis_Kelamin();
            case 3:
                return listmahasiswa.get(rowIndex).getAlamat();
            case 4:
                return listmahasiswa.get(rowIndex).getNo_telp();
            default:
                return null;
        }
    }
}
