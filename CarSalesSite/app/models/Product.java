package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Product extends Model {

    // Properties
    @Id
    private Long id;

    @Constraints.Required
    private String make;

    @Constraints.Required
    private String model;

    @Constraints.Required
    private int year;

    private String fuelType;

    @Constraints.Min(0)
    private int price;

    private String colour;

/*
@Entity
public class Product extends Model {

    // Properties

    @Id
    private Long id;  

    private String make;     

    private String model; 

    private int year;

    private String fuelType;

    @Constraints.Min(0)
    private int price;

    private String colour;

    // Default Constructor
    public Product() {     

    }
*/
    // Contructor to initialise object
    public  Product(Long id, String make, String model, int year, String fuelType, int price, String colour) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.price = price;
        this.colour = colour;
    }

    public static Finder<Long,Product> find = new Finder<>(Product.class);

    // Accessor methods
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String getFuelType() {
        return fuelType;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
}