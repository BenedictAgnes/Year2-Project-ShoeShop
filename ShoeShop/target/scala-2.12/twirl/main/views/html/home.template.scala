
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

object home extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User )(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""
  
"""),_display_(/*3.2*/main("Home",user)/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""
	"""),format.raw/*4.2*/("""<title>Soles</title>
    </head>
    <body>
		

	<div class="container-fluid">
	    <div class="row">
		<div class="col-sm-3">
		    <div class="well sidecol">
			<h2>News</h2>
			<h3>Student Sales</h3>
			
				
			</div>
		</div>
		<div class="col-sm-6">
		    <div class="midcol">
			<h1>SOLES</h1>
			
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
   """)))}),format.raw/*54.5*/("""


"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 22 23:25:56 GMT 2019
                  SOURCE: /home/wdd/p/Year2-Project-ShoeShop/ShoeShop/app/views/home.scala.html
                  HASH: a866c21c170f6101b76fa611a031daf2928cee70
                  MATRIX: 970->1|1121->57|1153->64|1178->81|1217->83|1246->86|2196->1006
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|86->54
                  -- GENERATED --
              */
          