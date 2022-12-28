package QuanLiXe.model;


public abstract class PhuongTien {
    private String BienKiemSoat;
    private int NamSanXuat;
    private String ChuSoHuu;
    HangSanXuat hangSanXuat;

    public PhuongTien(String bienKiemSoat, int namSanXuat, String chuSoHuu, HangSanXuat hangSanXuat) {
        BienKiemSoat = bienKiemSoat;
        NamSanXuat = namSanXuat;
        ChuSoHuu = chuSoHuu;
        this.hangSanXuat = hangSanXuat;
    }

    public String getBienKiemSoat() {
        return BienKiemSoat;
    }

    public int getNamSanXuat() {
        return NamSanXuat;
    }

    public String getChuSoHuu() {
        return ChuSoHuu;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        BienKiemSoat = bienKiemSoat;
    }

    public void setcodeHSX(String codeHSX) {
        codeHSX = codeHSX;
    }

    public void setNamSanXuat(int namSanXuat) {
        NamSanXuat = namSanXuat;
    }

    public void setChuSoHuu(String chuSoHuu) {
        ChuSoHuu = chuSoHuu;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public abstract void showThongTin();

    public String toString() {
        return "\nThông Tin Phương Tiện :" + "\nBiển Kiểm Soát: " + this.BienKiemSoat
                + "\nTên Hãng SX: " + this.hangSanXuat.getTenHSX() + "\nNăm SX: " +
                this.NamSanXuat + "\nChủ Sở Hữu: " + this.ChuSoHuu;
    }

}

