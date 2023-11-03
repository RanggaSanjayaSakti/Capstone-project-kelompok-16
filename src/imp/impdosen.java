/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package imp;
import model.Dosen;
import java.util.List;
/**
 *
 * @author Rangga
 */
public interface impdosen {
    public void insert(Dosen c);
    public void update(Dosen c);
    public void delete(int Nip);
    
    List<Dosen> getALL();
    List<Dosen> getcaridosen(String nama_dosen);
}
