package JavaCollections.MainTask.Aircraft.Types;

import JavaCollections.MainTask.Aircraft.Config.AircraftConfig;

public class mainPassengerPlane extends AircraftConfig {
    private final Integer passengerCapacity;
    private final Integer carrying;

    public mainPassengerPlane(int passengerCapacity, int carrying,
                                       int rangeFlight, int amountFuel, String manufacturer, String model) {
        super(rangeFlight, amountFuel, manufacturer, model);
        this.passengerCapacity = passengerCapacity;
        this.carrying= carrying;
    }

    @Override
    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    @Override
    public int getCarrying() {
        return carrying;
    }
}
