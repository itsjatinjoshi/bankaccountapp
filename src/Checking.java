public class Checking extends Account {

   private long debitCardNumber;
    private int debitCardPIN;

    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCardInfo();
    }

    @Override
    public void setBaseRate() {
        rate = getBaseRate()*1.5;
       }

    private void setDebitCardInfo() {
        debitCardNumber = (long) (Math.random() * Math.pow(10, 12));
        debitCardPIN = (int) (Math.random() * Math.pow(10, 4));

    }

    public void showInfo() {
        super.showInfo();
        System.out.println(
                "Your Checking Debit Card Number is : " + debitCardNumber + "\n" +
                        "Your 4 Digit Debit PIN is : " + debitCardPIN
        );
    }
}