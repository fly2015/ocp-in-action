/*
 * LambdaTester.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch15_functional.lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class LambdaTester
{
    public static void main(String[] args)
    {
        String abc = "HienNguyen";
        Predicate<String> predicate = a -> {return a.length() > 0;};
        boolean test = predicate.test(abc);
        System.out.println(test);
        
        Comparator<String> comparator = (String s3, String s4) -> {return s3.compareTo(s4);};
        System.out.println(comparator.compare("12344", "abc"));

    }
}



/*
 * Changes:
 * $Log: $
 */