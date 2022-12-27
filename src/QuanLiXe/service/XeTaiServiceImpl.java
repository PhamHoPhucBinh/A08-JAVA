package QuanLiXe.service;

import QuanLiXe.model.XeMay;
import QuanLiXe.model.XeTai;

import java.util.ArrayList;
import java.util.List;

public class XeTaiServiceImpl implements XeTaiService {
    private List<XeTai> xeTais = new ArrayList<>();

    @Override
    private List<XeTai> xeTaiss = new ArrayList<>();

    @Override
    public List<XeTai> findAll() {
        return xeTais;
    }

    @Override
    public void create(XeTai xeTai) {
        xeTais.add(xeTai);
    }

    @Override
    public void edit(XeTai xeTai) {

    }

    @Override
    public void delete(XeTai xeTai) {

    }

    @Override
    public List<XeTai> search(String bienSoXe) {
        return null;
    }

}

