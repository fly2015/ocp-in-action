/*
 * CompletableFutureDemo2.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch18_concurency.completable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;


/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class CompletableFutureDemo2
{
    public static void main(String[] args) throws Throwable
    {
        // Initialize handling of DataSource information handling
        //Set<DataSource> allChildDataSources = new HashSet<DataSource>();
        Set<Boolean> childHasAlreadyMoreThanOneDataSources = ConcurrentHashMap.newKeySet();
        // Initialize handling of transaction log quantity relevance
        boolean isTransactionLogQuantityRelevant = false;
        
        List<String> strs = new ArrayList<>();
        strs.add("1");
        strs.add("3");
        strs.add("4");
        strs.add("5");
        strs.add("6");
        strs.add("7");
        
        ExecutorService executor = Executors.newFixedThreadPool(2);
        List<CompletableFuture<String>> collect = strs.stream().map(s ->
        {
            return CompletableFuture.supplyAsync( () -> 
            {
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

        }).collect(Collectors.toList());
        
        try
        {
            collect.stream().map(CompletableFuture::join).filter(Objects::nonNull).map(o ->{
                childHasAlreadyMoreThanOneDataSources.add(Boolean.TRUE);
                return null;
            });
        }
        catch (CompletionException e)
        {
            String mess = "ERRs";
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
        if (s.equals("1"))
        {
            throw new ValidationException("InValid Value");
        }
        return s;
    }
}



/*
 * Changes:
 * $Log: $
 */