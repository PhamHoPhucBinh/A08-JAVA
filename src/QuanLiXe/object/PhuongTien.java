package QuanLiXe.object;


public abstract class PhuongTien {
    String BienKiemSoat;
    Object HangSanXuat;
    int NamSanXuat;
    String ChuSoHuu;

    public PhuongTien(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu) {
        BienKiemSoat = bienKiemSoat;
        HangSanXuat = tenHangSanXuat;
        NamSanXuat = namSanXuat;
        ChuSoHuu = chuSoHuu;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        BienKiemSoat = bienKiemSoat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        HangSanXuat = hangSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        NamSanXuat = namSanXuat;
    }

    public void setChuSoHuu(String chuSoHuu) {
        ChuSoHuu = chuSoHuu;
    }

    public abstract String getBienKiemSoat();

    public abstract String getHangSanXuat();

    public abstract int getNamSanXuat();

    public abstract String getChuSoHuu();

    public String toString() {
        return "\nThông Tin Phương Tiện :" + "\nBiển Kiểm Soát: " + this.BienKiemSoat
                + "\nTên Hãng SX: " + this.HangSanXuat + "\nNăm SX: " +
                this.NamSanXuat + "\nChủ Sở Hữu: " + this.ChuSoHuu;
    }

    public class HangSanXuat{
        String maHangSanXuat;
        String tenHangSanXuat;
        String quocGia;
    }
}

