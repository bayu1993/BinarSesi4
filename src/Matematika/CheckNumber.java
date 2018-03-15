package Matematika;

public class CheckNumber implements CheckNumberInterface{

    @Override
    public String checkNumber(int number) {
        if (number % 2 == 0){
            return "Genap";
        }
        return "Ganjil";
    }
}
