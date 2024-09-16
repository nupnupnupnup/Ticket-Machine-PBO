public class TicketMachine {
    private int balance;  // Saldo saat ini
    private int total;    // Total uang terkumpul
    private Ticket bandung;
    private Ticket selectedTicket;

    // Konstruktor untuk mesin tiket
    public TicketMachine() {
        balance = 0;
        total = 0;

        // Membuat tiket untuk tujuan Bandung
        bandung = new Ticket("Bandung", 40000, "16/09/2024");
    }

    // Menampilkan tujuan tiket
    public void displayDestination() {
        System.out.println("Tujuan tiket yang tersedia:");
        bandung.print();
    }

    // Memilih tiket Bandung
    public void selectBandungTicket() {
        selectedTicket = bandung;
        System.out.println("Tiket Bandung dipilih.");
    }

    // Mengambil harga tiket yang dipilih
    public int getSelectedTicketPrice() {
        return selectedTicket.getPrice();
    }

    // Memasukkan koin 20 Rupiah
    public void insertTwentyRupiah(Coin coin) {
        if (coin.getValue() == 20000) {
            balance += 20000;
            System.out.println("Uang 20000 Rupiah dimasukkan.");
        } else {
            System.out.println("Harap masukkan 20000 Rupiah.");
        }
    }

    // Mengambil saldo saat ini
    public int getBalance() {
        return balance;
    }

    // Mencetak tiket jika saldo cukup
    public void printTicket() {
        if (balance >= selectedTicket.getPrice()) {
            System.out.println("##################");
            selectedTicket.print();
            System.out.println("##################");
            total += selectedTicket.getPrice();
            balance -= selectedTicket.getPrice(); // Kurangi saldo dengan harga tiket
        } else {
            System.out.println("Saldo tidak cukup untuk mencetak tiket.");
        }
    }
}
