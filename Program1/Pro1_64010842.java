public class Pro1_64010842{
    public static void main(String[] args){
        Account account = new Account(1122,20000);
        account.setAnnualInterestRate(4.5);
        account.deposit(3000);
        account.withdraw(2500);

        System.out.println("-----------------------------------------------------------------");
        System.out.printf("\tBalance : %.2f\n", account.getBalance());
        System.out.printf("\tMonthly interest : %.3f\n", account.getMonthlyInterest());
        System.out.println("\tDate created : " + account.getDateCreated());
        System.out.println("-----------------------------------------------------------------");
    }
}