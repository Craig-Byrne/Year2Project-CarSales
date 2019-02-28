
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

		<tr>
			<td>4</td>
			<td>Ford</td>
			<td>Ka</td>
			<td>2010</td>
			<td>Petrol</td>
			<td>3000</td>
			<td>Silver</td>
		</tr>

		<tr>
			<td>5</td>
			<td>Ford</td>
			<td>Fiesta</td>
			<td>2013</td>
			<td>Petrol</td>
			<td>6700</td>
			<td>Silver</td>
		</tr>

		<tr>
			<td>6</td>
			<td>Ford</td>
			<td>Mondeo</td>
			<td>2007</td>
			<td>Petrol</td>
			<td>2600</td>
			<td>Silver</td>
		</tr>

		<tr>
			<td>7</td>
			<td>Volkswagen</td>
			<td>Passat</td>
			<td>2014</td>
			<td>Diesel</td>
			<td>9500</td>
			<td>Red</td>
		</tr>

		<tr>
			<td>8</td>
			<td>Seat</td>
			<td>Ibiza</td>
			<td>2016</td>
			<td>Petrol</td>
			<td>9000</td>
			<td>Grey</td>
		</tr>

		<tr>
			<td>9</td>
			<td>Volkswagen</td>
			<td>Golf</td>
			<td>2009</td>
			<td>Diesel</td>
			<td>6200</td>
			<td>White</td>
		</tr>

		<tr>
			<td>10</td>
			<td>Audi</td>
			<td>A3</td>
			<td>2014</td>
			<td>Petrol</td>
			<td>10500</td>
			<td>Black</td>
		</tr>
		</tbody>
	</table>
""")))}),format.raw/*121.2*/("""

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
                  DATE: Thu Feb 28 12:08:43 GMT 2019
                  SOURCE: /home/wdd/Year2Project/Year2Project-CarSales/CarSalesSite/app/views/products.scala.html
                  HASH: 20827ff034c82eff58269dc75f750f836d6f6838
                  MATRIX: 1033->1|1057->17|1095->18|1124->21|3094->1960
                  LINES: 33->1|33->1|33->1|34->2|153->121
                  -- GENERATED --
              */
          