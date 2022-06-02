/*
 * EnumImplementAbstractMethod.java
 *
 * Copyright by CRIF AG
 * Z�rich
 * All rights reserved.
 */
package java21.com.advanced.ch12_fundamentals.enums;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class EnumImplementAbstractMethod
{
    public enum Season
    {
     WINTER
     {
         public String getHours()
         {
             return "10am-3pm";
         }
     },
     SPRING
     {
         public String getHours()
         {
             return "9am-5pm";
         }
     },
     SUMMER
     {
         public String getHours()
         {
             return "9am-7pm";
         }
     },
     FALL
     {
         public String getHours()
         {
             return "9am-5pm";
         }
     };

        public abstract String getHours();
    }
    
    
    public enum Season1
    {
     WINTER
     {
         public String getHours()
         {
             return "10am-3pm";
         }
     },
     SUMMER
     {
         public String getHours()
         {
             return "9am-7pm";
         }
     },
     SPRING,
     FALL;

        
        public String getHours() // default implementation
        {
            return "9am-5pm";
        }
    }
    
    public static void main(String[] args)
    {
        System.out.println(Season.SUMMER.getHours());
    }
}



/*
 * Changes:
 * $Log: $
 */