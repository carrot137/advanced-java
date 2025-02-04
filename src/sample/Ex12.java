package sample;

public class Ex12 {
    public static void main(String[] args) {
        int answer=10/0;
        try{
        System.out.println(answer);
         }catch(Exception e){
             System.out.println("0で割ることができません");
         }
    }

}
