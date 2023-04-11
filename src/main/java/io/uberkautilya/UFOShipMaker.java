package io.uberkautilya;
// This is the only class that needs to change, if you
// want to determine which enemy ships you want to
// provide as an option to build

public class UFOShipMaker extends ShipMaker {

    protected Ship makeShip(String typeOfShip) {
        Ship ship = null;

        // If UFO was sent grab use the factory that knows
        // what types of weapons and engines a regular UFO needs.
        // The EnemyShip object is returned & given a name

        switch (typeOfShip) {
            case "UFO" -> {
                ShipFactory shipFactory = new UFOShipFactory();
                ship = new UFOShip(shipFactory);
                ship.setName("UFO Grunt Ship");
            }

            // If UFO BOSS was sent grab use the factory that knows
            // what types of weapons and engines a Boss UFO needs.
            // The EnemyShip object is returned & given a name
            case "UFO BOSS" -> {
                ShipFactory shipFactory = new UFOBossShipFactory();
                ship = new UFOBossShip(shipFactory);
                ship.setName("UFO Boss Ship");
            }
        }

        return ship;
    }
}