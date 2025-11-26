package com.advance;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnector {
    public static Connection co=null;
    public static Connection getConnection() throws Exception{
        //Singleton Design Pattern
        if(co==null){
            Class.forName("com.mysql.cj.jdbc.Driver");
            co=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","root@39");
        }
        return co;
    }
    
}
