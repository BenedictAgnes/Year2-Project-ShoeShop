
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

object womens extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
	<style>
	    .footer """),format.raw/*8.14*/("""{"""),format.raw/*8.15*/(""" """),format.raw/*8.16*/("""font-weight: bold; color: white; background-color: rgb(0, 0, 0); """),format.raw/*8.81*/("""}"""),format.raw/*8.82*/("""
	    """),format.raw/*9.6*/(""".sidecol """),format.raw/*9.15*/("""{"""),format.raw/*9.16*/(""" """),format.raw/*9.17*/("""font-weight: bold; background-color: lightblue; """),format.raw/*9.65*/("""}"""),format.raw/*9.66*/("""
	    """),format.raw/*10.6*/(""".sidecol h2 """),format.raw/*10.18*/("""{"""),format.raw/*10.19*/(""" """),format.raw/*10.20*/("""font-weight: bold; """),format.raw/*10.39*/("""}"""),format.raw/*10.40*/("""
	    """),format.raw/*11.6*/(""".midcol h1 """),format.raw/*11.17*/("""{"""),format.raw/*11.18*/(""" """),format.raw/*11.19*/("""margin-top: 2em; text-align: center; font-weight: bold; """),format.raw/*11.75*/("""}"""),format.raw/*11.76*/("""
	    """),format.raw/*12.6*/(""".midcol h3 """),format.raw/*12.17*/("""{"""),format.raw/*12.18*/(""" """),format.raw/*12.19*/("""text-align: center; color: black; """),format.raw/*12.53*/("""}"""),format.raw/*12.54*/("""
	    """),format.raw/*13.6*/(""".redtext """),format.raw/*13.15*/("""{"""),format.raw/*13.16*/(""" """),format.raw/*13.17*/("""color: rgb(235, 129, 129); """),format.raw/*13.44*/("""}"""),format.raw/*13.45*/("""
	"""),format.raw/*14.2*/("""</style>
	<title>Women</title>
    </head>
    <body>
	<nav class="navbar navbar-inverse">
	    <div class="container-fluid">
		<div class="navbar-header">
		    <a class="navbar-brand" href="#">Soles</a>
		</div>
		<ul class="nav navbar-nav">
		    <li class="active"><a href="#">Home</a></li>
		    <li><a href="#">Products</a></li>
		    <li><a href="#">About us</a></li>
		</ul>
	    </div>
	</nav>

	<div class="container-fluid">
	    <div class="row">
		<div class="col-sm-3">
		    <div class="well sidecol">
			<h2>News</h2>
			<h3>Student Sales</h3>
			<p>QUICK!!<span class="redtext">10% Student discounts</span> ends soon<span class="redtext">Last Chance to get the shoes you always wanted</span>.
		    </div>
		</div>
		<div class="col-sm-6">
		    <div class="midcol">
			<h1>Womens Section</h1>
			<h3></h3>
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
                  DATE: Tue Feb 26 21:54:39 GMT 2019
                  SOURCE: /home/wdd/Project1/Year2-Project-ShoeShop/app/views/womens.scala.html
                  HASH: 9c0658c9c6d824fa920fc366820498a5852a4fa3
                  MATRIX: 1031->0|1320->262|1348->263|1376->264|1468->329|1496->330|1529->337|1565->346|1593->347|1621->348|1696->396|1724->397|1758->404|1798->416|1827->417|1856->418|1903->437|1932->438|1966->445|2005->456|2034->457|2063->458|2147->514|2176->515|2210->522|2249->533|2278->534|2307->535|2369->569|2398->570|2432->577|2469->586|2498->587|2527->588|2582->615|2611->616|2641->619
                  LINES: 33->1|40->8|40->8|40->8|40->8|40->8|41->9|41->9|41->9|41->9|41->9|41->9|42->10|42->10|42->10|42->10|42->10|42->10|43->11|43->11|43->11|43->11|43->11|43->11|44->12|44->12|44->12|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|46->14
                  -- GENERATED --
              */
          