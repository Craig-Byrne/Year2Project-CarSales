
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
/*1.2*/import play.api.Environment

object reviews extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.Reviews],play.api.Environment,models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(reviewList: List[models.Reviews], env: play.api.Environment, user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Reviews", user)/*4.23*/{_display_(Seq[Any](format.raw/*4.24*/("""
    """),format.raw/*5.5*/("""<h1>Reviews</h1>
    
    <table class="table table-bordered table-striped">
		<thead>
			<!-- The header row-->
			<tr>
				<th>Full Name</th>
				<th>Email Address</th>
				<th>Review</th>
			</tr>
        </thead>
        
        <tbody>
			<!-- Product rows -->
			"""),_display_(/*19.5*/for(Reviews <- reviewList) yield /*19.31*/ {_display_(Seq[Any](format.raw/*19.33*/("""
			"""),format.raw/*20.4*/("""<tr scope="row">
				<td>"""),_display_(/*21.10*/Reviews/*21.17*/.getFullName),format.raw/*21.29*/("""</td>	
				<td>"""),_display_(/*22.10*/Reviews/*22.17*/.getEmail),format.raw/*22.26*/("""</td>
				<td>"""),_display_(/*23.10*/Reviews/*23.17*/.getReview),format.raw/*23.27*/("""</td>
				<td>
					<a href=""""),_display_(/*25.16*/routes/*25.22*/.HomeController.deleteReview(Reviews.getId)),format.raw/*25.65*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
						<span class="glyphicon glyphicon-trash"></span>
					</a>
				</td>
            </tr>
        """)))}),format.raw/*30.10*/("""
    """),format.raw/*31.5*/("""</tbody>
</table>
<p>
    <a href=""""),_display_(/*34.15*/routes/*34.21*/.HomeController.addReview()),format.raw/*34.48*/("""">
        <button class="btn btn-primary">Add your review</button>
    </a>
</p>
""")))}))
      }
    }
  }

  def render(reviewList:List[models.Reviews],env:play.api.Environment,user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(reviewList,env,user)

  def f:((List[models.Reviews],play.api.Environment,models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (reviewList,env,user) => apply(reviewList,env,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 29 13:23:14 GMT 2019
                  SOURCE: /home/wdd/Year2Project-CarSales/CarSalesSite/app/views/reviews.scala.html
                  HASH: 398c0141232d99d3f358ab9c010748fba7307136
                  MATRIX: 651->1|1038->30|1218->117|1245->119|1274->140|1312->141|1343->146|1640->417|1682->443|1722->445|1753->449|1806->475|1822->482|1855->494|1898->510|1914->517|1944->526|1986->541|2002->548|2033->558|2090->588|2105->594|2169->637|2364->801|2396->806|2459->842|2474->848|2522->875
                  LINES: 24->1|29->2|34->3|35->4|35->4|35->4|36->5|50->19|50->19|50->19|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|56->25|56->25|56->25|61->30|62->31|65->34|65->34|65->34
                  -- GENERATED --
              */
          