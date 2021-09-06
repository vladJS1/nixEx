package com.example.nested_class.static_nested_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;
    static int a;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    public static class Engine{
        int horsePower;
        static int countOfObjects;

        public Engine(int horsePower) {
            System.out.println(a);
            this.horsePower = horsePower;
            countOfObjects++;

        }

        @Override
        public String toString() {
            return "My Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "My car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }
}
class Test{
    public static void main(String[] args) {
        Car.Engine e = new Car.Engine(256);
        System.out.println(e);
        Car car = new Car("red",2,e);
        System.out.println(car);
    }
}
class Z extends Car.Engine{
    public Z(int horsePower) {
        super(horsePower);
    }
}
