package QuanLiXe.object;

import java.util.ArrayList;
import java.util.List;

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

//    @Override
//    public String getHangSanXuat() {
//        return HangSanXuat;
//    }

    @Override
    public int getNamSanXuat() {
        return NamSanXuat;
    }

    @Override
    public String getChuSoHuu() {
        return ChuSoHuu;
    }

    List<XeMay> XeMayList = new ArrayList<>();
}

