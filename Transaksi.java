package AplikasiLaundry;
import java.util.ArrayList;
import java.util.Scanner;

public class Transaksi {
    private ArrayList<Integer> kodeClient = new ArrayList<Integer>();
    private ArrayList<Integer> idLaundry = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    
    public Transaksi(){
        this.kodeClient.add(0);
        this.idLaundry.add(0);
        this.banyak.add(2);
        
        this.kodeClient.add(0);
        this.idLaundry.add(1);
        this.banyak.add(3);
        
        this.kodeClient.add(1);
        this.idLaundry.add(0);
        this.banyak.add(1);
    }
    
    public void prosesTransaksi(Client client, Laundry laundry, Transaksi transaksi){
        Scanner input = new Scanner(System.in);
        
        System.out.println("+==================================+");
        System.out.println("| Selamat Datang Di Laundry Berkah |");
        System.out.println("+==================================+");
        
        System.out.print("Silahkan Input ID Member :");
        int kode = input.nextInt();
        
        System.out.println("Selamat Datang Member " + client.getNama(kode));
        System.out.println("+==================================+");
        
        System.out.println("Silahkan Memilih Jenis Laundry!");
        int kodeLaundry = input.nextInt();
    }
    
    public int getKode(int kodeClient){
        return this.kodeClient.get(kodeClient);
    }
}
