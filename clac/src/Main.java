import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        // operators
        while(true){
            // num1
            Scanner sc1 = new Scanner(System.in);
            System.out.print("Enter The First Number : ");
            double num1 = sc1.nextDouble();

            // num2
            Scanner sc2 = new Scanner(System.in);
            System.out.print("Enter The Second Number : ");
            double num2 = sc2.nextDouble();

            // operator sign
            Scanner op = new Scanner(System.in);
            System.out.print("choose the operator [ +  , - , * , / ] : ");
            char operate = op.next().charAt(0);

            double result = 0;
            switch (operate){
                case '+':
                    result = num1 + num2;
                    System.out.println("Your Result is : " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Your Result is : " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Your Result is : " + result);
                    break;
                case '/':
                    if (num2 == 0){
                        System.out.println("Division by zero is not allowed.");
                    }else {
                        result = num1 / num2;
                        System.out.println("Your Result is : " + result);
                        break;
                    }


            }



        }


    }

}