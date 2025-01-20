package sample;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;

public class DateTimeSample4 {
    public static void main(String[] args) {
        LocalDateTime localDateTime=LocalDateTime.of(2020,2,1,1,1);

        

        
        System.out.println("月末は"+localDateTime.with(TemporalAdjusters.lastDayOfMonth()));

         LocalTime localTime = LocalTime.now(); 
         System.out.println("現在の時間：" + localTime); 
        //  System.out.println("⽉末は"+localTime.with(TemporalAdjusters.lastDayOfMonth())); 
         
         System.out.println("現在の日付と時間:" + localDateTime); 
         System.out.println("月末は"+ localDateTime.with(TemporalAdjusters.lastDayOfMonth())); 


    }

}
