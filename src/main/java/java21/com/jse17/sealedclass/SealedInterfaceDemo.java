/*
 * SealedInterfaceDemo.java
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
public class SealedInterfaceDemo
{

}

// Sealed interface
sealed interface Swims permits Duck, Swan, Floats {}
sealed interface Swims1 permits Duck {}
// Classes permitted to implement sealed interface
final class Duck implements Swims, Swims1 {}
final class Swan implements Swims {}
// Interface permitted to extend sealed interface
non-sealed interface Floats extends Swims {}

/*
 * Changes:
 * $Log: $
 */