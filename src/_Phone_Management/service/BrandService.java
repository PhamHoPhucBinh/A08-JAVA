package _Phone_Management.service;
import _Phone_Management.model.Brand;

import java.util.ArrayList;
import java.util.List;
public class BrandService {
    private ArrayList<Brand> brandArrayList = new ArrayList<>();
    public BrandService(){
        brandArrayList.add(new Brand("iPhone","USA",2001));
        brandArrayList.add(new Brand("SamSung","Korea",1899));
        brandArrayList.add(new Brand("Bphone","Vietnam",2010));
    }
    public List<Brand> findAll(){
        return brandArrayList;
    }
    public Brand findByName(String brandName){
        for (int i = 0; i < brandArrayList.size(); i++) {
            if(brandArrayList.get(i).getBrandName().equals(brandName)) {
                return brandArrayList.get(i);
            }else {
                System.out.println("this brand doesn't exist,pls input again");
            }
        }

        return null;
    }
}
