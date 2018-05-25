/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nearbyelements;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cunamy
 */
public class NearbyElements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayNearby ArrayNearby = new ArrayNearby();
        Scanner reader = new Scanner(System.in);
        int x;
        int y;
        System.out.println("Enter x : ");
        while(true){   
        try {           
        x = reader.nextInt();
        break;
        } catch(InputMismatchException e){
            System.out.println("Pless enter a number");
            x = 0;
        }
    }
        System.out.println("Enter y : ");
        y = reader.nextInt();
        System.out.println("Enter range: ");
        int range = reader.nextInt();
        reader.close();
        System.out.println("___________________");
        List elementsInRange = ArrayNearby.nearby(x,y,range);
        for (int i = 0; i < elementsInRange.size(); i++)
        System.out.println(elementsInRange.get(i));
        }        
    } 

