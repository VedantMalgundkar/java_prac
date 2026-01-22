package Tomato;

import java.util.ArrayList;
import java.util.List;

public class RestaurantManager {
    private List<Restaurant> restaurants;
    private static RestaurantManager resManagerInstance;

    public static RestaurantManager getRestaurantManager() {
        // Check if the instance is null
        if (resManagerInstance == null) {
            resManagerInstance = new RestaurantManager();
        }
        return resManagerInstance;
    }

    public List<Restaurant> searchResByLoc(String loc) {
        List<Restaurant> foundRestaurants = new ArrayList<>();

        // Loop through the list of restaurants
        for (Restaurant restau : this.restaurants) {
            if (restau.getLocation().toLowerCase().contains(loc.toLowerCase())) {
                foundRestaurants.add(restau);
            }
        }

        return foundRestaurants;
    }

    public void addRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
    } 
}
