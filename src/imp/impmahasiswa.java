/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imp;
import model.mahasiswa;
import java.util.List;
/**
 *
 * @author Rangga
 */
public interface impmahasiswa {
    public void insert(mahasiswa b);
    public void update(mahasiswa b);
    public void delete(int NIM);
    
    List<mahasiswa> getALL();
    List<mahasiswa> getcarimahasiswa(String Nama_Mahasiswa);
}
