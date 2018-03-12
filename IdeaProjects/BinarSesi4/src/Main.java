public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        int choice = mahasiswa.choice;
        switch (choice){
            case 1:
                System.out.println("addition");
                int addition = mahasiswa.additionOperator(mahasiswa.num1,mahasiswa.num2);
                System.out.println(addition);
                break;
            case 2:
                System.out.println("subtraction");
                int substract = mahasiswa.subractionOperator(mahasiswa.num1, mahasiswa.num2);
                System.out.println(substract);
                break;
            case 3:
                System.out.println("Multiplication");
                int multipication = mahasiswa.multiplicationOperator(mahasiswa.num1, mahasiswa.num2);
                System.out.println(multipication);
                break;
            case 4:
                System.out.println("Division");
                double division = mahasiswa.divisionOperator(mahasiswa.num1, mahasiswa.num2);
                System.out.println(division);
                break;
            default:
                System.out.println("Operator tidak ditemukan");

        }
    }
}
