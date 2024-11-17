package com.jon.workshop1.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jon.workshop1.model.Student;

@Controller
@RequestMapping("/students")
public class StudentController {

    List<Student> studentList;

    @ResponseBody
    @GetMapping("")
    public List<Student> getStudentList() throws ParseException {
        studentList = new ArrayList<>();
        
        //convert a date string to epoch (Long)
        String dob = "18 Dec 1975 10:25:00.000 SGT";
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy HH:mm:ss.SSS zzz");
        Date dDob = sdf.parse(dob);
        Long epochDob = dDob.getTime();

        Student s1 = new Student(1, "Damien", "Cumming", epochDob, "damient@nus.edu.sg", "25 HMKT 119615");
        studentList.add(s1);

        Student s2 = new Student(1, "Darryl", "Ng", epochDob, "darrylng@nus.edu.sg", "25 HMKT 119615");
        studentList.add(s2);

        Student s3 = new Student(1, "Brandon", "Ng", epochDob, "bradonng@nus.edu.sg", "25 HMKT 119615");
        studentList.add(s3);

        //convert epoch Long to Date
        Long epochTime = 188103300000L;
        Date dTime = new Date(epochTime);
        String formattedTime = sdf.format(dTime);
        System.out.println(formattedTime);

        return studentList;

    }

    
}
