package io.uberkautilya;

public abstract class ShipMaker {

    // This acts as an ordering mechanism for creating
    // EnemyShips that have a weapon, engine, name & nothing else

    // The specific parts used for engine & weapon depend
    // upon the String that is passed to this method

    protected abstract Ship makeShip(String typeOfShip);

    // When called a new EnemyShip is made. The specific parts
    // are based on the String entered. After the ship is made
    // we execute multiple methods in the EnemyShip Object

    public Ship orderShip(String typeOfShip) {
        Ship ship = makeShip(typeOfShip);

        ship.makeShip();
        ship.displayEnemyShip();
        ship.followHeroShip();
        ship.enemyShipShoots();

        return ship;

    }
}