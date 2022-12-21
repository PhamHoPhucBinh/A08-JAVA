package QuanLiXe.BangDieuKhien;

import QuanLiXe.object.PhuongTien;

import java.util.ArrayList;
import java.util.List;

public class QuanLiXe {
    List<PhuongTien> phuongTienList = new ArrayList<>();




    //Add
    public void themPhuongTien(PhuongTien phuongTien) {
        phuongTienList.add(phuongTien);
    }

    //Edit
    public void suaPhuongTien(PhuongTien phuongTien) {
        for (int i = 0; i < phuongTienList.size(); i++) {
            if (phuongTienList.get(i).getBienKiemSoat() == phuongTien.getBienKiemSoat()) {
                phuongTienList.set(i, phuongTien);
                return;
            }
        }
    }

    //Delete
    public void xoaPhuongTien(PhuongTien phuongTien) {
        for (int i = 0; i < phuongTienList.size(); i++) {
            if (phuongTienList.get(i).getBienKiemSoat() == phuongTien.getBienKiemSoat()) {
                phuongTienList.remove(i);
                return;
            }
        }
    }

    //Search
    public List<PhuongTien> timPhuongTien(String bienKiemSoat) {
        List<PhuongTien> timkiem = new ArrayList<>();
        for (int i = 0; i < phuongTienList.size(); i++) {
            if (phuongTienList.get(i).getBienKiemSoat().equals(bienKiemSoat)) {
                timkiem.add(phuongTienList.get(i));
            }
        }
        return timkiem;
    //
    }
}
