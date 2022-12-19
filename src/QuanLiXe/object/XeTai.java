package QuanLiXe.object;

public class XeTai extends PhuongTien{
    float TrongTai;

    public XeTai(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, float trongTai) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        TrongTai = trongTai;
    }

    public float getTrongTai() {
        return TrongTai;
    }

    public void setTrongTai(float trongTai) {
        TrongTai = trongTai;
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
