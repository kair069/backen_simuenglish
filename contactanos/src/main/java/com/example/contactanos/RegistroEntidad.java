package com.example.contactanos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RegistroEntidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Name;

    private String EmailAdress;

    private String PhoneNumber;

    private String BirthDate;

    private String Gender;

    private String Address;

    public RegistroEntidad(String name, String emailAdress, String phoneNumber, String birthDate, String gender, String address) {
        Name = name;
        EmailAdress = emailAdress;
        PhoneNumber = phoneNumber;
        BirthDate = birthDate;
        Gender = gender;
        Address = address;
    }

    public RegistroEntidad() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmailAdress() {
        return EmailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        EmailAdress = emailAdress;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String birthDate) {
        BirthDate = birthDate;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
