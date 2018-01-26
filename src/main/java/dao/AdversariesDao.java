package dao;

import models.Adversaries;
import models.Weapon;

import java.util.List;

public interface AdversariesDao {
    //create
    void add (Adversaries adversaries); //J
    // void addRestaurantToFoodType(Restaurant restaurant, Foodtype foodtype) //D & E

    //read
    List<Adversaries> getAll(); //A
    // List<Foodtype> getAllFoodtypesForARestaurant(int restaurantId); //D & E - we will implement this soon.

    Adversaries findById(int id); //B & C

    //update
    void update(int id, String adversaryName, String level, String index); //L

    //delete
    void deleteById(int id); //K
}
