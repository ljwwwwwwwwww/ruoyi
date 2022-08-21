import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.time.MonthDay.now;

public class a {
    public static void main(String[] args) {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s1 = format.format("2022-6-24 13:22:10");
        String a = now().toString();
        String s2 = format.format(a);
        Date d1 = null;
        Date d2 = null;
        try {
            d1 = format.parse(s1);
            d2 = format.parse(s2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long time1 = d1.getTime();
        long time2 = d2.getTime();
        int i = (int)(time2 - time1)/(1000*60);
        if(i <= 30){
            System.out.println("小于三十分钟");
        }else {
            System.out.println("大于三十分钟");
        }


    }
}
