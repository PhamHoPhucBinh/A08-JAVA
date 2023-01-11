package _Phone_Management.service;

import _Phone_Management.model.Brand;
import _Phone_Management.model.BrandNew;
import _Phone_Management.model.SecondHand;
import _Phone_Management.util.ConstantUtil;
import _Phone_Management.util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHandService implements PhoneService<SecondHand> {

    private ReadAndWrite readAndWrite = new ReadAndWrite();
    private ArrayList<SecondHand> secondHandArrayList = new ArrayList<>();
    private BrandService brandService = new BrandService();

    @Override
    public List<SecondHand> findAll() {
        return secondHandArrayList;
    }

    @Override
    public void create(SecondHand secondHand) {
        secondHandArrayList.add(secondHand);
        readAndWrite.write("src/_Phone_Management/data/SecondHand.csv",secondHandArrayList,false);
    }

    @Override
    public boolean findByID(String id) {
        for (int i = 0; i < secondHandArrayList.size(); i++) {

            return secondHandArrayList.get(i).getId().equals(id);
        }
        return false;
    }

    @Override
    public void delete(String id) {
        for (int i = 0; i < secondHandArrayList.size(); i++) {
            if(secondHandArrayList.get(i).getId().equals(id)){
                secondHandArrayList.remove(i);
                break;
            }
        }
        readAndWrite.write("src/_Phone_Management/data/SecondHand.csv",secondHandArrayList,true);
    }

    @Override
    public List<SecondHand> search(String id) {
        return secondHandArrayList.stream().filter(e -> e.getId().contains(id)).collect(Collectors.toList());
    }

    private ArrayList<SecondHand> mapToObject() {
        ArrayList<SecondHand> result = new ArrayList<>();

        List<String> lines = readAndWrite.read("src/_Phone_Management/data/SecondHand.csv");
        for (String line : lines){
            if(!line.isEmpty()){
                String[] tmp = line.split(",");
                String id = tmp[0];
                String phoneName = tmp[1];
                Brand brand = brandService.findByName(tmp[2]);
                int price = Integer.parseInt(tmp[3]);
                int amount = Integer.parseInt(tmp[4]);
                String warranty = tmp[5];
                ConstantUtil.TypeOfPhone typeOfPhone = ConstantUtil.TypeOfPhone.valueOf(tmp[6]);
                SecondHand secondHand = new SecondHand(id,phoneName,brand,price,amount,warranty, ConstantUtil.TypeOfPhone.valueOf(String.valueOf(typeOfPhone)));
                result.add(secondHand);
            }
        }

        return result;
    }
}
