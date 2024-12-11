package jd_computers_and_applications.User_Management.Data;

import jakarta.persistence.*;

@Entity
@Table(name = "usertype")
public class UserTypeDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserType_ID")
    private int userTypeID;

    @Column(name = "UserType_Name")
    private String userTypeName;

    public int getUserTypeID() {
        return userTypeID;
    }

    public void setUserTypeID(int userTypeID) {
        this.userTypeID = userTypeID;
    }

    public String getUserTypeName() {
        return userTypeName;
    }

    public void setUserTypeName(String userTypeName) {
        this.userTypeName = userTypeName;
    }
}
