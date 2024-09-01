package oops.solids.dependency.inversion;

interface BankCard {

    void doTransaction(int amount);
}

class DebitCard implements BankCard {

    @Override
    public void doTransaction(int amount) {
        System.out.println("Debit Card Payment" + amount);
    }
}

class CreditCard implements BankCard {

    @Override
    public void doTransaction(int amount) {
        System.out.println("Credit Card Payment of " + amount);

    }
}

class ShoppingMall {

    private BankCard bankCard;

    ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    void doPayment(int amount) {
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {

        BankCard bankCard = new CreditCard();
        ShoppingMall shoppingMall = new ShoppingMall(bankCard);
        shoppingMall.doPayment(5000);
    }
}