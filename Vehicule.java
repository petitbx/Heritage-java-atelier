public abstract class Vehicule {

    private int speed;

    public void start() {
        System.out.println("Et c'est parti pour un tour !");
    }

    public abstract void accelerate();

    public abstract void brake();

    public Vehicule(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void addSpeed(int speed) {
        this.speed += speed;
    }

    public void removeSpeed(int speed) {
        this.speed -= speed;
    }

}