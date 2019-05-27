public interface MusicPlayer {

    public default void play() {
        System.out.println("Another one bites the dust");
    }

    public default void stop() {
        System.out.println("Et je coupe le son !!!");
    }

}