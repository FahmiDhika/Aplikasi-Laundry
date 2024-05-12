package AplikasiLaundry;

public class Laporan extends Laundry{
    
    public void NamaLaundry(){
        System.out.println("\t"+super.namaLaundry);
    }
    public void laporan(Laundry jenisLaundry) {
        int x = jenisLaundry.getJumlahLaundry();
        System.out.println();
        System.out.println("Tabel Laundry");
        System.out.println();
        System.out.println("Jenis Laundry \tHarga \tDurasi Laundry");
        for (int i = 0; i < x; i++) {
            System.out.println(jenisLaundry.getNamaLaundry(i) + "\t"
                    + jenisLaundry.getHarga(i) + "\t" 
                    + jenisLaundry.getDurasi(i));
        }
    }
    public void laporan(Client client) {
        int x = client.getJumlahClient();

        System.out.println();
        System.out.println("Tabel Member");
        System.out.println();
        System.out.println("Nama \t\tAlamat \t\tTelepon \tSaldo");
        for (int i = 0; i < x; i++) {
            System.out.println(client.getNama(i) + "\t"
                    + client.getAlamat(i) + "\t" 
                    + client.getTelepon(i) + "\t"
                    + client.getSaldo(i));
        }
         }
    
    public void laporan(Transaksi transaksi, Laundry jenisLaundry) {
        int x = transaksi.getJmlTransaksi();
        System.out.println();
        System.out.println("Laporan Transaksi");
        System.out.println();
        System.out.println("Nama Barang Qty Harga Jumlah");
        int total = 0;
        for (int i = 0; i < x; i++) {
            int jumlah = transaksi.getBanyaknya(i) * jenisLaundry.getHarga(transaksi.getIdJenisLaundry(i));
            total += jumlah;
            System.out.println(jenisLaundry.getNamaLaundry(transaksi.getIdJenisLaundry(i)) + "\t"
                    + transaksi.getBanyaknya(i) + "\t" 
                    + jenisLaundry.getJenisLaundry(namaLaundry)
                    + jumlah);
        }
        System.out.println("Total Omset = " + total);
    }
    
}
