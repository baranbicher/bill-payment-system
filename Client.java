class Client extends BillingService {
    public void payBill(MemberAccount account, Bill bill, String paymentDate) throws InsufficientBalanceException {
        if (account.getBalance() < bill.getAmount()) {
            throw new InsufficientBalanceException("Yetersiz bakiye.");
        }
        // Özel ödeme implementasyonu burada yapılır.
    }

    // Diğer ödeme implementasyonları burada tanımlanabilir.
}
