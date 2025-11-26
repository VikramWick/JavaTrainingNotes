package com.advance;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  // Automatically creates Getters, Setters, toString, equals, and hashCode
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
    private int sroll;
    private String fname;
    private String lname;
    private Date dob;
    private String gender;
}
