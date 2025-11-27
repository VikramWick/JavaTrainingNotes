package com.datefunction;

public class FestivalMain {

    public static void main(String[] args) {
        Festival f1=new Festival();

        try{
            f1.setData("2025-03-31");
            f1.ramCal();
            f1.setData("2025-10-20");
            f1.diwaliCal();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
