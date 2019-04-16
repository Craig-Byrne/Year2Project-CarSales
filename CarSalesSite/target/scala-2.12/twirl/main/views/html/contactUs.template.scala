
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

object contactUs extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Inquiries],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(inquiryForm: Form[models.Inquiries], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.64*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Contact Us", user)/*4.26*/{_display_(Seq[Any](format.raw/*4.27*/("""
	"""),format.raw/*5.2*/("""<h1>Contact us</h1>

	"""),_display_(/*7.3*/form(action=routes.HomeController.inquirySubmit(), 'class -> "form-horizontal", 'role -> "form",
          'method -> "POST", 'enctype -> "multipart/form-data")/*8.64*/ {_display_(Seq[Any](format.raw/*8.66*/("""

			"""),_display_(/*10.5*/CSRF/*10.9*/.formField),format.raw/*10.19*/("""

	"""),_display_(/*12.3*/inputText(inquiryForm("fullName"), '_label -> "Full Name", 'class -> "form-control")),format.raw/*12.87*/("""
	"""),_display_(/*13.3*/inputText(inquiryForm("email"), '_label -> "Email Address", 'class -> "form-control")),format.raw/*13.88*/("""
	"""),_display_(/*14.3*/inputText(inquiryForm("phoneNumber"), '_label -> "Phone Number", 'class -> "form-control")),format.raw/*14.93*/("""
	"""),_display_(/*15.3*/inputText(inquiryForm("inquiry"), '_label -> "Information on car inquiring about", 'class -> "form-control")),format.raw/*15.111*/("""

	"""),_display_(/*17.3*/inputText(inquiryForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*17.67*/("""

	"""),format.raw/*19.2*/("""<div class="actions">
		<input type="submit" value="Add inquiry" class="btn btn-primary">
		<a href=""""),_display_(/*21.13*/routes/*21.19*/.HomeController.contactUs()),format.raw/*21.46*/("""">
			<button type="button" class="btn btn-warning">Cancel</button>
		</a>
	</div>
""")))}),format.raw/*25.2*/("""
""")))}),format.raw/*26.2*/("""



"""))
      }
    }
  }

  def render(inquiryForm:Form[models.Inquiries],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(inquiryForm,user)

  def f:((Form[models.Inquiries],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (inquiryForm,user) => apply(inquiryForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 16 13:24:15 IST 2019
                  SOURCE: /home/wdd/Year2Project-CarSales/CarSalesSite/app/views/contactUs.scala.html
                  HASH: d18663b302a82de5798f3b6b678fe73750245ff2
                  MATRIX: 986->1|1121->66|1166->63|1194->83|1222->86|1254->110|1292->111|1321->114|1371->139|1540->300|1579->302|1613->310|1625->314|1656->324|1688->330|1793->414|1823->418|1929->503|1959->507|2070->597|2100->601|2230->709|2262->715|2347->779|2379->784|2510->888|2525->894|2573->921|2691->1009|2724->1012
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|39->7|40->8|40->8|42->10|42->10|42->10|44->12|44->12|45->13|45->13|46->14|46->14|47->15|47->15|49->17|49->17|51->19|53->21|53->21|53->21|57->25|58->26
                  -- GENERATED --
              */
          