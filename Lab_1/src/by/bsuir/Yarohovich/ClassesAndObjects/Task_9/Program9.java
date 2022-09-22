package by.bsuir.Deschenya.ClassesAndObjects.Task_9;

public class Program9 {
    public static void main(String[] args) throws Exception {        
        Basket basket = new Basket();
        basket.addBall((float)3.0, "blue");                       
        basket.addBall((float)3.0, "red"); 
        basket.addBall((float)3.0, "pink"); 
        basket.deleteBall((float)3.0, "red"); 
        System.out.println(basket.getAllBallWeight());   
        System.out.println(basket.getBlueBallCount()); 
        basket.addBall((float)5.0, "blue"); 
        basket.deleteBall((float)3.0, "pink"); 
        System.out.println(basket.getAllBallWeight());   
        System.out.println(basket.getBlueBallCount()); 
    }
}
