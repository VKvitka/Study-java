package OOP;

public class Car extends Transport {


    public Engine engine = new Engine();

    public Car(float _speed, String _color, byte[] _coordinate, int _weight) {
        super(_speed, _color, _coordinate, _weight);

    }

    @Override
    public void moveObjeckt(float speed) {
        System.out.println("Moving Objeckt: " + speed);
    }

    @Override
    public boolean stopObjeckt() {
        this.speed = 0;
        return true;
    }

}
