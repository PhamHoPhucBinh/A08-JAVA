package _my_CaseStudy.person;

import _06_Inheritence.pratices.shape_circle_rectangle.Resizable;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Person implements Serializable {
    String name;
    String dayOfBirth;
    String gender;
    int idNumber;
    long contact;
    String email;

    public Person(String name, String dayOfBirth, String gender, int idNumber, long contact, String email) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.idNumber = idNumber;
        this.contact = contact;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person() {

    }
    public String toString() {
        return "\nEmployee Details :" + "\nID: " + this.idNumber + "\nName: " + this.name + "\nDayofBirth: " +
                this.dayOfBirth + "\nContact No: " + this.contact + "\nEmail: " + this.email + "\nGender: " + this.gender;
    }
}
