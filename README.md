# Tugas 9 - POLIMORFISME
## Identitas
- Nama : Husain Aziz Al Rosyid
- NIM	: 4124031
- Kelas	: A

## Tujuan
1. Memahami dan menerapkan konsep polimorfisme dalam pemrograman.
2. Memahami proses Virtual Method Invocation.
3. Memahami penggunaan `instanceof` dan polymorphic arguments.

## Dasar Teori
Polimorfisme adalah kemampuan suatu objek untuk mengambil banyak bentuk, misalnya variabel bertipe parent class dapat merujuk ke objek subclass. Virtual Method Invocation (VMI) memungkinkan metode overridden pada subclass dipanggil melalui referensi parent class. Kata kunci `instanceof` berguna untuk memeriksa tipe objek sebelum melakukan casting.

## Hasil Percobaan
**C. TUGAS PENDAHULUAN**

1.	Apakah yang dimaksud dengan polimorfisme?
> Polimorfisme adalah kemampuan suatu objek untuk mengambil banyak bentuk. Misalnya, sebuah variabel bertipe parent class dapat merujuk ke objek subclass.
2.	Jelaskan proses terjadinya Virtual Method Invocation!
> Prses di mana metode overridden pada subclass dipanggil melalui referensi parent class.
3.	Apakah yang dimaksud dengan polymorphic arguments?
> Parameter metode yang dapat menerima objek dari subclass.
4.	Apakah kegunaan kata kunci instanceof?
> Digunakan untuk memeriksa tipe objek sebelum melakukan casting

**D. PERCOBAAN**

[Tes.java](Tes.java)

**E. LATIHAN**

1.	Jika file `SuperclassX.java` belum dikompile, maka file `SubclassY.java` tidak dapat dikompile. Ini karena `SubclassY` membutuhkan definisi lengkap dari `SuperclassX`, tetapi definisi tersebut belum tersedia dalam bentuk file .class yang dihasilkan dari proses kompilasi. Jadi saat mencoba mengkompilasi `SubclassY.java`, compiler akan memberikan error bahwa kelas `SuperclassX` tidak ditemukan.
2. 
- Ketika objek Derived dibuat, konstruktor Base dipanggil terlebih dahulu.
- Di dalam konstruktor Base, metode `amethod()` dipanggil. Namun, karena objek sebenarnya adalah Derived, metode `amethod()` dari Derived dipanggil. Jadi output pertama adalah `Base.amethod()`.
- Kemudian, `System.out.println(b.i)` mencetak nilai variabel `i` dari kelas Base, yaitu `99`, karena akses variabel tidak mengikuti mekanisme overriding.
- Selanjutnya, `b.amethod()` memanggil metode `amethod()` dari Derived, karena metode overriding dipilih berdasarkan tipe objek pada runtime. Outputnya adalah `Derived.amethod()`.

3.  
- Objek Child dibuat dengan referensi bertipe Parent.
- Ketika p.method2() dipanggil, metode method2() dari kelas Parent dieksekusi.
- Di dalam method2(), metode method1() dipanggil. Namun, karena method1() pada Parent bersifat private, metode ini tidak dapat di-override oleh Child. Oleh karena itu, metode method1() dari Parent yang dipanggil, menghasilkan output Parent's method1().
- Output secara keseluruhan adalah Parent's method2() dan Parent's method1().

4. [Main.java](Main.java)

**F. LATIHAN**
[Pegawai.java](Pegawai.java)

## Analisis
Hasil percobaan menunjukkan bahwa polimorfisme memungkinkan fleksibilitas dalam pemrograman dengan mengizinkan objek bertipe parent untuk merujuk ke subclass. Virtual Method Invocation terbukti bekerja dengan memanggil metode subclass meskipun referensi bertipe parent. Kata kunci `instanceof` berhasil digunakan untuk mengenali tipe objek sebelum casting.
## Penutup
**Kesimpulan:**

Polimorfisme adalah konsep penting yang memungkinkan fleksibilitas dan efisiensi dalam pemrograman berorientasi objek. Virtual Method Invocation dan penggunaan kata kunci `instanceof` adalah teknik-teknik penting untuk mendukung konsep ini.

**Saran:** 

Pengembangan lebih lanjut dapat dilakukan dengan memperluas konsep polimorfisme pada proyek yang lebih kompleks.

File: [4124031_Husain Aziz_Tugas 9](https://github.com/HusainAziz2308/Tugas-9_Polimorfisme/releases/download/file/4124031_Husain.Aziz_Tugas.9.docx)
