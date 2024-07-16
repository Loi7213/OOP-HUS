package lab4.ex2.account;

public class TestMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer(001, "Loi", 'm');
        System.out.println(customer1);
        System.out.println("id is: " + customer1.getId());
        System.out.println("name is: " + customer1.getName());
        System.out.println("gender is: " + customer1.getGender());

        Account account1 = new Account(26, customer1, 5600.850);
        System.out.println(account1);
        account1.setBalance(260.500);
        System.out.println("id is: " + account1.getId());
        System.out.println("customer is: " + account1.getCustomer());
        System.out.println("balance is " + account1.getBalance());
        System.out.println("customer's name is: " + account1.getCustomerName());
        account1.deposit(26);
        System.out.println(account1);
        account1.withdraw(100000.400);
        System.out.println(account1);
        account1.withdraw(200000.725);
        System.out.println(account1);
    }
}
