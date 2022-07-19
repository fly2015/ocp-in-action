/*
 * SealedClassDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.jse17.sealedclass;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public sealed class SealedClassDemo //Can omit the "permits" if sealed parent class and its direct sub are in the same java file
{
    public static void main(String[] args)
    {
        Bear bear1 = new BearKid(); //transitive permit
        Bear bear2 = new UnknownBear(); // a sealed class still open for non-sealed class
    }
}

final class SubSealedClassDemo extends SealedClassDemo{}

// Parent
sealed class Bear permits Kodiak, Panda, UnclassifiedBear{} // A Sealed MUST declare permitted class

// Sub MUST BE extend sealed Parent
final class Panda extends Bear{}
non-sealed class UnclassifiedBear extends Bear{} // No need to specified permitted class in declaration and open for extend furthers
sealed class Kodiak extends Bear permits BearKid{} // A Sealed MUST declare permitted class, open for expand sealed
final class BearKid extends Kodiak{}

class UnknownBear extends UnclassifiedBear{}

/*
 * Changes:
 * $Log: $
 */