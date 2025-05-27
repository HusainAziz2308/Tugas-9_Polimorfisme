package Polimorfisme;
class Pegawai {
    protected String nama;
    protected int gaji;

    public Pegawai(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public int infoGaji() {
        return gaji;
    }
}

class Manajer extends Pegawai {
    private int tunjangan;

    public Manajer(String nama, int gaji, int tunjangan) {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }

    public int infoTunjangan() {
        return tunjangan;
    }
}

class Programmer extends Pegawai {
    private int bonus;

    public Programmer(String nama, int gaji, int bonus) {
        super(nama, gaji);
        this.bonus = bonus;
    }

    public int infoBonus() {
        return bonus;
    }
}

public class Bayaran {
    public int hitungbayaran(Pegawai peg) {
        int uang = peg.infoGaji();

        if (peg instanceof Manajer) {
            uang += ((Manajer) peg).infoTunjangan();
        } else if (peg instanceof Programmer) {
            uang += ((Programmer) peg).infoBonus();
        }

        return uang;
    }

    public static void main(String[] args) {
        Manajer man = new Manajer("Agus", 800, 50);
        Programmer prog = new Programmer("Budi", 600, 30);
        Bayaran hr = new Bayaran();

        System.out.println("Bayaran untuk Manajer : " + hr.hitungbayaran(man));
        System.out.println("Bayaran untuk Programmer : " + hr.hitungbayaran(prog));
    }
}
