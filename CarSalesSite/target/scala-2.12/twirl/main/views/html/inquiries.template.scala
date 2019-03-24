
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
				<th>Full Name</th>
				<th>Email Address</th>
				<th>Phone Number</th>
				<th>Inquiry</th>
			</tr>
        </thead>
        
        <tbody>
			<!-- Product rows -->
			"""),_display_(/*21.5*/for(Inquiries <- inquiryList) yield /*21.34*/ {_display_(Seq[Any](format.raw/*21.36*/("""
			"""),format.raw/*22.4*/("""<tr scope="row">
				<td>"""),_display_(/*23.10*/Inquiries/*23.19*/.getFullName),format.raw/*23.31*/("""</td>	
				<td>"""),_display_(/*24.10*/Inquiries/*24.19*/.getEmail),format.raw/*24.28*/("""</td>
				<td>"""),_display_(/*25.10*/Inquiries/*25.19*/.getPhoneNumber),format.raw/*25.34*/("""</td>
				<td>"""),_display_(/*26.10*/Inquiries/*26.19*/.getInquiry),format.raw/*26.30*/("""</td>
            </tr>
        """)))}),format.raw/*28.10*/("""
    """),format.raw/*29.5*/("""</tbody>
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
                  DATE: Sun Mar 24 20:47:49 GMT 2019
                  SOURCE: /home/wdd/Year2Project-CarSales/CarSalesSite/app/views/inquiries.scala.html
                  HASH: 781ae2ed2d35e200a243292d3eca685db3ecbcd9
                  MATRIX: 651->1|682->26|1066->55|1242->138|1269->140|1300->163|1338->164|1369->169|1695->469|1740->498|1780->500|1811->504|1864->530|1882->539|1915->551|1958->567|1976->576|2006->585|2048->600|2066->609|2102->624|2144->639|2162->648|2194->659|2258->692|2290->697
                  LINES: 24->1|25->2|30->3|35->4|36->5|36->5|36->5|37->6|52->21|52->21|52->21|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|59->28|60->29
                  -- GENERATED --
              */
          