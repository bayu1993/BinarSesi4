package LiftApps;

import java.util.Scanner;

public class LiftApps  {
    public LiftApps(){
        Scanner scanner = new Scanner(System.in);
        LiftModel model = new LiftModel();
        LiftImpl lift = new LiftImpl();
        try {
            System.out.print("Posisi anda ada di lantai berapa : ");
            model.setCurrent(scanner.nextInt());
            lift.cekCurrentPosition(model.getCurrent());
            System.out.print("Tujuan anda ke lantai berapa : ");
            model.setGoal(scanner.nextInt());
            lift.cekGoalPosition(model.getGoal());
            lift.cekPosition(model.getCurrent(),model.getGoal());
       }catch (Exception e){
           lift.errorHandling("number");
       }
    }
}
