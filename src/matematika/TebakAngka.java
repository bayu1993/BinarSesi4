package matematika;

import java.util.Scanner;

public class TebakAngka {
    CheckNumber checkNumber = new CheckNumber();
    public TebakAngka(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan angka : ");
        int number = scanner.nextInt();
        String result = checkNumber.checkNumber(number);
        System.out.println(result);
    }
}
