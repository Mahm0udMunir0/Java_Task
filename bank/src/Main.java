import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        while (true){
            double balance = 10000;
            System.out.println("#####################");
            System.out.println("### 1.Show Balance ##");
            System.out.println("### 2.Deposit      ##");
            System.out.println("### 3.Withdraw     ##");
            System.out.println("### 4.Exit         ##");
            System.out.println("#####################");
            System.out.println("\n");
            Scanner inp = new Scanner(System.in);
            System.out.print("Choose Number : ");
            int inp_do = inp.nextInt();
            switch (inp_do){
                case 1:
                    System.out.println("Your Balance : "+ balance);

                    break;
               case 2:
                    Scanner des = new Scanner(System.in);
                    System.out.print("Enter Number you want to Deposit : ");
                    double des_do = des.nextDouble();
                    balance = balance + des_do;
                    System.out.println("Your Current Balance : " + balance );
                    break;
                case 3:
                    System.out.print("Enter Number you want to Withdraw : ");
                    double withd_do = inp.nextDouble();
                    if (withd_do > balance) {
                        System.out.println("Insufficient Balance! Your balance is: " + balance);
                    } else {
                        balance = balance - withd_do;
                        System.out.println("Your Current Balance : " + balance);
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using our service. Goodbye!");
                    inp.close();
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");


   }
    }
    }
}