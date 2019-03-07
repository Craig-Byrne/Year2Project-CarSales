
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

object products extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[Product],play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(productList: List[Product], env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.57*/("""

"""),_display_(/*5.2*/main("Products")/*5.18*/{_display_(Seq[Any](format.raw/*5.19*/("""
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

  def render(productList:List[Product],env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(productList,env)

  def f:((List[Product],play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (productList,env) => apply(productList,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 07 17:01:12 GMT 2019
                  SOURCE: /home/wdd/Year2Project-CarSales/CarSalesSite/app/views/products.scala.html
                  HASH: 08996e4e61848c7bf774805757b08c3269d1a3d6
                  MATRIX: 651->1|680->25|1043->55|1193->110|1223->115|1247->131|1285->132|1314->135|1469->265|1509->297|1547->298|1578->302|1643->341|1657->346|1693->361|1724->365|1764->375|1796->380|2146->704|2189->731|2229->733|2261->738|2311->762|2408->850|2448->852|2483->860|2554->904|2604->933|2638->950|2651->955|2690->956|2724->963|2823->1032|2856->1038|2888->1043|2904->1050|2931->1056|2974->1072|2990->1079|3019->1087|3063->1104|3079->1111|3109->1120|3152->1136|3168->1143|3197->1151|3240->1167|3256->1174|3289->1186|3338->1208|3354->1215|3384->1224|3427->1240|3443->1247|3474->1257|3533->1289|3548->1295|3613->1339|3776->1475|3791->1481|3856->1525|4041->1680|4072->1684|4138->1723|4153->1729|4202->1757
                  LINES: 24->1|25->2|30->3|35->3|37->5|37->5|37->5|38->6|41->9|41->9|41->9|42->10|43->11|43->11|43->11|44->12|45->13|47->15|64->32|64->32|64->32|65->33|66->34|66->34|66->34|67->35|67->35|67->35|68->36|68->36|68->36|69->37|70->38|71->39|71->39|71->39|71->39|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|75->43|76->44|76->44|76->44|77->45|77->45|77->45|79->47|79->47|79->47|84->52|84->52|84->52|89->57|90->58|93->61|93->61|93->61
                  -- GENERATED --
              */
          