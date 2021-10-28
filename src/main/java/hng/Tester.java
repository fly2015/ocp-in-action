/*
 * Tester.java
 *
 * All rights reserved.
 */
package hng;


/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class Tester
{
    String abc;
    //int i = 1/0;
    public static void printSomething()
    {
       // System.out.println(StringUtils.isNumeric("XXXXXXXXXXX"));
       // System.out.println(abc);
    }
    
    public static void main(String[] args)
    {
        Tester t = new Tester();
        System.out.println(1/(double)3);
        double a = 1.7;
        System.out.println((int) a);
        
        String key = "A";
        switch (key)
        {
            case "A":
            case "B":   
                System.out.println("BBB");
            default:
                break;
        }
        
        printSomething();
       // java21.com.hng.Tester aa = new java21.com.hng.Tester();
    }
}



/*
 * Changes:
 * $Log: $
 */