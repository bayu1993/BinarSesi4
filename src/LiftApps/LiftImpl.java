package LiftApps;

import java.util.Scanner;

public class LiftImpl implements BaseLift{

    private BaseView view;
    public LiftImpl (BaseView view){
        this.view = view;
    }

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
            view.print("Anda sudah berada di lantai "+current);
            userConfirm();
        }
    }

    @Override
    public void goUp(int current, int goal) {
        for (int i = current; i<=goal; i++){
            view.print("Sekarang kamu sedang berada ke lantai "+i);
        }
        view.print("\n");
        view.print("sekarang kamu sudah berada di lantai "+goal);
        userConfirm();
    }

    @Override
    public void goDown(int current, int goal) {
        for (int i = current; i>=goal; i--){
            view.print("Sekarang kamu sedang berada ke lantai "+i);
        }
        view.print("\n");
        view.print("sekarang kamu sudah berada di lantai "+goal);
        userConfirm();
    }

    @Override
    public void userConfirm() {
        view.print("Apakah kamu akan naik lift lagi (Y/N)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        switch (answer){
            case "Y":
                new LiftApps();
                break;
            case "N":
                view.print("Thanks");
                break;
            default:
                errorHandling("confirm");
                userConfirm();
                break;
        }
    }

    @Override
    public void errorHandling(String error) {
        switch (error) {
            case "input":
                view.print("Error.. Salah input number hanya bisa diinputkan 1 - 20, silahkan coba lagi");
                new LiftApps();
                break;
            case "number":
                view.print("Error.. hanya bisa diinputkan number, silahkan coba lagi");
                new LiftApps();
                break;
            case "confirm":
                view.print("Silahkan inputkan Y atau N tidak ada yang lain");
                break;
        }
    }
}
