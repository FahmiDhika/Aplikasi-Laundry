package AplikasiLaundry;

public class Demo {
    public static void main(String[] args) {
        Client client = new Client();
        Laundry jenis = new Laundry();
        Transaksi transaksi = new Transaksi();
        Laporan lapor= new Laporan();
        
        lapor.NamaLaundry();
        lapor.laporan(jenis);
        lapor.laporan(client);
        transaksi.prosesTransaksi(client, jenis, transaksi);
        lapor.laporan(jenis);
        lapor.laporan(client);
    }
}
