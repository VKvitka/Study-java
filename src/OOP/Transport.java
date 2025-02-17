package OOP;

import java.util.Arrays;

public abstract class Transport {

    protected float speed;
    private String color;
    private byte[] coordinate;
    private int weight;


    public Transport(float speed, String color, byte[] coordinate, int weight) {
        System.out.println("Object created");
        setValues(speed, color, coordinate, weight);
//        System.out.println(getValues());
    }
    public Transport(int weight, byte[] coordinate) {
        this.weight = weight;
        this.coordinate = coordinate;
//        System.out.println(getValues());
    }

    public abstract void moveObjeckt(float speed);
    public abstract boolean stopObjeckt();

    protected void setValues(float speed, String color, byte[] coordinate, int weight) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }

    protected String getValues() {
        String info = "Object speed: " + speed + ". Weight: " + weight + ". Color: " + color + ".\n";
        String infoCord = "Coordinates:\n";

        for (int i = 0; i < coordinate.length; i++) {
            infoCord += coordinate[i] + "\n";
        }
        return info + infoCord;
    }

    class Engine {

        private boolean isReady;
        private int km;

        public void setValues(boolean isReady, int km) {
            this.isReady = isReady;
            this.km = km;
        }

        public void info(){
            if(isReady)
                System.out.println("Engine ready.");
             else
                System.out.println("Engine not ready. He has already passed:" + km + " km");
        }
    }
}
