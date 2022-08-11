package com.janchondo;

import com.janchondo.behavioralPatterns.observer.*;
import com.janchondo.behavioralPatterns.state.*;
import com.janchondo.creationalPatterns.prototype.Car;
import com.janchondo.creationalPatterns.prototype.ModifiedCar;
import com.janchondo.creationalPatterns.singleton.SingletonDatabase;
import com.janchondo.structuralPatterns.decorator.*;
import com.janchondo.structuralPatterns.facade.CheckFacade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws CloneNotSupportedException {
        int option;
        int designOption;
        int structuralOption;
        int behavioralOption;
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
                                client.search("10/05/2021","10:00",
                                        "9:00","Chihuahua","Cuauhtemoc");
                                break;
                            case 2:
                                CarInterface nitro = new Nitro(new BasicCar());
                                System.out.println(nitro.assemble());
                                System.out.println("");
                                CarInterface wheels = new Nitro(new Wheels(new BasicCar()));
                                System.out.println(wheels.assemble());
                                System.out.println("");
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
                    do {
                        System.out.println("-------------------");
                        System.out.println("Select an option: ");
                        System.out.println("1.- State");
                        System.out.println("2.- Observer");
                        System.out.println("3.- Exit");
                        behavioralOption = scan.nextInt();

                        switch (behavioralOption){
                            case 1:
                                ComputerContext computerState = new ComputerContext(new Sleeping());
                                System.out.println(computerState.getState());

                                computerState.setComputerState(new Running());
                                System.out.println(computerState.getState());

                                computerState.setComputerState(new TurnedOff());
                                System.out.println(computerState.getState());
                                break;
                            case 2:
                                MessageSubscriberOne subscriberOne = new MessageSubscriberOne();
                                MessageSubscriberTwo subscriberTwo = new MessageSubscriberTwo();
                                VideoPublisher videoPublisher = new VideoPublisher();

                                videoPublisher.register(subscriberOne);
                                videoPublisher.register(subscriberTwo);

                                List<String> showList;
                                showList = videoPublisher.notifyUpdate(new Message("New Video Uploaded"));

                                for(String subscribers : showList){
                                    System.out.println(subscribers);
                                }

                                videoPublisher.unregister(subscriberOne);
                                MessageSubscriberThree subscriberThree = new MessageSubscriberThree();
                                videoPublisher.register(subscriberThree);

                                showList = videoPublisher.notifyUpdate(new Message("New Video Uploaded"));

                                for(String subscribers : showList){
                                    System.out.println(subscribers);
                                }
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("Invalid Selection " + behavioralOption);
                                break;
                        }
                    }while(behavioralOption != 3);
                    break;
                case 4:
                    System.out.println("Exit...");
            }
        }while(designOption != 4);

    }
}
