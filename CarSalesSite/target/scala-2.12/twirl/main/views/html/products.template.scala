
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
/*2.2*/import play.api.Environment

object products extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[Product],play.api.Environment,models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(productList: List[Product], env: play.api.Environment, user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.82*/("""

"""),_display_(/*5.2*/main("Products", user)/*5.24*/{_display_(Seq[Any](format.raw/*5.25*/("""
	"""),format.raw/*6.2*/("""<h1>Products</h1>
	<h4>All cars listed are second hand, however all come fully serviced, valeted and with a valid NCT.</h4>

	"""),_display_(/*9.3*/if(flash.containsKey("success"))/*9.35*/{_display_(Seq[Any](format.raw/*9.36*/("""
		"""),format.raw/*10.3*/("""<div class="alert alert-success">
			"""),_display_(/*11.5*/flash/*11.10*/.get("success")),format.raw/*11.25*/("""
		"""),format.raw/*12.3*/("""</div>
	""")))}),format.raw/*13.3*/("""

	"""),format.raw/*15.2*/("""<table class="table table-bordered table-striped">
		<thead>
			<!-- The header row-->
			<tr>
				<th>Image</th>
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
			"""),_display_(/*31.5*/for(product <- productList) yield /*31.32*/ {_display_(Seq[Any](format.raw/*31.34*/("""
			"""),format.raw/*32.4*/("""<tr scope="row">
					"""),_display_(/*33.7*/if(env.resource("public/images/productImages/" + product.getId + "thumb.jpg").isDefined)/*33.95*/ {_display_(Seq[Any](format.raw/*33.97*/("""
						"""),format.raw/*34.7*/("""<td><img src="/assets/images/productImages/"""),_display_(/*34.51*/(product.getId + "thumb.jpg")),format.raw/*34.80*/(""""/></td>
					""")))}/*35.8*/else/*35.13*/{_display_(Seq[Any](format.raw/*35.14*/("""
					"""),format.raw/*36.6*/("""<td><img src="/assets/images/productImages/noImage.jpg"/></td>
				""")))}),format.raw/*37.6*/("""
				"""),format.raw/*38.5*/("""<td>"""),_display_(/*38.10*/product/*38.17*/.getMake),format.raw/*38.25*/("""</td>	
				<td>"""),_display_(/*39.10*/product/*39.17*/.getModel),format.raw/*39.26*/("""</td>
				<td>"""),_display_(/*40.10*/product/*40.17*/.getYear),format.raw/*40.25*/("""</td>
				<td>"""),_display_(/*41.10*/product/*41.17*/.getFuelType),format.raw/*41.29*/("""</td>
				<td>&euro;"""),_display_(/*42.16*/product/*42.23*/.getPrice),format.raw/*42.32*/("""</td>
				<td>"""),_display_(/*43.10*/product/*43.17*/.getColour),format.raw/*43.27*/("""</td>
				<td>
					<a href=""""),_display_(/*45.16*/routes/*45.22*/.HomeController.updateProduct(product.getId)),format.raw/*45.66*/("""" class="button-xs btn-danger">
						<span class="glyphicon glyphicon-pencil"></span>
					</a>
				</td>
				<td>
					<a href=""""),_display_(/*50.16*/routes/*50.22*/.HomeController.deleteProduct(product.getId)),format.raw/*50.66*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
						<span class="glyphicon glyphicon-trash"></span>
					</a>
				</td>
			</tr>
			""")))}),format.raw/*55.5*/("""
		"""),format.raw/*56.3*/("""</tbody>
	</table>
	<p>
		<a href=""""),_display_(/*59.13*/routes/*59.19*/.HomeController.addProduct()),format.raw/*59.47*/("""">
			<button class="btn btn-primary">Add a product</button>
		</a>
	</p>
""")))}))
      }
    }
  }

  def render(productList:List[Product],env:play.api.Environment,user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(productList,env,user)

  def f:((List[Product],play.api.Environment,models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (productList,env,user) => apply(productList,env,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 24 20:47:49 GMT 2019
                  SOURCE: /home/wdd/Year2Project-CarSales/CarSalesSite/app/views/products.scala.html
                  HASH: 021a1e1df96dca62d77bb5530be3814d8832e753
                  MATRIX: 651->1|680->25|1061->55|1236->135|1266->140|1296->162|1334->163|1363->166|1518->296|1558->328|1596->329|1627->333|1692->372|1706->377|1742->392|1773->396|1813->406|1845->411|2178->718|2221->745|2261->747|2293->752|2343->776|2440->864|2480->866|2515->874|2586->918|2636->947|2670->964|2683->969|2722->970|2756->977|2855->1046|2888->1052|2920->1057|2936->1064|2965->1072|3009->1089|3025->1096|3055->1105|3098->1121|3114->1128|3143->1136|3186->1152|3202->1159|3235->1171|3284->1193|3300->1200|3330->1209|3373->1225|3389->1232|3420->1242|3479->1274|3494->1280|3559->1324|3722->1460|3737->1466|3802->1510|3987->1665|4018->1669|4084->1708|4099->1714|4148->1742
                  LINES: 24->1|25->2|30->3|35->3|37->5|37->5|37->5|38->6|41->9|41->9|41->9|42->10|43->11|43->11|43->11|44->12|45->13|47->15|63->31|63->31|63->31|64->32|65->33|65->33|65->33|66->34|66->34|66->34|67->35|67->35|67->35|68->36|69->37|70->38|70->38|70->38|70->38|71->39|71->39|71->39|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|75->43|77->45|77->45|77->45|82->50|82->50|82->50|87->55|88->56|91->59|91->59|91->59
                  -- GENERATED --
              */
          