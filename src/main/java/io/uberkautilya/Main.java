package io.uberkautilya;

public class Main {

    public static void main(String[] args) {

        // EnemyShipBuilding handles orders for new EnemyShips
        // You send it a code using the orderTheShip method &
        // it sends the order to the right factory for creation

        ShipMaker shipMaker = new UFOShipMaker();

        Ship theGrunt = shipMaker.orderShip("UFO");
        System.out.println(theGrunt + "\n");

        Ship theBoss = shipMaker.orderShip("UFO BOSS");
        System.out.println(theBoss + "\n");

    }

}