package jd_computers_and_applications.User_Management.Data;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "user")
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "User_ID")
    private int User_ID;

    @Column(name = "User_Name")
    private String User_Name;

    @Column(name = "Password")
    private String Password;

    @Column(name = "Name_With_Initials")
    private String Name_With_Initials;

    @Column(name = "First_Name")
    private String First_Name;

    @Column(name = "Last_Name")
    private String Last_Name;

    @Column(name = "Address")
    private String Address;

    @Column(name = "Email")
    private String Email;

    @Column(name = "Created_At")
    private Date Created_At;

    @Column(name = "NIC")
    private String NIC;

    @Column(name = "phone")
    private Integer phone;

    @Column(name = "DOB")
    private Date DOB;

    @Column(name = "Available_Process")
    private int Available_Process;

    @Column(name = "Biometric_Authentication")
    private String Biometric_Authentication;

    @Column(name = "UserType_ID")
    private int UserType_ID;

    public int getUser_ID() {
        return User_ID;
    }

    public void setUser_ID(int user_ID) {
        User_ID = user_ID;
    }

    public String getUser_Name() {
        return User_Name;
    }

    public void setUser_Name(String user_Name) {
        User_Name = user_Name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getName_With_Initials() {
        return Name_With_Initials;
    }

    public void setName_With_Initials(String name_With_Initials) {
        Name_With_Initials = name_With_Initials;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Date getCreated_At() {
        return Created_At;
    }

    public void setCreated_At(Date created_At) {
        Created_At = created_At;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public int getAvailable_Process() {
        return Available_Process;
    }

    public void setAvailable_Process(int available_Process) {
        Available_Process = available_Process;
    }

    public String getBiometric_Authentication() {
        return Biometric_Authentication;
    }

    public void setBiometric_Authentication(String biometric_Authentication) {
        Biometric_Authentication = biometric_Authentication;
    }

    public int getUserType_ID() {
        return UserType_ID;
    }

    public void setUserType_ID(int userType_ID) {
        UserType_ID = userType_ID;
    }
}
