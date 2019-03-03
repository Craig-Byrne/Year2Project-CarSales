
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
/*1.2*/import models.Product

object products extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(productList: List[Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.30*/("""

"""),_display_(/*4.2*/main("Products")/*4.18*/{_display_(Seq[Any](format.raw/*4.19*/("""
	"""),format.raw/*5.2*/("""<h1>Products</h1>
	<h4>All cars listed are second hand, however all come fully serviced, valeted and with a valid NCT.</h4>
	<table class="table table-bordered table-striped">
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
			"""),_display_(/*23.5*/for(product <- productList) yield /*23.32*/ {_display_(Seq[Any](format.raw/*23.34*/("""
			"""),format.raw/*24.4*/("""<tr scope="row">
				<td>"""),_display_(/*25.10*/product/*25.17*/.getId),format.raw/*25.23*/("""</td>
				<td>"""),_display_(/*26.10*/product/*26.17*/.getMake),format.raw/*26.25*/("""</td>	
				<td>"""),_display_(/*27.10*/product/*27.17*/.getModel),format.raw/*27.26*/("""</td>
				<td>"""),_display_(/*28.10*/product/*28.17*/.getYear),format.raw/*28.25*/("""</td>
				<td>"""),_display_(/*29.10*/product/*29.17*/.getFuelType),format.raw/*29.29*/("""</td>
				<td>&euro;"""),_display_(/*30.16*/product/*30.23*/.getPrice),format.raw/*30.32*/("""</td>
				<td>"""),_display_(/*31.10*/product/*31.17*/.getColour),format.raw/*31.27*/("""</td>
			</tr>
			""")))}),format.raw/*33.5*/("""
		"""),format.raw/*34.3*/("""</tbody>
	</table>
""")))}),format.raw/*36.2*/("""


"""))
      }
    }
  }

  def render(productList:List[Product]): play.twirl.api.HtmlFormat.Appendable = apply(productList)

  def f:((List[Product]) => play.twirl.api.HtmlFormat.Appendable) = (productList) => apply(productList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 03 20:10:40 GMT 2019
                  SOURCE: /home/wdd/Year2Project-CarSales/CarSalesSite/app/views/products.scala.html
                  HASH: da5035d174b984f38af04286db87f8e2ccf0d035
                  MATRIX: 651->1|987->25|1110->53|1140->58|1164->74|1202->75|1231->78|1688->509|1731->536|1771->538|1803->543|1857->570|1873->577|1900->583|1943->599|1959->606|1988->614|2032->631|2048->638|2078->647|2121->663|2137->670|2166->678|2209->694|2225->701|2258->713|2307->735|2323->742|2353->751|2396->767|2412->774|2443->784|2494->805|2525->809|2577->831
                  LINES: 24->1|29->2|34->2|36->4|36->4|36->4|37->5|55->23|55->23|55->23|56->24|57->25|57->25|57->25|58->26|58->26|58->26|59->27|59->27|59->27|60->28|60->28|60->28|61->29|61->29|61->29|62->30|62->30|62->30|63->31|63->31|63->31|65->33|66->34|68->36
                  -- GENERATED --
              */
          