
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

object products extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.Product,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(product: models.Product):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""

"""),_display_(/*3.2*/main("Products")/*3.18*/{_display_(Seq[Any](format.raw/*3.19*/("""
	"""),format.raw/*4.2*/("""<h1>Products</h1>
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
			<tr scope="row">
				<td>"""),_display_(/*23.10*/product/*23.17*/.getId),format.raw/*23.23*/("""</td>
				<td>"""),_display_(/*24.10*/product/*24.17*/.getMake),format.raw/*24.25*/("""</td>	
				<td>"""),_display_(/*25.10*/product/*25.17*/.getModel),format.raw/*25.26*/("""</td>
				<td>"""),_display_(/*26.10*/product/*26.17*/.getYear),format.raw/*26.25*/("""</td>
				<td>"""),_display_(/*27.10*/product/*27.17*/.getFuelType),format.raw/*27.29*/("""</td>
				<td>&euro;"""),_display_(/*28.16*/product/*28.23*/.getPrice),format.raw/*28.32*/("""</td>
				<td>"""),_display_(/*29.10*/product/*29.17*/.getColour),format.raw/*29.27*/("""</td>
			</tr>
		</tbody>
	</table>
""")))}),format.raw/*33.2*/("""

"""))
      }
    }
  }

  def render(product:models.Product): play.twirl.api.HtmlFormat.Appendable = apply(product)

  def f:((models.Product) => play.twirl.api.HtmlFormat.Appendable) = (product) => apply(product)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Mar 02 16:21:18 GMT 2019
                  SOURCE: /home/wdd/Year2Project-CarSales/CarSalesSite/app/views/products.scala.html
                  HASH: 263804f131e20e2b7eef35f11e0b5299912e0b84
                  MATRIX: 959->1|1079->26|1109->31|1133->47|1171->48|1200->51|1684->508|1700->515|1727->521|1770->537|1786->544|1815->552|1859->569|1875->576|1905->585|1948->601|1964->608|1993->616|2036->632|2052->639|2085->651|2134->673|2150->680|2180->689|2223->705|2239->712|2270->722|2341->763
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|55->23|55->23|55->23|56->24|56->24|56->24|57->25|57->25|57->25|58->26|58->26|58->26|59->27|59->27|59->27|60->28|60->28|60->28|61->29|61->29|61->29|65->33
                  -- GENERATED --
              */
          