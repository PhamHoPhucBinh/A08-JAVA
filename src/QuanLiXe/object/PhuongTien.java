package QuanLiXe.object;


public abstract class PhuongTien {
    String BienKiemSoat;
    String TenHangSanXuat;
    int NamSanXuat;
    String ChuSoHuu;

    public PhuongTien(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu) {
        BienKiemSoat = bienKiemSoat;
        TenHangSanXuat = tenHangSanXuat;
        NamSanXuat = namSanXuat;
        ChuSoHuu = chuSoHuu;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        BienKiemSoat = bienKiemSoat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        TenHangSanXuat = tenHangSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        NamSanXuat = namSanXuat;
    }

    public void setChuSoHuu(String chuSoHuu) {
        ChuSoHuu = chuSoHuu;
    }

    public abstract String getBienKiemSoat();

    public abstract String getTenHangSanXuat();

    public abstract int getNamSanXuat();

    public abstract String getChuSoHuu();
}

