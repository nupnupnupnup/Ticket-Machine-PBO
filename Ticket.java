public class Ticket
{
    private String destination;
    private int price;
    private String date;

    public Ticket(String destination, int price, String date)
    {
        this.destination = destination;
        this.price = price;
        this.date = date;
    }

    public int getPrice()
    {
        return price;
    }

    public void print()
    {
        System.out.println("Tujuan: " + destination);
        System.out.println("Harga: " + price + " Rupiah");
        System.out.println("Tanggal: " + date);
    }
}
