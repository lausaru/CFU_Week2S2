import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaymentList implements TransactionList {
    ArrayList<Transaction> transactions = new ArrayList<Transaction>();

    public Transaction getLastTransaction() {
        return transactions.get((transactions.size()-1));
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public Transaction getTransactionByDate(Date date) {
        Transaction transactionOut = null;
        for (int i = 0; i < transactions.size(); i++) {
            if (transactions.get(i).getDate() == date) {
                transactionOut = transactions.get(i);
            }
        }
        return transactionOut;
    }

    public ArrayList<Transaction> getAllTransactions() {
        return transactions;
    }
}
