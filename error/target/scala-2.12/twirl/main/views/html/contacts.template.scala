
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

object contacts extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.4*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.29*/("""
"""),_display_(/*2.2*/main("Home",user)/*2.19*/ {_display_(Seq[Any](format.raw/*2.21*/("""
	
    """),format.raw/*4.5*/("""<body>
		<div class="info">
			<h1>
				Contact us
			</h1>
			<div class="col-sm-4">
				Our info
		
						<p>Our email: solesemail.com</p>
						<p>Our Phone: 01465465465</p>
						<p>Facebook: Soles</p>
						<p>HQ: Address street number</p>
						
		</div>
		
				<div class="col-sm-8">
						<img src=""""),_display_(/*20.18*/routes/*20.24*/.Assets.at("/public/images", "phone.png")),format.raw/*20.65*/("""" />
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
   """)))}),format.raw/*36.5*/("""


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
                  DATE: Wed Apr 17 14:34:06 IST 2019
                  SOURCE: /home/wdd/Year2-Project-ShoeShop/error/app/views/contacts.scala.html
                  HASH: fead955e699764a35591aa1096233bc1fe4e228a
                  MATRIX: 962->3|1082->28|1110->31|1135->48|1174->50|1209->59|1560->383|1575->389|1637->430|1870->633
                  LINES: 28->1|33->1|34->2|34->2|34->2|36->4|52->20|52->20|52->20|68->36
                  -- GENERATED --
              */
          