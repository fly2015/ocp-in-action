/*
 * Tricky.java
 *
 * All rights reserved.
 */
package java21.com.hng;

import java.security.AlgorithmParameters;
import java.security.SecureRandom;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

import java21.com.inheritance.Parent;


/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class Tester extends Parent
{
    {
        
    }
    public Tester()
    {
        
    }
    
    public Tester(int i)
    {
        
    }
    
    public static int i = 0;
    
    public static void setI(int i)
    {
        Tester.i = i;
    }
    
    public void getI()
    {
        i =10;
        setI(10);
        return;
    }
    public static void main(String[] args) throws Exception
    {
        System.out.println("Print Something !!!");
        
        StringBuilder builder = new StringBuilder("teams");
        System.out.println(builder.delete(2, 4));
        
        String string = "bidText.RIGHT_TO_VOTE_MAJORITY";
       // System.out.println(string.indexOf("bidText.RIGHT_TO_VOTE_"));
        System.out.println("bidText.RIGHT_TO_VOTE_".length());
        System.out.println(string.substring("bidText.RIGHT_TO_VOTE_".length(), string.length()));
        //
        // Tricky a = new Tricky();
        // System.out.println(a.encryptToken("aaaaaaaa", "123"));
        
        Tester tester = new Tester();
        Tester.setI(10);
        
        for (int i = 0; i<10 ; i++)
        {
            System.out.println(i);
        }
        
        LocalDate localDate = LocalDate.of(2021, 06, 15);
        Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant()); 
        
        System.out.println(date);
        
    }
    
  
    public String setI(String i) {
        return i;
        
    }

    /**
     * @see java21.com.inheritance.Parent#check()
     */
    @Override
    protected void check()
    {
        // TODO Auto-generated method stub
        
    }

    /**
     * @see java21.com.inheritance.Parent#check1()
     */
    @Override
    protected void check1()
    {
        // TODO Auto-generated method stub
        
    }
}



/*
 * Changes:
 * $Log: $
 */