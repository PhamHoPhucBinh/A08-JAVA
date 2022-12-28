package QuanLiXe.service;

import QuanLiXe.model.XeMay;

import java.util.ArrayList;

public interface XeMayService extends PhuongTienService<XeMay>{

    void hienThiXeMay(ArrayList<XeMay> xeMays);

    XeMay timXeMay(String bienKiemSoat);

    void themXeMay();

    void updateXeMay();

}
