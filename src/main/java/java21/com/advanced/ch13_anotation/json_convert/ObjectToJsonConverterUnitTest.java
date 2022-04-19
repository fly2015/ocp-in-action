/*
 * ObjectToJsonConverterUnitTest.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch13_anotation.json_convert;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ObjectToJsonConverterUnitTest
{
    public void givenObjectNotSerializedThenExceptionThrown() throws JsonSerializationException {
        Object object = new Object();
        ObjectToJsonConverter serializer = new ObjectToJsonConverter();
        serializer.convertToJson(object);
    }

    public void givenObjectSerializedThenTrueReturned() throws JsonSerializationException {
        Person person = new Person("soufiane", "cheouati", "34");
        ObjectToJsonConverter serializer = new ObjectToJsonConverter();
        String jsonString = serializer.convertToJson(person);
        System.out.println(jsonString);
    }
    
    public static void main(String[] args)
    {
        new ObjectToJsonConverterUnitTest().givenObjectSerializedThenTrueReturned();
        new ObjectToJsonConverterUnitTest().givenObjectNotSerializedThenExceptionThrown();
    }
}



/*
 * Changes:
 * $Log: $
 */