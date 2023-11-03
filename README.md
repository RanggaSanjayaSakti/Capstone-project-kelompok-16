# Capstone-project-kelompok-16
- Rangga Sanjaya Sakti (2209116080)
- Nazwa Talisya Inaya (2209116063)

# Pengelolaan KRS
KRS (Kartu Rencana Studi) adalah sebuah dokumen yang memuat daftar mata kuliah yang akan diambil oleh mahasiswa dalam satu semester atau tahun akademik tertentu. Pendataan KRS mahasiswa merupakan komponen yang sangat penting dalam administrasi perguruan tinggi dan universitas, KRS memberikan panduan kepada mahasiswa tentang mata kuliah yang perlu diambil untuk mencapai tahun akademiknya.  Pada tugas praktikum akhir PBO ini kami memutuskan untuk mengambil tema “Pendataan KRS Mahasiswa Prodi Ssitem Informasi” karena dapat membantu meningkatkan efesiensi dalam proses administrasi akademik, dapat memantau perkembangan akademik mahasiswa, membantu mereka memilih mata kuliah yang sesuai, dan memberikan perhatian khusus kepada mahasiswa yang mengalami kesulitan dalam studi. Dari pendataan KRS juga dapat membantu mahasiswa dalam melihat mata kuliah yang paling diminati dan mata kuliah yang kurang diminati oleh mahasiswa. Data KRS juga dapat digunakan untuk mengevaluasi kinerja dosen dalam hal pemantauan tingkat kehadiran, penilaian dosen oleh mahasiswa dan efektivitas pengajaran.


# Flowchart
![image](https://github.com/RanggaSanjayaSakti/Capstone-project-kelompok-16/assets/122283752/2749b6b0-0050-40ec-8174-0ef3e5f4b23b)

# Kelas
![image](https://github.com/RanggaSanjayaSakti/Capstone-project-kelompok-16/assets/122283752/2ccc63df-f4ca-4e21-a032-b7b784dcb660)


# Kodingan beserta penjelasan

- Class Databases
  <img width="418" alt="image" src="https://github.com/RanggaSanjayaSakti/Capstone-project-kelompok-16/assets/127506716/8f006df8-08fd-4859-9535-3449b7161ef4">
  . package databases;: Baris ini mendefinisikan paket (package) di mana class Database akan berada. Paket databases merupakan paket yang digunakan untuk mengelola akses 
    ke database.
  . import java.sql.*;: Ini adalah pernyataan untuk mengimpor paket java.sql yang berisi kelas-kelas dan antarmuka yang diperlukan untuk bekerja dengan database JDBC (Java 
    Database Connectivity).
  . public class Database {: Ini adalah deklarasi class Database yang akan digunakan untuk mengelola koneksi database.
  . private static Connection mysql;: Ini adalah deklarasi variabel mysql yang digunakan untuk menyimpan objek koneksi database. Variabel ini dideklarasikan sebagai 
    private 
    dan static sehingga hanya dapat diakses oleh class ini dan dapat dibagikan di antara semua instance dari class ini.
  . public static Connection configDB(): Ini adalah metode configDB yang digunakan untuk mengonfigurasi dan mendapatkan koneksi ke database. Metode ini mengembalikan objek 
    Connection yang merupakan koneksi database.
  . try { ... } catch (Exception a) { ... }: Ini adalah blok try-catch yang digunakan untuk menangani eksepsi yang mungkin terjadi saat mengatur koneksi database. Di dalam 
    blok try, koneksi database diinisialisasi dengan menggunakan informasi seperti URL database, nama pengguna, dan kata sandi. Jika ada kesalahan dalam koneksi, eksepsi 
    akan ditangani dan pesan kesalahan akan dicetak.
  . String url = "jdbc:mysql://localhost:3306/pa_dbd";: Ini adalah URL database yang digunakan untuk mengidentifikasi lokasi dan nama database yang akan diakses. Dalam hal 
    ini, database MySQL berada di localhost (komputer lokal) pada port 3306, dan nama database-nya adalah "pa_dbd".
  . String user = "root";: Ini adalah nama pengguna yang digunakan untuk mengautentikasi ke database MySQL. Dalam contoh ini, pengguna adalah "root".
  . String password = "";: Ini adalah kata sandi yang digunakan untuk mengautentikasi ke database MySQL. Dalam contoh ini, kata sandi dikosongkan (biasanya bukan praktik 
    yang aman).
  . mysql = DriverManager.getConnection(url, user, password);: Di sinilah koneksi sebenarnya dibuat dengan menggunakan metode DriverManager.getConnection(). Metode ini 
    mengambil tiga argumen: URL database, nama pengguna, dan kata sandi, dan mengembalikan objek Connection yang digunakan untuk berinteraksi dengan database.
  . System.err.println("Koneksi terputus " + a.getMessage());: Jika ada kesalahan dalam koneksi database, pesan kesalahan akan dicetak ke sistem keluaran kesalahan (error 
    output).k
  . return mysql;: Jika koneksi berhasil, objek Connection akan dikembalikan oleh metode configDB() sehingga dapat digunakan untuk berinteraksi dengan database dalam kode 
    lain.

- Class IMP DOSEN
  <img width="300" alt="image" src="https://github.com/RanggaSanjayaSakti/Capstone-project-kelompok-16/assets/127506716/ce7cb778-2ead-493f-bd29-94f3970016ac">
  . package imp;: Baris ini mendefinisikan paket (package) di mana interface impdosen akan berada. Interface ini mungkin digunakan untuk mengelola implementasi dari 
    entitas "Dosen" dalam suatu sistem atau aplikasi.
  . import model.Dosen;: Ini adalah pernyataan untuk mengimpor class Dosen dari paket model. Class Dosen digunakan dalam definisi metode-metode yang ada dalam interface 
    impdosen.
  . import java.util.List;: Ini adalah pernyataan untuk mengimpor interface List dari paket java.util. Interface List digunakan untuk mendefinisikan tipe data yang 
    digunakan sebagai hasil balik dari beberapa metode dalam interface impdosen.
  . public interface impdosen {: Ini adalah deklarasi dari interface impdosen. Interface ini didefinisikan sebagai public, yang berarti dapat diakses dari luar paketnya. 
    Interface ini akan menyediakan metode-metode yang akan diimplementasikan oleh class-class yang menggunakannya.
  . public void insert(Dosen c);: Ini adalah deklarasi metode insert, yang mengambil satu argumen bertipe Dosen yang digunakan untuk menambahkan data dosen ke dalam sistem 
    atau aplikasi.
  . public void update(Dosen c);: Ini adalah deklarasi metode update, yang mengambil satu argumen bertipe Dosen yang digunakan untuk memperbarui data dosen dalam sistem 
    atau aplikasi.
  . public void delete(int Nip);: Ini adalah deklarasi metode delete, yang mengambil satu argumen bertipe int yang merupakan NIP (Nomor Induk Pegawai) dari dosen yang akan 
    dihapus dari sistem atau aplikasi.
  . List<Dosen> getALL();: Ini adalah deklarasi metode getALL, yang mengembalikan daftar (List) objek Dosen. Metode ini digunakan untuk mengambil semua data dosen yang ada 
    dalam sistem atau aplikasi.
  . List<Dosen> getcaridosen(String nama_dosen);: Ini adalah deklarasi metode getcaridosen, yang mengambil satu argumen bertipe String yang berisi nama dosen yang akan 
    dicari. Metode ini mengembalikan daftar (List) objek Dosen yang sesuai dengan nama yang dicari.

- Class IMP KRS
  <img width="204" alt="image" src="https://github.com/RanggaSanjayaSakti/Capstone-project-kelompok-16/assets/127506716/ff3fc33d-a9bf-41a6-bfa9-e6201b66e675">
  . package imp;: Baris ini mendefinisikan paket (package) di mana interface impkrs akan berada. Interface ini mungkin digunakan untuk mengelola implementasi dari entitas 
    "KRS" (Kartu Rencana Studi) dalam suatu sistem atau aplikasi.
  . import model.KRS;: Ini adalah pernyataan untuk mengimpor class KRS dari paket model. Class KRS digunakan dalam definisi metode-metode yang ada dalam interface impkrs.
  . import java.util.List;: Ini adalah pernyataan untuk mengimpor interface List dari paket java.util. Interface List digunakan untuk mendefinisikan tipe data yang 
    digunakan sebagai hasil balik dari beberapa metode dalam interface impkrs.
  . public interface impkrs {: Ini adalah deklarasi dari interface impkrs. Interface ini didefinisikan sebagai public, yang berarti dapat diakses dari luar paketnya. 
    Interface ini akan menyediakan metode-metode yang akan diimplementasikan oleh class-class yang menggunakannya.
  . public void insert(KRS e);: Ini adalah deklarasi metode insert, yang mengambil satu argumen bertipe KRS. Metode ini digunakan untuk menambahkan data KRS ke dalam 
    sistem atau aplikasi.
  . List<KRS> getALL();: Ini adalah deklarasi metode getALL, yang mengembalikan daftar (List) objek KRS. Metode ini digunakan untuk mengambil semua data KRS yang ada dalam 
    sistem atau aplikasi.

- Class IMP MAHASISWA
  <img width="379" alt="image" src="https://github.com/RanggaSanjayaSakti/Capstone-project-kelompok-16/assets/127506716/8d2204f2-6a3d-4539-a9f2-f0c7c6712bd1">
  . package imp;: Baris ini mendefinisikan paket (package) di mana interface impmahasiswa akan berada. Interface ini mungkin digunakan untuk mengelola implementasi dari 
    entitas "Mahasiswa" dalam suatu sistem atau aplikasi.
  . import model.mahasiswa;: Ini adalah pernyataan untuk mengimpor class mahasiswa dari paket model. Class mahasiswa digunakan dalam definisi metode-metode yang ada dalam 
    interface impmahasiswa.
  . import java.util.List;: Ini adalah pernyataan untuk mengimpor interface List dari paket java.util. Interface List digunakan untuk mendefinisikan tipe data yang 
    digunakan sebagai hasil balik dari beberapa metode dalam interface impmahasiswa.
  . public interface impmahasiswa {: Ini adalah deklarasi dari interface impmahasiswa. Interface ini didefinisikan sebagai public, yang berarti dapat diakses dari luar 
    paketnya. Interface ini akan menyediakan metode-metode yang akan diimplementasikan oleh class-class yang menggunakannya.
  . public void insert(mahasiswa b);: Ini adalah deklarasi metode insert, yang mengambil satu argumen bertipe mahasiswa. Metode ini digunakan untuk menambahkan data 
    mahasiswa ke dalam sistem atau aplikasi.
  . public void update(mahasiswa b);: Ini adalah deklarasi metode update, yang mengambil satu argumen bertipe mahasiswa. Metode ini digunakan untuk memperbarui data 
    mahasiswa dalam sistem atau aplikasi.
  . public void delete(int NIM);: Ini adalah deklarasi metode delete, yang mengambil satu argumen bertipe int yang merupakan NIM (Nomor Induk Mahasiswa) dari mahasiswa 
    yang akan dihapus dari sistem atau aplikasi.
  . List<mahasiswa> getALL();: Ini adalah deklarasi metode getALL, yang mengembalikan daftar (List) objek mahasiswa. Metode ini digunakan untuk mengambil semua data 
    mahasiswa yang ada dalam sistem atau aplikasi.
  . List<mahasiswa> getcarimahasiswa(String Nama_Mahasiswa);: Ini adalah deklarasi metode getcarimahasiswa, yang mengambil satu argumen bertipe String yang berisi nama 
    mahasiswa yang akan dicari. Metode ini mengembalikan daftar (List) objek mahasiswa yang sesuai dengan nama yang dicari.
  
- Class IMP MATKUL
  <img width="367" alt="image" src="https://github.com/RanggaSanjayaSakti/Capstone-project-kelompok-16/assets/127506716/51f29b9d-2152-4259-a711-7e7ef97a7d65">
  . package imp;: Baris ini mendefinisikan paket (package) di mana interface impmatkul akan berada. Interface ini mungkin digunakan untuk mengelola implementasi dari 
    entitas "Mata_Kuliah" (mata kuliah) dalam suatu sistem atau aplikasi.
  . import model.Mata_Kuliah;: Ini adalah pernyataan untuk mengimpor class Mata_Kuliah dari paket model. Class Mata_Kuliah digunakan dalam definisi metode-metode yang ada 
    dalam interface impmatkul.
  . import java.util.List;: Ini adalah pernyataan untuk mengimpor interface List dari paket java.util. Interface List digunakan untuk mendefinisikan tipe data yang 
    digunakan sebagai hasil balik dari beberapa metode dalam interface impmatkul.
  . public interface impmatkul {: Ini adalah deklarasi dari interface impmatkul. Interface ini didefinisikan sebagai public, yang berarti dapat diakses dari luar paketnya. 
    Interface ini akan menyediakan metode-metode yang akan diimplementasikan oleh class-class yang menggunakannya.
  . public void insert(Mata_Kuliah d);: Ini adalah deklarasi metode insert, yang mengambil satu argumen bertipe Mata_Kuliah. Metode ini digunakan untuk menambahkan data 
    mata kuliah ke dalam sistem atau aplikasi.
  . public void update(Mata_Kuliah d);: Ini adalah deklarasi metode update, yang mengambil satu argumen bertipe Mata_Kuliah. Metode ini digunakan untuk memperbarui data 
    mata kuliah dalam sistem atau aplikasi.
  . public void delete(String Kodematkul);: Ini adalah deklarasi metode delete, yang mengambil satu argumen bertipe String yang berisi kode mata kuliah yang akan dihapus 
    dari sistem atau aplikasi.
  . List<Mata_Kuliah> getALL();: Ini adalah deklarasi metode getALL, yang mengembalikan daftar (List) objek Mata_Kuliah. Metode ini digunakan untuk mengambil semua data 
    mata kuliah yang ada dalam sistem atau aplikasi.
  . List<Mata_Kuliah> getcarinamamatkul(String nama_matkul);: Ini adalah deklarasi metode getcarinamamatkul, yang mengambil satu argumen bertipe String yang berisi nama 
    mata kuliah yang akan dicari. Metode ini mengembalikan daftar (List) objek Mata_Kuliah yang sesuai dengan nama yang dicari.

- Class Kontrol (CRUD DOSEN)
  <img width="327" alt="image" src="https://github.com/RanggaSanjayaSakti/Capstone-project-kelompok-16/assets/127506716/81312230-bb18-4515-a77f-e2d3c55f85c9">
  <img width="874" alt="image" src="https://github.com/RanggaSanjayaSakti/Capstone-project-kelompok-16/assets/127506716/22690a7a-0ede-497c-a4ba-3cf0bab0da15">
  <img width="618" alt="image" src="https://github.com/RanggaSanjayaSakti/Capstone-project-kelompok-16/assets/127506716/014fb6b2-7f06-4eb8-87ab-cfc472b9057d">
  . package kontrol;: Baris ini mendefinisikan paket (package) di mana class cruddosen akan berada.
  . import imp.impdosen;: Ini adalah pernyataan untuk mengimpor interface impdosen yang mungkin digunakan untuk mengakses dan mengelola data Dosen dalam sistem.
  . import GUI.dosen;: Ini adalah pernyataan untuk mengimpor class dosen dari paket GUI. Class dosen mungkin berfungsi sebagai antarmuka pengguna grafis (GUI) yang 
    digunakan untuk berinteraksi dengan data Dosen.
  . import java.sql.SQLException;: Ini adalah pernyataan untuk mengimpor class SQLException dari paket java.sql. Class ini digunakan untuk menangani eksepsi yang terkait 
    dengan operasi-operasi database.
  . import java.util.List;: Ini adalah pernyataan untuk mengimpor interface List dari paket java.util. Interface List digunakan untuk mengelola koleksi data.
  . import menu.dosen1;: Ini adalah pernyataan untuk mengimpor class dosen1 dari paket menu. Class ini mungkin digunakan sebagai implementasi dari interface impdosen.
  . import model.tabeldosen;: Ini adalah pernyataan untuk mengimpor class tabeldosen dari paket model. Class ini mungkin digunakan untuk menampilkan data Dosen dalam 
    sebuah tabel.
  . import model.Dosen;: Ini adalah pernyataan untuk mengimpor class Dosen dari paket model. Class Dosen mungkin merepresentasikan entitas Dosen dalam sistem.
  . public class cruddosen {: Ini adalah deklarasi class cruddosen. Class ini digunakan untuk mengontrol operasi-operasi terkait dengan entitas Dosen.
  . dosen dsn;: Ini adalah deklarasi variabel dsn yang merupakan objek dari class dosen. Objek ini mungkin digunakan untuk berinteraksi dengan antarmuka pengguna grafis 
    yang terkait dengan entitas Dosen.
  . impdosen dsnimp;: Ini adalah deklarasi variabel dsnimp yang merupakan objek yang mengimplementasikan interface impdosen. Objek ini mungkin digunakan untuk mengakses 
    dan mengelola data Dosen.
  . List<Dosen> listdosen;: Ini adalah deklarasi variabel listdosen yang merupakan daftar objek Dosen. Variabel ini mungkin digunakan untuk menyimpan data Dosen.
    public cruddosen(dosen dsn) throws SQLException {: Ini adalah konstruktor class cruddosen yang menerima objek dsn dari class dosen sebagai argumen. Konstruktor ini 
    mungkin digunakan untuk inisialisasi objek dan mendapatkan data Dosen dari sumber data (misalnya, database) ke dalam variabel listdosen.
  . public void reset() { ... }: Ini adalah metode reset() yang digunakan untuk mengosongkan inputan pada antarmuka pengguna grafis.
  . public void table() { ... }: Ini adalah metode table() yang digunakan untuk memperbarui tampilan tabel yang menampilkan data Dosen.
  . public void fielddosen(int row) { ... }: Ini adalah metode fielddosen() yang digunakan untuk mengisi inputan pada antarmuka pengguna grafis dengan data Dosen yang 
    dipilih.
  . public void insertdosen() { ... }: Ini adalah metode insertdosen() yang digunakan untuk menambahkan data Dosen ke dalam sistem atau aplikasi. Metode ini mengambil data 
    dari inputan pengguna, memasukkan ke dalam objek Dosen, dan menyimpannya ke dalam sumber data.
  . public void updatedosen() { ... }: Ini adalah metode updatedosen() yang digunakan untuk memperbarui data Dosen dalam sistem berdasarkan data yang dimasukkan oleh 
    pengguna.
  . public void deletedosen() { ... }: Ini adalah metode deletedosen() yang digunakan untuk menghapus data Dosen dari sistem berdasarkan data yang dimasukkan oleh 
    pengguna.
  
- Class Menu (Mahasiswa)
  <img width="778" alt="image" src="https://github.com/RanggaSanjayaSakti/Capstone-project-kelompok-16/assets/127506716/a8957f19-54a3-41d6-8678-78e03951ed87">
  <img width="428" alt="image" src="https://github.com/RanggaSanjayaSakti/Capstone-project-kelompok-16/assets/127506716/dfab71a7-c3e2-4afb-a586-79d604e3d16c">
  <img width="401" alt="image" src="https://github.com/RanggaSanjayaSakti/Capstone-project-kelompok-16/assets/127506716/5ec8a0ee-515c-4193-9b28-e5276548e54f">
  <img width="361" alt="image" src="https://github.com/RanggaSanjayaSakti/Capstone-project-kelompok-16/assets/127506716/30cb1796-9e16-418d-8255-62690ebf99cc">
  <img width="613" alt="image" src="https://github.com/RanggaSanjayaSakti/Capstone-project-kelompok-16/assets/127506716/97b85ad8-c668-4af3-aabe-93de18bb329c">
  <img width="624" alt="image" src="https://github.com/RanggaSanjayaSakti/Capstone-project-kelompok-16/assets/127506716/7da9343a-d998-4b23-ac47-f723f0b8f83c">

  . package menu;: Baris ini mendefinisikan paket (package) di mana class Mahasiswa akan berada.
  . import model.mahasiswa;: Ini adalah pernyataan untuk mengimpor class mahasiswa dari paket model. Class mahasiswa mungkin digunakan untuk merepresentasikan entitas 
    Mahasiswa dalam sistem.
  . import java.sql.*;: Ini adalah pernyataan untuk mengimpor paket-paket yang berkaitan dengan JDBC (Java Database Connectivity), yang digunakan untuk berinteraksi dengan 
    database.
  . import databases.Database;: Ini adalah pernyataan untuk mengimpor class Database dari paket databases. Class ini mungkin digunakan untuk mengelola koneksi database.
  . import imp.impmahasiswa;: Ini adalah pernyataan untuk mengimpor interface impmahasiswa. Interface ini mungkin digunakan untuk mendefinisikan metode-metode yang akan 
    digunakan untuk mengelola data Mahasiswa.
  . import java.util.ArrayList;: Ini adalah pernyataan untuk mengimpor class ArrayList dari paket java.util. Class ArrayList digunakan untuk mengelola koleksi data 
    Mahasiswa.
  . import java.util.List;: Ini adalah pernyataan untuk mengimpor interface List dari paket java.util. Interface List digunakan untuk mengelola koleksi data.
  . import java.util.logging.*;: Ini adalah pernyataan untuk mengimpor paket java.util.logging yang digunakan untuk melakukan pencatatan log (logging).
  . public class Mahasiswa implements impmahasiswa {: Ini adalah deklarasi class Mahasiswa yang mengimplementasikan interface impmahasiswa. Class ini bertanggung jawab 
    untuk mengimplementasikan metode-metode yang didefinisikan dalam interface tersebut untuk mengelola data Mahasiswa.
  . Connection conn;: Ini adalah deklarasi variabel conn yang merupakan objek Connection. Objek ini digunakan untuk mengelola koneksi ke database.
  . final String insert = "INSERT INTO mahasiswa (NIM, Nama_Mahasiswa, Jenis_Kelamin, Alamat, NO_Telp) VALUES (?,?,?,?,?);";: Ini adalah deklarasi variabel insert yang 
    berisi pernyataan SQL untuk menambahkan data Mahasiswa ke dalam database.
  . final String update = "UPDATE mahasiswa set Nama_Mahasiswa=?,Jenis_Kelamin=?, Alamat=?, NO_Telp=? where NIM=?;";: Ini adalah deklarasi variabel update yang berisi 
    pernyataan SQL untuk memperbarui data Mahasiswa dalam database.
  . final String delete = "DELETE FROM mahasiswa WHERE NIM=?;";: Ini adalah deklarasi variabel delete yang berisi pernyataan SQL untuk menghapus data Mahasiswa dari 
    database.
  . final String select = "SELECT * FROM mahasiswa mahasiswa;";: Ini adalah deklarasi variabel select yang berisi pernyataan SQL untuk mengambil semua data Mahasiswa dari 
    database.
  . final String search = "SELECT * FROM mahasiswa where NIM like ?";: Ini adalah deklarasi variabel search yang berisi pernyataan SQL untuk mencari data Mahasiswa 
    berdasarkan NIM yang cocok.
  . public Mahasiswa() { ... }: Ini adalah konstruktor class Mahasiswa. Konstruktor ini digunakan untuk menginisialisasi objek conn dengan menggunakan Database.configDB(), 
    yang mengembalikan objek koneksi database.
  . @Override: Ini adalah anotasi @Override yang menunjukkan bahwa metode berikutnya mengimplementasikan metode dari interface impmahasiswa.
    public void insert(mahasiswa b) { ... }: Ini adalah implementasi metode insert dari interface impmahasiswa. Metode ini digunakan untuk menambahkan data Mahasiswa ke 
    dalam database.
  . public void update(mahasiswa b) { ... }: Ini adalah implementasi metode update dari interface impmahasiswa. Metode ini digunakan untuk memperbarui data Mahasiswa dalam 
    database.
  . public void delete(int NIM) { ... }: Ini adalah implementasi metode delete dari interface impmahasiswa. Metode ini digunakan untuk menghapus data Mahasiswa dari 
    database berdasarkan NIM.
  . public java.util.List<mahasiswa> getcarimahasiswa(String Nama_Mahasiswa) { ... }: Ini adalah implementasi metode getcarimahasiswa dari interface impmahasiswa. Metode 
    ini digunakan untuk mencari data Mahasiswa berdasarkan nama Mahasiswa.
  . public java.util.List<mahasiswa> getALL() { ... }: Ini adalah implementasi metode getALL dari interface impmahasiswa. Metode ini digunakan untuk mengambil semua data 
    Mahasiswa dari database.

- Class Model (DOSEN)
  <img width="332" alt="image" src="https://github.com/RanggaSanjayaSakti/Capstone-project-kelompok-16/assets/127506716/d8d1ae5b-9755-49e1-9828-e6e7b9742a69">
  <img width="296" alt="image" src="https://github.com/RanggaSanjayaSakti/Capstone-project-kelompok-16/assets/127506716/c1a74429-b881-418e-9717-9a7eb718835f">
  package model;: Baris ini mendefinisikan paket (package) di mana class Dosen akan berada.

  . import databases.Database;: Ini adalah pernyataan untuk mengimpor class Database dari paket databases. Class Database mungkin berisi konfigurasi koneksi ke database, 
    dan class Dosen mewarisi (extends) class ini untuk memanfaatkan fitur-fitur yang ada di dalamnya.
  . public class Dosen extends Database {: Ini adalah deklarasi class Dosen yang meng-extends class Database. Ini berarti class Dosen mewarisi sifat dan metode-metode yang 
    ada di class Database.
  . private int NIP;: Ini adalah deklarasi variabel NIP yang mewakili nomor induk dosen. Variabel ini digunakan untuk menyimpan nilai NIP dari seorang dosen.
  . private String Nama_Dosen;: Ini adalah deklarasi variabel Nama_Dosen yang mewakili nama dosen. Variabel ini digunakan untuk menyimpan nama dari seorang dosen.
  . private String Jabatan;: Ini adalah deklarasi variabel Jabatan yang mewakili jabatan dosen. Variabel ini digunakan untuk menyimpan jabatan dari seorang dosen.
  . public int getNIP() { ... }: Ini adalah metode getNIP() yang digunakan untuk mengembalikan nilai dari variabel NIP. Metode ini berfungsi sebagai akses untuk membaca 
    nilai NIP.
  . public void setNIP(int NIP) { ... }: Ini adalah metode setNIP() yang digunakan untuk mengatur nilai dari variabel NIP. Metode ini berfungsi sebagai akses untuk 
    mengubah nilai NIP.
  . public String getNama_Dosen() { ... }: Ini adalah metode getNama_Dosen() yang digunakan untuk mengembalikan nilai dari variabel Nama_Dosen. Metode ini berfungsi 
    sebagai akses untuk membaca nama dosen.
  . public void setNama_Dosen(String Nama_Dosen) { ... }: Ini adalah metode setNama_Dosen() yang digunakan untuk mengatur nilai dari variabel Nama_Dosen. Metode ini 
    berfungsi sebagai akses untuk mengubah nama dosen.
  . public String getJabatan() { ... }: Ini adalah metode getJabatan() yang digunakan untuk mengembalikan nilai dari variabel Jabatan. Metode ini berfungsi sebagai akses 
    untuk membaca jabatan dosen.
  . public void setJabatan(String Jabatan) { ... }: Ini adalah metode setJabatan() yang digunakan untuk mengatur nilai dari variabel Jabatan. Metode ini berfungsi sebagai 
    akses untuk mengubah jabatan dosen.
  
- Class Model (Tabel)
  <img width="344" alt="image" src="https://github.com/RanggaSanjayaSakti/Capstone-project-kelompok-16/assets/127506716/ab2a74c1-a2a9-422d-8235-b8579f062d6c">
  <img width="459" alt="image" src="https://github.com/RanggaSanjayaSakti/Capstone-project-kelompok-16/assets/127506716/e95cbebc-40f8-4f92-8ef4-b90497509c00">

  . package model;: Baris ini mendefinisikan paket (package) di mana class tabeldosen akan berada.
  . import java.util.List;: Ini adalah pernyataan untuk mengimpor interface List dari paket java.util. Interface List digunakan untuk mengelola koleksi data.
  . import javax.swing.table.AbstractTableModel;: Ini adalah pernyataan untuk mengimpor class AbstractTableModel dari paket javax.swing.table. Class AbstractTableModel 
    digunakan untuk membuat model tabel yang dapat digunakan dalam komponen tabel Swing.
  . public class tabeldosen extends AbstractTableModel {: Ini adalah deklarasi class tabeldosen yang merupakan turunan dari class AbstractTableModel. Class ini digunakan 
    untuk mengatur tampilan tabel yang menampilkan data Dosen dalam antarmuka pengguna.
  . List<Dosen> listDosen;: Ini adalah deklarasi variabel listDosen yang merupakan objek dari class List yang menyimpan objek-objek Dosen. Variabel ini digunakan untuk 
    menyimpan data Dosen yang akan ditampilkan dalam tabel.
  . public tabeldosen(List<Dosen> listdosen) { ... }: Ini adalah konstruktor class tabeldosen yang menerima objek listdosen sebagai argumen. Konstruktor ini digunakan 
    untuk menginisialisasi objek listDosen dengan data Dosen yang akan ditampilkan dalam tabel.
  . public int getRowCount() { ... }: Ini adalah implementasi metode getRowCount yang digunakan untuk mengembalikan jumlah baris dalam tabel, yang sama dengan jumlah objek 
    Dosen dalam listDosen.
  . public int getColumnCount() { ... }: Ini adalah implementasi metode getColumnCount yang digunakan untuk mengembalikan jumlah kolom dalam tabel. Dalam kasus ini, jumlah 
    kolom adalah tetap 3.
  . public String getColumnName(int columnIndex) { ... }: Ini adalah implementasi metode getColumnName yang digunakan untuk mengembalikan nama kolom dalam tabel 
    berdasarkan indeks kolom. Dalam kasus ini, ada tiga kolom dengan nama "Nip," "nama_dosen," dan "jabatan."
  . public Object getValueAt(int rowIndex, int columnIndex) { ... }: Ini adalah implementasi metode getValueAt yang digunakan untuk mengambil nilai dalam sel tabel 
    berdasarkan indeks baris dan kolom. Metode ini mengambil nilai dari objek Dosen dalam listDosen sesuai dengan indeks baris dan kolom yang diberikan.


# SS Output beserta penjelasan
-![image](https://github.com/RanggaSanjayaSakti/Capstone-project-kelompok-16/assets/122283752/bf7957e0-4fe4-45f6-b68d-6df213703b26)
ini adalah tampilan awal untuk login user harus mengklik tombol admin agar terpindah ke halaman berikutnya
-![image](https://github.com/RanggaSanjayaSakti/Capstone-project-kelompok-16/assets/122283752/d121ac86-087c-474e-a2e8-045fc7d0cbdb)
setelah itu masukan username dan password nya untuk login untuk masuk ke beranda admin atau menu yang ada di admin.
-![image](https://github.com/RanggaSanjayaSakti/Capstone-project-kelompok-16/assets/122283752/e03e4ed7-9248-4bb7-81da-e130237bacb0)
Lalu muncul beranda admin yaitu ada menu data matakuliah, data mahasiswa, data dosen, data krs
-![image](https://github.com/RanggaSanjayaSakti/Capstone-project-kelompok-16/assets/122283752/b18401e0-84bd-4f8f-9336-fb9b85291c94)
ini adalah tampilan jika admin mengklik menu matakuliah, lalu ada fitur tambah, update, dan delete pada tampilan tersebut.
-![image](https://github.com/RanggaSanjayaSakti/Capstone-project-kelompok-16/assets/122283752/e007d5f0-7f8e-4a98-9cca-931f7a04a435)
ini adalah tampilan jika admin mengklik menu mahasiswa, ada fitur tambah, update, dan delete pada tampilan tersebut.
-![image](https://github.com/RanggaSanjayaSakti/Capstone-project-kelompok-16/assets/122283752/cd83c609-2092-454b-96da-f1c961cb3b11)
 ini adalah tampilan jika admin mengklik menu dosen, ada fitur tambah, update, dan delete pada tampilan tersebut.
-![image](https://github.com/RanggaSanjayaSakti/Capstone-project-kelompok-16/assets/122283752/dc132ee3-8719-4be1-a31f-9df4b323ad41)
lalu pada tampilan menu krs admin hanya bisa melihat data matakuliah yang berada didalam krs tersebut.



