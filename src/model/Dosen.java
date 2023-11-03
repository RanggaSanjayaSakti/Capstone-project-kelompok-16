/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import databases.Database;
/**
 *
 * @author Rangga
 */
public class Dosen extends Database{
    private int NIP;
    private String Nama_Dosen;
    private String Jabatan;

    public int getNIP() {
        return NIP;
    }

    public void setNIP(int NIP) {
        this.NIP = NIP;
    }

    public String getNama_Dosen() {
        return Nama_Dosen;
    }

    public void setNama_Dosen(String Nama_Dosen) {
        this.Nama_Dosen = Nama_Dosen;
    }

    public String getJabatan() {
        return Jabatan;
    }

    public void setJabatan(String Jabatan) {
        this.Jabatan = Jabatan;
    }
 
    
    
}
