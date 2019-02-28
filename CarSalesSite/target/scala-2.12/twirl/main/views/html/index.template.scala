
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Home")/*1.14*/{_display_(Seq[Any](format.raw/*1.15*/("""
	"""),format.raw/*2.2*/("""<h1>Welcome to IrelandCarSales</h1>
	<h3>Here you can buy second hand cars at a cheap price</h3>
""")))}),format.raw/*4.2*/(""" 


"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Feb 28 11:58:08 GMT 2019
                  SOURCE: /home/wdd/Year2Project/Year2Project-CarSales/CarSalesSite/app/views/index.scala.html
                  HASH: 238d0637a45310913dc334041dbef6a4ab75722b
                  MATRIX: 1030->1|1050->13|1088->14|1117->17|1246->117
                  LINES: 33->1|33->1|33->1|34->2|36->4
                  -- GENERATED --
              */
          