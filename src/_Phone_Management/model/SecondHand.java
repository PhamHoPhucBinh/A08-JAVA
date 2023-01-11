package _Phone_Management.model;
import _Phone_Management.util.ConstantUtil;

public class SecondHand extends Phone {
    private String warrantyRemain ;
    private ConstantUtil.TypeOfPhone typeOfPhone;

    public SecondHand(String warrantyRemain, ConstantUtil.TypeOfPhone typeOfPhone) {
        this.warrantyRemain = warrantyRemain;
        this.typeOfPhone = typeOfPhone;
    }

    public SecondHand(String id, String phoneName, Brand brand, int price, int amount, String warrantyRemain, ConstantUtil.TypeOfPhone typeOfPhone) {
        super(id, phoneName, brand, price, amount);
        this.warrantyRemain = warrantyRemain;
        this.typeOfPhone = typeOfPhone;
    }

    public String getWarrantyRemain() {
        return warrantyRemain;
    }

    public void setWarrantyRemain(String warrantyRemain) {
        this.warrantyRemain = warrantyRemain;
    }

    public ConstantUtil.TypeOfPhone getTypeOfPhone() {
        return typeOfPhone;
    }

    public void setTypeOfPhone(ConstantUtil.TypeOfPhone typeOfPhone) {
        this.typeOfPhone = typeOfPhone;
    }

    @Override
    public String toString() {
        return super.toString() + "SecondHand{" +
                "warrantyRemain='" + warrantyRemain + '\'' +
                ", typeOfPhone=" + typeOfPhone +
                '}';
    }
}
