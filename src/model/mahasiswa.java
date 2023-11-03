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
public class mahasiswa extends Database{
    private int NIM;
    private String Nama_Mahasiswa;
    private String Jenis_Kelamin;
    private String Alamat;
    private String No_telp;

    public int getNIM() {
        return NIM;
    }

    public void setNIM(int NIM) {
        this.NIM = NIM;
    }

    public String getNama_Mahasiswa() {
        return Nama_Mahasiswa;
    }

    public void setNama_Mahasiswa(String Nama_Mahasiswa) {
        this.Nama_Mahasiswa = Nama_Mahasiswa;
    }

    public String getJenis_Kelamin() {
        return Jenis_Kelamin;
    }

    public void setJenis_Kelamin(String Jenis_Kelamin) {
        this.Jenis_Kelamin = Jenis_Kelamin;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getNo_telp() {
        return No_telp;
    }

    public void setNo_telp(String No_telp) {
        this.No_telp = No_telp;
    }

    
    
   
}
