package LiftApps;

public interface BaseLift {
    void cekCurrentPosition(int current);

    void cekGoalPosition(int goal);

    void cekPosition(int current, int goal);

    void goUp(int current, int goal);

    void goDown(int current, int goal);

    void print(String msg);

    void userConfirm();

    void errorHandling(String error);
}
