/*
 * Person.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch14_generic_and_collection.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class Person implements Comparable<Person>
{
    private int id;
    private String name;
    
    
    public Person(int id, String name)
    {
        super();
        this.id = id;
        this.name = name;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    

    public static void main(String[] args)
    {
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person(5, "Duy"));
        personList.add(new Person(2, "Hien"));
        personList.add(new Person(3, "Vuong"));
        
        Comparator<Person> c = Comparator.comparingDouble(p -> p.getId()/1.5);
        Collections.sort(personList, c);

        personList.forEach((o) -> System.out.println(o.getId() + "-" + o.getName()));
        
        
        Set<Person> personTreeSet = new TreeSet<>();
        personTreeSet.add(new Person(5, "Duy"));
        // personTreeSet.add(null);
        
        TreeMap<Integer, Person> pTreeMap = new TreeMap<>();
        pTreeMap.put(1, null);
        pTreeMap.put(null, null);
        
        LinkedHashSet<Person> linkedHashSet = new LinkedHashSet<>();

    }
    /**
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(Person o)
    {
        return Integer.compare(this.id, o.id);
    }
}



/*
 * Changes:
 * $Log: $
 */