package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Reviews extends Model {

    @Id
    private Long id;

    private String fullName;

    private String email;
    
    private String review;

    public Reviews(Long id, String fullName, String email, String review) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.review = review;
    }

    public static Finder<Long,Reviews> find = new Finder<>(Reviews.class);

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getReview() {
        return review;
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

    public void setReview(String review) {
        this.review = review;
    }    
} 