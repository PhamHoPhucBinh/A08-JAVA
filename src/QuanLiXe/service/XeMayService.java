package QuanLiXe.service;

import QuanLiXe.model.XeMay;

import java.util.ArrayList;

public interface XeMayService extends PhuongTienService<XeMay>{

    void hienThiXeMay();

    XeMay timXeMay(String bienKiemSoat);

    void themXeMay();

    void updateXeMay();

    void xoaXeMay();

}
