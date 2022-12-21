package QuanLiXe.object;

class XeOtO extends PhuongTien {
    int SoChoNgoi;
    kieuXe KieuXe;

    public XeOtO(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
    }

    public XeOtO(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, int soChoNgoi, kieuXe kieuXe) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        SoChoNgoi = soChoNgoi;
        KieuXe = kieuXe;
    }


    public int getThuocTinhRieng() {
        return getSoChoNgoi();

    }

    public int getSoChoNgoi() {
        return SoChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        SoChoNgoi = soChoNgoi;
    }

    public kieuXe getKieuXe() {
        return KieuXe;
    }

    public void setKieuXe(kieuXe kieuXe) {
        KieuXe = kieuXe;
    }


    enum kieuXe {
        DuLich,
        XeKhach
    }
}