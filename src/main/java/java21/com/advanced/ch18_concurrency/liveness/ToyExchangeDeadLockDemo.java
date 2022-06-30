/*
 * ToyExchangeDeadLockDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch18_concurrency.liveness;

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
     * Finally, they wait each others to find one will give toy first forever and could not exchange toy.
     */
    
    
    public static void main(String[] args)
    {
        var executor = Executors.newFixedThreadPool(1);
        
        try
        {  
           ToyExchangeDeadLockDemo toyExchangeDeadLockDemo = new ToyExchangeDeadLockDemo(); 
          // executor.submit(() -> toyExchangeDeadLockDemo.getToy("Baby1", car, train));
          // executor.submit(() -> toyExchangeDeadLockDemo.getToy("Baby2", car, train));
        }
        finally
        {
            executor.isShutdown();
        }
        
        System.out.println(executor.isTerminated());
    }
}

class Baby
{
    Toy toy = new Toy();
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    Toy getToy()
    {
        return toy.getCar();
    }
}

class Toy
{
    Toy car = new Car();
    Toy train = new Train();
    
    Toy getCar()
    {
        synchronized (car)
        {
            return car;
        }
    }
    
    Toy getTrain()
    {
        synchronized (train)
        {
            return train;
        }
    }
}

class Car extends Toy
{
}

class Train extends Toy
{
   
}



/*
 * Changes:
 * $Log: $
 */