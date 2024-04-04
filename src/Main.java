public class Main {
    public static void main(String[] args) {
        Airplain boing =new Airplain("Боинг 737", "белый", 43998 );
        System.out.println(boing);
        Airbus A320 =new   Airbus("A 320","белый", 56237, 700);
        System.out.println(A320);
    }


}

class Airplain{
  private String name;
  private String color;
  private double weight;


    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Airplain{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Airplain(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;

    }
}
class Airbus extends Airplain {
    private double speed;

    public Airbus(String name, String color, double weight, double speed) {
        super(name, color, weight);
        this.speed = speed;
    }

    public Airbus(String name, String color, double weight) {
        super(name, color, weight);
    }

    public void highflightspeed(){
        System.out.println("высокая скорость полета");
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Airbus{"+getName() +getColor() +getWeight()+
                " speed=" + speed +
                '}';
    }
}




