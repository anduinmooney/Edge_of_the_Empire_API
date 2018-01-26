package dao;

import models.Weapon;

import java.util.List;

public interface WeaponDao {
    //create
    void add (Weapon weapon); //J
    // void addRestaurantToFoodType(Restaurant restaurant, Foodtype foodtype) //D & E

    //read
    List<Weapon> getAll(); //A
    // List<Foodtype> getAllFoodtypesForARestaurant(int restaurantId); //D & E - we will implement this soon.

    Weapon findById(int id); //B & C

    //update
    void update(int id, String name, String skill, String damage, String critical, String range, String encumberance, String hardPoint, String rarity, String price); //L

    //delete
    void deleteById(int id); //K
}
