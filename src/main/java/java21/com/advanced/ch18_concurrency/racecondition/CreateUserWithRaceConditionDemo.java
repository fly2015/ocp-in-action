/*
 * CreateUserWithRaceConditionDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch18_concurrency.racecondition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class CreateUserWithRaceConditionDemo
{
    /*
     * The username should be validation to avoid race conditions
     */
    private static final List<User> listUser = Collections.synchronizedList(new ArrayList<>());// correct one
    // private static volatile List<User> listUser = new ArrayList<User>();
    //private static final CopyOnWriteArrayList<User> listUser = new CopyOnWriteArrayList<>();
    public static void main(String[] args) throws Exception
    {
        var executor = Executors.newFixedThreadPool(10);
        List<Future<?>> listFuture = new ArrayList<Future<?>>();
        try
        {
            
            for (int i = 0; i < 10; i++)
            {
                Future< ? > submit = executor.submit(() -> {
                    try
                    {
                         addNewUser(new User("Mr.A"));
                    }
                    catch (Exception e)
                    {
                        throw new RejectedExecutionException(e.getMessage());
                    }
                });
                
                listFuture.add(submit);
            }
        }
        finally
        {
            executor.shutdown();
        }
        
        
        boolean terminated = executor.isTerminated();
        while(!terminated)
        {
            terminated = executor.isTerminated();
        }
        
        printName();
        
        
        
        for (Future<?> future : listFuture)
        {
            try
            {
                future.get();
            }
            catch (Exception e2)
            {
                throw e2;
            }
            
        }
        
    }

    private static void addNewUser(User user) throws Exception
    {
        synchronized (CreateUserWithRaceConditionDemo.class)
        {
            if(listUser.contains(user))
            {
               // System.out.println(Thread.currentThread().getName() + " - user already exist.");
                throw new Exception("Username already exist.");
            }
        }
        
        listUser.add(user);
    }
    
    private static void printName()
    {
        listUser.forEach(System.out::println);
    }
}

record User(String userName) {}

/*
 * Changes:
 * $Log: $
 */