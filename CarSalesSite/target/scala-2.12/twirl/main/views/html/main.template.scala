
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
			<li """),_display_(/*29.9*/if(title == "Log In")/*29.30*/{_display_(Seq[Any](format.raw/*29.31*/("""class="active"""")))}),format.raw/*29.46*/("""><a href=""""),_display_(/*29.57*/routes/*29.63*/.LoginController.login()),format.raw/*29.87*/("""">Log In</a></li>
			<li """),_display_(/*30.9*/if(title == "Inquiries")/*30.33*/{_display_(Seq[Any](format.raw/*30.34*/("""class="active"""")))}),format.raw/*30.49*/("""><a href=""""),_display_(/*30.60*/routes/*30.66*/.HomeController.inquiries()),format.raw/*30.93*/("""">Inquiries</a></li>
			<li """),_display_(/*31.9*/if(title == "Register")/*31.32*/{_display_(Seq[Any](format.raw/*31.33*/("""class="active"""")))}),format.raw/*31.48*/("""><a href=""""),_display_(/*31.59*/routes/*31.65*/.HomeController.register()),format.raw/*31.91*/("""">Register</a></li>
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
                """),_display_(/*47.18*/content),format.raw/*47.25*/("""
		    """),format.raw/*48.7*/("""</div>
		</div>
		<div class="col-sm-3">
		    <div class="well sidecol">
			<h2>Events</h2>
			<h3>The 153rd Meet for Real event</h3>
			<p>The popular <span class="redtext">Meet for Real</span> event takes place this Sunday at the Square Park, from 7am until 1pm. It will yet again give flea-market enthusiasts a chance to engage in a bit of live bartering and banter with their fellow sitesters.</p>
		    </div>
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
	<script src=""""),_display_(/*66.16*/routes/*66.22*/.Assets.versioned("javascripts/main.js")),format.raw/*66.62*/(""""></script>
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
                  DATE: Mon Mar 25 12:48:40 GMT 2019
                  SOURCE: /home/wdd/Year2Project-CarSales/CarSalesSite/app/views/main.scala.html
                  HASH: 570299f2f361b2dae2ab0674b92a62d6388b500d
                  MATRIX: 970->1|1119->57|1224->136|1238->142|1297->181|1549->405|1578->406|1607->407|1713->485|1742->486|1775->492|1812->501|1841->502|1870->503|1946->551|1975->552|2008->558|2048->570|2077->571|2106->572|2153->591|2182->592|2215->598|2254->609|2283->610|2312->611|2396->667|2425->668|2458->674|2497->685|2526->686|2555->687|2621->725|2650->726|2683->732|2720->741|2749->742|2778->743|2818->755|2847->756|2876->758|3178->1033|3206->1052|3245->1053|3291->1068|3329->1079|3344->1085|3388->1108|3442->1135|3478->1162|3517->1163|3563->1178|3601->1189|3616->1195|3663->1221|3725->1256|3759->1281|3798->1282|3844->1297|3882->1308|3897->1314|3945->1341|4001->1371|4031->1392|4070->1393|4116->1408|4154->1419|4169->1425|4214->1449|4266->1475|4299->1499|4338->1500|4384->1515|4422->1526|4437->1532|4485->1559|4540->1588|4572->1611|4611->1612|4657->1627|4695->1638|4710->1644|4757->1670|5152->2038|5180->2045|5214->2052|5885->2696|5900->2702|5961->2742
                  LINES: 28->1|33->2|36->5|36->5|36->5|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|45->14|46->15|46->15|46->15|46->15|46->15|46->15|47->16|57->26|57->26|57->26|57->26|57->26|57->26|57->26|58->27|58->27|58->27|58->27|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|59->28|59->28|60->29|60->29|60->29|60->29|60->29|60->29|60->29|61->30|61->30|61->30|61->30|61->30|61->30|61->30|62->31|62->31|62->31|62->31|62->31|62->31|62->31|78->47|78->47|79->48|97->66|97->66|97->66
                  -- GENERATED --
              */
          