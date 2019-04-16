
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Login],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Log in", user)/*4.22*/ {_display_(Seq[Any](format.raw/*4.24*/("""
    """),format.raw/*5.5*/("""<h1>Sign in</h1>
    """),_display_(/*6.6*/if(loginForm.hasGlobalErrors)/*6.35*/ {_display_(Seq[Any](format.raw/*6.37*/("""
        """),format.raw/*7.9*/("""<p class="alert alert-warning">
            """),_display_(/*8.14*/for(e <- loginForm.globalErrors) yield /*8.46*/ {_display_(Seq[Any](format.raw/*8.48*/("""
                """),_display_(/*9.18*/e/*9.19*/.message),format.raw/*9.27*/("""<br/>
            """)))}),format.raw/*10.14*/("""
        """),format.raw/*11.9*/("""</p>
    """)))}),format.raw/*12.6*/("""
	"""),_display_(/*13.3*/if(flash.containsKey("error"))/*13.33*/ {_display_(Seq[Any](format.raw/*13.35*/("""
		"""),format.raw/*14.3*/("""<div class="alert alert-success">
			"""),_display_(/*15.5*/flash/*15.10*/.get("error")),format.raw/*15.23*/("""
		"""),format.raw/*16.3*/("""</div>
	""")))}),format.raw/*17.3*/("""
    

    """),_display_(/*20.6*/helper/*20.12*/.form(action = controllers.routes.LoginController.loginSubmit())/*20.76*/ {_display_(Seq[Any](format.raw/*20.78*/("""
        """),_display_(/*21.10*/CSRF/*21.14*/.formField),format.raw/*21.24*/("""
        
        """),format.raw/*23.9*/("""<div class="form-group">
            """),_display_(/*24.14*/inputText(loginForm("email"), '_label -> "", 
            'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*25.72*/("""
        """),format.raw/*26.9*/("""</div>
        <div class="form-group">
            """),_display_(/*28.14*/inputPassword(loginForm("password"), '_label -> "", 
            'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*29.75*/("""
        
        """),format.raw/*31.9*/("""</div>
        <div class="form-group">
            <input type="submit" value="Sign In" class="btn btn-primary">
        </div>
    """)))}),format.raw/*35.6*/("""

    """),format.raw/*37.5*/("""<p>
        Not have an account? Why not register one now!
		<a href=""""),_display_(/*39.13*/routes/*39.19*/.HomeController.register()),format.raw/*39.45*/("""">
			<button class="btn btn-primary">Register</button>
		</a>
	</p>
""")))}),format.raw/*43.2*/("""                    """))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.users.Login],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 16 13:26:08 IST 2019
                  SOURCE: /home/wdd/Year2Project-CarSales/CarSalesSite/app/views/login.scala.html
                  HASH: d9b8fa6108621cb8d6f79168c0fdb84b6ee293c1
                  MATRIX: 984->1|1119->65|1163->81|1190->83|1218->103|1257->105|1288->110|1335->132|1372->161|1411->163|1446->172|1517->217|1564->249|1603->251|1647->269|1656->270|1684->278|1734->297|1770->306|1810->316|1839->319|1878->349|1918->351|1948->354|2012->392|2026->397|2060->410|2090->413|2129->422|2167->434|2182->440|2255->504|2295->506|2332->516|2345->520|2376->530|2421->548|2486->586|2624->703|2660->712|2740->765|2888->892|2933->910|3097->1044|3130->1050|3228->1121|3243->1127|3290->1153|3390->1223
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|36->5|37->6|37->6|37->6|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|42->11|43->12|44->13|44->13|44->13|45->14|46->15|46->15|46->15|47->16|48->17|51->20|51->20|51->20|51->20|52->21|52->21|52->21|54->23|55->24|56->25|57->26|59->28|60->29|62->31|66->35|68->37|70->39|70->39|70->39|74->43
                  -- GENERATED --
              */
          