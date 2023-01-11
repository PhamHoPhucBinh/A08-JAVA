package _Phone_Management.service;

import _Phone_Management.model.Brand;
import _Phone_Management.model.BrandNew;
import _Phone_Management.util.ConstantUtil;
import _Phone_Management.util.ReadAndWrite;
import _Shop_Management.service.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BrandNewService implements PhoneService<BrandNew> {
    private ArrayList<BrandNew> brandNewArrayList = new ArrayList<>();
    private ReadAndWrite readAndWrite = new ReadAndWrite();

    private BrandService brandService = new BrandService();

    public BrandNewService() {
        brandNewArrayList = mapToObject();
    }


    public List findAll() {
        return brandNewArrayList;
    }

    public void create(BrandNew brandNew) {
        brandNewArrayList.add(brandNew);
        readAndWrite.write("src/_Phone_Management/data/BrandNew.csv",brandNewArrayList,false);
    }


    public boolean findByID(String id) {
        for (int i = 0; i < brandNewArrayList.size(); i++) {

            return brandNewArrayList.get(i).getId().equals(id);
        }
        return false;
    }


    public void delete(String id) {
        for (int i = 0; i < brandNewArrayList.size(); i++) {
            if(brandNewArrayList.get(i).getId().equals(id)){
                brandNewArrayList.remove(i);
                break;
            }
        }
        readAndWrite.write("src/_Phone_Management/data/BrandNew.csv",brandNewArrayList,true);
    }


    public List<BrandNew> search(String id) {
        return brandNewArrayList.stream().filter(e -> e.getId().contains(id)).collect(Collectors.toList());
    }

    private ArrayList<BrandNew> mapToObject() {
        ArrayList<BrandNew> result = new ArrayList<>();

        List<String> lines = readAndWrite.read("src/_Phone_Management/data/SecondHand.csv");
        for (String line : lines){
            if(!line.isEmpty()){
                String[] tmp = line.split(",");
                String id = tmp[0];
                String phoneName = tmp[1];
                Brand brand = brandService.findByName(tmp[2]);
                int price = Integer.parseInt(tmp[3]);
                int amount = Integer.parseInt(tmp[4]);
                _Phone_Management.util.ConstantUtil.Store store = _Phone_Management.util.ConstantUtil.Store.valueOf(tmp[5]);
                BrandNew brandNew = new BrandNew(id, phoneName, brand, price, amount, ConstantUtil.Store.valueOf(String.valueOf(store)));
                result.add(brandNew);
            }
        }

        return result;
    }
}
