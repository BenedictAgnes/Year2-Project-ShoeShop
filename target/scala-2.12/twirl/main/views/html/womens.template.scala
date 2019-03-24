
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
	<script src=""""),_display_(/*7.16*/routes/*7.22*/.Assets.at("/public/javascripts", "jquery.js")),format.raw/*7.68*/(""""></script>
	<style>
	    .footer """),format.raw/*9.14*/("""{"""),format.raw/*9.15*/(""" """),format.raw/*9.16*/("""font-weight: bold; color: white; background-color: rgb(0, 0, 0); """),format.raw/*9.81*/("""}"""),format.raw/*9.82*/("""
	    """),format.raw/*10.6*/(""".sidecol """),format.raw/*10.15*/("""{"""),format.raw/*10.16*/(""" """),format.raw/*10.17*/("""font-weight: bold; background-color: lightblue; """),format.raw/*10.65*/("""}"""),format.raw/*10.66*/("""
	    """),format.raw/*11.6*/(""".sidecol h2 """),format.raw/*11.18*/("""{"""),format.raw/*11.19*/(""" """),format.raw/*11.20*/("""font-weight: bold; """),format.raw/*11.39*/("""}"""),format.raw/*11.40*/("""
	    """),format.raw/*12.6*/(""".midcol h1 """),format.raw/*12.17*/("""{"""),format.raw/*12.18*/(""" """),format.raw/*12.19*/("""margin-top: 2em; text-align: center; font-weight: bold; """),format.raw/*12.75*/("""}"""),format.raw/*12.76*/("""
	    """),format.raw/*13.6*/(""".midcol h3 """),format.raw/*13.17*/("""{"""),format.raw/*13.18*/(""" """),format.raw/*13.19*/("""text-align: center; color: black; """),format.raw/*13.53*/("""}"""),format.raw/*13.54*/("""
	    """),format.raw/*14.6*/(""".redtext """),format.raw/*14.15*/("""{"""),format.raw/*14.16*/(""" """),format.raw/*14.17*/("""color: rgb(235, 129, 129); """),format.raw/*14.44*/("""}"""),format.raw/*14.45*/("""
	"""),format.raw/*15.2*/("""</style>
	<title>Women</title>
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
		    <div class="midcol">
			<h1>Womens Section</h1>
			<img src=""""),_display_(/*43.15*/routes/*43.21*/.Assets.at("/public/images", "women1.jfif")),format.raw/*43.64*/("""" width="250" height="180"/>
			<img src=""""),_display_(/*44.15*/routes/*44.21*/.Assets.at("/public/images", "women2.jfif")),format.raw/*44.64*/("""" width="250" height="180"/>
			<img src=""""),_display_(/*45.15*/routes/*45.21*/.Assets.at("/public/images", "women3.jfif")),format.raw/*45.64*/("""" width="250" height="180"/>
			<img src=""""),_display_(/*46.15*/routes/*46.21*/.Assets.at("/public/images", "women4.jfif")),format.raw/*46.64*/("""" width="250" height="180"/>
			<img src=""""),_display_(/*47.15*/routes/*47.21*/.Assets.at("/public/images", "women5.jfif")),format.raw/*47.64*/("""" width="250" height="180"/>
			<img src=""""),_display_(/*48.15*/routes/*48.21*/.Assets.at("/public/images", "women6.jfif")),format.raw/*48.64*/("""" width="250" height="180"/>
			<img src=""""),_display_(/*49.15*/routes/*49.21*/.Assets.at("/public/images", "women7.jfif")),format.raw/*49.64*/("""" width="250" height="180"/>
			<img src=""""),_display_(/*50.15*/routes/*50.21*/.Assets.at("/public/images", "women8.jfif")),format.raw/*50.64*/("""" width="250" height="180"/>
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
                  DATE: Sun Mar 24 13:03:42 GMT 2019
                  SOURCE: /home/wdd/p/Year2-Project-ShoeShop/app/views/womens.scala.html
                  HASH: d564042163187692e7ed88e26a106d6232737f8f
                  MATRIX: 1031->0|1311->254|1325->260|1391->306|1454->342|1482->343|1510->344|1602->409|1630->410|1664->417|1701->426|1730->427|1759->428|1835->476|1864->477|1898->484|1938->496|1967->497|1996->498|2043->517|2072->518|2106->525|2145->536|2174->537|2203->538|2287->594|2316->595|2350->602|2389->613|2418->614|2447->615|2509->649|2538->650|2572->657|2609->666|2638->667|2667->668|2722->695|2751->696|2781->699|3568->1459|3583->1465|3647->1508|3718->1552|3733->1558|3797->1601|3868->1645|3883->1651|3947->1694|4018->1738|4033->1744|4097->1787|4168->1831|4183->1837|4247->1880|4318->1924|4333->1930|4397->1973|4468->2017|4483->2023|4547->2066|4618->2110|4633->2116|4697->2159
                  LINES: 33->1|39->7|39->7|39->7|41->9|41->9|41->9|41->9|41->9|42->10|42->10|42->10|42->10|42->10|42->10|43->11|43->11|43->11|43->11|43->11|43->11|44->12|44->12|44->12|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|46->14|46->14|46->14|46->14|46->14|46->14|47->15|75->43|75->43|75->43|76->44|76->44|76->44|77->45|77->45|77->45|78->46|78->46|78->46|79->47|79->47|79->47|80->48|80->48|80->48|81->49|81->49|81->49|82->50|82->50|82->50
                  -- GENERATED --
              */
          