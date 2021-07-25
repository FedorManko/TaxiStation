package com.epam.jwd.task1.data;

import com.epam.jwd.task1.obj.TaxiPark;
import com.epam.jwd.task1.obj.TaxiPark.*;

public class TaxiData {

    public static TaxiPark[] taxis;

    public static TaxiPark[] List() {
        taxis = new TaxiPark[] {
                new ComfortTaxi("BMW", 20000, 240, "Red", 240, 10.3,1.2),
                new ComfortTaxi("Range Rover", 32000, 190, "Black", 400, 10.6,1.1),
                new PremiumTaxi("Audi", 40000, 200, 5, 20, 13.2,1.5),
                new PremiumTaxi("Lexus", 50000, 210, 5, 40, 14.5,1.6),
                new EconomyTaxi("Renault", 5000, 220, "Velours", 70, 5.6,0.8),
                new EconomyTaxi("Peugeot", 8000, 230, "Leather", 25, 7.6,0.7)};
        return taxis;
    }

    public static ComfortTaxi[] comfortTaxis;

    public static ComfortTaxi[] List1() {
        comfortTaxis = new ComfortTaxi[] {
                new ComfortTaxi("BMW", 20000, 200, "Red", 100, 21.3,0.9),
                new ComfortTaxi("Range Rover", 32000, 21, "Black", 50, 15.6,1.1)};
        return comfortTaxis;

    }
}