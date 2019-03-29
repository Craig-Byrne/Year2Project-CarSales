
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
    <link rel="icon" type="image/png" href=""""),_display_(/*5.46*/routes/*5.52*/.Assets.versioned("images/favicon.png")),format.raw/*5.91*/("""">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta charset="UTF-8"/>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<style>
	    .footer """),format.raw/*10.14*/("""{"""),format.raw/*10.15*/(""" """),format.raw/*10.16*/("""font-weight: bold; color: white; background-color: black; text-align: center; """),format.raw/*10.94*/("""}"""),format.raw/*10.95*/("""
	    """),format.raw/*11.6*/(""".sidecol """),format.raw/*11.15*/("""{"""),format.raw/*11.16*/(""" """),format.raw/*11.17*/("""font-weight: bold; background-color: steelblue; """),format.raw/*11.65*/("""}"""),format.raw/*11.66*/("""
	    """),format.raw/*12.6*/(""".sidecol h2 """),format.raw/*12.18*/("""{"""),format.raw/*12.19*/(""" """),format.raw/*12.20*/("""font-weight: bold; """),format.raw/*12.39*/("""}"""),format.raw/*12.40*/("""
	    """),format.raw/*13.6*/(""".midcol h1 """),format.raw/*13.17*/("""{"""),format.raw/*13.18*/(""" """),format.raw/*13.19*/("""margin-top: 2em; text-align: center; font-weight: bold; """),format.raw/*13.75*/("""}"""),format.raw/*13.76*/("""
	    """),format.raw/*14.6*/(""".midcol h3 """),format.raw/*14.17*/("""{"""),format.raw/*14.18*/(""" """),format.raw/*14.19*/("""text-align: center; color: steelblue; """),format.raw/*14.57*/("""}"""),format.raw/*14.58*/("""
	    """),format.raw/*15.6*/(""".redtext """),format.raw/*15.15*/("""{"""),format.raw/*15.16*/(""" """),format.raw/*15.17*/("""color: red; """),format.raw/*15.29*/("""}"""),format.raw/*15.30*/("""
	"""),format.raw/*16.2*/("""</style>
	<title>IrelandCarSales</title>
    </head>
    <body>
	<nav class="navbar navbar-inverse">
	    <div class="container-fluid">
		<div class="navbar-header">
		    <a class="navbar-brand" href="/">IrelandCarSales</a>
		</div>
		<ul class="nav navbar-nav">
		    <li """),_display_(/*26.12*/if(title == "Home")/*26.31*/{_display_(Seq[Any](format.raw/*26.32*/("""class="active"""")))}),format.raw/*26.47*/("""><a href=""""),_display_(/*26.58*/routes/*26.64*/.HomeController.index()),format.raw/*26.87*/("""">Home</a></li>
		    <li """),_display_(/*27.12*/if(title == "Cars on Sale")/*27.39*/{_display_(Seq[Any](format.raw/*27.40*/("""class="active"""")))}),format.raw/*27.55*/("""><a href=""""),_display_(/*27.66*/routes/*27.72*/.HomeController.products()),format.raw/*27.98*/("""">Cars on Sale</a></li>
		    <li """),_display_(/*28.12*/if(title == "Contact us")/*28.37*/{_display_(Seq[Any](format.raw/*28.38*/("""class="active"""")))}),format.raw/*28.53*/("""><a href=""""),_display_(/*28.64*/routes/*28.70*/.HomeController.contactUs()),format.raw/*28.97*/("""">Contact us</a></li>
			<li """),_display_(/*29.9*/if(title == "Log In")/*29.30*/{_display_(Seq[Any](format.raw/*29.31*/("""class="active"""")))}),format.raw/*29.46*/(""">
				"""),_display_(/*30.6*/if(user != null)/*30.22*/ {_display_(Seq[Any](format.raw/*30.24*/("""
					"""),format.raw/*31.6*/("""<a href=""""),_display_(/*31.16*/routes/*31.22*/.LoginController.logout()),format.raw/*31.47*/("""">Log Out</a>
				""")))}/*32.7*/else/*32.12*/{_display_(Seq[Any](format.raw/*32.13*/("""
					"""),format.raw/*33.6*/("""<a href=""""),_display_(/*33.16*/routes/*33.22*/.LoginController.login()),format.raw/*33.46*/("""">Log In</a>
				""")))}),format.raw/*34.6*/("""
			"""),format.raw/*35.4*/("""</li>
			<li """),_display_(/*36.9*/if(title == "Admin")/*36.29*/{_display_(Seq[Any](format.raw/*36.30*/("""class="active"""")))}),format.raw/*36.45*/("""><a href=""""),_display_(/*36.56*/routes/*36.62*/.HomeController.admin()),format.raw/*36.85*/("""">Admin</a></li>
		</ul>
	    </div>
	</nav>

	<div class="container-fluid">
	    <div class="row">
		<div class="col-sm-3">
		    <div class="well sidecol">
			<h2>News</h2>
			<h3>New stock incoming!</h3>
			<p>New models being added to the website soon, stay tuned!!</p>
		    </div>
		</div>
		<div class="col-sm-6">
		    <div class="midcol">
                """),_display_(/*52.18*/content),format.raw/*52.25*/("""
		    """),format.raw/*53.7*/("""</div>
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
                  DATE: Fri Mar 29 01:25:33 GMT 2019
                  SOURCE: /home/wdd/Year2Project-CarSales/CarSalesSite/app/views/main.scala.html
                  HASH: 08b06c032853f3683186a3dae3817287eca5920f
                  MATRIX: 970->1|1119->57|1224->136|1238->142|1297->181|1549->405|1578->406|1607->407|1713->485|1742->486|1775->492|1812->501|1841->502|1870->503|1946->551|1975->552|2008->558|2048->570|2077->571|2106->572|2153->591|2182->592|2215->598|2254->609|2283->610|2312->611|2396->667|2425->668|2458->674|2497->685|2526->686|2555->687|2621->725|2650->726|2683->732|2720->741|2749->742|2778->743|2818->755|2847->756|2876->758|3178->1033|3206->1052|3245->1053|3291->1068|3329->1079|3344->1085|3388->1108|3442->1135|3478->1162|3517->1163|3563->1178|3601->1189|3616->1195|3663->1221|3725->1256|3759->1281|3798->1282|3844->1297|3882->1308|3897->1314|3945->1341|4001->1371|4031->1392|4070->1393|4116->1408|4149->1415|4174->1431|4214->1433|4247->1439|4284->1449|4299->1455|4345->1480|4382->1500|4395->1505|4434->1506|4467->1512|4504->1522|4519->1528|4564->1552|4612->1570|4643->1574|4683->1588|4712->1608|4751->1609|4797->1624|4835->1635|4850->1641|4894->1664|5286->2029|5314->2036|5348->2043|5598->2266|5613->2272|5674->2312
                  LINES: 28->1|33->2|36->5|36->5|36->5|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|45->14|46->15|46->15|46->15|46->15|46->15|46->15|47->16|57->26|57->26|57->26|57->26|57->26|57->26|57->26|58->27|58->27|58->27|58->27|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|59->28|59->28|60->29|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|64->33|65->34|66->35|67->36|67->36|67->36|67->36|67->36|67->36|67->36|83->52|83->52|84->53|94->63|94->63|94->63
                  -- GENERATED --
              */
          