package Model;

import java.util.Date;

public class Comics extends User{
    public static int surchargeComic ;
    private int comicGrade = 5;
    public Comics(){

    }

    public Comics(int surchargeComic) {
        this.surchargeComic = surchargeComic;
    }

    public Comics( String bookName, Date borrowDay, Date giveBackDay) {
        super( bookName, borrowDay, giveBackDay);
        this.surchargeComic = surchargeComic;
    }


    public long comicCalculate(){
        long borrowTime = super.getBorrowDay().getTime();
        long givebackTime = super.getGiveBackDay().getTime();
        long timeDiff = givebackTime - borrowTime; //trả ra thời gian giữa ngày mượn và ngày trả (milisecond)
        long numDays = timeDiff / (24 * 60 * 60 * 1000); //chuyển đổi t mili giây sang ngày (trả ra số ngày mượn)
        return ((numDays + surchargeComic) + comicGrade) * 1000;
    }

    @Override
    public String toString() {
        return super.toString() + " Số tiền cần thanh toán là " +comicCalculate() + "$ ";
    }
}
