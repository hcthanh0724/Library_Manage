package Model;

import java.util.Date;

public class Fiction extends User{
    public static int surcharge = 5000;
    private int fictionGrade = 2;
    public Fiction(){

    }

    public Fiction( String bookName, Date borrowDay, Date giveBackDay) {
        super( bookName, borrowDay, giveBackDay);
    }


    public long fictionCalculate(){
        long borrowTime = super.getBorrowDay().getTime();
        long givebackTime = super.getGiveBackDay().getTime();
        long timeDiff = borrowTime - givebackTime;
        long numDay = timeDiff / (24 * 60 * 60 * 1000);
        return (numDay +surcharge) +fictionGrade ;
    }

    @Override
    public String toString() {
        return super.toString() + " Số tiền cần thanh toán là " +fictionCalculate();
    }
}
