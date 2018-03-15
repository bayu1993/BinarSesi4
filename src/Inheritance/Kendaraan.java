package Inheritance;

public abstract class Kendaraan {
    String merk,warna;
    int harga,jmlRoda;

    public Kendaraan(String merk){
        this.merk = merk;
    }

    public abstract void maju();

    public abstract void belok();

    public void ngerem(){
        System.out.println("Kendaraan "+merk+" bisa ngerem");
    }
}
