package OOP;

import java.awt.*;

public class OOP1 {
    public static void main(String[] args) {
            // OOP: Класи і об'єкти
        Car bmw = new Car(250.5f, "Blue", new byte[] {0, 0, 0}, 2500);
        bmw.engine.setValues(false, 2000);
        bmw.engine.info();

        Truck truck = new Truck( 5600, new byte[] {5, 100, 32});
        truck.engine.setValues(true, 2000);
        truck.engine.info();

//        truck.setValues(250.5f, "Blue", new byte[] {0, 0, 0}, 2500, true);
//        System.out.println(truck.getValues());
//        truck.setloaded(true);
//        truck.getLoaded();

        Car flyCar = new Car(250.5f, "Red", new byte[] {0, 0, 0}, 2500);{
            
            }


        };

    }
