
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
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script>
	$('.carousel').carousel("""),format.raw/*12.26*/("""{"""),format.raw/*12.27*/("""
		"""),format.raw/*13.3*/("""interval: 3000
	"""),format.raw/*14.2*/("""}"""),format.raw/*14.3*/(""")
</script>
		<script src="../../dist/js/bootstrap.min.js"></script>
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
		    <li """),_display_(/*27.12*/if(title == "Products")/*27.35*/{_display_(Seq[Any](format.raw/*27.36*/("""class="active"""")))}),format.raw/*27.51*/("""><a href=""""),_display_(/*27.62*/routes/*27.68*/.HomeController.products()),format.raw/*27.94*/("""">Cars on Sale</a></li>
		    <li """),_display_(/*28.12*/if(title == "Contact Us")/*28.37*/{_display_(Seq[Any](format.raw/*28.38*/("""class="active"""")))}),format.raw/*28.53*/("""><a href=""""),_display_(/*28.64*/routes/*28.70*/.HomeController.contactUs()),format.raw/*28.97*/("""">Contact us</a></li>
			<li """),_display_(/*29.9*/if(title == "Log in")/*29.30*/{_display_(Seq[Any](format.raw/*29.31*/("""class="active"""")))}),format.raw/*29.46*/(""">
				"""),_display_(/*30.6*/if(user != null)/*30.22*/ {_display_(Seq[Any](format.raw/*30.24*/("""
					"""),format.raw/*31.6*/("""<a href=""""),_display_(/*31.16*/routes/*31.22*/.LoginController.logout()),format.raw/*31.47*/("""">Log Out</a>
				""")))}/*32.7*/else/*32.12*/{_display_(Seq[Any](format.raw/*32.13*/("""
					"""),format.raw/*33.6*/("""<a href=""""),_display_(/*33.16*/routes/*33.22*/.LoginController.login()),format.raw/*33.46*/("""">Log In</a>
				""")))}),format.raw/*34.6*/("""
			"""),format.raw/*35.4*/("""</li>
			<li """),_display_(/*36.9*/if(title == "Admin")/*36.29*/{_display_(Seq[Any](format.raw/*36.30*/("""class="active"""")))}),format.raw/*36.45*/("""><a href=""""),_display_(/*36.56*/routes/*36.62*/.HomeController.admin()),format.raw/*36.85*/("""">Admin</a></li>
			<li """),_display_(/*37.9*/if(title == "Reviews")/*37.31*/{_display_(Seq[Any](format.raw/*37.32*/("""class="active"""")))}),format.raw/*37.47*/("""><a href=""""),_display_(/*37.58*/routes/*37.64*/.HomeController.reviews()),format.raw/*37.89*/("""">Reviews</a></li>
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
                """),_display_(/*51.18*/content),format.raw/*51.25*/("""
		    """),format.raw/*52.7*/("""</div>
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
	<script src=""""),_display_(/*69.16*/routes/*69.22*/.Assets.versioned("javascripts/main.js")),format.raw/*69.62*/(""""></script>
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
                  DATE: Mon Apr 22 12:38:09 IST 2019
                  SOURCE: /home/wdd/Year2Project-CarSales/CarSalesSite/app/views/main.scala.html
                  HASH: 490280cf7d405300bb4fb3cd37ca671171fc973b
                  MATRIX: 970->1|1119->57|1413->325|1427->331|1490->374|1691->547|1720->548|1750->551|1793->567|1821->568|2184->904|2212->923|2251->924|2297->939|2335->950|2350->956|2394->979|2448->1006|2480->1029|2519->1030|2565->1045|2603->1056|2618->1062|2665->1088|2727->1123|2761->1148|2800->1149|2846->1164|2884->1175|2899->1181|2947->1208|3003->1238|3033->1259|3072->1260|3118->1275|3151->1282|3176->1298|3216->1300|3249->1306|3286->1316|3301->1322|3347->1347|3384->1367|3397->1372|3436->1373|3469->1379|3506->1389|3521->1395|3566->1419|3614->1437|3645->1441|3685->1455|3714->1475|3753->1476|3799->1491|3837->1502|3852->1508|3896->1531|3947->1556|3978->1578|4017->1579|4063->1594|4101->1605|4116->1611|4162->1636|4416->1863|4444->1870|4478->1877|4804->2176|4819->2182|4880->2222
                  LINES: 28->1|33->2|39->8|39->8|39->8|43->12|43->12|44->13|45->14|45->14|57->26|57->26|57->26|57->26|57->26|57->26|57->26|58->27|58->27|58->27|58->27|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|59->28|59->28|60->29|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|64->33|65->34|66->35|67->36|67->36|67->36|67->36|67->36|67->36|67->36|68->37|68->37|68->37|68->37|68->37|68->37|68->37|82->51|82->51|83->52|100->69|100->69|100->69
                  -- GENERATED --
              */
          