package JavaClasses;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Search {

    public List<Cars> getCarsByMake(List<Cars> cars, Make make) {
        List<Cars> result = new ArrayList<Cars>();
        for (Cars car : cars) {
            if (car.getMake().equals(make))
                result.add(car);
        }
        return result;
    }

    public List<Cars> getCarsByModelAndOperation(List<Cars> cars, String model, int years) {
        List<Cars> results = new ArrayList<Cars>();
        for (Cars car : cars) {
            if (car.getModel().equals(model) && Calendar.getInstance().get(Calendar.YEAR)-car.getYearOfIssue() > years)
                results.add(car);
        }
        return results;
    }

    public List<Cars> getCarsByYearAndPrice(List<Cars> cars, int yearOfIssue, int price) {
        List<Cars> results = new ArrayList<Cars>();
        for (Cars car : cars) {
            if (car.getYearOfIssue()==yearOfIssue && car.getPrice() > price)
                results.add(car);
        }
        return results;
    }

}
