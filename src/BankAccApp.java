import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BankAccApp {
    public static void main(String[] args) {

        List<Account> accounts = new LinkedList<Account>();

//        Checking checking = new Checking("William Shakespear", "343234532", 2000);
//        Saving saving = new Saving("Bob Marlie", "344643432", 3400);
//        checking.showInfo();
//        checking.deposit(2000);
//        checking.withdraw(1500);
//        checking.transfer("saving", 200);
//        System.out.println("**********************");
//        saving.compoundResult();
        String file = "C:\\Users\\Jatin-PC\\IdeaProjects\\bankaccountapp\\src\\Utility\\original.csv";

        List<String[]> newAccountHolders = Utility.CSV.readCSV(file);

        for(String[] acc : newAccountHolders){
            String name = acc[0];
            String ssn = acc[1];
            String accType = acc[2];
            double bal = Double.parseDouble(acc[3]);
           // System.out.println(name+ " " + ssn + " " + accType + " " + bal);

            if(accType.equals("Savings")){
                accounts.add(new Saving(name, ssn, bal));
         //       System.out.println("OPEN A SAVING ACCOUNT");
            }
            else if(accType.equals("Checking")){
                accounts.add(new Checking(name, ssn, bal));
             //   System.out.println("OPEN A CHECKING ACCOUNT");
            }
            else{
               System.out.println("NO ACCOUNT FOUND");
            }
        }

//        for(int i =0; i<newAccountHolders.size(); i++){
//            String name = Arrays.toString(newAccountHolders.get(0));
//            System.out.println(name);
//            String sSNumber = Arrays.toString(newAccountHolders.get(1));
//            System.out.println(sSNumber);
//            String accountType = Arrays.toString(newAccountHolders.get(2));
//            System.out.println(accountType);
//            double balance = Double.parseDouble(Arrays.toString(newAccountHolders.get(3)));
//            System.out.println(balance);
//       //     System.out.println(name + " " + sSNumber + " " + accountType + " " + Double.parseDouble(String.valueOf(balance)));
//
//        }

        for (Account acc1: accounts) {
            System.out.println("\n************");
            acc1.showInfo();

        }


    }
}
