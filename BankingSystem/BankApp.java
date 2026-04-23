import java.util.Scanner;
import java.util.ArrayList;

public class BankApp {
    public static void main(String[] args) {
        ArrayList<BankAccount> Account=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        
        while(true){
            System.out.println(" Enter 1 to : Create Account ");
            System.out.println(" Enter 2 to : Deposit money to your Account ");
            System.out.println(" Enter 3 to : Withdraw money from your Account ");
            System.out.println(" Enter 4 to : Check your Balance ");
            System.out.println(" Enter 5 to : Exit ");
        
            int ch = sc.nextInt(); 
            sc.nextLine();
            switch(ch){

                case 1:{
                        System.out.println("Enter your AccountNumber");
                        int acc=sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter your name ");
                        String  name=sc.nextLine();
                       
                        System.out.println("Enter your Openning Balance");
                        double balance=sc.nextDouble();
                        sc.nextLine();
                        Account.add( new BankAccount(acc,name,balance));
                        System.out.println(" Congratulations " +name+"your Account Created Successfully!!!!");
                        break;

                }
                case 2: {
                    System.out.println("Enter your Account Number\n");
                    int DpM= sc.nextInt();
                    sc.nextLine();
                    for(BankAccount acc: Account ){
                        if(acc.getAccountNumber()==DpM){

                            System.out.println("Enter Amount to deposit\n");
                            double amt=sc.nextDouble();
                            acc.deposit(amt);
                        }

                    }
                    break;
                }

                case 3: {
                    System.out.println("Enter your Account Number\n");
                    int DpM= sc.nextInt();
                    sc.nextLine();
                    for(BankAccount acc: Account ){
                        if(acc.getAccountNumber()==DpM){

                            System.out.println("Enter Amount to Withdraw\n");
                            double amt=sc.nextDouble();
                            acc.withdraw(amt);
                        }

                    }
                    break;
                }



                case 4:{
                    System.out.println("Enter your Account Number\n");
                    int DpM= sc.nextInt();
                    sc.nextLine();
                    for(BankAccount acc: Account ){
                        if(acc.getAccountNumber()==DpM){

                            System.out.println("Your Balance is :  "+ acc.getBalance());
                           
                        }

                    }
                    break;
                
                }

                case 5 :{

                    System.out.println("Thank you for choosing us!!");
                    return;
                }
                default:System.out.println("Invalid input");
            }
        }

    }
}
