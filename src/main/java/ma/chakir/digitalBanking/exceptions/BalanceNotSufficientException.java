package ma.chakir.digitalBanking.exceptions;


public class BalanceNotSufficientException extends Exception {
    public BalanceNotSufficientException(String message) {
        super(message);
    }
}