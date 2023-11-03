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
public class KRS extends Database{
    
    private String Kode_Matkul;
    private String Nama_Matkul;
    private int SKS;
    private String Semester;
    private String Tahun;

    public String getKode_Matkul1() {
        return Kode_Matkul;
    }

    public void setKode_Matkul(String Kode_Matkul) {
        this.Kode_Matkul = Kode_Matkul;
    }

    public String getNama_Matkul() {
        return Nama_Matkul;
    }

    public void setNama_Matkul(String Nama_Matkul) {
        this.Nama_Matkul = Nama_Matkul;
    }

    public int getSKS() {
        return SKS;
    }

    public void setSKS(int SKS) {
        this.SKS = SKS;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }

    public String getTahun() {
        return Tahun;
    }

    public void setTahun(String Tahun) {
        this.Tahun = Tahun;
    }
    
    
}

