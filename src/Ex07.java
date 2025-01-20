import java.time.LocalDateTime;

public class Ex07 {

    public static void main(String[] args) {

        LocalDateTime localDateTime=LocalDateTime.of(1998,7,31,0,0);
        int year = localDateTime.getYear();
        System.out.println("年:"+year);
        int month=localDateTime.getMonthValue();
        System.out.println("月："+month);
        int dayOfMonth = localDateTime.getDayOfMonth(); 
        System.out.println("日：" + dayOfMonth); 

    }

}
