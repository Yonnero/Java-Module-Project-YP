import java.util.ArrayList;

public class Race {

    public void printWinner(ArrayList<Car> cars) {
        Car winner = new Car();
        for (Car car : cars) {
            if (winner.getSpeed() <= car.getSpeed()) {
                winner = car;
            }
        }

        System.out.println("\n*-------------------------------------------------------------------------*");
        System.out.println(" Победитель в нашей гонке - '" + winner.getName() + "'!");
        System.out.println("*-------------------------------------------------------------------------*");
    }
}
