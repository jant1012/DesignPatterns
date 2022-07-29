package com.janchondo.creationalPatterns.singleton;

public class SingletonDatabase {
    private String databaseName;
    private static SingletonDatabase database;

    private SingletonDatabase(String databaseName){
        this.databaseName = databaseName;
    }

    public static SingletonDatabase getSingletonInstance(String databaseName){
        if(database == null){
            database = new SingletonDatabase(databaseName);
        }
        return database;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void getConnection() {
        System.out.println("You are now connected using: " + databaseName);
    }
}
