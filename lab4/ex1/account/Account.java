package lab4.ex1.account;

public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    public int credit(int amount) {
        balance = amount + balance;
        return balance;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
            return balance;
        }
        System.out.println("Amount exceeded balance");
        return balance;
    }

    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            another.credit(amount);
            balance = balance - amount;
            return balance;
        }
        System.out.println("Amount exceeded balance");
        return balance;
    }

    public String toString() {
        return "Account[id = " + id + ", name = " + name + ", balance = " + balance + "]";
    }
}
