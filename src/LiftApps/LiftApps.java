package LiftApps;

import java.util.Scanner;

public class LiftApps  {
    public LiftApps(){
        Scanner scanner = new Scanner(System.in);
        LiftImpl lift = new LiftImpl();
        int current = 0;
        int goal = 0;
        try {
            System.out.print("Posisi anda ada di lantai berapa : ");
            current = scanner.nextInt();
            lift.cekCurrentPosition(current);
            System.out.print("Tujuan anda ke lantai berapa : ");
            goal = scanner.nextInt();
            lift.cekGoalPosition(goal);
       }catch (Exception e){
           lift.errorHandling("number");
       }finally {
            lift.cekPosition(current,goal);
        }
    }
}
