package by.bsuir.Deschenya.ClassesAndObjects.Task_9;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Ball> listBall = new ArrayList<Ball>();
    final static int maxNumberOfProduct = 20;
    final static int minNumberOfProduct = 0;

    public Basket() {  }

    public void addBall(float weight, String color) {
        if (listBall.size() == maxNumberOfProduct) {
            System.out.println("The basket is full. Delete some products and try again:)");
        }
        else {
            listBall.add(new Ball(weight, color));
            System.out.println("Added.");
        }
    }

    public void deleteBall(float weight, String color) {
        if (listBall.size() == minNumberOfProduct) {
            System.out.println("The basket is empty. Add some products and try again:)");
        }
        else {            
            if (findBallInBasket(weight, color) != null) {
                System.out.println("Deleted.");
            }
            else {
                System.out.println("Error in deleting ball from basket.");
            }
        }
    }

    public float getAllBallWeight() {
        float sumWeight = 0;

        for (Ball ball : listBall) {
            sumWeight += ball.getWeight();
        }
        return sumWeight;
    }

    public int getBlueBallCount() {
        int blueBall = 0;

        for (Ball ball : listBall) {
            if (ball.getColor() == "blue") {
                blueBall++;
            }
        }
        return blueBall;
    }

    private Ball findBallInBasket(float weight, String color) {
        for (Ball product : listBall) {
            if (product.getWeight() == weight && product.getColor() == color) {
                return product;
            }
        }
        return null;
    }
}
