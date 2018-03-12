import java.util.Scanner;

public class Calculator {

    public void printCalculator(){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Nilai 1 : ");
            int num1 = scanner.nextInt();
            System.out.print("Nilai 2 : ");
            int num2 = scanner.nextInt();
            System.out.println("Pilih Operator :");
            System.out.println("1. Penambahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.print("Pilihan :");
            int choice = scanner.nextInt();
            hitung(num1, num2, choice);
        }catch (Exception ex){
            System.out.println("Error, Input data harus bilangan bulat ");
            printCalculator();
        }
    }

    private void hitung(int num1, int num2, int choice){
        switch (choice){
            case 1:
                System.out.println("addition");
                additionOperator(num1, num2);
                break;
            case 2:
                System.out.println("subtraction");
                subractionOperator(num1, num2);
                break;
            case 3:
                System.out.println("Multiplication");
                multiplicationOperator(num1, num2);
                break;
            case 4:
                System.out.println("Division");
                divisionOperator(num1, num2);
                break;
            default:
                System.out.println("Operator tidak ditemukan");
        }
    }

    private void additionOperator(int num1, int num2){
        int hasil = num1 + num2;
        System.out.println(num1 +" + "+num2+" = "+hasil);
    }

    private void subractionOperator(int num1, int num2){
        int hasil = num1 - num2;
        System.out.println(num1 +" - "+num2+" = "+hasil);
    }

    private void multiplicationOperator(int num1, int num2){
        int hasil = num1 * num2;
        System.out.println(num1 +" x "+num2+" = "+hasil);
    }

    private void divisionOperator(int num1, int num2){
        double hasil = (double) num1 / num2;
        System.out.println(num1 +" / "+num2+" = "+hasil);
    }

}
