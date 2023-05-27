package Model;

import java.util.Date;

public class Mystery extends User{
    public static int surchargeMystery = 4000;
    private int mysteryGrade = 4;
    public Mystery(){

    }

    public Mystery(int mysteryGrade) {
        this.mysteryGrade = mysteryGrade;
    }

    public Mystery( String bookName, Date borrowDay, Date giveBackDay ) {
        super( bookName, borrowDay, giveBackDay);
    }

    public long mysteryCalculate(){
        long borrowTime = super.getBorrowDay().getTime();
        long givebackTime = super.getGiveBackDay().getTime();
        long timeDiff = givebackTime - borrowTime;
        long numDays = timeDiff / (24 * 60 * 60 * 1000);
        return (numDays * mysteryGrade) + surchargeMystery;
    }
    @Override
    public String toString() {
        return super.toString() + " Số tiền cần thanh toán là " +mysteryCalculate();
    }
}
