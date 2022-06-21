/*
 * SQLInjectionDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch22_sercurity;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class SQLInjectionDemo
{
    public int getOpening(Connection conn, String day) throws SQLException
    {
        String sql = "SELECT opens FROM hours WHERE day = '" + day + "'";
        try (var stmt = conn.createStatement(); var rs = stmt.executeQuery(sql))
        {
            if (rs.next())
                return rs.getInt("opens");
        }
        return -1;
    }
    
    public static void main(String[] args) throws SQLException
    {
        Connection conn = null;
        int evil = new SQLInjectionDemo().getOpening(conn,"monday' OR day IS NOT NULL OR day = 'sunday"); // 9
    }
}


/*
 * Changes:
 * $Log: $
 */