
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.1*/("""<!DOCTYPE html>
<html>
    <head>
    <link rel="icon" type="image/png" href=""""),_display_(/*11.46*/routes/*11.52*/.Assets.versioned("images/favicon.png")),format.raw/*11.91*/("""">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta charset="UTF-8"/>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<style>
	    .footer """),format.raw/*16.14*/("""{"""),format.raw/*16.15*/(""" """),format.raw/*16.16*/("""font-weight: bold; color: white; background-color: black; text-align: center; """),format.raw/*16.94*/("""}"""),format.raw/*16.95*/("""
	    """),format.raw/*17.6*/(""".sidecol """),format.raw/*17.15*/("""{"""),format.raw/*17.16*/(""" """),format.raw/*17.17*/("""font-weight: bold; background-color: steelblue; """),format.raw/*17.65*/("""}"""),format.raw/*17.66*/("""
	    """),format.raw/*18.6*/(""".sidecol h2 """),format.raw/*18.18*/("""{"""),format.raw/*18.19*/(""" """),format.raw/*18.20*/("""font-weight: bold; """),format.raw/*18.39*/("""}"""),format.raw/*18.40*/("""
	    """),format.raw/*19.6*/(""".midcol h1 """),format.raw/*19.17*/("""{"""),format.raw/*19.18*/(""" """),format.raw/*19.19*/("""margin-top: 2em; text-align: center; font-weight: bold; """),format.raw/*19.75*/("""}"""),format.raw/*19.76*/("""
	    """),format.raw/*20.6*/(""".midcol h3 """),format.raw/*20.17*/("""{"""),format.raw/*20.18*/(""" """),format.raw/*20.19*/("""text-align: center; color: steelblue; """),format.raw/*20.57*/("""}"""),format.raw/*20.58*/("""
	    """),format.raw/*21.6*/(""".redtext """),format.raw/*21.15*/("""{"""),format.raw/*21.16*/(""" """),format.raw/*21.17*/("""color: red; """),format.raw/*21.29*/("""}"""),format.raw/*21.30*/("""
	"""),format.raw/*22.2*/("""</style>
	<title>IrelandCarSales</title>
    </head>
    <body>
	<nav class="navbar navbar-inverse">
	    <div class="container-fluid">
		<div class="navbar-header">
		    <a class="navbar-brand" href="/">IrelandCarSales</a>
		</div>
		<ul class="nav navbar-nav">
		    <li """),_display_(/*32.12*/if(title == "Home")/*32.31*/{_display_(Seq[Any](format.raw/*32.32*/("""class="active"""")))}),format.raw/*32.47*/("""><a href=""""),_display_(/*32.58*/routes/*32.64*/.HomeController.index()),format.raw/*32.87*/("""">Home</a></li>
		    <li """),_display_(/*33.12*/if(title == "Products")/*33.35*/{_display_(Seq[Any](format.raw/*33.36*/("""class="active"""")))}),format.raw/*33.51*/("""><a href=""""),_display_(/*33.62*/routes/*33.68*/.HomeController.products()),format.raw/*33.94*/("""">Products</a></li>
		    <li """),_display_(/*34.12*/if(title == "Contact us")/*34.37*/{_display_(Seq[Any](format.raw/*34.38*/("""class="active"""")))}),format.raw/*34.53*/("""><a href=""""),_display_(/*34.64*/routes/*34.70*/.HomeController.contactUs()),format.raw/*34.97*/("""">Contact us</a></li>
		</ul>
	    </div>
	</nav>

	<div class="container-fluid">
	    <div class="row">
		<div class="col-sm-3">
		    <div class="well sidecol">
			<h2>News</h2>
			<h3>New product sub-category</h3>
			<p>Following the sudden and unprecedented volumes of trade in fashion paper bags, our <span class="redtext">bags</span> category has been extended to include a seventh subcategory, <span class="redtext">paper handbags</span>.
		    </div>
		</div>
		<div class="col-sm-6">
		    <div class="midcol">
                """),_display_(/*50.18*/content),format.raw/*50.25*/("""
		    """),format.raw/*51.7*/("""</div>
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
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Feb 20 16:53:20 GMT 2019
                  SOURCE: /home/wdd/Documents/Year2Project-CarSales/CarSalesSite/app/views/main.scala.html
                  HASH: e644b620186e43dfeb05ed4c1cc8e63918396cb1
                  MATRIX: 1206->260|1330->291|1436->370|1451->376|1511->415|1763->639|1792->640|1821->641|1927->719|1956->720|1989->726|2026->735|2055->736|2084->737|2160->785|2189->786|2222->792|2262->804|2291->805|2320->806|2367->825|2396->826|2429->832|2468->843|2497->844|2526->845|2610->901|2639->902|2672->908|2711->919|2740->920|2769->921|2835->959|2864->960|2897->966|2934->975|2963->976|2992->977|3032->989|3061->990|3090->992|3392->1267|3420->1286|3459->1287|3505->1302|3543->1313|3558->1319|3602->1342|3656->1369|3688->1392|3727->1393|3773->1408|3811->1419|3826->1425|3873->1451|3931->1482|3965->1507|4004->1508|4050->1523|4088->1534|4103->1540|4151->1567|4715->2104|4743->2111|4777->2118
                  LINES: 33->7|38->8|41->11|41->11|41->11|46->16|46->16|46->16|46->16|46->16|47->17|47->17|47->17|47->17|47->17|47->17|48->18|48->18|48->18|48->18|48->18|48->18|49->19|49->19|49->19|49->19|49->19|49->19|50->20|50->20|50->20|50->20|50->20|50->20|51->21|51->21|51->21|51->21|51->21|51->21|52->22|62->32|62->32|62->32|62->32|62->32|62->32|62->32|63->33|63->33|63->33|63->33|63->33|63->33|63->33|64->34|64->34|64->34|64->34|64->34|64->34|64->34|80->50|80->50|81->51
                  -- GENERATED --
              */
          