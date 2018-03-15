public class Looping {
    public void nestedLoop(){
        for (int i=5;i>0;i--){
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i=1;i<5;i++){
            for (int j=0;j<=i;j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
    public void bilanganFibonanci(int num1, int num2, int count){
        System.out.print(num1 +", "+num2);
        for (int i = 2; i<count; i++){
            int num3 = num1 + num2;
            System.out.print(", "+num3);
            num1 = num2;
            num2 = num3;
        }
    }

}
