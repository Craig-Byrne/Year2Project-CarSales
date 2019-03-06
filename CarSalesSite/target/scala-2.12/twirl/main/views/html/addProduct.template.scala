
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add Product")/*5.21*/{_display_(Seq[Any](format.raw/*5.22*/("""
    """),format.raw/*6.5*/("""<p class="lead">Add a new product</p>

    """),_display_(/*8.6*/form(action=routes.HomeController.addProductSubmit(), 'class -> "form-horizontal", 'role -> "form",
          'method -> "POST", 'enctype -> "multipart/form-data")/*9.64*/ {_display_(Seq[Any](format.raw/*9.66*/("""
        
        """),_display_(/*11.10*/CSRF/*11.14*/.formField),format.raw/*11.24*/("""

        """),_display_(/*13.10*/inputText(productForm("make"), '_label -> "Make", 'class -> "form-control")),format.raw/*13.85*/("""
        """),_display_(/*14.10*/inputText(productForm("model"), '_label -> "Model", 'class -> "form-control")),format.raw/*14.87*/("""
        """),_display_(/*15.10*/inputText(productForm("year"), '_label -> "Year", 'class -> "form-control")),format.raw/*15.85*/("""
        """),_display_(/*16.10*/inputText(productForm("fuel_type"), '_label -> "Fuel Type", 'class -> "form-control")),format.raw/*16.95*/("""
        """),_display_(/*17.10*/inputText(productForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*17.87*/("""
        """),_display_(/*18.10*/inputText(productForm("colour"), '_label -> "Colour", 'class -> "form-control")),format.raw/*18.89*/("""

        """),format.raw/*20.9*/("""<label>Image Upload</label>
        <input class="btn-sm btn-default" type="file" name="upload">

        """),_display_(/*23.10*/inputText(productForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*23.74*/("""

        """),format.raw/*25.9*/("""<div class="actions">
            <input type="submit" value="Add/Update product" class="btn btn-primary">
            <a href=""""),_display_(/*27.23*/routes/*27.29*/.HomeController.products()),format.raw/*27.55*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*31.6*/("""
""")))}))
      }
    }
  }

  def render(productForm:Form[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(productForm)

  def f:((Form[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (productForm) => apply(productForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 06 15:27:00 GMT 2019
                  SOURCE: /home/wdd/Year2Project-CarSales/CarSalesSite/app/views/addProduct.scala.html
                  HASH: 7170ccb2d0c490607d048dad6fe37550e73bdbd6
                  MATRIX: 967->1|1075->39|1119->37|1146->55|1173->57|1200->76|1238->77|1269->82|1338->126|1509->289|1548->291|1594->310|1607->314|1638->324|1676->335|1772->410|1809->420|1907->497|1944->507|2040->582|2077->592|2183->677|2220->687|2318->764|2355->774|2455->853|2492->863|2626->970|2711->1034|2748->1044|2904->1173|2919->1179|2966->1205|3114->1323
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|39->8|40->9|40->9|42->11|42->11|42->11|44->13|44->13|45->14|45->14|46->15|46->15|47->16|47->16|48->17|48->17|49->18|49->18|51->20|54->23|54->23|56->25|58->27|58->27|58->27|62->31
                  -- GENERATED --
              */
          