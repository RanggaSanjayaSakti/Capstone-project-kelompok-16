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
public class tabelmatkul extends AbstractTableModel{
    List<Mata_Kuliah> listmatkul;
    
    public tabelmatkul(List<Mata_Kuliah> listMatkul){
        this.listmatkul = listMatkul;
    }

    @Override
    public int getRowCount() {
        return listmatkul.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch(columnIndex){
            case 0:
                return "Kode_Matkul";
            case 1:
                return "Nama_Matkul";
            case 2:
                return "SKS";
            case 3:
                return "Semester";
            case 4:
                return "Tahun_Ajaran";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return listmatkul.get(rowIndex).getKode_Matkul1();
            case 1:
                return listmatkul.get(rowIndex).getNama_Matkul();
            case 2:
                return listmatkul.get(rowIndex).getSKS();
            case 3:
                return listmatkul.get(rowIndex).getSemester();
            case 4:
                return listmatkul.get(rowIndex).getTahun();
            default:
                return null;
        }
    }
}
