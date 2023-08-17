class MemberAccountService {
    public MemberAccount createAccount(String id, String firstName, String lastName, double balance) {
        return new MemberAccount(id, firstName, lastName, balance);
    }

    // Diğer CRUD işlemleri burada tanımlanabilir.
}
