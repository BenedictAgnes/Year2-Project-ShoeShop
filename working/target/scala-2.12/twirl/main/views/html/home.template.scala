
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

object home extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.4*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.29*/("""
"""),_display_(/*2.2*/main("Home",user)/*2.19*/ {_display_(Seq[Any](format.raw/*2.21*/("""
	
    """),format.raw/*4.5*/("""<body>
		

		<div class="container-fluid">
			<div class="row">
			<div class="col-sm-3">
				<div class="well sidecol">
				<h2>News</h2>
				<h3>Student Sales</h3>
				<p>QUICK!!<span class="redtext">10% Student discounts</span> ends soon<span class="redtext">Last Chance to get the shoes you always wanted <img src=""""),_display_(/*13.155*/routes/*13.161*/.Assets.at("/public/images", "StudentDiscount.jpg")),format.raw/*13.212*/("""" width="300" height="230" /></span>.
					
				</div>
			</div>
			<div class="col-sm-6">
				<div class="midcol">
				<h1>SOLES</h1>
				<img src=""""),_display_(/*20.16*/routes/*20.22*/.Assets.at("/public/images", "vans.gif")),format.raw/*20.62*/("""" />
				<img src=""""),_display_(/*21.16*/routes/*21.22*/.Assets.at("/public/images", "vapour.jfif")),format.raw/*21.65*/("""" />
				<img src=""""),_display_(/*22.16*/routes/*22.22*/.Assets.at("/public/images", "Nike.jpg")),format.raw/*22.62*/("""" width="250" height="180"/>
	
				</div>
				
			</div>
			<div class="col-sm-3">
				<div class="well sidecol">
				<h2>Events</h2>
				<h3>Clearance Sale</h3>
				<p>Last Seasons shoes <span class="redtext">50%</span>Act now and get a 3rd pair for half price</p>
				</div>
			</div>
			</div>
			<div class= "row">
				<div class = "col-sm-12">
					<div class="pop">
				<h2>Most Wanted Shoes-Buy Now!</h2>
				<img src=""""),_display_(/*39.16*/routes/*39.22*/.Assets.at("/public/images", "trainer1.jfif")),format.raw/*39.67*/("""" width="250" height="180"/>
				<img src=""""),_display_(/*40.16*/routes/*40.22*/.Assets.at("/public/images", "trainer2.jfif")),format.raw/*40.67*/("""" width="250" height="180"/>
				<img src=""""),_display_(/*41.16*/routes/*41.22*/.Assets.at("/public/images", "trainer3.jfif")),format.raw/*41.67*/("""" width="250" height="180"/>
				<img src=""""),_display_(/*42.16*/routes/*42.22*/.Assets.at("/public/images", "trainer4.jfif")),format.raw/*42.67*/("""" width="250" height="180"/>
			</div>
	
	
				</div>
			</div>
	
			<div class="row">
			<div class="col-sm-12">
				<div class="well footer">
				Year 2 Project 
				</div>
			</div>
			</div>
		</div>
    </body>
   """)))}),format.raw/*58.5*/("""


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
                  DATE: Fri Apr 05 17:49:06 IST 2019
                  SOURCE: /home/wdd/Year2-Project-ShoeShop/error/app/views/home.scala.html
                  HASH: 5239a117ec871f985dc6fbd54ce162f287e646e6
                  MATRIX: 958->3|1078->28|1106->31|1131->48|1170->50|1205->59|1562->388|1578->394|1651->445|1835->602|1850->608|1911->648|1959->669|1974->675|2038->718|2086->739|2101->745|2162->785|2633->1229|2648->1235|2714->1280|2786->1325|2801->1331|2867->1376|2939->1421|2954->1427|3020->1472|3092->1517|3107->1523|3173->1568|3439->1804
                  LINES: 28->1|33->1|34->2|34->2|34->2|36->4|45->13|45->13|45->13|52->20|52->20|52->20|53->21|53->21|53->21|54->22|54->22|54->22|71->39|71->39|71->39|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|74->42|90->58
                  -- GENERATED --
              */
          