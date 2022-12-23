package QuanLiXe.service;

import QuanLiXe.model.HangSanXuat;

import java.util.ArrayList;
import java.util.List;

public class HangSanXuatService {
    private ArrayList<HangSanXuat> hangSanXuats = new ArrayList<>();

    public HangSanXuatService(){
        hangSanXuats.add(new HangSanXuat("HD","Honda", "Japan"));
        hangSanXuats.add(new HangSanXuat("YM", "Yamaha", "Korea"));
    }

    public List<HangSanXuat> findAll(){
        return hangSanXuats;
    }
}
