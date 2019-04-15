
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

object register extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.User],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(registerForm: Form[models.users.User], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Register", user)/*5.24*/{_display_(Seq[Any](format.raw/*5.25*/("""
    """),format.raw/*6.5*/("""<p class="lead">Register</p>

    <!-- Use a views.html.helpers package method to create the form (instead of html)-->
    <!-- Note the arguments that are being passed to the scala function form (they are
         essentially instructions for constructing an HTML form element)-->
    """),_display_(/*11.6*/form(action=routes.HomeController.registerSubmit(), 'class -> "form-horizontal", 'role -> "form")/*11.103*/ {_display_(Seq[Any](format.raw/*11.105*/("""
        """),format.raw/*12.37*/("""
        """),format.raw/*13.99*/("""
        """),_display_(/*14.10*/CSRF/*14.14*/.formField),format.raw/*14.24*/("""

        """),format.raw/*16.9*/("""<!-- Use helper methods to add fields to the form -->
        <!-- Note that the form fields are related to the fields of the itemForm object -->
        <!-- Note the arguments that are being passed to the scala function inputText (they are 
             essentially instructions for constructing an HTML input element)-->
        <!-- Note the """),_display_(/*20.24*/select),format.raw/*20.30*/(""" """),format.raw/*20.31*/("""function's argument options. This needs to be a map of ids-to-names
             and this is provided by the method Category.options(), which we added to the Category
             class in the previous step. -->
            """),_display_(/*23.14*/inputText(registerForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*23.90*/("""
            """),_display_(/*24.14*/inputText(registerForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*24.92*/("""
            """),_display_(/*25.14*/inputText(registerForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*25.98*/("""
            """),_display_(/*26.14*/inputText(registerForm("role"), '_label -> "Role", 'class  -> "form-control")),format.raw/*26.91*/("""


            """),format.raw/*29.13*/("""<!-- We use the bootstrap actions class for the buttons at the bottom:
                1. The submit button for the form
                2. A button that allows the user to cancel without adding an item
            -->
            <div class="actions">
                <input type="submit" value="Register" class="btn btn-primary">
                <a href=""""),_display_(/*35.27*/routes/*35.33*/.HomeController.register()),format.raw/*35.59*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
    """)))}),format.raw/*39.6*/(""" """),format.raw/*39.24*/("""
""")))}),format.raw/*40.2*/(""" """),format.raw/*40.20*/("""
"""))
      }
    }
  }

  def render(registerForm:Form[models.users.User],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(registerForm,user)

  def f:((Form[models.users.User],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (registerForm,user) => apply(registerForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 15 12:36:37 IST 2019
                  SOURCE: /home/wdd/Year2Project-CarSales/CarSalesSite/app/views/register.scala.html
                  HASH: 89afa81095c02c6d0a97634a0c8d48de7cab9e12
                  MATRIX: 986->1|1123->68|1167->66|1194->84|1221->86|1251->108|1289->109|1320->114|1633->401|1740->498|1781->500|1818->537|1855->636|1892->646|1905->650|1936->660|1973->670|2347->1017|2374->1023|2403->1024|2655->1249|2752->1325|2793->1339|2892->1417|2933->1431|3038->1515|3079->1529|3177->1606|3220->1621|3605->1979|3620->1985|3667->2011|3827->2141|3856->2159|3888->2161|3917->2179
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|42->11|42->11|42->11|43->12|44->13|45->14|45->14|45->14|47->16|51->20|51->20|51->20|54->23|54->23|55->24|55->24|56->25|56->25|57->26|57->26|60->29|66->35|66->35|66->35|70->39|70->39|71->40|71->40
                  -- GENERATED --
              */
          