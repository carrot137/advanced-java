package sample;

public class Car {
    private int speed;
    public void run(int speed)throws Exception{
        //speed+=10;
        if(speed>=180){
            throw new OverSpeedException("スピードの出しすぎです");
        }
            else{
                this.speed=speed;
                System.out.println("スピードが"+speed+"km/hになりました");
            }
        
        
    }

}
