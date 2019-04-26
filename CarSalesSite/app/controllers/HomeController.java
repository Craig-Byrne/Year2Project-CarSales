package controllers;

import play.mvc.*;
import models.Product;

import play.api.Environment;
import play.db.ebean.Transactional;

import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import play.data.*;
import views.html.*;
import models.users.*;
import models.Inquiries;
import models.Reviews;

import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;
import java.io.File;

import java.io.IOException;
import java.awt.image.*;
import javax.imageio.*;
import org.imgscalr.*;
import controllers.LoginController;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    private FormFactory formFactory;
    private Environment e;

    @Inject
    public HomeController(FormFactory f, Environment env){
        this.formFactory = f;
        this.e = env;
    }

    public Result index() {
        return ok(index.render(User.getUserById(session().get("email"))));
    }

    public Result products(){
        List<Product> productList = Product.find.all();
        return ok(products.render(productList, e, User.getUserById(session().get("email"))));
    }

    @With(AuthAdmin.class)
    public Result admin() {
        return ok(admin.render(User.getUserById(session().get("email"))));
    }

    public Result users(){
        List<User> userList = User.find.all();
        return ok(users.render(userList, e, User.getUserById(session().get("email"))));
    }

    public Result addUser(){
        Form<User> newUserForm = formFactory.form(User.class);
        return ok(addUser.render(newUserForm, User.getUserById(session().get("email"))));
    }

    @With(AuthAdmin.class)
    public Result addUserSubmit(){
            Form<User> newUserForm = formFactory.form(User.class).bindFromRequest();
            if (newUserForm.hasErrors()) {
                return badRequest(addUser.render(newUserForm, User.getUserById(session().get("email"))));
            } else {
                User newUser = newUserForm.get();
                newUser.save();
                flash("success", "User " + newUser.getName() + " was added.");
                return redirect(controllers.routes.HomeController.users());
            }
        
        }


    public Result updateUser(Long id){
        User u;
        Form<User> newUserForm;
    
        try{
            u = User.find.byId(id);
            newUserForm = formFactory.form(User.class).fill(u);
        } catch (Exception ex){
            return badRequest("error");
        }

        return ok(addUser.render(newUserForm, User.getUserById(session().get("email"))));
    }

        public Result deleteUser(Long id){
            User.find.ref(id).delete();
            flash("success", "User has been deleted.");
            return redirect(controllers.routes.HomeController.users());
        }

    @With(AuthAdmin.class)
    public Result inquiries(){
        List<Inquiries> inquiryList = Inquiries.find.all();
        return ok(inquiries.render(inquiryList, e, User.getUserById(session().get("email"))));
    }

    public Result deleteInquiry(Long id){
        Inquiries.find.ref(id).delete();
        flash("success", "Inquiry has been deleted.");
        return redirect(controllers.routes.HomeController.inquiries());
    }

    public Result reviews(){
        List<Reviews> reviewList = Reviews.find.all();
        return ok(reviews.render(reviewList, e, User.getUserById(session().get("email"))));
    }
    
    @With(AuthAdmin.class)
    public Result deleteReview(Long id){
        Reviews.find.ref(id).delete();
        flash("success", "Review has been deleted.");
        return redirect(controllers.routes.HomeController.reviews());
    }

    @With(AuthManager.class)
    public Result addProduct(){
        Form<Product> productForm = formFactory.form(Product.class);
        return ok(addProduct.render(productForm, User.getUserById(session().get("email"))));
    }

    @With(AuthManager.class)
    public Result addProductSubmit(){
        Form<Product> newProductForm = formFactory.form(Product.class).bindFromRequest();

        if (newProductForm.hasErrors()){
            return badRequest(addProduct.render(newProductForm, User.getUserById(session().get("email"))));
        } else {
            Product newProduct = newProductForm.get();
            if (newProduct.getId() == null){
                newProduct.save();
            } else {
                newProduct.update();
            }

            MultipartFormData data = request().body().asMultipartFormData();
            FilePart image = data.getFile("upload");
            String saveImageMessage = saveFile(newProduct.getId(), image);

            newProduct.save();
            flash("success", "Product " + newProduct.getMake() + " " + newProduct.getModel() + " was added/updated " + saveImageMessage);
            return redirect(controllers.routes.HomeController.products());
        }
    }

    @With(AuthManager.class)
    public Result deleteProduct(Long id){
        Product.find.ref(id).delete();
        flash("success", "Product has been deleted.");
        return redirect(controllers.routes.HomeController.products());
    }

    @With(AuthManager.class)
    public Result updateProduct(Long id){
        Product p;
        Form<Product> productForm;
    
        try{
            p = Product.find.byId(id);
            productForm = formFactory.form(Product.class).fill(p);
        } catch (Exception ex){
            return badRequest("error");
        }

        return ok(addProduct.render(productForm, User.getUserById(session().get("email"))));
    }

    public Result contactUs(){
            Form<Inquiries> inquiryForm = formFactory.form(Inquiries.class);
        return ok(contactUs.render(inquiryForm, User.getUserById(session().get("email")))); 
    }

    @With(AuthCustomer.class)
    public Result inquirySubmit(){
        Form<Inquiries> newInquiryForm = formFactory.form(Inquiries.class).bindFromRequest();

        if (newInquiryForm.hasErrors()){
            return badRequest(contactUs.render(newInquiryForm, User.getUserById(session().get("email"))));
        } else {
            Inquiries newInquiry = newInquiryForm.get();
            if (newInquiry.getId() == null){
                newInquiry.save();
            } else {
                newInquiry.update();
            }

            newInquiry.save();
            flash("success", "Inquiry " + newInquiry.getFullName() + " was added ");
            return redirect(controllers.routes.HomeController.contactUs());
        }
    }

    @With(AuthCustomer.class)
    public Result addReview(){
            Form<Reviews> reviewForm = formFactory.form(Reviews.class);
        return ok(addReview.render(reviewForm, User.getUserById(session().get("email")))); 
    }  

    @With(AuthCustomer.class)
    public Result addReviewSubmit(){
        Form<Reviews> newReviewForm = formFactory.form(Reviews.class).bindFromRequest();

    if (newReviewForm.hasErrors()){
        return badRequest(addReview.render(newReviewForm, User.getUserById(session().get("email"))));
    } else {
        Reviews newReview = newReviewForm.get();
        if (newReview.getId() == null){
            newReview.save();
        } else {
            newReview.update();
        }

        newReview.save();
        flash("Success", "Review " + newReview.getFullName() + " was added ");
        return redirect(controllers.routes.HomeController.addReview());
    }
}

    public Result register() {
        Form<User> registerForm = formFactory.form(User.class);
        return ok(register.render(registerForm, User.getUserById(session().get("email"))));
    }

    public Result registerSubmit() {
        Form<User> registerForm = formFactory.form(User.class).bindFromRequest();
        if (registerForm.hasErrors()) {
            return badRequest(register.render(registerForm, User.getUserById(session().get("email"))));
        } else {
             User register = registerForm.get();
             register.save();
             flash("success", "User was added.");
             return redirect(controllers.routes.HomeController.register());
        }
    }            


    public String saveFile(Long id, FilePart<File> uploaded) {
        if (uploaded != null) {

            String mimeType = uploaded.getContentType();
            if (mimeType.startsWith("image/")) {
                
                String fileName = uploaded.getFilename();

                String extension = "";
                int i = fileName.lastIndexOf('.');
                if (i >= 0) {
                    extension = fileName.substring(i +1);
                }

                File file = uploaded.getFile();

                File dir = new File("public/images/productImages");
                if (!dir.exists()) {
                    dir.mkdirs();
                }

                File newFile = new File("public/images/productImages/", id + "." + extension);
                if (file.renameTo(newFile)) {
                    try {
                        BufferedImage img = ImageIO.read(newFile);
                        BufferedImage scaledImg = Scalr.resize(img, 90);

                        if (ImageIO.write(scaledImg, extension, new File("public/images/productImages/", id + "thumb.jpg"))) {
                            return "/ file uploaded and thumbnail created.";
                        } else {
                            return "/ file uploaded but thubnail creation failed.";
                        }
                    } catch (IOException e) {
                        return "/ file uploaded but thumbnail creation failed";
                    }

                } else {
                     return "/ file upload failed";
                }
            }
        }
        return "/ no image file.";
    }
}



