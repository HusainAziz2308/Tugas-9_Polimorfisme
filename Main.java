package Polimorfisme;

class Pegawai {
    String nama;

    Pegawai(String nama) {
        this.nama = nama;
    }

    void kerja() {
        System.out.println(nama + " on duty");
    }
}

class Manajer extends Pegawai {
    Manajer(String nama) {
        super(nama);
    }

    void kerja() {
        System.out.println(nama + " is supervising");
    }
}

class Kurir extends Pegawai {
    Kurir(String nama) {
        super(nama);
    }

    void kerja() {
        System.out.println(nama + " on the way");
    }
}

public class Main {
    
    static void aktivitasKerja(Pegawai p) {
        p.kerja();  // Panggil method kerja yang sesuai dengan tipe objeknya
    }

    public static void main(String[] args) {
        Pegawai peg1 = new Pegawai("Andi");
        Manajer man1 = new Manajer("Budi");
        Kurir kur1 = new Kurir("Cici");

        aktivitasKerja(peg1);  // Andi sedang bekerja.
        aktivitasKerja(man1);  // Budi sedang mengatur tim.
        aktivitasKerja(kur1);  // Cici sedang mengantar paket.
    }
}
