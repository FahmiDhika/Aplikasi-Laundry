package AplikasiLaundry;
import java.util.ArrayList;

public class Petugas implements User{
    
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();

    public Petugas() {
        this.namaPetugas.add("Admin Haha");
        this.alamat.add("kedung kandang");
        this.telepon.add("086374638282");
        this.jabatan.add(0);
        
        this.namaPetugas.add("Admin Hihi");
        this.alamat.add("kedung kandang");
        this.telepon.add("081237283647");
        this.jabatan.add(0);
        
        this.namaPetugas.add("Admin Hehe");
        this.alamat.add("kedung kandang");
        this.telepon.add("081236472893");
        this.jabatan.add(0);
    }
    public void setJabatan(int jabatan){
        this.jabatan.add(jabatan);
    }
    
    public int getJabatan(int id){
        return this.jabatan.get(id);
    }
    
    public int getJmlPetugas(){
        return this.namaPetugas.size();
    }

    public void setNama(String namaPetugas ){
        this.namaPetugas.add(namaPetugas);
    }
    
    public void setAlamat(String alamat ){
        this.namaPetugas.add(alamat);
    }
    
    public void setTelepon(String telepon ){
        this.namaPetugas.add(telepon);
    }

    public String getNama(int idPetugas){
        return this.namaPetugas.get(idPetugas);
    }

    public String getAlamat(int idPetugas){
        return this.alamat.get(idPetugas);
    }

    public String getTelepon(int idPetugas){
        return this.telepon.get(idPetugas);
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