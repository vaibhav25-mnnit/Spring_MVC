package com.vaibhav.springmvc.modal;

import java.util.List;

public class Student {
    private String firstName,lastName, favLang;
    private int age;
    private String gender;
    private List<String> systems;

    public List<String> getSystems() {
        return systems;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setSystems(List<String> systems) {
        this.systems = systems;
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

    public String getFavLang() {
        return favLang;
    }

    public void setFavLang(String favLang) {
        this.favLang = favLang;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", favLang='" + favLang + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", systems=" + systems +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
