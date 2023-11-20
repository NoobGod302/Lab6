package ro.uoradea;

class ContDeEconomii extends ContBancar{
    private double limitaRetragere;

    public ContDeEconomii(double initialBalance, double limitaRetragere){
        super(initialBalance);
        this.limitaRetragere = limitaRetragere;
    }

    @Override
    public void withdraw(double amount){
        if(amount < balance && amount < limitaRetragere){
            balance = balance - amount;
        } else {
            System.out.println("Error");
        }


    }
}
