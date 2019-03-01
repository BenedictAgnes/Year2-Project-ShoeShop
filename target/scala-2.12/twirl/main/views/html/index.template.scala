
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
		"""),format.raw/*15.3*/(""".pop h2 """),format.raw/*15.11*/("""{"""),format.raw/*15.12*/("""font-weight: bold; color: black; text-size-adjust: 2em;text-align: center;"""),format.raw/*15.86*/("""}"""),format.raw/*15.87*/("""
	"""),format.raw/*16.2*/("""</style>
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
		<div class="col-sm-3">
		    <div class="well sidecol">
			<h2>News</h2>
			<h3>Student Sales</h3>
			<p>QUICK!!<span class="redtext">10% Student discounts</span> ends soon<span class="redtext">Last Chance to get the shoes you always wanted <img src=""""),_display_(/*45.154*/routes/*45.160*/.Assets.at("/public/images", "StudentDiscount.jpg")),format.raw/*45.211*/("""" width="300" height="230" /></span>.
				
			</div>
		</div>
		<div class="col-sm-6">
		    <div class="midcol">
			<h1>SOLES</h1>
			<img src=""""),_display_(/*52.15*/routes/*52.21*/.Assets.at("/public/images", "vans.gif")),format.raw/*52.61*/("""" />
			<img src=""""),_display_(/*53.15*/routes/*53.21*/.Assets.at("/public/images", "vapour.jfif")),format.raw/*53.64*/("""" />
			<img src=""""),_display_(/*54.15*/routes/*54.21*/.Assets.at("/public/images", "Nike.jpg")),format.raw/*54.61*/("""" width="250" height="180"/>

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
			<img src=""""),_display_(/*71.15*/routes/*71.21*/.Assets.at("/public/images", "trainer1.jfif")),format.raw/*71.66*/("""" width="250" height="180"/>
			<img src=""""),_display_(/*72.15*/routes/*72.21*/.Assets.at("/public/images", "trainer2.jfif")),format.raw/*72.66*/("""" width="250" height="180"/>
			<img src=""""),_display_(/*73.15*/routes/*73.21*/.Assets.at("/public/images", "trainer3.jfif")),format.raw/*73.66*/("""" width="250" height="180"/>
			<img src=""""),_display_(/*74.15*/routes/*74.21*/.Assets.at("/public/images", "trainer4.jfif")),format.raw/*74.66*/("""" width="250" height="180"/>
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
                  SOURCE: /home/wdd/yr2/Year2-Project-ShoeShop/app/views/index.scala.html
                  HASH: a86d3df8e66c55edef74c79d0fbeb059fb674d0c
                  MATRIX: 1030->0|1310->254|1324->260|1390->306|1453->342|1481->343|1509->344|1601->409|1629->410|1663->417|1700->426|1729->427|1758->428|1834->476|1863->477|1897->484|1937->496|1966->497|1995->498|2042->517|2071->518|2105->525|2144->536|2173->537|2202->538|2286->594|2315->595|2349->602|2388->613|2417->614|2446->615|2508->649|2537->650|2571->657|2608->666|2637->667|2666->668|2721->695|2750->696|2781->700|2817->708|2846->709|2948->783|2977->784|3007->787|3950->1702|3966->1708|4039->1759|4219->1912|4234->1918|4295->1958|4342->1978|4357->1984|4421->2027|4468->2047|4483->2053|4544->2093|5004->2526|5019->2532|5085->2577|5156->2621|5171->2627|5237->2672|5308->2716|5323->2722|5389->2767|5460->2811|5475->2817|5541->2862
                  LINES: 33->1|39->7|39->7|39->7|41->9|41->9|41->9|41->9|41->9|42->10|42->10|42->10|42->10|42->10|42->10|43->11|43->11|43->11|43->11|43->11|43->11|44->12|44->12|44->12|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|46->14|46->14|46->14|46->14|46->14|46->14|47->15|47->15|47->15|47->15|47->15|48->16|77->45|77->45|77->45|84->52|84->52|84->52|85->53|85->53|85->53|86->54|86->54|86->54|103->71|103->71|103->71|104->72|104->72|104->72|105->73|105->73|105->73|106->74|106->74|106->74
                  -- GENERATED --
              */
          