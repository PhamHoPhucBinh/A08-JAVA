package QuanLiXe.object;

public class XeTai extends PhuongTien{
    int TrongTai;

    public XeTai(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, int trongTai) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        TrongTai = trongTai;
    }

    public int getTrongTai() {
        return TrongTai;
    }

    public void setTrongTai(int trongTai) {
        TrongTai = trongTai;
    }

    @Override
    public int getThuocTinhRieng(){
        return getTrongTai();
    }





}
