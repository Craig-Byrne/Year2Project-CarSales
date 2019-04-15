
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
				<th>Update</th>
				<th>Delete</th>
			</tr>
		</thead>

		<tbody>
			<!-- Product rows -->
			"""),_display_(/*33.5*/for(product <- productList) yield /*33.32*/ {_display_(Seq[Any](format.raw/*33.34*/("""
			"""),format.raw/*34.4*/("""<tr scope="row">
					"""),_display_(/*35.7*/if(env.resource("public/images/productImages/" + product.getId + "thumb.jpg").isDefined)/*35.95*/ {_display_(Seq[Any](format.raw/*35.97*/("""
						"""),format.raw/*36.7*/("""<td><img src="/assets/images/productImages/"""),_display_(/*36.51*/(product.getId + "thumb.jpg")),format.raw/*36.80*/(""""/></td>
					""")))}/*37.8*/else/*37.13*/{_display_(Seq[Any](format.raw/*37.14*/("""
					"""),format.raw/*38.6*/("""<td><img src="/assets/images/productImages/noImage.jpg"/></td>
				""")))}),format.raw/*39.6*/("""
				"""),format.raw/*40.5*/("""<td>"""),_display_(/*40.10*/product/*40.17*/.getMake),format.raw/*40.25*/("""</td>	
				<td>"""),_display_(/*41.10*/product/*41.17*/.getModel),format.raw/*41.26*/("""</td>
				<td>"""),_display_(/*42.10*/product/*42.17*/.getYear),format.raw/*42.25*/("""</td>
				<td>"""),_display_(/*43.10*/product/*43.17*/.getFuelType),format.raw/*43.29*/("""</td>
				<td>&euro;"""),_display_(/*44.16*/product/*44.23*/.getPrice),format.raw/*44.32*/("""</td>
				<td>"""),_display_(/*45.10*/product/*45.17*/.getColour),format.raw/*45.27*/("""</td>
				<td>
					<a href=""""),_display_(/*47.16*/routes/*47.22*/.HomeController.updateProduct(product.getId)),format.raw/*47.66*/("""" class="button-xs btn-danger">
						<span class="glyphicon glyphicon-pencil"></span>
					</a>
				</td>
				<td>
					<a href=""""),_display_(/*52.16*/routes/*52.22*/.HomeController.deleteProduct(product.getId)),format.raw/*52.66*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
						<span class="glyphicon glyphicon-trash"></span>
					</a>
				</td>
			</tr>
			""")))}),format.raw/*57.5*/("""
		"""),format.raw/*58.3*/("""</tbody>
	</table>
	<p>
		<a href=""""),_display_(/*61.13*/routes/*61.19*/.HomeController.addProduct()),format.raw/*61.47*/("""">
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
                  DATE: Mon Apr 15 13:15:41 IST 2019
                  SOURCE: /home/wdd/Year2Project-CarSales/CarSalesSite/app/views/products.scala.html
                  HASH: 39f69545a24301de93bae4a2b744e0b9b3f31fb0
                  MATRIX: 651->1|680->25|1061->55|1236->135|1266->140|1296->162|1334->163|1363->166|1518->296|1558->328|1596->329|1627->333|1692->372|1706->377|1742->392|1773->396|1813->406|1845->411|2220->760|2263->787|2303->789|2335->794|2385->818|2482->906|2522->908|2557->916|2628->960|2678->989|2712->1006|2725->1011|2764->1012|2798->1019|2897->1088|2930->1094|2962->1099|2978->1106|3007->1114|3051->1131|3067->1138|3097->1147|3140->1163|3156->1170|3185->1178|3228->1194|3244->1201|3277->1213|3326->1235|3342->1242|3372->1251|3415->1267|3431->1274|3462->1284|3521->1316|3536->1322|3601->1366|3764->1502|3779->1508|3844->1552|4029->1707|4060->1711|4126->1750|4141->1756|4190->1784
                  LINES: 24->1|25->2|30->3|35->3|37->5|37->5|37->5|38->6|41->9|41->9|41->9|42->10|43->11|43->11|43->11|44->12|45->13|47->15|65->33|65->33|65->33|66->34|67->35|67->35|67->35|68->36|68->36|68->36|69->37|69->37|69->37|70->38|71->39|72->40|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|75->43|76->44|76->44|76->44|77->45|77->45|77->45|79->47|79->47|79->47|84->52|84->52|84->52|89->57|90->58|93->61|93->61|93->61
                  -- GENERATED --
              */
          