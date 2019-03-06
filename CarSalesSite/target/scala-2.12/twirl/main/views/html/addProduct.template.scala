
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

    """),_display_(/*8.6*/form(action=routes.HomeController.addProductSubmit(), 'class -> "form-horizontal", 'role -> "form")/*8.105*/{_display_(Seq[Any](format.raw/*8.106*/("""
        """),_display_(/*9.10*/CSRF/*9.14*/.formField),format.raw/*9.24*/("""

        """),_display_(/*11.10*/inputText(productForm("make"), '_label -> "Make", 'class -> "form-control")),format.raw/*11.85*/("""
        """),_display_(/*12.10*/inputText(productForm("model"), '_label -> "Model", 'class -> "form-control")),format.raw/*12.87*/("""
        """),_display_(/*13.10*/inputText(productForm("year"), '_label -> "Year", 'class -> "form-control")),format.raw/*13.85*/("""
        """),_display_(/*14.10*/inputText(productForm("fuel_type"), '_label -> "Fuel Type", 'class -> "form-control")),format.raw/*14.95*/("""
        """),_display_(/*15.10*/inputText(productForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*15.87*/("""
        """),_display_(/*16.10*/inputText(productForm("colour"), '_label -> "Colour", 'class -> "form-control")),format.raw/*16.89*/("""

        """),_display_(/*18.10*/inputText(productForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*18.74*/("""

        """),format.raw/*20.9*/("""<div class="actions">
            <input type="submit" value="Add/Update product" class="btn btn-primary">
            <a href=""""),_display_(/*22.23*/routes/*22.29*/.HomeController.products()),format.raw/*22.55*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*26.6*/("""
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
                  DATE: Wed Mar 06 00:52:24 GMT 2019
                  SOURCE: /home/wdd/Year2Project-CarSales/CarSalesSite/app/views/addProduct.scala.html
                  HASH: 9e2f7c181f98f9bb8745eedae0822e38880db6e2
                  MATRIX: 967->1|1075->39|1119->37|1146->55|1173->57|1200->76|1238->77|1269->82|1338->126|1446->225|1485->226|1521->236|1533->240|1563->250|1601->261|1697->336|1734->346|1832->423|1869->433|1965->508|2002->518|2108->603|2145->613|2243->690|2280->700|2380->779|2418->790|2503->854|2540->864|2696->993|2711->999|2758->1025|2906->1143
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|39->8|39->8|39->8|40->9|40->9|40->9|42->11|42->11|43->12|43->12|44->13|44->13|45->14|45->14|46->15|46->15|47->16|47->16|49->18|49->18|51->20|53->22|53->22|53->22|57->26
                  -- GENERATED --
              */
          