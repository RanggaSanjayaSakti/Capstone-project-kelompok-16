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
public class tabeldosen extends AbstractTableModel{
    List<Dosen> listDosen;
    
    public tabeldosen(List<Dosen> listdosen){
        this.listDosen = listdosen;
    }

    @Override
    public int getRowCount() {
        return listDosen.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch(columnIndex){
            case 0:
                return "Nip";
            case 1:
                return "nama_dosen";
            case 2 :
                return "jabatan";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return listDosen.get(rowIndex).getNIP();
            case 1:
                return listDosen.get(rowIndex).getNama_Dosen();
            case 2:
                return listDosen.get(rowIndex).getJabatan();
            default:
                return null;
        }
    }
}
