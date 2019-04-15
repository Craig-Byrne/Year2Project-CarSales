
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
                <th>Update</th>
                <th>Delete</th>
            </tr>
        </thead>
        
        """),_display_(/*26.10*/for(user <- userList) yield /*26.31*/ {_display_(Seq[Any](format.raw/*26.33*/("""
            """),format.raw/*27.13*/("""<tr scope="row">
                <td>"""),_display_(/*28.22*/user/*28.26*/.getName),format.raw/*28.34*/("""</td>	
				<td>"""),_display_(/*29.10*/user/*29.14*/.getRole),format.raw/*29.22*/("""</td>
                <td>"""),_display_(/*30.22*/user/*30.26*/.getEmail),format.raw/*30.35*/("""</td>
                <td>
					<a href=""""),_display_(/*32.16*/routes/*32.22*/.HomeController.updateUser(user.getId)),format.raw/*32.60*/("""" class="button-xs btn-danger">
						<span class="glyphicon glyphicon-pencil"></span>
					</a>
				</td>
                <td>
                        <a href=""""),_display_(/*37.35*/routes/*37.41*/.HomeController.deleteUser(user.getId)),format.raw/*37.79*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                            <span class="glyphicon glyphicon-trash"></span>
                        </a>
                    </td>
            </tr>
        """)))}),format.raw/*42.10*/("""
    """),format.raw/*43.5*/("""</tbody>
</table>
<p>
    <a href=""""),_display_(/*46.15*/routes/*46.21*/.HomeController.addUser()),format.raw/*46.46*/("""">
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
                  DATE: Mon Apr 15 12:19:49 IST 2019
                  SOURCE: /home/wdd/Year2Project-CarSales/CarSalesSite/app/views/users.scala.html
                  HASH: c4cd0ea83eb077bd6e1bb8687fbb02ac30eebc91
                  MATRIX: 651->1|683->27|1058->56|1226->131|1253->133|1280->152|1318->153|1346->155|1389->173|1429->205|1467->206|1496->209|1560->247|1574->252|1610->267|1640->270|1679->279|1709->282|2015->561|2052->582|2092->584|2133->597|2198->635|2211->639|2240->647|2283->663|2296->667|2325->675|2379->702|2392->706|2422->715|2491->757|2506->763|2565->801|2754->963|2769->969|2828->1007|3080->1228|3112->1233|3175->1269|3190->1275|3236->1300
                  LINES: 24->1|25->2|30->3|35->4|36->5|36->5|36->5|37->6|39->8|39->8|39->8|40->9|41->10|41->10|41->10|42->11|43->12|45->14|57->26|57->26|57->26|58->27|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|63->32|63->32|63->32|68->37|68->37|68->37|73->42|74->43|77->46|77->46|77->46
                  -- GENERATED --
              */
          