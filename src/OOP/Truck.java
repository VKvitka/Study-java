package OOP;

public class Truck extends Transport{


    public Engine engine = new Engine();

    private boolean isLoaded;

    public Truck(int weight, byte[] coordinate) {
        super(weight, coordinate);
    }


    public Truck(int weight, byte[] coordinate , boolean isLoaded) {
        super(weight, coordinate);
        this.isLoaded = isLoaded;}

    @Override
    public void moveObjeckt(float speed) {
        System.out.println("Moving Objeckt: " + speed );
    }

    @Override
    public boolean stopObjeckt() {
        this.speed = 0;
        return true;
    }

    public void setValues(float speed, String color, byte[] coordinate, int weight, boolean isLoaded){
        super.setValues(speed, color, coordinate, weight);
        this.isLoaded = isLoaded;
    }

    @Override
    protected String getValues() {
        System.out.println(super.getValues());
        return getLoaded();
    }

    public void setloaded(boolean loaded) {
        isLoaded = loaded;
    }
    public String getLoaded() {
        if(isLoaded)
            return "Truck is loaded";
        else
            return "Truck is loaded";
    }

}
