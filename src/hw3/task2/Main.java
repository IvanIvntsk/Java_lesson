package hw3.task2;

public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = {
                new Guitar(6),
                new Drum(20),
                new Trumpet(10),
        };
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
