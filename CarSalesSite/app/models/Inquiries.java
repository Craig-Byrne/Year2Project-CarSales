package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Inquiries extends Model {

    @Id
    private Long id;

    private String fullName;

    private String email;

    private String phoneNumber;

    private String inquiry;

    public Inquiries(Long id, String fullName, String email, String phoneNumber, String inquiry) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.inquiry = inquiry;
    }

    public static Finder<Long,Inquiries> find = new Finder<>(Inquiries.class);

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getInquiry() {
        return inquiry;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setInquiry(String inquiry) {
        this.inquiry = inquiry;
    }
}
