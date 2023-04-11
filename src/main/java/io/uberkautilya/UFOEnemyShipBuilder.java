package io.uberkautilya;
// This is the only class that needs to change, if you
// want to determine which enemy ships you want to
// provide as an option to build

public class UFOEnemyShipBuilder extends EnemyShipBuilder {

    protected EnemyShip makeEnemyShip(String typeOfShip) {
        EnemyShip enemyShip = null;

        // If UFO was sent grab use the factory that knows
        // what types of weapons and engines a regular UFO needs.
        // The EnemyShip object is returned & given a name

        switch (typeOfShip) {
            case "UFO" -> {
                EnemyShipFactory shipFactory = new UFOEnemyShipFactory();
                enemyShip = new UFOEnemyShip(shipFactory);
                enemyShip.setName("UFO Grunt Ship");
            }

            // If UFO BOSS was sent grab use the factory that knows
            // what types of weapons and engines a Boss UFO needs.
            // The EnemyShip object is returned & given a name
            case "UFO BOSS" -> {
                EnemyShipFactory shipFactory = new UFOBossEnemyShipFactory();
                enemyShip = new UFOBossEnemyShip(shipFactory);
                enemyShip.setName("UFO Boss Ship");
            }
        }

        return enemyShip;
    }
}