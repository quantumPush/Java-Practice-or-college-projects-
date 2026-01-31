class Account {
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int b) {
        balance = b;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Account a = new Account();
        a.setBalance(2000);
        System.out.println(a.getBalance());
    }
}
