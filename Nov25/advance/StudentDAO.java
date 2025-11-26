package com.advance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    private ResultSet performquery(String query){
        return null;
    }

    public List<StudentDTO> getallstudents()throws Exception{
        Connection con=Dbconnector.getConnection();
        PreparedStatement ps=con.prepareStatement("select * from student");
        ResultSet rs=ps.executeQuery(); //points to beginning of file
        //Object Relation Mapping
        List<StudentDTO> li=new ArrayList<StudentDTO>();
        List<StudentDTO> result = new ArrayList<>();
		while(rs.next()) {
			result.add(new StudentDTO(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDate(4),rs.getString(5)));
		}
		return result;
    }

    public StudentDTO getbyId(StudentDTO ob)throws Exception{
        Connection con=Dbconnector.getConnection();
        PreparedStatement ps=con.prepareStatement("select * from student where sroll=?");
        ps.setInt(1, ob.getSroll());
        ResultSet rs=ps.executeQuery();
        if(rs.next()){
            ob.setFname(rs.getString("fname"));
            ob.setLname(rs.getString("lname"));
        }
        else{
            throw new Exception("sroll "+ob.getSroll()+" does not exist");
        }
        return ob;
    }

    public String deletebyId(StudentDTO ob)throws Exception{
        Connection con=Dbconnector.getConnection();
        PreparedStatement ps=con.prepareStatement("delete from student where sroll=?");
        ps.setInt(1, ob.getSroll());
        int count=ps.executeUpdate();
        if(count>0){
            return "Deleted Successfully";
        }
        else{
            return "Id not found";
        }
    }

    public String insertStudent(StudentDTO ob) throws Exception {
        Connection con = Dbconnector.getConnection();
        // Assuming table columns are: sroll, fname, lname, dob, gender
        PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?,?)");
        
        ps.setInt(1, ob.getSroll());
        ps.setString(2, ob.getFname());
        ps.setString(3, ob.getLname());
        ps.setDate(4, ob.getDob());
        ps.setString(5, ob.getGender());
        
        int count = ps.executeUpdate();
        
        if (count > 0) {
            return "Inserted Successfully";
        } else {
            return "Insertion Failed";
        }
}}
