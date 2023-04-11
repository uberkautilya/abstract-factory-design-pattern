package io.uberkautilya;

public class Main {

    public static void main(String[] args) {

        // EnemyShipBuilding handles orders for new EnemyShips
        // You send it a code using the orderTheShip method &
        // it sends the order to the right factory for creation

        EnemyShipBuilder enemyShipBuilder = new UFOEnemyShipBuilder();

        EnemyShip theGrunt = enemyShipBuilder.orderShip("UFO");
        System.out.println(theGrunt + "\n");

        EnemyShip theBoss = enemyShipBuilder.orderShip("UFO BOSS");
        System.out.println(theBoss + "\n");

    }

}