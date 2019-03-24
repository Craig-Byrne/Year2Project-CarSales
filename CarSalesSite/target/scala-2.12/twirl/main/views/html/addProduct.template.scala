
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

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[models.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add Product", user)/*5.27*/{_display_(Seq[Any](format.raw/*5.28*/("""
    """),format.raw/*6.5*/("""<p class="lead">Add a new product</p>

    """),_display_(/*8.6*/form(action=routes.HomeController.addProductSubmit(), 'class -> "form-horizontal", 'role -> "form",
          'method -> "POST", 'enctype -> "multipart/form-data")/*9.64*/ {_display_(Seq[Any](format.raw/*9.66*/("""
        
        """),_display_(/*11.10*/CSRF/*11.14*/.formField),format.raw/*11.24*/("""

        """),_display_(/*13.10*/inputText(productForm("make"), '_label -> "Make", 'class -> "form-control")),format.raw/*13.85*/("""
        """),_display_(/*14.10*/inputText(productForm("model"), '_label -> "Model", 'class -> "form-control")),format.raw/*14.87*/("""
        """),_display_(/*15.10*/inputText(productForm("year"), '_label -> "Year", 'class -> "form-control")),format.raw/*15.85*/("""
        """),_display_(/*16.10*/inputText(productForm("fuelType"), '_label -> "Fuel Type", 'class -> "form-control")),format.raw/*16.94*/("""
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

  def render(productForm:Form[models.Product],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(productForm,user)

  def f:((Form[models.Product],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (productForm,user) => apply(productForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 24 20:49:23 GMT 2019
                  SOURCE: /home/wdd/Year2Project-CarSales/CarSalesSite/app/views/addProduct.scala.html
                  HASH: d3d090ff94fe47147e6c92714ff03e8d4dd9caa9
                  MATRIX: 985->1|1118->64|1162->62|1189->80|1216->82|1249->107|1287->108|1318->113|1387->157|1558->320|1597->322|1643->341|1656->345|1687->355|1725->366|1821->441|1858->451|1956->528|1993->538|2089->613|2126->623|2231->707|2268->717|2366->794|2403->804|2503->883|2540->893|2674->1000|2759->1064|2796->1074|2952->1203|2967->1209|3014->1235|3162->1353
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|39->8|40->9|40->9|42->11|42->11|42->11|44->13|44->13|45->14|45->14|46->15|46->15|47->16|47->16|48->17|48->17|49->18|49->18|51->20|54->23|54->23|56->25|58->27|58->27|58->27|62->31
                  -- GENERATED --
              */
          