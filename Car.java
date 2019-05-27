public class Car extends Vehicule implements MusicPlayer {

    private String licencePlate;

    private double fuel;

    public void fillUp(double fuel) {
        this.fuel += fuel;
    }

    @Override
    public void accelerate() {
        this.addSpeed(1);
    }

    @Override
    public void play() {
        System.out.println("We will rock you ! YEAHHHHHHH");
    }

    @Override
    public void brake() {
        this.removeSpeed(2);
    }

    public Car(String licencePlate, double fuel, int speed) {
        super(speed);
        this.licencePlate = licencePlate;
        this.fuel = fuel;
    }

    public static void main(String[] args) {
        Car peugeot = new Car("DR-213-JM", 45.00, 208);
        peugeot.start();
        peugeot.play();
        peugeot.accelerate();
        peugeot.brake();
        System.out.println("Vous roulez a ");
        System.out.println(peugeot.getSpeed());
        peugeot.stop();
    }

}