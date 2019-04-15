
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
		    <li """),_display_(/*22.12*/if(title == "contactUs")/*22.36*/{_display_(Seq[Any](format.raw/*22.37*/("""class="active"""")))}),format.raw/*22.52*/("""><a href=""""),_display_(/*22.63*/routes/*22.69*/.HomeController.contactUs()),format.raw/*22.96*/("""">Contact us</a></li>
			<li """),_display_(/*23.9*/if(title == "Log in")/*23.30*/{_display_(Seq[Any](format.raw/*23.31*/("""class="active"""")))}),format.raw/*23.46*/(""">
				"""),_display_(/*24.6*/if(user != null)/*24.22*/ {_display_(Seq[Any](format.raw/*24.24*/("""
					"""),format.raw/*25.6*/("""<a href=""""),_display_(/*25.16*/routes/*25.22*/.LoginController.logout()),format.raw/*25.47*/("""">Log Out</a>
				""")))}/*26.7*/else/*26.12*/{_display_(Seq[Any](format.raw/*26.13*/("""
					"""),format.raw/*27.6*/("""<a href=""""),_display_(/*27.16*/routes/*27.22*/.LoginController.login()),format.raw/*27.46*/("""">Log In</a>
				""")))}),format.raw/*28.6*/("""
			"""),format.raw/*29.4*/("""</li>
			<li """),_display_(/*30.9*/if(title == "admin")/*30.29*/{_display_(Seq[Any](format.raw/*30.30*/("""class="active"""")))}),format.raw/*30.45*/("""><a href=""""),_display_(/*30.56*/routes/*30.62*/.HomeController.admin()),format.raw/*30.85*/("""">Admin</a></li>
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
                  DATE: Sat Apr 06 23:07:07 IST 2019
                  SOURCE: /home/wdd/Year2Project-CarSales/CarSalesSite/app/views/main.scala.html
                  HASH: 0aa5412b90fd6bedebc2b8603080f541f06c98aa
                  MATRIX: 970->1|1119->57|1413->325|1427->331|1490->374|1808->665|1836->684|1875->685|1921->700|1959->711|1974->717|2018->740|2072->767|2104->790|2143->791|2189->806|2227->817|2242->823|2289->849|2351->884|2384->908|2423->909|2469->924|2507->935|2522->941|2570->968|2626->998|2656->1019|2695->1020|2741->1035|2774->1042|2799->1058|2839->1060|2872->1066|2909->1076|2924->1082|2970->1107|3007->1127|3020->1132|3059->1133|3092->1139|3129->1149|3144->1155|3189->1179|3237->1197|3268->1201|3308->1215|3337->1235|3376->1236|3422->1251|3460->1262|3475->1268|3519->1291|3570->1316|3601->1338|3640->1339|3686->1354|3724->1365|3739->1371|3785->1396|4039->1623|4067->1630|4101->1637|4427->1936|4442->1942|4503->1982
                  LINES: 28->1|33->2|39->8|39->8|39->8|51->20|51->20|51->20|51->20|51->20|51->20|51->20|52->21|52->21|52->21|52->21|52->21|52->21|52->21|53->22|53->22|53->22|53->22|53->22|53->22|53->22|54->23|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|58->27|59->28|60->29|61->30|61->30|61->30|61->30|61->30|61->30|61->30|62->31|62->31|62->31|62->31|62->31|62->31|62->31|76->45|76->45|77->46|94->63|94->63|94->63
                  -- GENERATED --
              */
          