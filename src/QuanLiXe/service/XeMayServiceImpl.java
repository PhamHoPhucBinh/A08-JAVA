package QuanLiXe.service;

import QuanLiXe.model.HangSanXuat;
import QuanLiXe.model.XeMay;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeMayServiceImpl implements XeMayService {
    private ArrayList<XeMay> xeMays = new ArrayList<>();
    private HangSanXuatService hangSanXuatServices = new HangSanXuatService();

    public XeMayServiceImpl() {
        XeMay xeBinh = new XeMay("43A12345", 2015, "Phúc Bình", hangSanXuatServices.getHangSanXuatMau(), 150);
        xeMays.add(xeBinh);

    }

    @Override
    public void create(XeMay xeMay) {
    }

    @Override
    public void hienThiXeMay() {
        System.out.println("\n--------------Danh sách xe Máy---------------\n");
        System.out.println(String.format("%-15s%-20s%-10s%-15s%-10s", "BKS", "Chủ Xe", "NSX", "HSX", "CS"));
        for (XeMay e : xeMays) {
            System.out.println(String.format("%-15s%-20s%-10s%-15s%-10s", e.getBienKiemSoat(), e.getChuSoHuu(), e.getNamSanXuat(), e.getHangSanXuat().getTenHSX(), e.getCongSuat()));
        }
    }

    @Override
    public XeMay timXeMay(String bienKiemSoat) {
        return null;
    }

    @Override
    public void themXeMay() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập Biển Kiểm Soát: ");
        String bienKiemSoat = scanner.nextLine();

        System.out.println("Nhập Tên Chủ Xe: ");
        String chuSoHuu = scanner.nextLine();

        System.out.println("Nhập Năm Sản Xuất: ");
        int namSanXuat = Integer.parseInt(scanner.nextLine());

        System.out.println("Chọn Hãng Sản Xuất : ");
        String tenHangXe = scanner.nextLine();
        if (tenHangXe == hangSanXuatServices.getHangSanXuatMau().getCodeHSX()) {
            tenHangXe = hangSanXuatServices.getHangSanXuatMau().getTenHSX();
        } else {
            System.out.println("dữ liệu chưa có sẵn hãy nhập lại");
        }

        System.out.println("Nhập Công Suất Xe Máy");
        int congSuat = Integer.parseInt(scanner.nextLine());

//        XeMay xeMay = new XeMay(bienKiemSoat,namSanXuat,chuSoHuu,tenHangXe,congSuat);
//        xeMays.add(xeMay);
        hienThiXeMay();

    }

    @Override
    public void updateXeMay() {
        hienThiXeMay();
        Scanner scanner = new Scanner(System.in);
        System.out.println("chọn xe muốn update theo BKS");
        String bienKiemSoat = scanner.nextLine();
        int j = 0;
        for (XeMay e : xeMays) {
            if (bienKiemSoat.equals(e.getBienKiemSoat())) {
                j++;
                do {
                    int choose1 = 0;
                    System.out.println("\nBạn muốn update thông tin nào dưới đây :\n" +
                                    "1). Biển Kiểm Soát\n" +
                                    "2). Tên Chủ Xe\n" +
                                    "3). Năm Sản Xuất\n" +
                                    "4). Hãng Sản Xuất.\n" +
                                    "5). Công Suất.\n" +
                                    "6). Go back.\n") ;
                            System.out.println("Nhập lựa chọn của bạn : ");
                    choose1 = scanner.nextInt();
                    switch (choose1) {
                        case 1:
                            System.out.println("\nNhập Biển Kiểm Soát mới:");
                            e.BienKiemSoat = scanner.next();
                            System.out.println(e + "\n");
                            break;

                        case 2:
                            System.out.println("Nhập Tên Chủ Xe Mới:");
                            e.ChuSoHuu = scanner.next();
                            System.out.println(e + "\n");
                            break;

                        case 3:
                            System.out.println("Nhập Năm Sản Xuất Mới : " );
                            e.NamSanXuat = scanner.nextInt();
                            System.out.println(e + "\n");
                            break;

                        case 4:
                            System.out.println("Nhập Hãng Sản Xuất Mới :");
//                            e.hangSanXuat = scanner.nextLine();
                            System.out.println(e + "\n");
                            break;

                        case 5:
                            System.out.println("Nhập Công Suất Mới :");
                            e.congSuat = scanner.nextInt();
                            System.out.println(e + "\n");
                            break;

                        case 6:
                            j++;
                            break;

                        default:
                            System.out.println("\nNhập lại lựa chọn đúng :");
                            break;

                    }
                }
                while (j == 1);
            }
        }
        if (j == 0) {
            System.out.println("\nBiển Kiểm Soát k tồn tại, nhập lại !!");
        }
    }

    @Override
    public void xoaXeMay() {
        hienThiXeMay();
        Scanner scanner = new Scanner(System.in);
        System.out.println("chọn xe muốn xóa theo BKS");
        String bienKiemSoat = scanner.nextLine();
        int k = 0;
        try {
            for (XeMay e : xeMays) {
                if (bienKiemSoat.equals(e.getBienKiemSoat())) {
                    xeMays.remove(e);
                    hienThiXeMay();
                    k++;
                }
            }
            if (k == 0) {
                System.out.println("\nXe không tồn tại, nhập lại BKS khác");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
