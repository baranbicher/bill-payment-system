class BillingService {
    public void payBill(MemberAccount account, Bill bill) throws InsufficientBalanceException {
        if (account.getBalance() < bill.getAmount()) {
            throw new InsufficientBalanceException("Yetersiz bakiye.");
        }
        // Fatura ödeme işlemleri burada yapılır.
    }

    // Diğer fatura işlemleri burada tanımlanabilir.
}
