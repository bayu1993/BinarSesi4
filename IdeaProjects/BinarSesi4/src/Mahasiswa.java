import java.util.Scanner;

public class Mahasiswa {
    /*deklarasi variable*/
    int num1;
    int num2;
    int choice;

    public Mahasiswa(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nilai 1 : ");
        num1 = scanner.nextInt();
        System.out.print("Nilai 2 : ");
        num2 = scanner.nextInt();
        System.out.println("Pilih Operator :");
        System.out.println("1. Penambahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Pilihan :");
        choice = scanner.nextInt();
    }

    public void additionOperator(int num1, int num2){
        int hasil = num1 + num2;
        System.out.println(num1 +" + "+num2+" = "+hasil);
    }

    public void subractionOperator(int num1, int num2){
        int hasil = num1 - num2;
        System.out.println(num1 +" - "+num2+" = "+hasil);
    }

    public void multiplicationOperator(int num1, int num2){
        int hasil = num1 * num2;
        System.out.println(num1 +" x "+num2+" = "+hasil);
    }

    public void divisionOperator(int num1, int num2){
        double hasil = (double) num1 / num2;
        System.out.println(num1 +" / "+num2+" = "+hasil);
    }

}
