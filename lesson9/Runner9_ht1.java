import by.itClass.Client9;

public class Runner9_ht1 {
    public static void main(String[] args) {
        Client9 client1 = new Client9();
        Client9 client2 = new Client9("Alex", "91010000000", "11.10.20", "q1234567");

        client1.setName("Max");
        client1.setAccount(client1.new BankAccount("3002000000", "10.10.20", "w1234567"));

        System.out.println("Client1.");
        client1.show();
        System.out.println("\nClient2.");
        client2.show();

        System.out.println("\nBankAccount1");
        client1.getAccount().displayAccount();
        System.out.println("\nBankAccount2");
        client2.getAccount().displayAccount();
    }
}
