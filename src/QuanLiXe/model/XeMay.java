package QuanLiXe.model;

public class XeMay extends PhuongTien {
    int congSuat;

    public XeMay(String bienKiemSoat, int namSanXuat, String chuSoHuu, HangSanXuat hangSanXuat, int inputCongSuat) {
        super(bienKiemSoat, namSanXuat, chuSoHuu, hangSanXuat);
        congSuat = inputCongSuat;
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
