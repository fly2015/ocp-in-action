/*
 * RepeatableDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch13_anotation;

import java.lang.annotation.Repeatable;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class RepeatableDemo
{

}


class Zoo
{
    public static class Monkey
    {
    }

    @Risk(danger = "Silly")
    @Risk(danger = "Aggressive", level = 5)
    @Risk(danger = "Violent", level = 10)
    private Monkey monkey;
}

@interface Risks {
    Risk[] value();
}


@Repeatable(Risks.class)
@interface Risk
{
    String danger();
    int level() default 1;
}
/*
 * Changes:
 * $Log: $
 */