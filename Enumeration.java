import javax.lang.model.util.ElementScanner14;

public class Enumeration {
    enum DayofWeek
    {
        MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5),SATURDAY(6),SUNDAY(7);
        public int val;
        DayofWeek(int val)
        {
            this.val=val;
        }
        boolean isWorkDay()
        {
        if(val<6)
        return true;
        else
        return false;
    }
}

public static void main(String[] args) {
    DayofWeek Day;
    System.out.println("Verification of Sunday(isWorkDay())");
    System.out.println(DayofWeek.SUNDAY.isWorkDay());
    System.out.println("Verification of Wednesday(isWorkDay())");
    System.out.println(DayofWeek.WEDNESDAY.isWorkDay());
}
}