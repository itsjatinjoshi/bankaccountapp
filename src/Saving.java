public class Saving extends Account {

    private int safetyDepositBoxID;
    private int safetyDepositBoxKEY;

    public Saving(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;

        showSafetyDipositBox();
    }

    @Override
    public void setBaseRate() {
        rate = getBaseRate() - .25;
    }

    private void showSafetyDipositBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKEY = (int) (Math.random() * Math.pow(10, 4));
    }

    public void showInfo() {
        super.showInfo();
        System.out.println(
                "Your SAVING Safety Deposit ID is : " + safetyDepositBoxID + "\n" +
                        "Your SAVING Safety Deposit KEY is : " + safetyDepositBoxKEY

        );
    }
}
