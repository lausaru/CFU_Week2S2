import java.util.Date;

public class Transaction {
    private int sellerAccountNumber;
    private int buyerAccountNumber;
    private int amount;
    private Date date;

    public Transaction(int sellerAccountNumber, int buyerAccountNumber, int amount, Date date) {
        setSellerAccountNumber(sellerAccountNumber);
        setBuyerAccountNumber(buyerAccountNumber);
        setAmount(amount);
        setDate(date);
    }

    private void setSellerAccountNumber(int sellerAccountNumber) {
        this.sellerAccountNumber = sellerAccountNumber;
    }

    private void setBuyerAccountNumber(int buyerAccountNumber) {
        this.buyerAccountNumber = buyerAccountNumber;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getSellerAccountNumber() {
        return this.sellerAccountNumber;
    }

    public int getBuyerAccountNumber() {
        return buyerAccountNumber;
    }

    public int getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }
}
