
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
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),_display_(/*2.2*/main("Home",user)/*2.19*/ {_display_(Seq[Any](format.raw/*2.21*/("""
	
    """),format.raw/*4.5*/("""<body>
		
				<div class="container">
						  
						<div id="myCarousel" class="carousel slide" data-ride="carousel">
							<!-- Indicators -->
							<ol class="carousel-indicators">
								<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
								<li data-target="#myCarousel" data-slide-to="1"></li>
								<li data-target="#myCarousel" data-slide-to="2"></li>
							</ol>
					
						<!-- Wrapper for slides -->
						<div class="carousel-inner">
							<div class="item active">
								<img src=""""),_display_(/*19.20*/routes/*19.26*/.Assets.at("/public/images", "header1.jpg")),format.raw/*19.69*/("""" alt="pic1" style="width:100%;">
								<div class="carousel-caption">
										<h3>Trending</h3>
										<p>Trending deals too hard to miss out</p>
									</div>
							</div>
					
							<div class="item">
								<img src=""""),_display_(/*27.20*/routes/*27.26*/.Assets.at("/public/images", "header2.jpg")),format.raw/*27.69*/("""" alt="pic2" style="width:100%;">
								<div class="carousel-caption">
										<h3>HOT</h3>
										<p>Buy the hottest deals</p>
									</div>
							</div>
							<div class="item">
									<img src=""""),_display_(/*34.21*/routes/*34.27*/.Assets.at("/public/images", "header3.jpg")),format.raw/*34.70*/("""" alt="pic3" style="width:100%;">
									<div class="carousel-caption">
											<h3>Comfort</h3>
											<p>Run is comfort</p>
										</div>
								</div>
							</div>
				
					
						<!-- Left and right controls -->
						
						</div>
					</div>
					<div class="container">    
							<div class="row">
								<div class="col-sm-4">
									<div class="panel panel-primary">
										<div class="panel-heading">Most Popular</div>
										<div class="panel-body"><a href="http://localhost:9000/productDetails/14"><img src=""""),_display_(/*52.96*/routes/*52.102*/.Assets.at("/public/images", "trainer1.jfif")),format.raw/*52.147*/("""" class="img-responsive" style="width:100%" alt="Image"></div> </a>
										<div class="panel-footer">Don't miss out</div>
									</div>
								</div>
								<div class="col-sm-4"> 
									<div class="panel panel-danger">
										<div class="panel-heading">New In</div>
										<div class="panel-body"><a href="http://localhost:9000/productDetails/15"><img src=""""),_display_(/*59.96*/routes/*59.102*/.Assets.at("/public/images", "trainer2.jfif")),format.raw/*59.147*/("""" class="img-responsive" style="width:100%" alt="Image"></div> </a>
										<div class="panel-footer">The shoes for you</div>
									</div>
								</div>
								<div class="col-sm-4"> 
									<div class="panel panel-success">
										<div class="panel-heading">On Sale</div>
										<div class="panel-body"><a href="http://localhost:9000/productDetails/16"><img src=""""),_display_(/*66.96*/routes/*66.102*/.Assets.at("/public/images", "trainer3.jfif")),format.raw/*66.147*/("""" class="img-responsive" style="width:100%" alt="Image"></div> </a>
										<div class="panel-footer">Hurry before they sell out!</div>
									</div>
								</div>
							</div>
						</div><br>
		
    </body>
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
                  DATE: Sun Apr 28 20:27:15 IST 2019
                  SOURCE: /home/wdd/Year2-Project-ShoeShop/error/app/views/home.scala.html
                  HASH: d610fb59c77ac11f639da97170a5c5a78fed4498
                  MATRIX: 958->1|1078->26|1106->29|1131->46|1170->48|1205->57|1774->599|1789->605|1853->648|2123->891|2138->897|2202->940|2447->1158|2462->1164|2526->1207|3117->1771|3133->1777|3200->1822|3609->2204|3625->2210|3692->2255|4106->2642|4122->2648|4189->2693
                  LINES: 28->1|33->1|34->2|34->2|34->2|36->4|51->19|51->19|51->19|59->27|59->27|59->27|66->34|66->34|66->34|84->52|84->52|84->52|91->59|91->59|91->59|98->66|98->66|98->66
                  -- GENERATED --
              */
          