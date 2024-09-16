import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat objek mesin tiket
        TicketMachine ticketMachine = new TicketMachine();
        Scanner scanner = new Scanner(System.in);

        // Menampilkan tujuan tiket yang tersedia
        System.out.println("Selamat datang di mesin tiket!");
        ticketMachine.displayDestination();

        // Memilih tiket tujuan (dalam hal ini hanya Bandung, tapi bisa dikembangkan untuk lebih banyak tiket)
        System.out.println("Apakah Anda ingin membeli tiket Bandung? (y/n)");
        String response = scanner.nextLine();
        
        if(response.equalsIgnoreCase("y")) {
            ticketMachine.selectBandungTicket();

            // Memasukkan uang secara interaktif
            while (ticketMachine.getBalance() < ticketMachine.getSelectedTicketPrice()) {
                System.out.println("Masukkan uang (hanya kelipatan 20000 Rupiah): ");
                int amount = scanner.nextInt();

                // Membuat objek koin dengan nilai yang diinput oleh pengguna
                Coin coin = new Coin(amount);
                ticketMachine.insertTwentyRupiah(coin);

                System.out.println("Saldo saat ini: " + ticketMachine.getBalance() + " Rupiah.");
            }

            // Mencetak tiket jika saldo mencukupi
            ticketMachine.printTicket();
        } else {
            System.out.println("Anda memilih untuk tidak membeli tiket. Terima kasih!");
        }
    }
}
