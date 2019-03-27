
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

object admin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Admin", user)/*4.21*/{_display_(Seq[Any](format.raw/*4.22*/("""
    """),format.raw/*5.5*/("""<h1>Administration</h1>
    
    <p>
        View currently register users
		<a href=""""),_display_(/*9.13*/routes/*9.19*/.HomeController.users()),format.raw/*9.42*/("""">
			<button class="btn btn-primary">Registered users</button>
		</a>
    </p>

    <p>
        View customer inquiries
            <a href=""""),_display_(/*16.23*/routes/*16.29*/.HomeController.inquiries()),format.raw/*16.56*/("""">
                <button class="btn btn-primary">Inquiries</button>
            </a>
        </p>
""")))}))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 27 00:26:20 GMT 2019
                  SOURCE: /home/wdd/Year2Project-CarSales/CarSalesSite/app/views/admin.scala.html
                  HASH: ba331b47b5e751b5139f1387c114b2e73b8ad1f4
                  MATRIX: 959->1|1057->28|1101->44|1128->46|1155->65|1193->66|1224->71|1337->158|1351->164|1394->187|1564->330|1579->336|1627->363
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|36->5|40->9|40->9|40->9|47->16|47->16|47->16
                  -- GENERATED --
              */
          