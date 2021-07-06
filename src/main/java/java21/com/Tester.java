/*
 * Tricky.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.util.TraceClassVisitor;

import java21.com.generic.sdo.Animal;
import java21.com.generic.sdo.Dog;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class Tester
{
    public static void main(String[] args)
    {
        try {
            ClassReader reader = new ClassReader("java21.com.generic.classes.CrateTest");
            StringWriter sw = new StringWriter();
            TraceClassVisitor tcv = new TraceClassVisitor(new PrintWriter(System.out));
            reader.accept(tcv, 0);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
       
    }
}



/*
 * Changes:
 * $Log: $
 */