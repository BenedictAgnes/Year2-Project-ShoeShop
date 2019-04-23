
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
			<div class="container">
					<h3 class="text-center">Contact</h3>
					<p class="text-center"><em>We love our customers!</em></p>
				
					<div class="row">
						<div class="col-md-4">
							<p>Have a question? Drop a note.</p>
							<p><span class="glyphicon glyphicon-map-marker"></span>Dublin, Ireland</p>
							<p><span class="glyphicon glyphicon-phone"></span>Phone: +00 1515151515</p>
							<p><span class="glyphicon glyphicon-envelope"></span>Email: mailmail.com</p>
						</div>
						<div class="col-md-8">
							<div class="row">
								<div class="col-sm-6 form-group">
									<input class="form-control" id="name" name="name" placeholder="Name" type="text" required>
								</div>
								<div class="col-sm-6 form-group">
									<input class="form-control" id="email" name="email" placeholder="Email" type="email" required>
								</div>
							</div>
							<textarea class="form-control" id="comments" name="comments" placeholder="Comment" rows="5"></textarea>
							<br>
							<div class="row">
								<div class="col-md-12 form-group">
									<button class="btn pull-right" type="submit">Send</button>
								</div>
							</div>
						</div>
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
   """)))}),format.raw/*56.5*/("""


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
                  DATE: Tue Apr 23 14:58:54 IST 2019
                  SOURCE: /home/wdd/Year2-Project-ShoeShop/error/app/views/contacts.scala.html
                  HASH: 0b59c92a2bc33669a5933cf9f02ae65dd06ac59c
                  MATRIX: 962->3|1082->28|1110->31|1135->48|1174->50|1209->59|2740->1560
                  LINES: 28->1|33->1|34->2|34->2|34->2|36->4|88->56
                  -- GENERATED --
              */
          