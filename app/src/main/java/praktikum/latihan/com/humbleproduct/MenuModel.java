package praktikum.latihan.com.humbleproduct;

public class MenuModel {
    private String namaBarang, hargaBarang, deskripsiMenu;
    private int fotoBarang;

    public MenuModel(String namaBarang, String hargaBarang, String deskripsiMenu, int fotoBarang) {
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.deskripsiMenu = deskripsiMenu;
        this.fotoBarang = fotoBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(String hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public String getDeskripsiMenu() {
        return deskripsiMenu;
    }

    public void setDeskripsiMenu(String deskripsiMenu) {
        this.deskripsiMenu = deskripsiMenu;
    }

    public int getFotoBarang() {
        return fotoBarang;
    }

    public void setFotoBarang(int fotoBarang) {
        this.fotoBarang = fotoBarang;
    }
}



