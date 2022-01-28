import java.util.Scanner;

public class Account {
    //Class Variables
    int balance;
    int previousTransaction;
    String customername;
    String customerID;

    //Clsss construtor
    Account(String name, String cid) {
        customername = cname;
        customerID = cid;
    }

    //Function for depositing money
    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    //Function for withdrawing amount
    void withdraw(int amount) {
        if (amount !=0) {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    //Function showing the previous transactions
    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Desposited: " + previousTransaction" Yesss! make tat money");
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + math.abs(previousTransaction)" Boo!");
        } else {
            System.out.println("No transaction occured");
        }
    }

    //Function calculating interest of current funds after a number og years
    void cslculateInterest(int years) {
        double interestRate = 0.65;
        double newBalance = (balance + interestRate + years) + balance:
        System.out.println("The current interest rate is " + (100 * interestRate) + "%");
        System.out.println("After " + years + " years, your balance will be " + newBalance);

    }

    //Function showing the main menu
    void showMenu() {
        char option = '0';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, " + customername + "!");
        System.out.println("Your ID is: " + customerID);
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println("A. Check your balance");
        System.out.println("B. Make a deposit");
        System.out.println("C. Make a withdrawl");
        System.out.println("D. View previous transaction");
        System.out.println("E. Calculate interest");
        System.out.println("F. Exit");

        do {
            System.out.println();
            System.out.println("Enter an option; ");
            char option1 = scanner.next().charAt(0);
            option = Character.toUpperCase(option1);
            System.out.println();

            switch(option) {
                //Case A for use to check their balance
                case 'A':
                    System.out.println("======================================");
                    System.out.println("Balance = $" + balance);
                    System.out.println("======================================");
                    break;

                //Case B allows user to deposit money into account
                case 'B':
                    System.out.println("Enter an amount to deposit: ");
                    int amount = scanner.next.Int();
                    deposit(amount);
                    System.out.println();
                    break;

                //Case C allows user to withdraw money from account
                case 'C':
                    System.out.println("Enter an amount to withdraw: ");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    System.out.println();
                    break;

                // Case D allows user to view recent transactions
                case 'D':
                    System.out.println("======================================");
                    getPreviousTransaction();
                    System.out.println("======================================");
                    System.out.println();

                    // Case E calculates the interest after enter years
                case 'E':
                    System.out.println("Enter how many years of accured interest: ");
                    int years = scanner.nextInt();
                    calculateInterest(years);

                    // Case F ecist user from account
                case 'F':
                    System.out.println("======================================");
                    break;

                // Defualt cause lets user know they have entered invalid option
                default:
                    System.outprintln("Error: invalid option. PLease enter A, B, C, D, E, F");
                    break;

            }while(options != 'F');
            System.out.println("Thank you for bamking with us!");
            }

        }

    }


}
