package QuanLiXe.BangDieuKhien;

import java.util.Scanner;

public class BangDieuKhien {
    public static void main(String[] args) {
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
                    System.out.println("\nEnter your choice :\n1.Display list employees \n2.Add new employees \n3.Edit employees \n4.Delete employees \n5.Return Main menu \n");
                    ch2 = sc.nextInt();
//                    Hotel.features(ch2);

                    break;
                case 2:
                    System.out.println("\nEnter your choice :\n1.Display list customer \n2.Add new customer \n3.Edit customer \n4.Return to Mainmenu\n");
                    ch2 = sc.nextInt();
//                    Hotel.availability(ch2);
                    break;
                case 3:
                    System.out.println("\nEnter your choice :\n1.Display list facility \n2.Add new facility \n3.Display list facility maintenance\n4.Return main menu\n");
                    ch2 = sc.nextInt();
//                    Hotel.bookroom(ch2);
                    break;
                case 4:
                    System.out.println("\nEnter your choice :\n1.Add new booking \n2.Display list booking \n3.Create new constract \n4.Display list contract \n5.Edit contracts \n6.Return main menu \n");
                    ch2 = sc.nextInt();
//                    Hotel.bookroom(ch2);
                    break;
                case 5:
                    System.out.println("\nPromotion Management :\n1.Display list customers use service \n2.Display list customers get voucher \n3.Return main menu\n");
                    ch2 = sc.nextInt();
//                    Hotel.bookroom(ch2);
                    break;
                case 6:
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