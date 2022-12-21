package QuanLiXe.object;

import java.util.ArrayList;
import java.util.List;

public class XeMay extends PhuongTien {
    int congSuat;
    public XeMay(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public void showThongTin(){
        System.out.println("");
    }
}
