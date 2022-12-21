package QuanLiXe.object;


import com.sun.xml.internal.bind.v2.TODO;

public abstract class PhuongTien {
    String BienKiemSoat;
    HangSanXuat hangSanXuat;
    int NamSanXuat;
    String ChuSoHuu;

    public PhuongTien(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu) {
        BienKiemSoat = bienKiemSoat;
        HangSanXuat = hangSanXuat;
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

    public abstract void showThongTin();

    public String toString() {
        return "\nThông Tin Phương Tiện :" + "\nBiển Kiểm Soát: " + this.BienKiemSoat
                + "\nTên Hãng SX: " + this.HangSanXuat + "\nNăm SX: " +
                this.NamSanXuat + "\nChủ Sở Hữu: " + this.ChuSoHuu;
    }
}

