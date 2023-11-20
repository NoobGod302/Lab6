package ro.uoradea;

class ContBancar {
    protected double balance;

    public ContBancar(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        if(amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
    public double getBalance(){
        return balance;
    }


}
