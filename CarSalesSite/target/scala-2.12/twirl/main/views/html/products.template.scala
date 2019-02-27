
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

object products extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Products")/*1.18*/{_display_(Seq[Any](format.raw/*1.19*/("""
	"""),format.raw/*2.2*/("""<h1>Products</h1>
	<h4>All cars listed are second hand, however all come fully serviced, valeted and with a valid NCT.</h4>
	<table class="table table-bordered table-hover table-condensed">
		<thead>
			<!-- The header row-->
			<tr>
				<th>ID</th>
				<th>Make</th>
				<th>Model</th>
				<th>Year</th>
				<th>Fuel Type</th>
				<th>Price</th>
				<th>Colour</th>
			</tr>
		</thead>

		<tbody>
			<!-- Product rows -->
		<tr>
			<td>1</td>
			<td>Volkswagen</td>
			<td>Polo</td>
			<td>2012</td>
			<td>Petrol</td>
			<td>7750</td>
			<td>Red</td>
		</tr>

		<tr>
			<td>2</td>
			<td>Opel</td>
			<td>Corsa</td>
			<td>2010</td>
			<td>Petrol</td>
			<td>6450</td>
			<td>Black</td>
		</tr>

		<tr>
			<td>3</td>
			<td>Renault</td>
			<td>Clio</td>
			<td>2014</td>
			<td>Petrol</td>
			<td>8800</td>
			<td>Silver</td>
		</tr>
		</tbody>
	</table>
""")))}),format.raw/*51.2*/("""

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
                  DATE: Wed Feb 27 15:37:20 GMT 2019
                  SOURCE: /home/wdd/Year2Project-CarSales/CarSalesSite/app/views/products.scala.html
                  HASH: 4c351013b6434d29737decd1e2743c1b3a7cd503
                  MATRIX: 1033->1|1057->17|1095->18|1124->21|2061->928
                  LINES: 33->1|33->1|33->1|34->2|83->51
                  -- GENERATED --
              */
          