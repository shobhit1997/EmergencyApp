package com.example.dell.emergency;

/**
 * Created by DELL on 11/12/2017.
 */

public class User {

    String name, gender, nationality, religion, dob, marital, address, relativeName, email;
    int age;
    long mob_no;

    public User(String name, String gender, String nationality, String religion, String dob, String marital, String address, String relativeName, String email, int age, long mob_no) {
        this.name = name;
        this.gender = gender;
        this.nationality = nationality;
        this.religion = religion;
        this.marital = marital;
        this.address = address;
        this.relativeName = relativeName;
        this.email = email;
        this.age = age;
        this.dob = dob;
        this.mob_no = mob_no;
    }

    public int getAge() {
        return age;
    }

    public long getMob_no() {
        return mob_no;
    }

    public String getAddress() {
        return address;
    }

    public String getDob() {
        return dob;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getMarital() {
        return marital;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public String getRelativeName() {
        return relativeName;
    }

    public String getReligion() {
        return religion;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMarital(String marital) {
        this.marital = marital;
    }

    public void setMob_no(long mob_no) {
        this.mob_no = mob_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setRelativeName(String relativeName) {
        this.relativeName = relativeName;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }
}

