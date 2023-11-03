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
public class tabelkrs extends AbstractTableModel{
    List<KRS> listkrs;
    
    public tabelkrs(List<KRS> listKrs){
        this.listkrs = listKrs;
    }

    @Override
    public int getRowCount() {
        return listkrs.size();
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
                return listkrs.get(rowIndex).getKode_Matkul1();
            case 1:
                return listkrs.get(rowIndex).getNama_Matkul();
            case 2:
                return listkrs.get(rowIndex).getSKS();
            case 3:
                return listkrs.get(rowIndex).getSemester();
            case 4:
                return listkrs.get(rowIndex).getTahun();
            default:
                return null;
        }
    }
}
