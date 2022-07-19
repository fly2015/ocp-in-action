/*
 * ToyExchangeDeadLockDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch18_concurrency.liveness.deadlock;

import java.util.concurrent.Executors;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ToyExchangeDeadLockDemo
{
    /*
     * Two babies are playing toys, the first one plays train and the second play car, neither baby likes to share.
     * After a while, they want to exchange the toys, but no one would like to give their toy first.
     * Finally, they wait each others to find one will give toy first and could not exchange toys forever.
     */
    
    private static final Car car = new Car();
    private static final Train train = new Train();
    
    public static void main(String[] args)
    {
        var executor = Executors.newFixedThreadPool(5);
        
        try
        {  
              Baby baby1 = new Baby("Baby1");
              Baby baby2 = new Baby("Baby2");
              executor.submit(() -> {
                  baby1.exchangeCarGetTrain(car, train);
                  });
              executor.submit(() -> baby2.exchangeTrainGetCar(train, car));
        }
        finally
        {
            executor.shutdown();
        }
        
        boolean terminated = executor.isTerminated();
        while(!terminated)
        {
            terminated = executor.isTerminated();
            System.out.println("Trying to exchang toys.");
            try
            {
                Thread.sleep(3000);
            }
            catch (InterruptedException e)
            {
                System.out.println("Interrupted.");
            }
        }
        System.out.println("Exchanged done");
    }
}

class Baby
{
    private final String name;
    public Baby(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }


    private void getCar(Car car)
    {
        System.out.println(Thread.currentThread().getName() + " - The baby " + this.name + " is holding the Car");
    }
    
    
    private void getTrain(Train train)
    {
        System.out.println(Thread.currentThread().getName() + " - The baby " + this.name + " is holding the Train");
    }
    
    void exchangeCarGetTrain(Car car, Train train)
    {
        synchronized (car)
        {
            this.getCar(car);
            System.out.println(Thread.currentThread().getName() + " - The baby " + this.name + " is trying getting Train");
            synchronized (train)
            {
                this.getTrain(train);
            }
        }
        System.out.println("Exchanged Car get Train");
    }
    
    void exchangeTrainGetCar(Train train, Car car)
    {
        synchronized (train)
        {
            this.getTrain(train);
            System.out.println(Thread.currentThread().getName() + " - The baby " + this.name + " is trying getting Car");
            synchronized (car)
            {
                this.getCar(car);
            }
        }
        System.out.println("Exchanged Train get Car");
    }
}


class Car
{
}

class Train
{
}



/*
 * Changes:
 * $Log: $
 */