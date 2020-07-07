package JavaCollections.MainTask.Airline;

import JavaCollections.MainTask.Aircraft.Config.AircraftComparison;
import JavaCollections.MainTask.Aircraft.Config.AircraftConfig;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Airline {
	private String airlineName;
	private List<AircraftConfig> aircrafts = new ArrayList<AircraftConfig>();

	public Airline(String airlineName) {
		this.airlineName = airlineName;
	}
	
	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	
	public void addAircraft(AircraftConfig aircraft) {
		aircrafts.add(aircraft);
	}
	
	public void calculateTotalCargoPassengerCapacity() {
		int totalPassengerCapacity = 0;
		int totalCargoCapacity = 0;
		for (int i = 0; i < aircrafts.size(); ++i) {
				totalPassengerCapacity += aircrafts.get(i).getPassengerCapacity();
				totalCargoCapacity += aircrafts.get(i).getCarrying();
		}
		
		System.out.println("Общая пассажировместимость: " + totalPassengerCapacity);
		System.out.println("Общая грузоподъемность: " + totalCargoCapacity);
	}
	
	
	public void sortPlanesByFlightRange() {

		Collections.sort(this.aircrafts, new AircraftComparison());
	}
	
	public ArrayList<AircraftConfig> filterAircraftsByFuelConsumption(int min, int max, boolean showResult) {
		System.out.println("Самолеты компании с параметрами потребления горючего от "+min+" до "+max+" кг/ч: ");
		ArrayList<AircraftConfig> resultList = new ArrayList<AircraftConfig>();
		for (int i = 0; i < this.aircrafts.size(); ++i) {
			int planeConsumption = aircrafts.get(i).getAmountFuel();
			if (planeConsumption >= min && planeConsumption <= max) {
				resultList.add(aircrafts.get(i));
			}
		}
		
		if (showResult == true) {
			showAircraftList(resultList);
		}
		
		return resultList;
	}
	
	public void showAirlineAircrafts() {
		showAircraftList(this.aircrafts);
	}
	
	private void showAircraftList(List<AircraftConfig> al) {
		System.out.println("======= " + this.getAirlineName() + " ======");
		for (int i = 0; i < al.size(); ++i) {
			System.out.println(al.get(i));
		}
	}
}
