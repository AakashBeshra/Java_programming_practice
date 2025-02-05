import java.util.Scanner;
class Bank {
    private String name;
    private long accno;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAccno() {
        return accno;
    }

    public void setAccno(long accno) {
        this.accno = accno;
    }
    public Bank(String name, long accno, double balance) {
        this.name = name;
        this.accno = accno;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
    public void transfer(Balance toAccount, double amount) {
        if (balance >= amount) {
            balance -= amount;
            toAccount.deposit(amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
    public boolean checkAccountHolder(String name) {
        return this.name.equalsIgnoreCase(name);
    }
    public boolean checkAccountNumber(long accno) {
        return this.accno == accno;
    }
    public void displayAccountDetails() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accno);
        System.out.println("Current Balance: " + balance);
    }
    // Main function to take inputs from user
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter account number: ");
        long accno = scanner.nextLong();
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        Balance account = new Balance(name, accno, initialBalance);
        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // clear newline character
            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.print("Enter recipient's account number: ");
                    long recipientAccno = scanner.nextLong();
                    System.out.print("Enter transfer amount: ");
                    double transferAmount = scanner.nextDouble();
                    Balance recipientAccount = new Balance("", recipientAccno, 0);
                    account.transfer(recipientAccount, transferAmount);
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                System.out.println("Invalid option. Please try again.");
                break;
            }
        }
        scanner.close();
        System.out.println("Thank you for using our ATM!");
        account.displayAccountDetails();
    }
}