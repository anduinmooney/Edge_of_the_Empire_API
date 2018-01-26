package dao;

import models.Armor;

import java.util.List;

public interface ArmorDao {

        //create
        void add (Armor armor); //J
        // void addRestaurantToFoodType(Restaurant restaurant, Foodtype foodtype) //D & E

        //read
        List<Armor> getAll(); //A
        // List<Foodtype> getAllFoodtypesForARestaurant(int restaurantId); //D & E - we will implement this soon.

        Armor findById(int id); //B & C

        //update
        void update(int id, String armorName, String defense, String soak, String price, String armorEncumberance, String armorHardPoint, String armorRarity); //L

        //delete
        void deleteById(int id); //K
    }

