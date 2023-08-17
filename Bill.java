class Bill {
    private double amount;
    private String processDate;
    private int billType;

    public Bill(double amount, String processDate, int billType) {
        this.amount = amount;
        this.processDate = processDate;
        this.billType = billType;
    }

    public double getAmount() {
        return amount;
    }

    // Getter ve setter metotları
}
