package QuanLiXe.model;

public class HangSanXuat {
    private String codeHSX;
    private String tenHSX;
    private String quocGia;

    public HangSanXuat(String codeHSX, String tenHSX, String quocGia) {
        this.codeHSX = codeHSX;
        this.tenHSX = tenHSX;
        this.quocGia = quocGia;
    }

    public String getCodeHSX() {
        return codeHSX;
    }

    public void setCodeHSX(String codeHSX) {
        this.codeHSX = codeHSX;
    }

    public String getTenHSX() {
        return this.tenHSX;
    }

    public void setTenHSX(String tenHSX) {
        this.tenHSX = tenHSX;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }




}
