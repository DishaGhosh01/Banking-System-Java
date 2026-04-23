public class BankAccount {
    private int AccountNumber;
    private  String accountHolderName;
    private double Balance;
    public BankAccount( int AccountNumber,String accountHolderName, double Balance) {
            this.AccountNumber=AccountNumber;
            this.accountHolderName = accountHolderName;
            this.Balance=Balance;
    }

    public void deposit(double amount){
        if(amount>0){
            Balance+=amount;
            System.out.println(amount+"  Deposited Successfully!!");

        }
        else{
            System.out.println("enter a valid number to deposit");

        }
        
    }


    public void withdraw(double amount){
        if(amount<Balance){
            Balance-=amount;
            System.out.println(amount+"  Wthdraw Successfully!!");

        }
        else{
            System.out.println("enter a valid number to withdraw");

        }
        

    }

    public double getBalance(){
        return Balance;

    }
    public int getAccountNumber(){

        return AccountNumber;
    }


}
