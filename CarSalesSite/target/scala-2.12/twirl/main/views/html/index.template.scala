
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),_display_(/*2.2*/main("Home", user)/*2.20*/{_display_(Seq[Any](format.raw/*2.21*/("""
	"""),format.raw/*3.2*/("""<h1>Welcome to IrelandCarSales</h1>
	<h3>Here you can buy second hand cars at a cheap price</h3>

	<div class="container-fluid">
			<div class="row">
			<div class="col-sm-4">
				<div class="well sidecol">
				<h2>Services</h2>
				<h3>Some of our current services include: </h3>
				<p>New models being added to the website soon, stay tuned!!</p>
				</div>
			</div>

			<div class="row">
				<div class="col-sm-4">
					<div class="midcol">
				</div>
			</div>

			<div class="row">
					<div class="col-sm-4">
						<div class="well sidecol">
						<h2>What we garuntee</h2>
						<h4>- Car is fully valeted</h4>
						<h4>- A 3 month garuntee</h4>
						<h4>- An NCT garuntee</h4>
						<h4>- That we will not be beaten in prices</h4>
					</div>
			</div>
""")))}),format.raw/*32.2*/(""" 


"""))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 07 00:34:10 IST 2019
                  SOURCE: /home/wdd/Year2Project-CarSales/CarSalesSite/app/views/index.scala.html
                  HASH: 64503a780b04a24c0d1d08bdaba12411b662be60
                  MATRIX: 959->1|1079->26|1107->29|1133->47|1171->48|1200->51|2024->845
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|64->32
                  -- GENERATED --
              */
          