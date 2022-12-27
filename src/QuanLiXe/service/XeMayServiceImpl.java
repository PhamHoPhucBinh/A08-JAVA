package QuanLiXe.service;

import QuanLiXe.model.XeMay;

import java.util.ArrayList;
import java.util.List;

public class XeMayServiceImpl implements XeMayService{
    private List<XeMay> xeMays = new ArrayList<>();

    @Override
    public List<XeMay> findAll() {
        return xeMays;
    }

    @Override
    public void create(XeMay xeMay) {
        xeMays.add(xeMay);
    }

    @Override
    public void edit(XeMay xeMay) {

    }

    @Override
    public void delete(XeMay xeMay) {

    }

    @Override
    public List<XeMay> search(String bienSoXe) {
        return null;
    }

}
