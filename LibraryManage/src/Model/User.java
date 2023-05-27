package Model;

import java.util.Date;

public class User {
    public static int count = 1;
    private int id;
    private String bookName;
    private Date borrowDay;
    private Date giveBackDay;

    public User(){

    }

    public User( String bookName, Date borrowDay, Date giveBackDay) {
        this.id = count++;
        this.bookName = bookName;
        this.borrowDay = borrowDay;
        this.giveBackDay = giveBackDay;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        User.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Date getBorrowDay() {
        return borrowDay;
    }

    public void setBorrowDay(Date borrowDay) {
        this.borrowDay = borrowDay;
    }

    public Date getGiveBackDay() {
        return giveBackDay;
    }

    public void setGiveBackDay(Date giveBackDay) {
        this.giveBackDay = giveBackDay;
    }

    @Override
    public String toString() {
        return "User:" +
                "id=" + id +
                ", bookName=' " + bookName + '\'' +
                ", borrowDay= " + borrowDay +
                ", giveBackDay= " + giveBackDay +
                ' ';
    }
}
