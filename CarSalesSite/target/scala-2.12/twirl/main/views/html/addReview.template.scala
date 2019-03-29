
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

object addReview extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Reviews],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(reviewForm: Form[models.Reviews], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add a review", user)/*4.28*/{_display_(Seq[Any](format.raw/*4.29*/("""
	"""),format.raw/*5.2*/("""<h1>Reviews</h1>

	"""),_display_(/*7.3*/form(action=routes.HomeController.addReviewSubmit(), 'class -> "form-horizontal", 'role -> "form",
          'method -> "POST", 'enctype -> "multipart/form-data")/*8.64*/ {_display_(Seq[Any](format.raw/*8.66*/("""

		  """),_display_(/*10.6*/CSRF/*10.10*/.formField),format.raw/*10.20*/("""

	"""),_display_(/*12.3*/inputText(reviewForm("fullName"), '_label -> "Full Name", 'class -> "form-control")),format.raw/*12.86*/("""
	"""),_display_(/*13.3*/inputText(reviewForm("email"), '_label -> "Email Address", 'class -> "form-control")),format.raw/*13.87*/("""
	"""),_display_(/*14.3*/inputText(reviewForm("review"), '_label -> "Leave a review here", 'class -> "form-control")),format.raw/*14.94*/("""

	"""),_display_(/*16.3*/inputText(reviewForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*16.66*/("""

	"""),format.raw/*18.2*/("""<div class="actions">
		<input type="submit" value="Submit review" class="btn btn-primary">
		<a href=""""),_display_(/*20.13*/routes/*20.19*/.HomeController.reviews()),format.raw/*20.44*/("""">
			<button type="button" class="btn btn-warning">Cancel</button>
		</a>
	</div>
""")))}),format.raw/*24.2*/("""
""")))}))
      }
    }
  }

  def render(reviewForm:Form[models.Reviews],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(reviewForm,user)

  def f:((Form[models.Reviews],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (reviewForm,user) => apply(reviewForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 29 11:47:52 GMT 2019
                  SOURCE: /home/wdd/Year2Project-CarSales/CarSalesSite/app/views/addReview.scala.html
                  HASH: 93912cd02ac7717a029392c5babfebcc2c80e973
                  MATRIX: 984->1|1116->62|1160->78|1187->80|1221->106|1259->107|1287->109|1332->129|1502->291|1541->293|1574->300|1587->304|1618->314|1648->318|1752->401|1781->404|1886->488|1915->491|2027->582|2057->586|2141->649|2171->652|2302->756|2317->762|2363->787|2477->871
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|36->5|38->7|39->8|39->8|41->10|41->10|41->10|43->12|43->12|44->13|44->13|45->14|45->14|47->16|47->16|49->18|51->20|51->20|51->20|55->24
                  -- GENERATED --
              */
          