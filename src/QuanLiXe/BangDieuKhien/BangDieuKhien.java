package QuanLiXe.BangDieuKhien;

import QuanLiXe.model.HangSanXuat;
import QuanLiXe.model.XeMay;
import QuanLiXe.model.XeTai;
import QuanLiXe.service.HangSanXuatService;
import QuanLiXe.service.XeMayService;
import QuanLiXe.service.XeMayServiceImpl;
import _12_Java_collection_framwork.excercice.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class BangDieuKhien {
    ArrayList<XeMay> xeMays = new ArrayList<XeMay>();


    String bienKiemSoat;
    int namSanXuat;
    String chuSoHuu;
    HangSanXuat hangSanXuat;
    int inputCongSuat;

    private XeMayServiceImpl xeMayService = new XeMayServiceImpl();

    public void hienthiMenu() {
        boolean flag = true;
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG ");
            System.out.println("Chọn chức năng : " +
                    "\n 1. Hiện thị phương tiện." +
                    "\n 2. Thêm mới phương tiện." +
                    "\n 3. Xóa phương tiện." +
                    "\n 4. Tìm kiếm theo biển kiểm soát" +
                    "\n 5. Thoát. ");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    // code display

                    int choose2 = 0;
                    System.out.println("chức năng hiện thị");
                    System.out.println("chọn loại xe : " +
                            "\n 1. Xe Máy. " +
                            "\n 2. Xe Ô tô." +
                            "\n 3. Xe Tải." +
                            "\n 4. Trở lại menu trước.");
                    choose2 = scanner.nextInt();
                    switch (choose2) {
                        case 1:
                            xeMayService.hienThiXeMay(xeMays);
                            break;
                        case 2:
//                            XeOToServiceImpl.hienThiXeOTo(xeOTos);
                        case 3:
//                            XeTaiServiceImpl.hienThiXeTai(xeTais);
                        case 4:
                            break;
                    }

                    break;
                case 2:
                    // code thêm mới

                    System.out.println("Chức năng thêm xe mới");
                    System.out.println("chọn loại xe : " +
                            "\n 1. Xe Máy. " +
                            "\n 2. Xe Ô tô." +
                            "\n 3. Xe Tải." +
                            "\n 4. Trở lại menu trước.");
                    choose2 = scanner.nextInt();
                    switch (choose2) {
                        case 1:
                            System.out.println("\nNhập các thông tin tạo xe Máy :\n");
                            System.out.println("Nhập Biển Số :");
                            bienKiemSoat = scanner.next();
                            System.out.println("Nhập tên chủ xe :");
                            chuSoHuu = scanner.next();
                            System.out.println("Nhập Năm Sản Xuất :");
                            namSanXuat = scanner.nextInt();
                            System.out.println("Chọn Hãng Sản Xuất :");
                            //nhập choose để chọn hãng trong list
                            System.out.println("Nhập Công Suất  :");
                            inputCongSuat = scanner.nextInt();

                            xeMays.add(new XeMay(bienKiemSoat, namSanXuat, chuSoHuu, hangSanXuat, inputCongSuat));
                            xeMayService.hienThiXeMay(xeMays);
                            break;
                        case 2:

                    }

                    break;
                case 3:
                    // code xóa
                    System.out.println("chức năng xóa");

                    break;
                case 4:
                    // code sửa
                    System.out.println("chức năng sửa");

                    break;
                case 5:
                    // code tìm kiếm
                    System.out.println("chức năng tìm kiếm");
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }
}
