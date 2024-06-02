package OctaNet Projects;

import java.util.Scanner;

class ATM 
{
    double Balance;                                
    int PIN = 8340;
 
    public void check_pin()                                                      // This method is used to Check whether the Pin is Right or Wrong.  
    {
        System.out.print("Enter your pin: ");

        Scanner sc = new Scanner(System.in);                                     // Take the input from the Scanner class.

        int inputted_PIN = sc.nextInt();                                         // The pin entered by the user.

        if (inputted_PIN == PIN)                                                 // The condition check whether the Pin entered is Correct or Wrong.
        {
            display_Menu();
        }
        else
        {
            System.out.println("Enter the valid PIN..!!");     
        }
    }


    public void display_Menu()                                                   // This method display the Functions of the ATM.
    {
        System.out.println(" Welcome to the ATM");

        System.out.println("\n1. Check Balance Amount");

        System.out.println("\n2. Deposit Amount");

        System.out.println("\n3. Withdraw Amount");

        System.out.println("\n4. Exit"); 

        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();                                                // User choose the case what he want to do.

        switch(choice)
        {
            case 1:
            check_Balance();                                                      // case 1 calls the check_balance method.
            break;

            case 2:
            deposit_Money();                                                      // case 2 calls the deposit_Money method.
            break;

            case 3:
            withdraw_Money();                                                     // case 3 calls the withdraw_Money method.
            break;

            case 4:                                                               // case 4 calls the return method when the user wants to exit.
            return; 

            default:                                                              // If user choose any other case then this case executed.
            System.out.println("Enter a valid choice...");
        }
    }

    public void check_Balance()                                                   // This method checks the balamce of the user.
        {
            System.out.println("Balance: " + Balance); 
            display_Menu();
        } 
    public void deposit_Money()                                                   // This method deposit the Money in the ATM and add the Money in initial balance.
    { 
        System.out.println("Enter the amount to deposit");

        Scanner sc = new Scanner(System.in);
 
        int deposit_amount = sc.nextInt();                                        // Take the input from the user that how much Money he wants to deposits in the ATM.

        Balance = Balance + deposit_amount;

        System.out.println("Money Deposited Successfully...");

        display_Menu();
    }

    public void withdraw_Money()                                                  // This method withdraw the money from the atm and subtract it from the initial balance.
    {
        System.out.println("Enter amount to be withdrawn...");

        Scanner sc = new Scanner(System.in);

        int withdrawn_Money = sc.nextInt();

        if(withdrawn_Money > Balance )                                            // This condition checks if the withdraw money is more than the balance,
        {                                                                         // Then it display that insuffient balance in the account.
            System.out.println("Insufficient Balance..");                  
        }
        else                                                                      // or else part will execute.
        {                    
            Balance = Balance - withdrawn_Money;

            System.out.println("Money withdrawl successfully..");
        }

        display_Menu();
    }

}

class ATM_Machine                                                               // This is the main class.
{  
    public static void main (String args[])
    {
        ATM atm = new ATM();                                                       // Create the object of ATM class and calls the check_pin method.
        atm.check_pin();
    }
}
    


