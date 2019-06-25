package package5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date today = new Date();
        System.out.println("현재시각");
        System.out.println(today);

        System.out.println("더한시각");
        Calendar cal = Calendar.getInstance();
        // calendar에 설정
        cal.setTime(today);

        // 일 값을 얻고 100을 더한 값
        cal.add(Calendar.DATE, 100);
        System.out.println(today);
        System.out.println(cal.getTime());

        // date형으로 변환
        SimpleDateFormat format1 = new SimpleDateFormat("서기 yyyy년 MM월 dd일");
        String strDate = format1.format(cal.getTime());
        System.out.println(strDate);


    }
}
