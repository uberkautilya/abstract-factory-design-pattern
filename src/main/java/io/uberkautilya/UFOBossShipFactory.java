package io.uberkautilya;// This factory uses the EnemyShipFactory interface
// to create very specific UFO Enemy Ship

// This is where we define all of the parts the ship
// will use by defining the methods implemented
// being ESWeapon and ESEngine

// The returned object specifies a specific weapon & engine

public class UFOBossShipFactory implements ShipFactory {

    // Defines the weapon object to associate with the ship

    public Weapon addGun() {
        return new UFOBossGun(); // Specific to Boss UFO
    }

    // Defines the engine object to associate with the ship

    public Engine addEngine() {
        return new UFOBossEngine(); // Specific to Boss UFO
    }

}