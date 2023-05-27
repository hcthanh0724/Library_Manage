
import Manage.Manage;
import Model.User;

import java.text.ParseException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        Manage manage = new Manage();
        while (true){
            System.out.println("------------------------");
            System.out.println("Lựa chọn thao tác: ");
            System.out.println("1. Hiển thị sách ");
            System.out.println("2. Thêm sách ");
            System.out.println("3. Sửa sách ");
            System.out.println("4. Xóa sách ");
            System.out.println("5. Tính tiền ");
            System.out.println("6. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice){


                case 1:
                    manage.show();
                    break;
                case 2:

                    System.out.println("1. Comics  ");
                    System.out.println("2. Fiction ");
                    System.out.println("3. Mystery ");
                    int choice2 = Integer.parseInt(scanner.nextLine());
                    switch (choice2){
                        case 1:
                            manage.addComicBook();

                            break;
                        case 2:
                            manage.addFictionBook();
                            break;
                        case 3:
                            manage.addMysteryBook();
                            break;
                    }
                    break;
//                case 3:
//                    System.out.println("1. Comics  ");
//                    System.out.println("2. Fiction ");
//                    System.out.println("3. Mystery ");
//                    break;
//                case 4:
//                    System.out.println("1. Comics  ");
//                    System.out.println("2. Fiction ");
//                    System.out.println("3. Mystery ");
//                    break;
//
//                case 5:
//                    System.out.println("1. Comics  ");
//                    System.out.println("2. Fiction ");
//                    System.out.println("3. Mystery ");
//                    break;
            }
        }
    }
}