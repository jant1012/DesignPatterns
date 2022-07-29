package com.janchondo.creationalPatterns;

import com.janchondo.creationalPatterns.prototype.Car;
import com.janchondo.creationalPatterns.prototype.ModifiedCar;
import com.janchondo.creationalPatterns.singleton.SingletonDatabase;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws CloneNotSupportedException {
        int option;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("-------------------");
            System.out.println("Select an option: ");
            System.out.println("1.- Singleton");
            System.out.println("2.- Prototype");
            System.out.println("3.- Exit");
            option = scan.nextInt();

            switch(option) {
                case 1:
                    SingletonDatabase connection = SingletonDatabase.getSingletonInstance("Oracle");
                    connection.getConnection();
                    break;
                case 2:
                    Car car = new ModifiedCar();
                    car.setColor("Blue");
                    car.setBrand("Chevrolet");
                    System.out.println("The current car is:");
                    System.out.println(car.showCar());

                    Car carCloned = car.clone();
                    carCloned.setColor("Red");
                    carCloned.setBrand("Audi");
                    System.out.println("The cloned car is:");
                    System.out.println(carCloned.showCar());
                    break;
                case 3:
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Invalid Selection " + option);
                    break;
            }


        }while(option != 3);
    }
}
