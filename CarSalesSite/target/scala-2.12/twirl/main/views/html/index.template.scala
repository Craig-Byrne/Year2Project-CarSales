
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
					<h2>Some of our current stock</h2>
					<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
						<!-- Indicators -->
						<ol class="carousel-indicators">
							<li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
							<li data-target="#carousel-example-generic" data-slide-to="1"></li>
							<li data-target="#carousel-example-generic" data-slide-to="2"></li>
						</ol>
					 
						<!-- Wrapper for slides -->
						<div class="carousel-inner">
							<div class="item active">
								<img src=""""),_display_(/*31.20*/routes/*31.26*/.Assets.versioned("images/1.jpeg")),format.raw/*31.60*/("""" alt="First slide">
								<div class="carousel-caption">
									<h7>Volkswagen Polo 2012</h7>
								</div>
							</div>
							<div class="item">
								<img src=""""),_display_(/*37.20*/routes/*37.26*/.Assets.versioned("images/2.jpeg")),format.raw/*37.60*/("""" alt="second slide">
								<div class="carousel-caption">
									<h7>Opel Corsa 2010</h7>
								</div>
							</div>
							<div class="item">
								<img src=""""),_display_(/*43.20*/routes/*43.26*/.Assets.versioned("images/3.jpeg")),format.raw/*43.60*/("""" alt="Third slide">
								<div class="carousel-caption">
									<h7>Renault Clio 2014</h7>
								</div>
							</div>
						</div>
					 
						<!-- Controls -->
						<a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
							<span class="glyphicon glyphicon-chevron-left"></span>
						</a>
						<a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
							<span class="glyphicon glyphicon-chevron-right"></span>
						</a>
					</div> <!-- Carousel -->
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
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script>
	$('.carousel').carousel("""),format.raw/*74.26*/("""{"""),format.raw/*74.27*/("""
		"""),format.raw/*75.3*/("""interval: 3000
	"""),format.raw/*76.2*/("""}"""),format.raw/*76.3*/(""")
</script>
""")))}),format.raw/*78.2*/(""" 
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
                  DATE: Tue Apr 23 12:31:41 IST 2019
                  SOURCE: /home/wdd/Year2Project-CarSales/CarSalesSite/app/views/index.scala.html
                  HASH: 773ddfa7b78e74d1cd53769d64424ede32136ec3
                  MATRIX: 959->1|1079->26|1107->29|1133->47|1171->48|1200->51|2270->1094|2285->1100|2340->1134|2546->1313|2561->1319|2616->1353|2818->1528|2833->1534|2888->1568|3991->2643|4020->2644|4051->2648|4095->2665|4123->2666|4168->2681
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|63->31|63->31|63->31|69->37|69->37|69->37|75->43|75->43|75->43|106->74|106->74|107->75|108->76|108->76|110->78
                  -- GENERATED --
              */
          