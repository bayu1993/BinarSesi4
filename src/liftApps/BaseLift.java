package liftApps;

public interface BaseLift {
    void cekCurrentPosition(int current);

    void cekGoalPosition(int goal);

    void cekPosition(int current, int goal);

    void goUp(int current, int goal);

    void goDown(int current, int goal);

    void userConfirm();

    void errorHandling(String error);
}
