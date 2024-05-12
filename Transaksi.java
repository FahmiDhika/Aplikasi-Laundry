package AplikasiLaundry;
import java.util.ArrayList;
import java.util.Scanner;

public class Transaksi {
    private ArrayList<Integer> idClient = new ArrayList<Integer>();
    private ArrayList<Integer> idLaundry = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    
    public Transaksi(){
        this.idClient.add(0);
        this.idLaundry.add(0);
        this.banyak.add(2);
        
        this.idClient.add(0);
        this.idLaundry.add(1);
        this.banyak.add(3);
        
        this.idClient.add(1);
        this.idLaundry.add(0);
        this.banyak.add(1);
    }
    
    public void prosesTransaksi(Client client, Laundry laundry, Transaksi transaksi){
        Scanner input = new Scanner(System.in);
        
        System.out.println("+==================================+");
        System.out.println("| Selamat Datang Di Laundry Berkah |");
        System.out.println("+==================================+");
        
        System.out.print("Silahkan Input ID Member :");
        int id = input.nextInt();
        
        System.out.println("Selamat datang " + client.getNama(id));
        System.out.println("+==================================+");
        
        System.out.println("Silahkan Memilih Jenis Laundry!");
        int kodeLaundry = input.nextInt();
        
        int i = 0;
        int temp = 0;
        do {
            System.out.print("Silahkan Memilih Jenis Laundry : ");
            temp = input.nextInt();
            if (temp != 99) {
                idLaundry.add(temp);
                System.out.print(laundry.getNamaLaundry(idLaundry.get(i)) + " sebanyak : ");
                banyak.add(input.nextInt());

                i++;
            }
        } while (temp != 99);
        
        System.out.println("\nTransaksi belanja " + client.getNama(id) + " sebagai berikut");
        System.out.println("Nama Barang \\Jumlah \\Harga \\Total Harga \\\"");

        int total = 0;
        int x = idLaundry.size();
        for (int j = 0; j < x; j++) {
            int jumlah = banyak.get(j) * laundry.getHarga(idLaundry.get(j));
            total += jumlah;
            System.out.println(laundry.getNamaLaundry(idLaundry.get(j))+ "\t" 
                    + banyak.get(j) + "\t"
                    + laundry.getHarga(idLaundry.get(j)) + "\t" 
                    + jumlah);
            transaksi.setTransaksi(laundry, kodeLaundry, id, jumlah);
        }
    }
    
    public void setTransaksi(Laundry jenislaundry, int idLaundry, int idClient, int banyaknya) {
        this.idClient.add(idClient);
        this.idClient.add(idClient);
        this.banyak.add(banyaknya);
        jenislaundry.editHarga(idLaundry, banyaknya);
    }
    
    public int getIdJenisLaundry(int id) {
        return this.idLaundry.get(id);
    }

    public int getBanyaknya(int id) {
        return this.banyak.get(id);
    }

    public int getIdClient(int id) {
        return this.idClient.get(id);
    }

    public int getJmlTransaksi() {
        return this.idClient.size();
    }

    
}
