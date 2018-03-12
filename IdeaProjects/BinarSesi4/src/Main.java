public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        int choice = mahasiswa.choice;
        int num1 = mahasiswa.num1;
        int num2 = mahasiswa.num2;
        switch (choice){
            case 1:
                System.out.println("addition");
                mahasiswa.additionOperator(num1, num2);
                break;
            case 2:
                System.out.println("subtraction");
                mahasiswa.subractionOperator(num1, num2);
                break;
            case 3:
                System.out.println("Multiplication");
                mahasiswa.multiplicationOperator(num1, num2);
                break;
            case 4:
                System.out.println("Division");
                mahasiswa.divisionOperator(num1, num2);
                break;
            default:
                System.out.println("Operator tidak ditemukan");

        }
    }
}
