package ru.job4j.cast;

public class MainVechicle {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle train = new Train();
        Vehicle bus = new Bus();
        Vehicle planeAirbus = new Plane();
        Vehicle trainSapsan = new Train();
        Vehicle busWorker = new Bus();
        String[] kinds = {"This prototype of", "123A", "This red double-decker", "This comfortable", "755А", "This commercial"};
        String[] actions = {"is black.", "arrives at 09:00 A.M.", "runs every day.", "is big.", "arrives at 10:30 A.M.", "runs only on working days."};
        Vehicle[] vehicles = new Vehicle[]{plane, train, bus, planeAirbus, trainSapsan, busWorker};
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].move();
            vehicles[i].description(kinds[i], actions[i]);
        }
    }
}
