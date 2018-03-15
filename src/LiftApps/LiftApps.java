package LiftApps;

import java.util.Scanner;

public class LiftApps  {
    public LiftApps(){
        Scanner scanner = new Scanner(System.in);
        LiftImpl lift = new LiftImpl();
        try {
            System.out.print("Posisi anda ada di lantai berapa : ");
            int current = scanner.nextInt();
            lift.cekCurrentPosition(current);
            System.out.print("Tujuan anda ke lantai berapa : ");
            int goal = scanner.nextInt();
            lift.cekGoalPosition(goal);
            lift.cekPosition(current,goal);
       }catch (Exception e){
           lift.errorHandling("number");
       }
    }
}
