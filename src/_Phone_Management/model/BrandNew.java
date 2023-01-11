package _Phone_Management.model;

import _Phone_Management.util.ConstantUtil;

public class BrandNew extends Phone{
    ConstantUtil.Store store;

    public BrandNew(ConstantUtil.Store store) {
        this.store = store;
    }

    public BrandNew(String id, String phoneName, Brand brand, int price, int amount, ConstantUtil.Store store) {
        super(id, phoneName, brand, price, amount);
        this.store = store;
    }

    public ConstantUtil.Store getStore() {
        return store;
    }

    public void setStore(ConstantUtil.Store store) {
        this.store = store;
    }

    @Override
    public String toString() {
        return super.toString() + "BrandNew{" +
                "store=" + store +
                '}';
    }
}
