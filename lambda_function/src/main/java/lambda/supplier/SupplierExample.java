package lambda.supplier;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;


public class SupplierExample {
    public static ArrayList<Car> createThreeCar(Supplier<Car> carSupplier) {
        ArrayList<Car> al = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            al.add(carSupplier.get());
        }
        return al;
    }
    //Consumer
    public static void changeCar(Car car, Consumer<Car> carConsumer){
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCar (() -> new Car("Nissan Tiida","Siler Tittanic",1.6));
        System.out.println("OurCars: ");
        for (Car s : ourCars) {
            System.out.println(s);
        }

        changeCar(ourCars.get(0),
                car -> {
                    car.color="red";
                    car.engine = 2.4;
                    System.out.println("upgraded car: " + car);
                });
    }
}
class Car {
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
