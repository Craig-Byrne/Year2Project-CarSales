
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
				<th>Rating Out Of 5</th>
				<th>Review</th>
				<th>Delete</th>
			</tr>
        </thead>
        
        <tbody>
			<!-- Product rows -->
			"""),_display_(/*20.5*/for(Reviews <- reviewList) yield /*20.31*/ {_display_(Seq[Any](format.raw/*20.33*/("""
			"""),format.raw/*21.4*/("""<tr scope="row">
				<td>"""),_display_(/*22.10*/Reviews/*22.17*/.getFullName),format.raw/*22.29*/("""</td>	
				<td>"""),_display_(/*23.10*/Reviews/*23.17*/.getRating),format.raw/*23.27*/("""</td>
				<td>"""),_display_(/*24.10*/Reviews/*24.17*/.getComment),format.raw/*24.28*/("""</td>
				<td>
					<a href=""""),_display_(/*26.16*/routes/*26.22*/.HomeController.deleteReview(Reviews.getId)),format.raw/*26.65*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
						<span class="glyphicon glyphicon-trash"></span>
					</a>
				</td>
            </tr>
        """)))}),format.raw/*31.10*/("""
    """),format.raw/*32.5*/("""</tbody>
</table>
<p>
    <a href=""""),_display_(/*35.15*/routes/*35.21*/.HomeController.addReview()),format.raw/*35.48*/("""">
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
                  DATE: Tue Apr 16 13:22:56 IST 2019
                  SOURCE: /home/wdd/Year2Project-CarSales/CarSalesSite/app/views/reviews.scala.html
                  HASH: ad096c62e4026ccc092101b72b3f6507b50bdc5b
                  MATRIX: 651->1|1038->30|1218->117|1245->119|1274->140|1312->141|1343->146|1662->439|1704->465|1744->467|1775->471|1828->497|1844->504|1877->516|1920->532|1936->539|1967->549|2009->564|2025->571|2057->582|2114->612|2129->618|2193->661|2388->825|2420->830|2483->866|2498->872|2546->899
                  LINES: 24->1|29->2|34->3|35->4|35->4|35->4|36->5|51->20|51->20|51->20|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|57->26|57->26|57->26|62->31|63->32|66->35|66->35|66->35
                  -- GENERATED --
              */
          