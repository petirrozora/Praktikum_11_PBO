package Praktikum_11_PBO;

public class DataMahasiswa {
    private String NIM;
    private String nama;
    private String alamat;
    private String matkul;
    private double nilaiAkhir;
    
    public DataMahasiswa(String NIM, String nama, String alamat, String matkul, double nilaiAkhir){
        this.NIM = NIM;
        this.nama = nama;
        this.alamat = alamat;
        this.matkul = matkul;
        this.nilaiAkhir = nilaiAkhir;
    }
    
    public String getNIM(){
        return NIM;
    }
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public String getMatkul(){
        return matkul;
    }
    public double getNilaiAkhir(){
        return nilaiAkhir;
    }
}
