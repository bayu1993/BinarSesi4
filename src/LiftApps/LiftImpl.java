package LiftApps;

import java.util.Scanner;

public class LiftImpl implements BaseLift{

    @Override
    public void cekCurrentPosition(int current) {
        if(current < 1 || current >20){
            errorHandling("input");
            new LiftApps();
        }
    }

    @Override
    public void cekGoalPosition(int goal) {
        if (goal < 1 || goal > 20){
            errorHandling("input");
            new LiftApps();
        }
    }

    @Override
    public void cekPosition(int current, int goal) {
        if (current > goal){
            goDown(current,goal);
        }else if(current < goal){
            goUp(current,goal);
        }else {
            print("Anda sudah berada di lantai "+current);
            userConfirm();
        }
    }

    @Override
    public void goUp(int current, int goal) {
        for (int i = current; i<=goal; i++){
            print("Sekarang kamu sedang berada ke lantai "+i);
        }
        print("\n");
        print("sekarang kamu sudah berada di lantai "+goal);
        userConfirm();
    }

    @Override
    public void goDown(int current, int goal) {
        for (int i = current; i>=goal; i--){
            print("Sekarang kamu sedang berada ke lantai "+i);
        }
        print("\n");
        print("sekarang kamu sudah berada di lantai "+goal);
        userConfirm();
    }

    @Override
    public void print(String msg) {
        System.out.println(msg);
    }

    @Override
    public void userConfirm() {
        print("Apakah kamu akan naik lift lagi (Y/N)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        switch (answer){
            case "Y":
                new LiftApps();
                break;
            case "N":
                print("Thanks");
                break;
            default:
                errorHandling("Y/N");
                userConfirm();
        }
    }

    @Override
    public void errorHandling(String error) {
        switch (error) {
            case "input":
                System.out.println("Error.. Salah input number hanya bisa diinputkan 1 - 20, silahkan coba lagi");
                new LiftApps();
                break;
            case "number":
                System.out.println("Error.. hanya bisa diinputkan number, silahkan coba lagi");
                new LiftApps();
                break;
            case "Y/N":
                System.out.println("Silahkan inputkan Y atau N tidak ada yang lain");
                break;
        }
    }
}
