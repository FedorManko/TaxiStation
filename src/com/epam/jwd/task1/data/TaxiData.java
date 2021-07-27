package com.epam.jwd.task1.data;

import com.epam.jwd.task1.obj.ComfortTaxi;
import com.epam.jwd.task1.obj.EconomyTaxi;
import com.epam.jwd.task1.obj.PremiumTaxi;
import com.epam.jwd.task1.obj.TaxiPark;


public class TaxiData {

    public static TaxiPark[] taxis;

    public static TaxiPark[] List() {
        taxis = new TaxiPark[] {
                new ComfortTaxi("BMW", 20000, 90, 450, 12.3, 10.3,"Red"),
                new ComfortTaxi("Range Rover", 32000, 190, 28, 11.5, 10.6,"Black"),
                new PremiumTaxi("Audi", 40000, 200, 5, 13.6, 13.2,5),
                new PremiumTaxi("Lexus", 50000, 210, 23, 14.6, 14.5,8),
                new EconomyTaxi("Renault", 5000, 220, "Velours", 70, 5.6,6.8),
                new EconomyTaxi("Peugeot", 8000, 230, "Leather", 25, 7.6,6.7)};
        return taxis;
    }

    public static ComfortTaxi[] comfortTaxis;

    public static ComfortTaxi[] List1() {
        comfortTaxis = new ComfortTaxi[] {
                new ComfortTaxi("BMW", 22000, 200, 35, 13.5, 21.3,"Red"),
                new ComfortTaxi("Range Rover", 32000, 210,15 , 10.0, 15.6,"Blue")};
        return comfortTaxis;

    }
}