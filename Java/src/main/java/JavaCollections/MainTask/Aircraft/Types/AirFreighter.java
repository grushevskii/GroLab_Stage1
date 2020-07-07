package JavaCollections.MainTask.Aircraft.Types;

import JavaCollections.MainTask.Aircraft.Config.AircraftConfig;

public class AirFreighter extends AircraftConfig {
    private final Integer carrying;

    public AirFreighter(int carrying,int rangeFlight, int amountFuel,
                        String manufacturer, String model) {
        super(rangeFlight, amountFuel, manufacturer, model);

        this.carrying = carrying;
    }

    @Override
    public int getCarrying() {
        return carrying;
    }

    @Override
    public int getPassengerCapacity() {
        return 0;
    }
}
