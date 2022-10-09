/*
Mosammad Kabir
Professor DeBello
March 28, 2021
CUS 1115
 */
import java.util.Scanner;
public class deposit_loop
{
    public static void main(String[] args) {

        double i = 100;//initial balance
        Scanner kb = new Scanner(System.in);
        System.out.println("You currently have a balance of " + i + " in your bank account.");
        double d = 0;


        while (i < 5000)
        {
            System.out.println("Enter deposit: ");
        d = kb.nextDouble();
        i = i + d;//final balance=initial+deposit
        System.out.println("You currently have a balance of " + i + " in your bank account.");
    }

        System.out.println("Congrats! With your last deposit of "+d+", You can now buy the car with the "+i+" in your bank! ");


        }
    }
/*
You currently have a balance of 100.0 in your bank account.
Enter deposit:
700
You currently have a balance of 800.0 in your bank account.
Enter deposit:
700
You currently have a balance of 1500.0 in your bank account.
Enter deposit:
700
You currently have a balance of 2200.0 in your bank account.
Enter deposit:
700
You currently have a balance of 2900.0 in your bank account.
Enter deposit:
700
You currently have a balance of 3600.0 in your bank account.
Enter deposit:
700
You currently have a balance of 4300.0 in your bank account.
Enter deposit:
700
You currently have a balance of 5000.0 in your bank account.
Congrats! With your last deposit of 700.0, You can now buy the car with the 5000.0 in your bank!
 */