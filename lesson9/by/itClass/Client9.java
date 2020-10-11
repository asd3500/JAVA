package by.itClass;

public class Client9 {
    private String name;
    private BankAccount account;

    public Client9() {
        account = new BankAccount();
    }

    public Client9(String name, String number, String date, String password) {
        this.name = name;
        account = new BankAccount(number, date, password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    public void show() {
        System.out.printf("Person" +
                "\nName: %s" +
                "\nAccount number: %s" +
                "\nOpening date: %s\n",
                name, account.number, account.date);
    }

    public class BankAccount {
        private String number;
        private String date;
        private String password;

        public BankAccount() {
        }

        public BankAccount(String number, String date, String password) {
            this.number = number;
            this.date = date;
            this.password = password;
        }

        public void displayAccount() {
            System.out.printf("Account login: %s" +
                    "\nAccount number: %s" +
                    "\nOpening date: %s" +
                    "\nAccount password: %s\n",
                    name, number, date, password);
        }
    }
}
