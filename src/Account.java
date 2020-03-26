public abstract class Account implements IBaseRate {

    private String name;
    private String sSN;
    private double balance;
    protected String accountNumber;
    protected double rate;
    private static int uniqueDigit = 20000;

    public Account(String name, String sSN, double balance) {
        this.name = name;
        this.sSN = sSN;
        this.balance = balance;
        this.accountNumber = setAccountNumber();
        setBaseRate();


    }

//    public void toCallMethod() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please Select the Options \n1. For Deposit. \n2. For Withdraw. \n3. For Transfer. \n4. Press C for Cancel any Operation");
//        double amount;
//
//        if (option.equals("1")) {
//            System.out.println("Please enter the amount for Deposit");
//            amount = sc.nextDouble();
//            deposit(amount);
//        }
//
//
//    }

    public abstract void setBaseRate();

    public void compoundResult() {
        double compoundAmount = balance * (rate / 100);
        System.out.println("Your Compound Balance is $" + compoundAmount + " So Total Balance is " + balance + compoundAmount);
    }

    public String setAccountNumber() {
        uniqueDigit++;
        String lastTwoSSNnum = sSN.substring(sSN.length() - 2, sSN.length());
        int randomDigit = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoSSNnum + "" + uniqueDigit + "" + randomDigit;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Balance after deposit is " + balance);
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Balance after withdraw is " + balance);
    }

    public void transfer(String toWhere, double amount) {
        balance = balance - amount;
        System.out.println("Transferring $" + amount + " to the " + toWhere);
        System.out.println("Balance after transfer" + balance);
    }

    public void showInfo() {
        System.out.println("Name : " + this.name + " \n" +
                "Social Num : " + this.sSN + "\n" +
                "Balance : " + balance + "\n" +
                "Account Num : " + accountNumber + "\n" +
                "Interest Rate : " + rate
        );
    }
}
