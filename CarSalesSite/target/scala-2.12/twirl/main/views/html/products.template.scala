
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

	"""),_display_(/*8.3*/if(flash.containsKey("success"))/*8.35*/{_display_(Seq[Any](format.raw/*8.36*/("""
		"""),format.raw/*9.3*/("""<div class="alert alert-success">
			"""),_display_(/*10.5*/flash/*10.10*/.get("success")),format.raw/*10.25*/("""
		"""),format.raw/*11.3*/("""</div>
	""")))}),format.raw/*12.3*/("""

	"""),format.raw/*14.2*/("""<table class="table table-bordered table-striped">
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
			"""),_display_(/*30.5*/for(product <- productList) yield /*30.32*/ {_display_(Seq[Any](format.raw/*30.34*/("""
			"""),format.raw/*31.4*/("""<tr scope="row">
				<td>"""),_display_(/*32.10*/product/*32.17*/.getId),format.raw/*32.23*/("""</td>
				<td>"""),_display_(/*33.10*/product/*33.17*/.getMake),format.raw/*33.25*/("""</td>	
				<td>"""),_display_(/*34.10*/product/*34.17*/.getModel),format.raw/*34.26*/("""</td>
				<td>"""),_display_(/*35.10*/product/*35.17*/.getYear),format.raw/*35.25*/("""</td>
				<td>"""),_display_(/*36.10*/product/*36.17*/.getFuelType),format.raw/*36.29*/("""</td>
				<td>&euro;"""),_display_(/*37.16*/product/*37.23*/.getPrice),format.raw/*37.32*/("""</td>
				<td>"""),_display_(/*38.10*/product/*38.17*/.getColour),format.raw/*38.27*/("""</td>
				<td>
					<a href=""""),_display_(/*40.16*/routes/*40.22*/.HomeController.updateItem(id)),format.raw/*40.52*/("""" class="button-xs btn-danger">
						<span class="glyphicon glyphicon-pencil"></span>
					</a>
				</td>
				<td>
					<a href=""""),_display_(/*45.16*/routes/*45.22*/.HomeController.deleteItem(p.getId)),format.raw/*45.57*/("""" class="button-xs btn-danger">
						<span class="glyphicon glyphicon-trash"></span>
					</a>
				</td>
			</tr>
			""")))}),format.raw/*50.5*/("""
		"""),format.raw/*51.3*/("""</tbody>
	</table>
	<p>
		<a href=""""),_display_(/*54.13*/routes/*54.19*/.HomeController.addItem()),format.raw/*54.44*/("""">
			<button class="btn btn-primary">Add a product</button>
		</a>
	</p>
""")))}),format.raw/*58.2*/("""


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
                  DATE: Tue Mar 05 17:41:48 GMT 2019
                  SOURCE: /home/wdd/Year2Project-CarSales/CarSalesSite/app/views/products.scala.html
                  HASH: 8500243e7baea6a5869a0bb84c6b9f0a5429c87d
                  MATRIX: 651->1|987->25|1110->53|1140->58|1164->74|1202->75|1231->78|1386->208|1426->240|1464->241|1494->245|1559->284|1573->289|1609->304|1640->308|1680->318|1712->323|2042->627|2085->654|2125->656|2157->661|2211->688|2227->695|2254->701|2297->717|2313->724|2342->732|2386->749|2402->756|2432->765|2475->781|2491->788|2520->796|2563->812|2579->819|2612->831|2661->853|2677->860|2707->869|2750->885|2766->892|2797->902|2856->934|2871->940|2922->970|3085->1106|3100->1112|3156->1147|3310->1271|3341->1275|3407->1314|3422->1320|3468->1345|3577->1424
                  LINES: 24->1|29->2|34->2|36->4|36->4|36->4|37->5|40->8|40->8|40->8|41->9|42->10|42->10|42->10|43->11|44->12|46->14|62->30|62->30|62->30|63->31|64->32|64->32|64->32|65->33|65->33|65->33|66->34|66->34|66->34|67->35|67->35|67->35|68->36|68->36|68->36|69->37|69->37|69->37|70->38|70->38|70->38|72->40|72->40|72->40|77->45|77->45|77->45|82->50|83->51|86->54|86->54|86->54|90->58
                  -- GENERATED --
              */
          