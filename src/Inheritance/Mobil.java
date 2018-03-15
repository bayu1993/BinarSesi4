package Inheritance;

public class Mobil extends Kendaraan{

    public Mobil(String merk) {
        super(merk);
    }

    @Override
    public void maju() {

    }

    @Override
    public void belok() {

    }

    public void ngerem(){
        System.out.println("Mobil ngerem");
    }
}
