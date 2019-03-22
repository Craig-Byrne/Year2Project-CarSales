
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
			"""),_display_(/*32.5*/for(product <- productList) yield /*32.32*/ {_display_(Seq[Any](format.raw/*32.34*/("""
			"""),format.raw/*33.4*/("""<tr scope="row">
					"""),_display_(/*34.7*/if(env.resource("public/images/productImages/" + product.getId + "thumb.jpg").isDefined)/*34.95*/ {_display_(Seq[Any](format.raw/*34.97*/("""
						"""),format.raw/*35.7*/("""<td><img src="/assets/images/productImages/"""),_display_(/*35.51*/(product.getId + "thumb.jpg")),format.raw/*35.80*/(""""/></td>
					""")))}/*36.8*/else/*36.13*/{_display_(Seq[Any](format.raw/*36.14*/("""
					"""),format.raw/*37.6*/("""<td><img src="/assets/images/productImages/noImage.jpg"/></td>
				""")))}),format.raw/*38.6*/("""
				"""),format.raw/*39.5*/("""<td>"""),_display_(/*39.10*/product/*39.17*/.getId),format.raw/*39.23*/("""</td>
				<td>"""),_display_(/*40.10*/product/*40.17*/.getMake),format.raw/*40.25*/("""</td>	
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
                  DATE: Fri Mar 22 12:19:09 GMT 2019
                  SOURCE: /home/wdd/Year2Project-CarSales/CarSalesSite/app/views/products.scala.html
                  HASH: f4d2337657316ff6e92ef12165626af149ac9120
                  MATRIX: 651->1|680->25|1061->55|1236->135|1266->140|1296->162|1334->163|1363->166|1518->296|1558->328|1596->329|1627->333|1692->372|1706->377|1742->392|1773->396|1813->406|1845->411|2195->735|2238->762|2278->764|2310->769|2360->793|2457->881|2497->883|2532->891|2603->935|2653->964|2687->981|2700->986|2739->987|2773->994|2872->1063|2905->1069|2937->1074|2953->1081|2980->1087|3023->1103|3039->1110|3068->1118|3112->1135|3128->1142|3158->1151|3201->1167|3217->1174|3246->1182|3289->1198|3305->1205|3338->1217|3387->1239|3403->1246|3433->1255|3476->1271|3492->1278|3523->1288|3582->1320|3597->1326|3662->1370|3825->1506|3840->1512|3905->1556|4090->1711|4121->1715|4187->1754|4202->1760|4251->1788
                  LINES: 24->1|25->2|30->3|35->3|37->5|37->5|37->5|38->6|41->9|41->9|41->9|42->10|43->11|43->11|43->11|44->12|45->13|47->15|64->32|64->32|64->32|65->33|66->34|66->34|66->34|67->35|67->35|67->35|68->36|68->36|68->36|69->37|70->38|71->39|71->39|71->39|71->39|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|75->43|76->44|76->44|76->44|77->45|77->45|77->45|79->47|79->47|79->47|84->52|84->52|84->52|89->57|90->58|93->61|93->61|93->61
                  -- GENERATED --
              */
          