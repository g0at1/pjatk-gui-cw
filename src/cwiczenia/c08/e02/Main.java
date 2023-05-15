package cwiczenia.c08.e02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public
    class Main {

    public static void main(String[] args) {
        Map<String, List<Car>> map = new HashMap<>();
        Car cheapest = null;
        String cheapestSalon = "";

        String[] arr = {
                "salon A", "Mercedes", "130000",
                "salon B", "Mercedes", "120000",
                "salon C", "Ford", "110000",
                "salon B", "Opel", "90000",
                "salon C", "Honda", "95000",
                "salon A", "Ford", "105000",
                "salon A", "Renault", "75000"
        };

        for (int i = 0; i < arr.length; i += 3) {
            String salon = arr[i];
            String model = arr[i+1];
            int price = Integer.parseInt(arr[i+2]);
            if (!map.containsKey(salon)) {
                map.put(salon, new ArrayList<>());
            }
            map.get(salon).add(new Car(model, price));
        }
        System.out.println(map);

        for (Map.Entry<String, List<Car>> entry : map.entrySet()) {
            List<Car> cars = entry.getValue();
            for (Car car : cars) {
                if (cheapest == null || car.getPrice() < cheapest.getPrice()) {
                    cheapest = car;
                    cheapestSalon = entry.getKey();
                }
            }
        }
        System.out.println(
            cheapest.getModel() + " in " + cheapestSalon + " for " + cheapest.getPrice()
        );
    }
}
