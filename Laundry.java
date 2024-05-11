package AplikasiLaundry;
import java.util.ArrayList;

public class Laundry {
    private ArrayList<String> jenisLaundry = new ArrayList<>();
    private ArrayList<Integer> harga = new ArrayList<>();
    private ArrayList<Integer> durasi = new ArrayList<>();
    
    public Laundry(){
        this.jenisLaundry.add("Baju");
        this.harga.add(10000);
        this.durasi.add(3600);
        
        this.jenisLaundry.add("Celana");
        this.harga.add(20000);
        this.durasi.add(1800);
        
        this.jenisLaundry.add("Jaket");
        this.harga.add(50000);
        this.durasi.add(7200);
    }
    
    public void setNamaLaundry(String jenisLaundry){
        this.jenisLaundry.add(jenisLaundry);;
    }
    
    public String getNamaLaundry(int idLaundry){
        return this.getNamaLaundry(idLaundry);
    }
    
    public String getJenisLaundry(String jenisLaundry){
        return this.getJenisLaundry(jenisLaundry);
    }
    
    public void setHarga(int harga){
        this.harga.add(harga);
    }
    
    public int getHarga(int idLaundry){
        return this.getHarga(idLaundry);
    }
    
    public void setDurasi(int durasi){
        this.durasi.add(durasi);
    }
    
    public int getDurasi(){
        return this.getDurasi();
    }
}
