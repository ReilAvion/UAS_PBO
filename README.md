# UAS PBO APLIKASI HITUNG
Percobaan penerapan konsep OOP dan implementasi JDBC antara Java dan Mysql

### PBO A - Kelompok 2:
 - Dimas Bayu Aji                     (11770500106)
 - Muhammad Akbar Hidayatullah        (1177050044)
 - Ryan Reliovani                     (1177050128)  

## Yang dibutuhkan :
- XAMPP (untuk MySQL, Apache, phpmyadmin)
- Netbeans (untuk membuka Project)

## Langkah - Langkah Menjalankan Aplikasi :
1. Persiapkan aplikasi yang dibutuhkan
2. Download/clone source code project, dengan cara (Pilih) :
    - Menclone langsung melalui Netbeans
      
      [Tutorial](https://www.joe0.com/2018/02/16/how-to-cloning-github-project-into-netbeans/)
    - Aplikasi git
      1. Buka git, kemudian masukan command
          ```
          git clone https://github.com/ReilAvion/UAS_PBO.git
          ```
      2. Buka aplikasi Netbeans, lalu pilih **Open Project**
      3. Pilihlah folder dimana tempat clone berada
    - Download .zip **Clone or download**
      1. Pada atas kanan, klik **Clone or download** dan **Download ZIP**
      2. Ekstrak .zip tersebut
      3. Buka aplikasi Netbeans, lalu pilih **Open Project**
      4. Pilihlah folder dimana tempat ekstrak berada
3. Buka aplikasi XAMPP, lalu Aktifkan Mysql dan Apache
4. Buka link localhost phpmyadmin pada browser, dengan cara (Pilih) :
    - Tekan button **Admin** pada sebelah kanan baris **MySQL**
    - [Click Me !](http://localhost/phpmyadmin/index.php) 
5. Pada phpmyadmin, klik tab **Database** lalu buatlah database baru dengan nama **pengeluaran**
6. Pada phpmyadmin, klik tab **Import** lalu click _Choose File_ dan pilih **pengeluaran.sql** yang berada pada subdirectory project */sql/*
   ```
   .../UAS_PBO-master/sql/
   ```
7. Buka aplikasi Netbeans, lalu pilih dan jalankan **Aplikasi.java**, dengan cara (Pilih) :
    - Pada sidebar kiri, buka package **main** lalu click kanan pada **Aplikasi.java** dan pilih **Run File**
    - Pada tab Run (diantara **Refactor** dan **Debug**), click **Run Project**, dan pilih **Aplikasi.java** sebagai class utama

## Keterangan Menggunakan Aplikasi
-N/A   

## TL;DR
Clone project ini, buat database baru bernama **pengeluaran**, import file **pengeluaran.sql** yang terdapat pada folder /sql/, lalu run **Aplikasi.java** melalui netbeans


_Aplikasi ini diibuat pada Netbeans versi 8.2_
