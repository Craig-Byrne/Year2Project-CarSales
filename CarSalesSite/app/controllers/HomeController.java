package controllers;

import play.mvc.*;
import models.Product;
import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render());
    }

    public Result products(){

        Product p = new Product(1L,"Volkswagen","Polo",2012,"Petrol",7750,"Red");
        Product p2 = new Product(2L,"Opel","Corsa",2010,"Petrol",6450,"Black");
        Product p3 = new Product(3L,"Renault","Clio",2014,"Petrol",8800,"Silver");
        Product p4 = new Product(4L,"Ford","Ka",2010,"Petrol",3000,"Silver");
        Product p5 = new Product(5L,"Ford","Fiesta",2013,"Petrol",6700,"Silver");

        return ok(products.render(p)); 
    }

    public Result contactUs(){
        return ok(contactUs.render()); 
    }



}
