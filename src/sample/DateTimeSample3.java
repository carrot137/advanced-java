package sample;

import java.time.LocalDateTime;

public class DateTimeSample3 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2018,
        1,
        2,
        3,
        4,
        5,
        999999990); 
        System.out.println("日付と時間："+localDateTime);

        localDateTime = localDateTime.plusYears(1); 
        localDateTime = localDateTime.plusMonths(2); 
        localDateTime = localDateTime.plusDays(3); 
        localDateTime = localDateTime.plusHours(4); 
        localDateTime = localDateTime.plusMinutes(5); 
        localDateTime = localDateTime.plusSeconds(6); 
        localDateTime = localDateTime.plusNanos(7); 
        System.out.println("進めた後︓" + localDateTime); 

    }
}
