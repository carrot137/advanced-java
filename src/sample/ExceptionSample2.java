package sample;

public class ExceptionSample2 {
    public static void main(String[] args) {
        System.out.println("プログラム開始");

        
        try {
            Class.forName("java.lang.NotExistClass");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("例外がおきました");
        }finally{
            System.out.println("finally");
            //後処理
        }

        System.out.println( "プログラム終了");
    }

}
