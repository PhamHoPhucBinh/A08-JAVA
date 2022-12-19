package QuanLiXe.object;

public class XeMay extends PhuongTien{
    float CongSuat;
    public XeMay(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
    }

    public float getCongSuat() {
        return CongSuat;
    }

    public void setCongSuat(float congSuat) {
        CongSuat = congSuat;
    }

    @Override
    public String getBienKiemSoat() {
        return BienKiemSoat;
    }

    @Override
    public String getTenHangSanXuat() {
        return TenHangSanXuat;
    }

    @Override
    public int getNamSanXuat() {
        return NamSanXuat;
    }

    @Override
    public String getChuSoHuu() {
        return ChuSoHuu;
    }
}
