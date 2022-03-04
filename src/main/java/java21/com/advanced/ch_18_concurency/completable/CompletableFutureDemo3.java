/*
 * CompletableFutureDemo1.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch_18_concurency.completable;

import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class CompletableFutureDemo3
{
    public static void main(String[] args) throws Throwable
    {
        List<String> strs = new ArrayList<>();
        strs.add("1");
        strs.add("3");
        strs.add("4");
        strs.add("5");
        strs.add("6");
        strs.add("71");
        
        ExecutorService executor = Executors.newFixedThreadPool(2);
        List<CompletableFuture<String>> collect = strs.stream().map(s ->
        {
            try
            {
                if(s.length() <= 1)
                {
                    return CompletableFuture.supplyAsync( () -> {
                        try
                        {
                            return manipulate(s);
                        }
                        catch (ValidationException e)
                        {
                            System.out.println(e.getMessage());
                            throw new CompletionException(e);
                        }
                    }, executor);
                }
            }
            finally
            {
                System.out.println("Always get executed!");
            }
            
            return null;
        }).collect(Collectors.toList());
        
        try
        {
            collect.stream().filter(Objects::nonNull).map(CompletableFuture::join).forEach(System.out::println);
        }
        catch (CompletionException e)
        {
            String mess = "ERR";
            if (e.getCause() != null)
            {
                try
                {
                    throw e.getCause();
                }
                catch (ValidationException e1)
                {
                    throw e1;
                }
            }
            else
            {
                throw new Exception(mess, e);
            }
        }
        finally
        {
            if (!executor.isShutdown())
            {
                executor.shutdown();
            }
        }
        
        
        System.out.println("DONE");
    }


    private static String manipulate(String s) throws ValidationException
    {
        return s;
    }
}



/*
 * Changes:
 * $Log: $
 */