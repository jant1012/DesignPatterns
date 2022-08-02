package com.janchondo;

import com.janchondo.creationalPatterns.prototype.Car;
import com.janchondo.creationalPatterns.prototype.ModifiedCar;
import com.janchondo.creationalPatterns.singleton.SingletonDatabase;
import com.janchondo.structuralPatterns.facade.CheckFacade;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws CloneNotSupportedException {
        int option;
        int designOption;
        int structuralOption;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("-------------------");
            System.out.println("1.- Creational Patterns");
            System.out.println("2.- Structural Patterns");
            System.out.println("3.- Behavioral Patterns");
            System.out.println("4.- Exit");
            designOption = scan.nextInt();

            switch(designOption) {
                case 1:
                    do {
                        System.out.println("-------------------");
                        System.out.println("Select an option: ");
                        System.out.println("1.- Singleton");
                        System.out.println("2.- Prototype");
                        System.out.println("3.- Exit");
                        option = scan.nextInt();

                        switch (option) {
                            case 1:
                                SingletonDatabase connection = SingletonDatabase.
                                        getSingletonInstance("Oracle");
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
                                break;
                            default:
                                System.out.println("Invalid Selection " + option);
                                break;
                        }


                    } while (option != 3);
                    break;
                case 2:
                    do{
                        System.out.println("-------------------");
                        System.out.println("Select an option: ");
                        System.out.println("1.- Facade");
                        System.out.println("2.- Decorator");
                        System.out.println("3.- Exit");
                        structuralOption = scan.nextInt();

                        switch (structuralOption){
                            case 1:
                                CheckFacade client = new CheckFacade();
                                client.search("10/05/2022","10:00","Chihuahua","Cuauhtemoc");
                                break;
                            case 2:
                                System.out.println("decorator");
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("Invalid Selection " + structuralOption);
                                break;
                        }
                    }while(structuralOption != 3);
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Exit...");

            }
        }while(designOption != 4);

    }
}
