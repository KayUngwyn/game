/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.spacegame;

import java.util.Scanner;

/**
 *
 * @author ungwy
 */
public class SpaceGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTurns = 5;
        for(int turn = 1; turn <= numberOfTurns; turn++){
            System.out.println("Turn " + turn + ":");
            System.out.print("Enter the name of enemy 1: ");
            String enemy1 = scanner.nextLine();
            System.out.println("Enter the distance to enemy 1: ");
            double dist1 = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print("Enter the name of enemy 2: ");
            String enemy2 = scanner.nextLine();
            System.out.print("Enter the distance to enemy 2: ");
            double dist2 = scanner.nextDouble();
            scanner.nextLine();
            
            String enemyToShoot;
            if(dist1 < dist2){
                enemyToShoot = enemy1;
                
            }else{
                enemyToShoot = enemy2;
            }
            System.out.println("Shooting the closest enemy: " + enemyToShoot);
            
        }
        scanner.close();
    }
}
