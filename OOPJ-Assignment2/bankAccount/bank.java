import java.util.Scanner;

class account {
    Scanner sc = new Scanner(System.in);
    private String name;
    private int accNo;
    private double accBal;

    void createAccount() {
        System.out.println("Enter Your Name : ");
        this.name = sc.nextLine();
        System.out.println("Congratulations Your account is created!!");
        this.accBal = 0;
        this.accNo = 155;
    }

    void depositMoney(int no,double amount){
        if(no == this.accNo){
            this.accBal += amount;
        }
        else{
            System.out.println("Invalid account number!!");
        }
    }

    void withdrawMoney(int no,double amount){
        if(no == this.accNo){
            if((this.accBal - amount) >=0){
                this.accBal -= amount;
            }
            else{
                System.out.println("Insufficient Balance");
            }
        }
        else{
            System.out.println("Invalid account number!!");
        }
    }

    void displayBalance(int no){
        if (no == this.accNo)  {
                System.out.println("Your account balance is : "+ this.accBal);
            }
        else {
            System.out.println("Invalid account number!!");
        }
    }
    
    void displayInfo(int no){
        if (no == this.accNo){
            System.out.println("Name : "+ this.name);
            System.out.println("Account balance : "+this.accNo);
        }
        else {
            System.out.println("Invalid account number!!");
        }
    }
}


class bank{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        account bank = new account();
        bank.createAccount();
        int choice = -1;
        int no;
        double amount;
        boolean b = true;

        while(b){
        System.out.println("Enter Choice : ");
        System.out.println("1. Deposit money");
        System.out.println("2. Withdraw money");
        System.out.println("3. Display account balance");
        System.out.println("4. Display account holder's information");
        System.out.println("0. Exit");

        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter Account number: ");
                no = sc.nextInt();
                System.out.println("Enter amount : ");
                amount = sc.nextDouble();
                bank.depositMoney(no, amount);
                System.out.println();
                break;

            case 2:
                System.out.println("Enter Account number: ");
                no = sc.nextInt();
                System.out.println("Enter amount : ");
                amount = sc.nextDouble();
                bank.withdrawMoney(no, amount);
                System.out.println();
                break;

            case 3:
                System.out.println("Enter Account number: ");
                no = sc.nextInt();
                bank.displayBalance(no);
                System.out.println();
                break;

            case 4:
                System.out.println("Enter Account number: ");
                no = sc.nextInt();
                bank.displayInfo(no);
                System.out.println();
                break;

            case 0:
                b= false;
        }
    }
    }
}