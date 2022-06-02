/*
 * CombineShorthandNatations.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch13_anotation;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
@interface Rhythm
{
    String[] value();
}


class CombineShorthandNatations
{
    @Rhythm(value={"Swing"}) 
    String favorite;
    @Rhythm(value="R&B") 
    String secondFavorite;
    @Rhythm({"Classical"}) 
    String mostDisliked;
    @Rhythm("Country")
    String lastDisliked;
}



/*
 * Changes:
 * $Log: $
 */