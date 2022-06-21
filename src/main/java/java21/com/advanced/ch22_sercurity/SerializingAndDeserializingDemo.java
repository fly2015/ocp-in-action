/*
 * SerializingAndDeserializingDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch22_sercurity;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class SerializingAndDeserializingDemo
{

}


class Employee implements Serializable
{
    private String name;
    private int age;
    private String ssn;
    // Constructors/getters/setters
    
    private static final ObjectStreamField[] serialPersistentFields = {new ObjectStreamField("name", String.class), new ObjectStreamField("ssn", String.class)};
    
    private Employee()
    {
    }

    private static Map<String, Employee> pool = new ConcurrentHashMap<>();

    public synchronized static Employee getEmployee(String name)
    {
        if (pool.get(name) == null)
        {
            var e = new Employee();
            e.name = name;
            pool.put(name, e);
        }
        return pool.get(name);
    }


    private static String encrypt(String input)
    {
        return input;
        // Implementation omitted
    }


    private static String decrypt(String input)
    {
        return input;
        // Implementation omitted
    }
     

    private void writeObject(ObjectOutputStream s) throws Exception
    {
        ObjectOutputStream.PutField fields = s.putFields();
        fields.put("name", name);
        fields.put("ssn", encrypt(ssn));
        s.writeFields();
    }


    private void readObject(ObjectInputStream s) throws Exception
    {
        ObjectInputStream.GetField fields = s.readFields();
        this.name = (String)fields.get("name", null);
        this.ssn = decrypt((String)fields.get("ssn", null));
    }
    

    public synchronized Object readResolve() throws ObjectStreamException
    {
        var existingEmployee = pool.get(name);
        if (pool.get(name) == null)
        {
            // New employee not in memory
            pool.put(name, this);
            return this;
        }
        else
        {
            // Existing user already in memory
            existingEmployee.name = this.name;
            existingEmployee.ssn = this.ssn;
            return existingEmployee;
        }
    }
    

    public Object writeReplace() throws ObjectStreamException
    {
        var e = pool.get(name);
        return e != null ? e : this;
    }
}

/*
 * Changes:
 * $Log: $
 */