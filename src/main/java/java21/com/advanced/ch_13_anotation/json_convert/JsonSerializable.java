/*
 * JsonSerializable.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch_13_anotation.json_convert;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static java.lang.annotation.ElementType.TYPE;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
@Retention(RUNTIME)
@Target(TYPE)
public @interface JsonSerializable
{

}



/*
 * Changes:
 * $Log: $
 */