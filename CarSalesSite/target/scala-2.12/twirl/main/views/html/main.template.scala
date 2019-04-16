
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta charset="UTF-8"/>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<link rel="stylesheet" href=""""),_display_(/*8.33*/routes/*8.39*/.Assets.versioned("stylesheets/styles.css")),format.raw/*8.82*/("""">
		<style>
		</style>
		<title>IrelandCarSales</title>
    </head>
    <body>
	<nav class="navbar navbar-inverse">
	    <div class="container-fluid">
		<div class="navbar-header">
		    <a class="navbar-brand" href="/">IrelandCarSales</a>
		</div>
		<ul class="nav navbar-nav">
		    <li """),_display_(/*20.12*/if(title == "Home")/*20.31*/{_display_(Seq[Any](format.raw/*20.32*/("""class="active"""")))}),format.raw/*20.47*/("""><a href=""""),_display_(/*20.58*/routes/*20.64*/.HomeController.index()),format.raw/*20.87*/("""">Home</a></li>
		    <li """),_display_(/*21.12*/if(title == "Products")/*21.35*/{_display_(Seq[Any](format.raw/*21.36*/("""class="active"""")))}),format.raw/*21.51*/("""><a href=""""),_display_(/*21.62*/routes/*21.68*/.HomeController.products()),format.raw/*21.94*/("""">Cars on Sale</a></li>
		    <li """),_display_(/*22.12*/if(title == "Contact Us")/*22.37*/{_display_(Seq[Any](format.raw/*22.38*/("""class="active"""")))}),format.raw/*22.53*/("""><a href=""""),_display_(/*22.64*/routes/*22.70*/.HomeController.contactUs()),format.raw/*22.97*/("""">Contact us</a></li>
			<li """),_display_(/*23.9*/if(title == "Log in")/*23.30*/{_display_(Seq[Any](format.raw/*23.31*/("""class="active"""")))}),format.raw/*23.46*/(""">
				"""),_display_(/*24.6*/if(user != null)/*24.22*/ {_display_(Seq[Any](format.raw/*24.24*/("""
					"""),format.raw/*25.6*/("""<a href=""""),_display_(/*25.16*/routes/*25.22*/.LoginController.logout()),format.raw/*25.47*/("""">Log Out</a>
				""")))}/*26.7*/else/*26.12*/{_display_(Seq[Any](format.raw/*26.13*/("""
					"""),format.raw/*27.6*/("""<a href=""""),_display_(/*27.16*/routes/*27.22*/.LoginController.login()),format.raw/*27.46*/("""">Log In</a>
				""")))}),format.raw/*28.6*/("""
			"""),format.raw/*29.4*/("""</li>
			<li """),_display_(/*30.9*/if(title == "Admin")/*30.29*/{_display_(Seq[Any](format.raw/*30.30*/("""class="active"""")))}),format.raw/*30.45*/("""><a href=""""),_display_(/*30.56*/routes/*30.62*/.HomeController.admin()),format.raw/*30.85*/("""">Admin</a></li>
			<li """),_display_(/*31.9*/if(title == "Reviews")/*31.31*/{_display_(Seq[Any](format.raw/*31.32*/("""class="active"""")))}),format.raw/*31.47*/("""><a href=""""),_display_(/*31.58*/routes/*31.64*/.HomeController.reviews()),format.raw/*31.89*/("""">Reviews</a></li>
		</ul>
		</div>
	</div>
	</nav>

		<div class="col-sm-3">
		    <div class="sidecol">
				</div>
		</div>

	<div class="container-fluid">
		<div class="col-sm-6">
		    <div class="midcol">
                """),_display_(/*45.18*/content),format.raw/*45.25*/("""
		    """),format.raw/*46.7*/("""</div>
		</div>
	</div>

			<div class="col-sm-3">
				<div class="sidecol">
					</div>
			</div>

	    <div class="row">
		<div class="col-sm-12">
		    <div class="well footer">
			Website created by Craig Byrne, Ryan Williams and Warren Berrigan
		 </div>
		</div>
	</div>
</div>
	<script src=""""),_display_(/*63.16*/routes/*63.22*/.Assets.versioned("javascripts/main.js")),format.raw/*63.62*/(""""></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 16 13:23:53 IST 2019
                  SOURCE: /home/wdd/Year2Project-CarSales/CarSalesSite/app/views/main.scala.html
                  HASH: 05d80b062db039936798b8a667805731814a5456
                  MATRIX: 970->1|1119->57|1413->325|1427->331|1490->374|1808->665|1836->684|1875->685|1921->700|1959->711|1974->717|2018->740|2072->767|2104->790|2143->791|2189->806|2227->817|2242->823|2289->849|2351->884|2385->909|2424->910|2470->925|2508->936|2523->942|2571->969|2627->999|2657->1020|2696->1021|2742->1036|2775->1043|2800->1059|2840->1061|2873->1067|2910->1077|2925->1083|2971->1108|3008->1128|3021->1133|3060->1134|3093->1140|3130->1150|3145->1156|3190->1180|3238->1198|3269->1202|3309->1216|3338->1236|3377->1237|3423->1252|3461->1263|3476->1269|3520->1292|3571->1317|3602->1339|3641->1340|3687->1355|3725->1366|3740->1372|3786->1397|4040->1624|4068->1631|4102->1638|4428->1937|4443->1943|4504->1983
                  LINES: 28->1|33->2|39->8|39->8|39->8|51->20|51->20|51->20|51->20|51->20|51->20|51->20|52->21|52->21|52->21|52->21|52->21|52->21|52->21|53->22|53->22|53->22|53->22|53->22|53->22|53->22|54->23|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|58->27|59->28|60->29|61->30|61->30|61->30|61->30|61->30|61->30|61->30|62->31|62->31|62->31|62->31|62->31|62->31|62->31|76->45|76->45|77->46|94->63|94->63|94->63
                  -- GENERATED --
              */
          