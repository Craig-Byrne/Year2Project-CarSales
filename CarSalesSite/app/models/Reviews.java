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

    private int rating;
    
    private String comment;


    public Reviews(Long id, String fullName, int rating, String comment) {
        this.id = id;
        this.fullName = fullName;
        this.rating = rating;
        this.comment = comment;
    }

    public static Finder<Long,Reviews> find = new Finder<>(Reviews.class);

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }    
} 