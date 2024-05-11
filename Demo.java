package AplikasiLaundry;

public class Demo {
    public static void main(String[] args) {
        Transaksi transaksi = new Transaksi();
        Client client = new Client();
        Laundry laundry = new Laundry();
        
        
        transaksi.prosesTransaksi(client, laundry, transaksi);
    }
}
