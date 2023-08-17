import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MemberAccountService accountService = new MemberAccountService();
        Client billingClient = new Client();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hesap ID'si: ");
        String id = scanner.nextLine();
        System.out.print("Ad: ");
        String firstName = scanner.nextLine();
        System.out.print("Soyad: ");
        String lastName = scanner.nextLine();
        System.out.print("Bakiye: ");
        double balance = scanner.nextDouble();
        scanner.nextLine(); // Boş satırı oku

        MemberAccount account = accountService.createAccount(id, firstName, lastName, balance);

        System.out.print("Fatura tutarı: ");
        double billAmount = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("İşlem tarihi: ");
        String processDate = scanner.nextLine();
        System.out.print("Fatura tipi (1-Telefon, 2-Internet, 3-Su): ");
        int billType = scanner.nextInt();

        Bill bill = new Bill(billAmount, processDate, billType);

        try {
            billingClient.payBill(account, bill);
            System.out.println("Fatura ödendi.");
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
