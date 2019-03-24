
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
/*1.2*/import models.Inquiries
/*2.2*/import play.api.Environment

object inquiries extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[Inquiries],play.api.Environment,models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(inquiryList: List[Inquiries], env: play.api.Environment, user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Inquiries", user)/*5.25*/{_display_(Seq[Any](format.raw/*5.26*/("""
    """),format.raw/*6.5*/("""<h1>Inquiries</h1>
    
    <table class="table table-bordered table-striped">
		<thead>
			<!-- The header row-->
			<tr>
				<th>ID</th>
				<th>Full Name</th>
				<th>Email Address</th>
				<th>Phone Number</th>
				<th>Inquiry</th>
			</tr>
        </thead>
        
        <tbody>
			<!-- Product rows -->
			"""),_display_(/*22.5*/for(Inquiries <- inquiryList) yield /*22.34*/ {_display_(Seq[Any](format.raw/*22.36*/("""
			"""),format.raw/*23.4*/("""<tr scope="row">
				<td>"""),_display_(/*24.10*/Inquiries/*24.19*/.getId),format.raw/*24.25*/("""</td>
				<td>"""),_display_(/*25.10*/Inquiries/*25.19*/.getFullName),format.raw/*25.31*/("""</td>	
				<td>"""),_display_(/*26.10*/Inquiries/*26.19*/.getEmail),format.raw/*26.28*/("""</td>
				<td>"""),_display_(/*27.10*/Inquiries/*27.19*/.getPhoneNumber),format.raw/*27.34*/("""</td>
				<td>"""),_display_(/*28.10*/Inquiries/*28.19*/.getInquiry),format.raw/*28.30*/("""</td>
            </tr>
        """)))}),format.raw/*30.10*/("""
    """),format.raw/*31.5*/("""</tbody>
</table>
""")))}))
      }
    }
  }

  def render(inquiryList:List[Inquiries],env:play.api.Environment,user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(inquiryList,env,user)

  def f:((List[Inquiries],play.api.Environment,models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (inquiryList,env,user) => apply(inquiryList,env,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 24 19:52:20 GMT 2019
                  SOURCE: /home/wdd/Year2Project-CarSales/CarSalesSite/app/views/inquiries.scala.html
                  HASH: 2f3b3533eb2d4553051eff9425f0d06e5dad35df
                  MATRIX: 651->1|682->26|1066->55|1242->138|1269->140|1300->163|1338->164|1369->169|1711->485|1756->514|1796->516|1827->520|1880->546|1898->555|1925->561|1967->576|1985->585|2018->597|2061->613|2079->622|2109->631|2151->646|2169->655|2205->670|2247->685|2265->694|2297->705|2361->738|2393->743
                  LINES: 24->1|25->2|30->3|35->4|36->5|36->5|36->5|37->6|53->22|53->22|53->22|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|61->30|62->31
                  -- GENERATED --
              */
          