package QuanLiXe.model;

import QuanLiXe.util.ConstantUtil;

public class XeOTo extends PhuongTien{
    int SoChoNgoi;
    ConstantUtil.kieuXe KieuXe;

    public XeOTo(String bienKiemSoat, int namSanXuat, String chuSoHuu, HangSanXuat hangSanXuat) {
        super(bienKiemSoat, namSanXuat, chuSoHuu, hangSanXuat);

    }

    public int getSoChoNgoi() {
        return SoChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        SoChoNgoi = soChoNgoi;
    }

    @Override
    public void showThongTin() {

    }

    public ConstantUtil.kieuXe getKieuXe() {
        return KieuXe;
    }

    public void setKieuXe(ConstantUtil.kieuXe kieuXe) {
        KieuXe = kieuXe;
    }
}
