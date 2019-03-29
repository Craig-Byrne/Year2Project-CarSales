// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Year2Project-CarSales/CarSalesSite/conf/routes
// @DATE:Fri Mar 29 13:14:55 GMT 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:59
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:59
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def addProductSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addProductSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addProductSubmit"})
        }
      """
    )
  
    // @LINE:34
    def deleteInquiry: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteInquiry",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteInquiry/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:28
    def contactUs: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.contactUs",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contactUs"})
        }
      """
    )
  
    // @LINE:44
    def addUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addUser"})
        }
      """
    )
  
    // @LINE:40
    def admin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.admin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
        }
      """
    )
  
    // @LINE:30
    def inquirySubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.inquirySubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "inquirySubmit"})
        }
      """
    )
  
    // @LINE:18
    def deleteProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteProduct",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteProduct/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:12
    def products: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.products",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products"})
        }
      """
    )
  
    // @LINE:48
    def deleteUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteUser",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteUser/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:56
    def deleteReview: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteReview",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteReview/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:20
    def updateProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateProduct",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateProduct/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:46
    def addUserSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addUserSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addUserSubmit"})
        }
      """
    )
  
    // @LINE:42
    def users: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.users",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
        }
      """
    )
  
    // @LINE:36
    def register: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.register",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
    // @LINE:14
    def addProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addProduct",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addProduct"})
        }
      """
    )
  
    // @LINE:32
    def inquiries: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.inquiries",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "inquiries"})
        }
      """
    )
  
    // @LINE:38
    def registerSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.registerSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "registerSubmit"})
        }
      """
    )
  
    // @LINE:50
    def reviews: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.reviews",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reviews"})
        }
      """
    )
  
    // @LINE:54
    def addReviewSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addReviewSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addReviewSubmit"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:52
    def addReview: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addReview",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addReview"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:22
  class ReverseLoginController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def loginSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.loginSubmit",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loginSubmit"})
        }
      """
    )
  
    // @LINE:26
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:22
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }


}
