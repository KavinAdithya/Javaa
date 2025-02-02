
import java.util.ArrayList;
import java.util.List;


@FunctionalInterface
interface Transaction {
    double operation(double amount, double balance);
}

class TransactionException extends RuntimeException {

    public TransactionException(String message) {
        super(message);
    }
    
}

class PerformOperation {
    
    public static double performOperation(Transaction transaction, double amount, double balance) {
        return transaction.operation(amount, balance);
    }


    public static Transaction composeTransaction(List<Transaction> transactions, int x) {
        return (amount, balance) -> {
            System.out.println(x);
            for (Transaction transaction : transactions) {
                balance = transaction.operation(amount, balance);
            }
            return balance;
        };
    }

}

public class Balance {
    
    public static void main(String[] args) {
        Transaction deposit = (amount, balance) -> balance + amount;

        Transaction withdrawal = (amount, balance) -> {
        
            if (amount > balance)
                throw new TransactionException("Withdrawal amount is Higher than the current balance.");
            return balance - amount;
        
        };

        Transaction transfer = (amount, balance) -> {
        
            if (amount > balance)
                throw new TransactionException("Transfer Failed due to insufficient Balance");
            return balance - amount;
        
        };

        Transaction refund = (amount, balance) -> {

            if (amount > balance)
                throw new TransactionException("Amount Not Possible For Refund");
            return balance - amount;
        
        };

        double balance = 2000.00;

        balance = PerformOperation.performOperation(deposit, 200, balance);

        System.out.println(balance);
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(refund);
        transactions.add(withdrawal);
        Transaction compositeTransaction = PerformOperation.composeTransaction(transactions, 3_0_0);
        
        transactions.add(deposit);
        balance = compositeTransaction.operation(100, balance);

        Transaction compositeTransaction1 = PerformOperation.composeTransaction(transactions, 2_0_0);
        
        transactions.add(deposit);
        balance = compositeTransaction1.operation(100, balance);


        System.out.println(balance);

        System.out.println();
    }
}