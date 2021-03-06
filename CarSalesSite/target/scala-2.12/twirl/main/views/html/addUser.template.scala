
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

object addUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.User],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(newUserForm: Form[models.users.User], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add User", user)/*5.24*/{_display_(Seq[Any](format.raw/*5.25*/("""
    """),format.raw/*6.5*/("""<h3 class="lead">Add a new user</h3>

    """),_display_(/*8.6*/form(action=routes.HomeController.addUserSubmit(), 'class -> "form-horizontal", 'role -> "form",
          'method -> "POST", 'enctype -> "multipart/form-data")/*9.64*/ {_display_(Seq[Any](format.raw/*9.66*/("""
        
        """),_display_(/*11.10*/CSRF/*11.14*/.formField),format.raw/*11.24*/("""

        """),_display_(/*13.10*/inputText(newUserForm("name"), '_label -> "Full Name", 'class -> "form-control")),format.raw/*13.90*/("""
        """),_display_(/*14.10*/inputText(newUserForm("role"), '_label -> "Role", 'class -> "form-control")),format.raw/*14.85*/("""
        """),_display_(/*15.10*/inputText(newUserForm("email"), '_label -> "Email Address", 'class -> "form-control")),format.raw/*15.95*/("""
        """),_display_(/*16.10*/inputText(newUserForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*16.93*/("""

        """),format.raw/*18.9*/("""<div class="actions">
            <input type="submit" value="Add user" class="btn btn-primary">
            <a href=""""),_display_(/*20.23*/routes/*20.29*/.HomeController.users()),format.raw/*20.52*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*24.6*/("""
""")))}))
      }
    }
  }

  def render(newUserForm:Form[models.users.User],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(newUserForm,user)

  def f:((Form[models.users.User],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (newUserForm,user) => apply(newUserForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 28 17:00:52 IST 2019
                  SOURCE: /home/wdd/Year2Project-CarSales/CarSalesSite/app/views/addUser.scala.html
                  HASH: 012fed827fbea3cf6397e6b8398ae45c5fc17b86
                  MATRIX: 985->1|1121->67|1165->65|1192->83|1219->85|1249->107|1287->108|1318->113|1386->156|1554->316|1593->318|1639->337|1652->341|1683->351|1721->362|1822->442|1859->452|1955->527|1992->537|2098->622|2135->632|2239->715|2276->725|2422->844|2437->850|2481->873|2629->991
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|39->8|40->9|40->9|42->11|42->11|42->11|44->13|44->13|45->14|45->14|46->15|46->15|47->16|47->16|49->18|51->20|51->20|51->20|55->24
                  -- GENERATED --
              */
          