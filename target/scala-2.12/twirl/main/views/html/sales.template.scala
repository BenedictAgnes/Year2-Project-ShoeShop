
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

object sales extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
    <head>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta charset="UTF-8"/>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src=""""),_display_(/*7.16*/routes/*7.22*/.Assets.at("/public/javascripts", "jquery.js")),format.raw/*7.68*/(""""></script>
	<style>
	    .footer """),format.raw/*9.14*/("""{"""),format.raw/*9.15*/(""" """),format.raw/*9.16*/("""font-weight: bold; color: white; background-color: rgb(0, 0, 0); """),format.raw/*9.81*/("""}"""),format.raw/*9.82*/("""
	    """),format.raw/*10.6*/(""".sidecol """),format.raw/*10.15*/("""{"""),format.raw/*10.16*/(""" """),format.raw/*10.17*/("""font-weight: bold; background-color: lightblue; """),format.raw/*10.65*/("""}"""),format.raw/*10.66*/("""
	    """),format.raw/*11.6*/(""".sidecol h2 """),format.raw/*11.18*/("""{"""),format.raw/*11.19*/(""" """),format.raw/*11.20*/("""font-weight: bold; """),format.raw/*11.39*/("""}"""),format.raw/*11.40*/("""
	    """),format.raw/*12.6*/(""".midcol h1 """),format.raw/*12.17*/("""{"""),format.raw/*12.18*/(""" """),format.raw/*12.19*/("""margin-top: 2em; text-align: center; font-weight: bold; """),format.raw/*12.75*/("""}"""),format.raw/*12.76*/("""
	    """),format.raw/*13.6*/(""".midcol h3 """),format.raw/*13.17*/("""{"""),format.raw/*13.18*/(""" """),format.raw/*13.19*/("""text-align: center; color: black; """),format.raw/*13.53*/("""}"""),format.raw/*13.54*/("""
	    """),format.raw/*14.6*/(""".redtext """),format.raw/*14.15*/("""{"""),format.raw/*14.16*/(""" """),format.raw/*14.17*/("""color: rgb(235, 129, 129); """),format.raw/*14.44*/("""}"""),format.raw/*14.45*/("""
	"""),format.raw/*15.2*/("""</style>
	<title>Soles</title>
    </head>
    <body>
	<nav class="navbar navbar-inverse">
	    <div class="container-fluid">
		<div class="navbar-header">
		    <a class="navbar-brand" href="/">Soles</a>
		</div>
		<ul class="nav navbar-nav">
		    <li class="active"><a href="/">Home</a></li>
		    <li><a href="/sales">Sales</a></li>
			<li><a href="/mens">Mens</a></li>
			<li><a href="/womens">Womens</a></li>
			<li><a href="/aboutus">About us</a></li>
			<li><a href="/kids">Kids</a></li>
			<br></br>
			<li><a href="/login">login</a></li>
		</ul>
	    </div>
	</nav>
    
	<div class="container-fluid">
		<div class="row">
				<div class="col-sm-12">
						<h1><img src=""""),_display_(/*40.22*/routes/*40.28*/.Assets.at("/public/images", "sale.jfif")),format.raw/*40.69*/("""" </h1>
						<h3></h3>
						</div>
		</div>

	    <div class="row">
		<div class="col-sm-3">
		    <div class="well sidecol">
			<h2>News</h2>
			<h3>Student Sales</h3>
			<p>QUICK!! <span class="redtext">10% Student discounts </span> ends soon<span class="redtext"> Last Chance to get the shoes you always wanted</span>.
		    </div>
		</div>
		<div class="col-sm-6">
		    <div class="midcol">
		
			<h3></h3>
		    </div>
		</div>
		<div class="col-sm-3">
		    <div class="well sidecol">
			<h2>Events</h2>
			<h3>Clearance Sale</h3>
			<p>Last Seasons shoes <span class="redtext">50% </span> Act now and get a 3rd pair for half price</p>
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
</html>


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
                  DATE: Fri Mar 01 12:29:52 GMT 2019
                  SOURCE: /home/wdd/yr2/Year2-Project-ShoeShop/app/views/sales.scala.html
                  HASH: 09f583a06daaa594dd8212d5612cfbb1a3698222
                  MATRIX: 1030->0|1304->248|1318->254|1384->300|1445->334|1473->335|1501->336|1593->401|1621->402|1654->408|1691->417|1720->418|1749->419|1825->467|1854->468|1887->474|1927->486|1956->487|1985->488|2032->507|2061->508|2094->514|2133->525|2162->526|2191->527|2275->583|2304->584|2337->590|2376->601|2405->602|2434->603|2496->637|2525->638|2558->644|2595->653|2624->654|2653->655|2708->682|2737->683|2766->685|3474->1366|3489->1372|3551->1413
                  LINES: 33->1|39->7|39->7|39->7|41->9|41->9|41->9|41->9|41->9|42->10|42->10|42->10|42->10|42->10|42->10|43->11|43->11|43->11|43->11|43->11|43->11|44->12|44->12|44->12|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|46->14|46->14|46->14|46->14|46->14|46->14|47->15|72->40|72->40|72->40
                  -- GENERATED --
              */
          