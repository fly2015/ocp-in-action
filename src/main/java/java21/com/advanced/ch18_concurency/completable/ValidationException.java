/*
 * ValidationException.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch18_concurency.completable;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ValidationException extends Exception
{
    /** serialVersionUID */
    private static final long serialVersionUID = 1L;
    public ValidationException (String msg)
    {
        super(msg);
    }
}



/*
 * Changes:
 * $Log: $
 */