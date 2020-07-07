package JavaCollections.MainTask.Aircraft.Types;

import JavaCollections.MainTask.Aircraft.Config.AircraftConfig;

public class regionalPassengerPlane extends AircraftConfig {
    private final Integer passengerCapacity;

    public regionalPassengerPlane(int passengerCapacity, int rangeFlight,
                                  int amountFuel, String manufacturer, String model) {
        super(rangeFlight, amountFuel, manufacturer, model);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    @Override
    public int getCarrying() {
        return 0;
    }
}
