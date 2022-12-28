package QuanLiXe.service;

import QuanLiXe.model.XeMay;
import QuanLiXe.model.XeTai;

public interface XeTaiService extends PhuongTienService<XeTai>{
    void hienThiXeTai();
    XeTai timXeTai(String bienKiemSoat);

    void themXeTai();

    void updateXeTai();
}
