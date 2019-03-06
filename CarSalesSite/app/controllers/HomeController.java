package controllers;

import play.mvc.*;
import models.Product;

import play.db.ebean.Transactional;

import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import play.data.*;
import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    private FormFactory formFactory;

    @Inject
    public HomeController(FormFactory f){
        this.formFactory = f;
    }

    public Result index() {
        return ok(index.render());
    }

    public Result products(){
        List<Product> productList = Product.find.all();
        return ok(products.render(productList));
    }

    public Result addProduct(){
        Form<Product> productForm = formFactory.form(Product.class);
        return ok(addProduct.render(productForm));
    }

    public Result addProductSubmit(){
        Form<Product> newProductForm = formFactory.form(Product.class).bindFromRequest();

        if (newProductForm.hasErrors()){
            return badRequest(addProduct.render(newProductForm));
        } else {
            Product newProduct = newProductForm.get();
            if (newProduct.getId() == null){
                newProduct.save();
            } else {
                newProduct.update();
            }
            newProduct.save();
            flash("success", "Product " + newProduct.getMake() + " " + newProduct.getModel() + " was added/updated.");
            return redirect(controllers.routes.HomeController.products());
        }
    }

    public Result deleteProduct(Long id){
        Product.find.ref(id).delete();
        flash("success", "Product has been deleted.");
        return redirect(controllers.routes.HomeController.products());
    }

    public Result updateProduct(Long id){
        Product p;
        Form<Product> productForm;
    
        try{
            p = Product.find.byId(id);
            productForm = formFactory.form(Product.class).fill(p);
        } catch (Exception ex){
            return badRequest("error");
        }

        return ok(addProduct.render(productForm));
    }

    public Result contactUs(){
        return ok(contactUs.render()); 
    }



}
