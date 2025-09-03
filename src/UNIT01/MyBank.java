package UNIT01;

public class MyBank {
    public static void main (String[]args){

        Bank as = new Bank();
        try{
            as.withdraw(9999);
            as.withdraw(1);
        }
        catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}
