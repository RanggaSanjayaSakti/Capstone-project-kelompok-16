/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package databases;
import java.sql.*;

/**
 *
 * @author Rangga
 */
public class Database {
    private static Connection mysql;
    public static Connection configDB(){
        try{
            String url = "jdbc:mysql://localhost:3306/pa_dbd";
            String user = "root";
            String password = "";
            mysql = DriverManager.getConnection(url,user,password);
        } catch(Exception a) {
            System.err.println("Koneksi terputus "+a.getMessage());
        }
        return mysql;
    }
    }
