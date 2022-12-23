package QuanLiXe.model;

public class XeTai extends PhuongTien{
    int TrongTai;

    public XeTai(String bienKiemSoat, int namSanXuat, String chuSoHuu, HangSanXuat hangSanXuat) {
        super(bienKiemSoat, namSanXuat, chuSoHuu, hangSanXuat);
    }


    public int getTrongTai() {
        return TrongTai;
    }

    public void setTrongTai(int trongTai) {
        TrongTai = trongTai;
    }

    @Override
    public void showThongTin() {

    }


}
