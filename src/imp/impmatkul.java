/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package imp;
import model.Mata_Kuliah;
import java.util.List;
/**
 *
 * @author Rangga
 */
public interface impmatkul {
    public void insert(Mata_Kuliah d);
    public void update(Mata_Kuliah d);
    public void delete(String Kodematkul);
    
    List<Mata_Kuliah> getALL();
    List<Mata_Kuliah> getcarinamamatkul(String nama_matkul);
}
