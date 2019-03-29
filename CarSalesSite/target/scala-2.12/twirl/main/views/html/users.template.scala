
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
/*1.2*/import models.users.User
/*2.2*/import play.api.Environment

object users extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[User],play.api.Environment,models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(userList: List[User], env: play.api.Environment, user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Users", user)/*5.21*/{_display_(Seq[Any](format.raw/*5.22*/("""
	"""),format.raw/*6.2*/("""<h1>Users</h1>

	"""),_display_(/*8.3*/if(flash.containsKey("success"))/*8.35*/{_display_(Seq[Any](format.raw/*8.36*/("""
		"""),format.raw/*9.3*/("""<div class="alert alert-success">
			"""),_display_(/*10.5*/flash/*10.10*/.get("success")),format.raw/*10.25*/("""
		"""),format.raw/*11.3*/("""</div>
	""")))}),format.raw/*12.3*/("""

	"""),format.raw/*14.2*/("""<table class="table table-bordered table-striped">
		<thead>
			<!-- The header row-->
			<tr>
				<th>Name</th>
				<th>Role</th>
                <th>Email</th>
                <th>Delete</th>
            </tr>
        </thead>
        
        """),_display_(/*25.10*/for(user <- userList) yield /*25.31*/ {_display_(Seq[Any](format.raw/*25.33*/("""
            """),format.raw/*26.13*/("""<tr scope="row">
                <td>"""),_display_(/*27.22*/user/*27.26*/.getName),format.raw/*27.34*/("""</td>	
				<td>"""),_display_(/*28.10*/user/*28.14*/.getRole),format.raw/*28.22*/("""</td>
                <td>"""),_display_(/*29.22*/user/*29.26*/.getEmail),format.raw/*29.35*/("""</td>
                <td>
                        <a href=""""),_display_(/*31.35*/routes/*31.41*/.HomeController.deleteUser(user.getId)),format.raw/*31.79*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                            <span class="glyphicon glyphicon-trash"></span>
                        </a>
                    </td>
            </tr>
        """)))}),format.raw/*36.10*/("""
    """),format.raw/*37.5*/("""</tbody>
</table>
<p>
    <a href=""""),_display_(/*40.15*/routes/*40.21*/.HomeController.addUser()),format.raw/*40.46*/("""">
        <button class="btn btn-primary">Add a user</button>
    </a>
</p>
""")))}))
      }
    }
  }

  def render(userList:List[User],env:play.api.Environment,user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(userList,env,user)

  def f:((List[User],play.api.Environment,models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (userList,env,user) => apply(userList,env,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 29 00:24:26 GMT 2019
                  SOURCE: /home/wdd/Year2Project-CarSales/CarSalesSite/app/views/users.scala.html
                  HASH: 2aa2f23c84315c527b531a65e38b02b12252585d
                  MATRIX: 651->1|683->27|1058->56|1226->131|1253->133|1280->152|1318->153|1346->155|1389->173|1429->205|1467->206|1496->209|1560->247|1574->252|1610->267|1640->270|1679->279|1709->282|1983->529|2020->550|2060->552|2101->565|2166->603|2179->607|2208->615|2251->631|2264->635|2293->643|2347->670|2360->674|2390->683|2478->744|2493->750|2552->788|2804->1009|2836->1014|2899->1050|2914->1056|2960->1081
                  LINES: 24->1|25->2|30->3|35->4|36->5|36->5|36->5|37->6|39->8|39->8|39->8|40->9|41->10|41->10|41->10|42->11|43->12|45->14|56->25|56->25|56->25|57->26|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|62->31|62->31|62->31|67->36|68->37|71->40|71->40|71->40
                  -- GENERATED --
              */
          