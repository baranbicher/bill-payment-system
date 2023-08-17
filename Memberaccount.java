class MemberAccount {
    private String id;
    private String firstName;
    private String lastName;
    private String code;
    private double balance;

    public MemberAccount(String id, String firstName, String lastName, double balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.code = id + firstName.substring(0, 2);
        this.balance = balance;
    }

    public int getBalance() {
        return 1;
    }

    // Getter ve setter metotları
}
