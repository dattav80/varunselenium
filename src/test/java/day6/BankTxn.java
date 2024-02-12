package day6;

public class BankTxn {

    private String name;
    private long cardNumber;
    private int cvv;
    private int exp;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }


}
