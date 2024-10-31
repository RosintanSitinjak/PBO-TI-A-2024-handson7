package enkapsulasi;

public class Main {
    public static void main(String[] args) {
        BankAccount rosintanSitinjak = new BankAccount(100);

    //beli minuman 10 (withdraw);
        rosintanSitinjak.withdraw(10);
        System.out.println("Current balance is: " + rosintanSitinjak.getBalance());
    }
}
