package AplikasiLaundry;
import java.util.ArrayList;

public class Client implements User{
    private ArrayList<String> namaClient= new ArrayList<String>();
    private ArrayList<String> idClient= new ArrayList<String>();
    private ArrayList<String> alamat= new ArrayList<String>();
    private ArrayList<String> telepon= new ArrayList<String>();
    private ArrayList<Integer> saldo= new ArrayList<Integer>();
    
    public void client (){
        this.idClient.add("1");
        this.namaClient.add("\tAhmad");
        this.alamat.add("\tSawojajar 1");
        this.telepon.add("\t081234567891");
        this.saldo.add(100000);
        
        this.idClient.add("2");
        this.namaClient.add("\tZulqar");
        this.alamat.add("\tSawojajar 2");
        this.telepon.add("\t081239284628");
        this.saldo.add(100000);
        
        this.idClient.add("3");
        this.namaClient.add("\tAbu Bakar");
        this.alamat.add("\tSawojajar 3");
        this.telepon.add("\t081264738292");
        this.saldo.add(100000);
    }
    
    public void setNama(String namaClient){
        this.namaClient.add(namaClient);
    }
    
    public String getNama(int idClient){
        return this.namaClient.get(idClient);
    }
    
    public void setId(String idClient){
        this.idClient.add(idClient);
    }
    
    public String getId(int idClient){
        return this.idClient.get(idClient);
    }
    
    public void setAlamat(String alamat){
        this.alamat.add(alamat);
    }
    
    public String getAlamat(int idClient){
        return this.alamat.get(idClient);
    }
    
    public void setTelepon(String telepon){
        this.telepon.add(telepon);
    }
    
    public String getTelepon(int idClient){
        return this.telepon.get(idClient);
    }
    
    public void setSaldo(int saldo){
        this.saldo.add(saldo);
    }
    
    public int getSaldo(int idClient){
        return this.saldo.get(idClient);
    }
    
    public void editSaldo(int idClient, int saldo){
        this.saldo.set(idClient, saldo);
    }

    public int getJumlahClient(){
        return this.saldo.size();
    }

    @Override
    public void setNama() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setAlamat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setTelepon() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getNama() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getAlamat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getTelepon() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}