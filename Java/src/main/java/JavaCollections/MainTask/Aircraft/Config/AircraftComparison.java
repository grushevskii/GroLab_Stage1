package JavaCollections.MainTask.Aircraft.Config;

import java.util.Comparator;

public class AircraftComparison implements Comparator<AircraftConfig> {

    @Override
    public int compare(AircraftConfig a1, AircraftConfig a2) {
        return new Integer(a1.getRangeFlight()).compareTo(a2.getRangeFlight());
    }
}
