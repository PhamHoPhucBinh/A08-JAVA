package QuanLiXe.BangDieuKhien;

import QuanLiXe.model.XeMay;
import QuanLiXe.model.XeTai;
import QuanLiXe.service.HangSanXuatService;
import QuanLiXe.service.XeMayService;
import QuanLiXe.service.XeMayServiceImpl;

import java.util.Scanner;

public class BangDieuKhien {

    public static void main(String[] args) {
         XeMayService xeMayService = new XeMayServiceImpl();
         HangSanXuatService hangSanXuatService = new HangSanXuatService();

         XeMay xeMay1 = new XeMay("43A12345",2005,"Binh",hangSanXuatService.getHangSanXuat(),150  );
        System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");
        Scanner sc = new Scanner(System.in);
        int ch, ch2;
        char wish;
        x:
        do {

            System.out.println("\nChọn chức năng: :\n1.Thêm mới phương tiện. \n2.Hiện thị phương tiện \n3.Xóa phương tiện \n4.Tìm kiếm theo biển kiểm soát \n5.Thoát\n");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("\nChọn chức năng :\n1.Thêm Xe Tải \n2.Thêm Xe Ô tô \n3.Thêm Xe Máy \n4.Return Main menu \n");
                    ch2 = sc.nextInt();
                    switch (ch2){
                        case 1 :
                            ch2 = sc.nextInt();


                            break ;
                        case 2:
                            ch2 = sc.nextInt();
                            System.out.println();
                        case 3:
                            ch2 = sc.nextInt();
                            xeMayService.create(xeMay1);

                    }
                    break;
                case 2:
                    System.out.println("\nEnter your choice :\n1.Hiển thị Danh Sách xe tải \n2.Hiển thị Danh Sách xe Ô tô \n3.Hiển thị Danh Sách xe máy \n4.Return to Mainmenu\n");
                    ch2 = sc.nextInt();
//                    Hotel.availability(ch2);
                    break;
                case 3:
                    System.out.println("\nXóa Theo Biển Kiểm Soát :\n1.Xóa Xe tải \n2.Xóa xe Ô tô \n3.Xóa xe máy\n4.Return main menu\n");
                    ch2 = sc.nextInt();
//                    Hotel.bookroom(ch2);
                    break;
                case 4:
                    System.out.println("\nTìm Thông Tin xe theo Biển Kiểm Soát :\n1.Tìm Thông tin Xe Tải \n2.Tìm Thông tin Xe Ô tô \n3.Tìm Thông tin Xe Máy \n4.Return main menu \n");
                    ch2 = sc.nextInt();
//                  XeMay xeMay = xeMayService.findAll().get(0);
                    break;
                case 5:
                    break x;
            }
            System.out.println("\nContinue : (y/n)");
            wish = sc.next().charAt(0);
            if (!(wish == 'y' || wish == 'Y' || wish == 'n' || wish == 'N')) {
                System.out.println("Invalid Option");
                System.out.println("\nContinue : (y/n)");
                wish = sc.next().charAt(0);
            }
        }
        while (wish == 'y' || wish == 'Y');
        {
            System.out.println("Not a valid input");
        }
    }

}
