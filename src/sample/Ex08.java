package sample;


import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class Ex08 {

    public static void main(String[] args) {

        LocalDateTime localDateTime=LocalDateTime.of(2020,2,1,1,1);

        localDateTime=localDateTime.with(TemporalAdjusters.lastDayOfMonth());
        
        System.out.println(localDateTime);
    }   

}
