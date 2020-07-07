package JavaCollections.MainTask.Aircraft.Config;

public abstract class AircraftConfig {
    private final String manufacturer;
    private final String model;
    private final int rangeFlight;
    private final int amountFuel;

    public AircraftConfig (int rangeFlight, int amountFuel, String manufacturer, String model) {
        this.rangeFlight = rangeFlight;
        this.amountFuel = amountFuel;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public abstract int getPassengerCapacity();

    public abstract int getCarrying();

    public int getRangeFlight() {
        return rangeFlight;
    }

    public int getAmountFuel() {
        return amountFuel;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Самолет [Производитель = " + manufacturer
                + ", Модель = " + model + ", Пассажировместимость = "
                + getPassengerCapacity() + ", Грузоподъемность=" + getCarrying()
                + ", Дальность полета =" + rangeFlight + ", Количество потребляемого топлива = "
                + amountFuel + "]";
    }
}
