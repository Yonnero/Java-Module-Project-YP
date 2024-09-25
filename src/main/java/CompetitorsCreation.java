import java.util.ArrayList;
import java.util.Scanner;

public class CompetitorsCreation {
    private final Scanner scanner = new Scanner(System.in);
    private final ArrayList<Car> cars = new ArrayList<>();
    private final int competitors = 3;
    private final int maxSpeed = 250;
    private final int minSpeed = 1;

    void createCompetitors() {
        while (cars.size() < competitors) {
            int countCar = cars.size() + 1;
            Car car = new Car(nameCar(countCar), checkSpeed(countCar));
            cars.add(car);
        }
        scanner.close();
    }

    int checkSpeed(int countCar) {
        int speed;
        while (true) {
            System.out.println("Введите скорость автомобиля №" + countCar + ":");
            if (scanner.hasNextInt()) {
                speed = scanner.nextInt();
                scanner.nextLine();
                if (minSpeed <= speed && speed <= maxSpeed) {
                    return speed;
                } else {
                    System.out.println("Скорость выходит из диапазона значений. Повторите попытку...");
                }
            } else {
                System.out.println("Введено недопустимое значение. Повторите попытку...");
                scanner.next();
            }
        }
    }

    String nameCar(int countCar) {
        System.out.println("Введите название автомобиля №" + countCar + ":");
        return scanner.next();
    }

    ArrayList<Car> getCars() {
        return cars;
    }
}
