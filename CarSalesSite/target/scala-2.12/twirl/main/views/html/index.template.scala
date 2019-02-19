
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
    <head>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta charset="UTF-8"/>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<style>
	    .footer """),format.raw/*8.14*/("""{"""),format.raw/*8.15*/(""" """),format.raw/*8.16*/("""font-weight: bold; color: white; background-color: black; """),format.raw/*8.74*/("""}"""),format.raw/*8.75*/("""
	    """),format.raw/*9.6*/(""".sidecol """),format.raw/*9.15*/("""{"""),format.raw/*9.16*/(""" """),format.raw/*9.17*/("""font-weight: bold; background-color: steelblue; """),format.raw/*9.65*/("""}"""),format.raw/*9.66*/("""
	    """),format.raw/*10.6*/(""".sidecol h2 """),format.raw/*10.18*/("""{"""),format.raw/*10.19*/(""" """),format.raw/*10.20*/("""font-weight: bold; """),format.raw/*10.39*/("""}"""),format.raw/*10.40*/("""
	    """),format.raw/*11.6*/(""".midcol h1 """),format.raw/*11.17*/("""{"""),format.raw/*11.18*/(""" """),format.raw/*11.19*/("""margin-top: 2em; text-align: center; font-weight: bold; """),format.raw/*11.75*/("""}"""),format.raw/*11.76*/("""
	    """),format.raw/*12.6*/(""".midcol h3 """),format.raw/*12.17*/("""{"""),format.raw/*12.18*/(""" """),format.raw/*12.19*/("""text-align: center; color: steelblue; """),format.raw/*12.57*/("""}"""),format.raw/*12.58*/("""
	    """),format.raw/*13.6*/(""".redtext """),format.raw/*13.15*/("""{"""),format.raw/*13.16*/(""" """),format.raw/*13.17*/("""color: red; """),format.raw/*13.29*/("""}"""),format.raw/*13.30*/("""
	"""),format.raw/*14.2*/("""</style>
	<title>Online Flea Market</title>
    </head>
    <body>
	<nav class="navbar navbar-inverse">
	    <div class="container-fluid">
		<div class="navbar-header">
		    <a class="navbar-brand" href="#">WebSiteName</a>
		</div>
		<ul class="nav navbar-nav">
		    <li class="active"><a href="#">Home</a></li>
		    <li><a href="#">Products</a></li>
		    <li><a href="#">About us</a></li>
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
			<h1>Welcome to the Online Flea Market!</h1>
			<h3>The place where you can buy anything and sell anyting<br/> (as long as it is legal and morally ok)</h3>
		    </div>
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
			Website created by ABC Sights
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

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Feb 19 16:33:26 GMT 2019
                  SOURCE: /home/wdd/Documents/Year2Project-CarSales/CarSalesSite/app/views/index.scala.html
                  HASH: 701bfdcf55962f768999f20aaa01b1878b6a53bb
                  MATRIX: 1030->0|1319->262|1347->263|1375->264|1460->322|1488->323|1521->330|1557->339|1585->340|1613->341|1688->389|1716->390|1750->397|1790->409|1819->410|1848->411|1895->430|1924->431|1958->438|1997->449|2026->450|2055->451|2139->507|2168->508|2202->515|2241->526|2270->527|2299->528|2365->566|2394->567|2428->574|2465->583|2494->584|2523->585|2563->597|2592->598|2622->601
                  LINES: 33->1|40->8|40->8|40->8|40->8|40->8|41->9|41->9|41->9|41->9|41->9|41->9|42->10|42->10|42->10|42->10|42->10|42->10|43->11|43->11|43->11|43->11|43->11|43->11|44->12|44->12|44->12|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|46->14
                  -- GENERATED --
              */
          