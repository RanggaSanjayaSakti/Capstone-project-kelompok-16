/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kontrol;
import imp.impkrs;
import GUI.matakuliah;
import GUI.menukrs;
import java.util.List;
import javax.swing.table.TableModel;
import model.KRS;
import model.tabelkrs;
import menu.krs;
import model.tabelmatkul;
/**
 *
 * @author Rangga
 */
public class crudkrs {
    menukrs krsmenul;
    impkrs krslimp;
    List<KRS> listkrs;

    public crudkrs(menukrs krsmenu){
        this.krsmenul = krsmenu;
        krslimp = new krs();
        listkrs = krslimp.getALL();
    }
    public void table(){
        listkrs = krslimp.getALL();
        tabelkrs tk = new tabelkrs(listkrs);
        krsmenul.getTablekrs().setModel((TableModel) tk);
    }
}
