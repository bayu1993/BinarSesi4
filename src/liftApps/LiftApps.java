package liftApps;

import java.util.Scanner;

public class LiftApps implements BaseView{

    public LiftApps(){
        Scanner scanner = new Scanner(System.in);

        BaseLift lift = new LiftImpl(this);
        LiftModel model = new LiftModel();
        try {
            System.out.print("Posisi anda ada di lantai berapa : ");
            model.setCurrent(scanner.nextInt());
            lift.cekCurrentPosition(model.getCurrent());
            System.out.print("Tujuan anda ke lantai berapa : ");
            model.setGoal(scanner.nextInt());
            lift.cekGoalPosition(model.getGoal());
            lift.cekPosition(model.getCurrent(), model.getGoal());
       }catch (Exception e){
           lift.errorHandling("number");
       }
    }

    @Override
    public void print(String msg) {
        System.out.println(msg);
    }
}
