package com.jon.workshop1.model;

public class Student {
    private Integer id;
    private String firstName;
    private String lastName;
    private Long birthDate;
    private String dob;
    private String email;
    private String address;

    public Student() {
        
    }

    

    public Student(Integer id, String firstName, String lastName, Long birthDate, String email,
            String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
        this.address = address;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Long getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Long birthDate) {
        this.birthDate = birthDate;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
