package Manage;

import Model.Comics;
import Model.Fiction;
import Model.Mystery;
import Model.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Manage {
    Scanner scanner = new Scanner(System.in);
     ArrayList<User> bookList = new ArrayList<>();
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    public User createComicBook() throws ParseException {
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày mượn");
        String borrowDay = scanner.nextLine();
        Date borrowDay1 = format.parse(borrowDay);
        System.out.println("Nhập ngày trả");
        String givebackDay = scanner.nextLine();
        Date givebackDay1 = format.parse(givebackDay);
            return new Comics(name,borrowDay1,givebackDay1);
    }
public User createMysteryBook() throws ParseException {
    System.out.println("Nhập tên");
    String name = scanner.nextLine();
    System.out.println("Nhập ngày mượn");
    String borrowDay = scanner.nextLine();
    Date borrowDay1 = format.parse(borrowDay);
    System.out.println("Nhập ngày trả");
    String givebackDay = scanner.nextLine();
    Date givebackDay1 = format.parse(givebackDay);
    return new Mystery(name,borrowDay1,givebackDay1);
}

    public User createFictionBook() throws ParseException {
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày mượn");
        String borrowDay = scanner.nextLine();
        Date borrowDay1 = format.parse(borrowDay);
        System.out.println("Nhập ngày trả");
        String givebackDay = scanner.nextLine();
        Date givebackDay1 = format.parse(givebackDay);
        return new Fiction(name,borrowDay1,givebackDay1);
    }

    public void addComicBook() throws ParseException {
        bookList.add(createComicBook());
    }
    public void addMysteryBook() throws ParseException {
        bookList.add(createMysteryBook());
    }
    public void addFictionBook() throws ParseException {
        bookList.add(createFictionBook());
    }
    public void show(){
        for (User booklist:  bookList) {
            System.out.println(booklist);
        }
    }

}
