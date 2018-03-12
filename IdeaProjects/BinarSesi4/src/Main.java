public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int choice = calculator.choice;
        int num1 = calculator.num1;
        int num2 = calculator.num2;
        switch (choice){
            case 1:
                System.out.println("addition");
                calculator.additionOperator(num1, num2);
                break;
            case 2:
                System.out.println("subtraction");
                calculator.subractionOperator(num1, num2);
                break;
            case 3:
                System.out.println("Multiplication");
                calculator.multiplicationOperator(num1, num2);
                break;
            case 4:
                System.out.println("Division");
                calculator.divisionOperator(num1, num2);
                break;
            default:
                System.out.println("Operator tidak ditemukan");

        }
    }
}
