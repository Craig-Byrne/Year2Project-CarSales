
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
		    <li """),_display_(/*21.12*/if(title == "Cars on Sale")/*21.39*/{_display_(Seq[Any](format.raw/*21.40*/("""class="active"""")))}),format.raw/*21.55*/("""><a href=""""),_display_(/*21.66*/routes/*21.72*/.HomeController.products()),format.raw/*21.98*/("""">Cars on Sale</a></li>
		    <li """),_display_(/*22.12*/if(title == "Contact us")/*22.37*/{_display_(Seq[Any](format.raw/*22.38*/("""class="active"""")))}),format.raw/*22.53*/("""><a href=""""),_display_(/*22.64*/routes/*22.70*/.HomeController.contactUs()),format.raw/*22.97*/("""">Contact us</a></li>
			<li """),_display_(/*23.9*/if(title == "Log In")/*23.30*/{_display_(Seq[Any](format.raw/*23.31*/("""class="active"""")))}),format.raw/*23.46*/(""">
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

	<div class="container-fluid">
		<div class="col-sm-6">
		    <div class="midcol">
                """),_display_(/*40.18*/content),format.raw/*40.25*/("""
		    """),format.raw/*41.7*/("""</div>
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
	<script src=""""),_display_(/*52.16*/routes/*52.22*/.Assets.versioned("javascripts/main.js")),format.raw/*52.62*/(""""></script>
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
                  DATE: Thu Apr 04 00:14:33 IST 2019
                  SOURCE: /home/wdd/Year2Project-CarSales/CarSalesSite/app/views/main.scala.html
                  HASH: c549a131c0977485e987de623978b8aa5720187a
                  MATRIX: 970->1|1119->57|1413->325|1427->331|1490->374|1808->665|1836->684|1875->685|1921->700|1959->711|1974->717|2018->740|2072->767|2108->794|2147->795|2193->810|2231->821|2246->827|2293->853|2355->888|2389->913|2428->914|2474->929|2512->940|2527->946|2575->973|2631->1003|2661->1024|2700->1025|2746->1040|2779->1047|2804->1063|2844->1065|2877->1071|2914->1081|2929->1087|2975->1112|3012->1132|3025->1137|3064->1138|3097->1144|3134->1154|3149->1160|3194->1184|3242->1202|3273->1206|3313->1220|3342->1240|3381->1241|3427->1256|3465->1267|3480->1273|3524->1296|3575->1321|3606->1343|3645->1344|3691->1359|3729->1370|3744->1376|3790->1401|3970->1554|3998->1561|4032->1568|4282->1791|4297->1797|4358->1837
                  LINES: 28->1|33->2|39->8|39->8|39->8|51->20|51->20|51->20|51->20|51->20|51->20|51->20|52->21|52->21|52->21|52->21|52->21|52->21|52->21|53->22|53->22|53->22|53->22|53->22|53->22|53->22|54->23|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|58->27|59->28|60->29|61->30|61->30|61->30|61->30|61->30|61->30|61->30|62->31|62->31|62->31|62->31|62->31|62->31|62->31|71->40|71->40|72->41|83->52|83->52|83->52
                  -- GENERATED --
              */
          