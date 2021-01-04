package models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    private String name = "Janis";
    private String lastname = "Ozols";
    private String password = "TestParole1";
    private String phoneNumber = "22222222";
    private String email = generateTestEmail();

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNameAndLastnameInOneString(){
        return name + " " + lastname;
    }

    public String getPassword() {return password;}

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    String generateTestEmail(){
        SimpleDateFormat formatter= new SimpleDateFormat("yyyyMMdd_HHmmss");
        Date date = new Date(System.currentTimeMillis());
        return "test" + formatter.format(date) + "@test.lv";
    }
}
