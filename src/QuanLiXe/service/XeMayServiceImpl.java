package QuanLiXe.service;

import QuanLiXe.model.HangSanXuat;
import QuanLiXe.model.XeMay;

import java.util.ArrayList;
import java.util.List;

public class XeMayServiceImpl implements XeMayService{
    private ArrayList<XeMay> xeMays = new ArrayList<>();
    private HangSanXuatService hangSanXuatServices = new HangSanXuatService();

    public XeMayServiceImpl(){
        XeMay xeBinh = new XeMay("43A12345",2015,"Phúc Bình",hangSanXuatServices.getHangSanXuatMau(),150);
        xeMays.add(xeBinh);

    }
    @Override
    public void create(XeMay xeMay) {
    }
    @Override
     public void hienThiXeMay() {
        System.out.println("\n--------------Danh sách xe Máy---------------\n");
        System.out.println(String.format("%-15s%-20s%-10s%-15s%-10s", "BKS","Chủ Xe","NSX","HSX","CS"));
        for(XeMay e : xeMays) {
            System.out.println(String.format("%-15s%-20s%-10s%-15s%-10s",e.getBienKiemSoat(),e.getChuSoHuu(),e.getNamSanXuat(),e.getHangSanXuat().getTenHSX(),e.getCongSuat()));
        }
    }
    @Override
    public XeMay timXeMay(String bienKiemSoat) {
        return null;
    }
    @Override
    public void themXeMay() {
    }
    @Override
    public void updateXeMay() {
    }
}
