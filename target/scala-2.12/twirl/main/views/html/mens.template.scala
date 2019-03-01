
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

object mens extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
	<title>Mens Section</title>
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
			<h1>Mens Section</h1>
			<img src=""""),_display_(/*42.15*/routes/*42.21*/.Assets.at("/public/images", "mens1.jfif")),format.raw/*42.63*/("""" width="250" height="180"/>
			<img src=""""),_display_(/*43.15*/routes/*43.21*/.Assets.at("/public/images", "mens2.jfif")),format.raw/*43.63*/("""" width="250" height="180"/>
			<img src=""""),_display_(/*44.15*/routes/*44.21*/.Assets.at("/public/images", "mens3.jfif")),format.raw/*44.63*/("""" width="250" height="180"/>
			<img src=""""),_display_(/*45.15*/routes/*45.21*/.Assets.at("/public/images", "mens4.jfif")),format.raw/*45.63*/("""" width="250" height="180"/>
			<img src=""""),_display_(/*46.15*/routes/*46.21*/.Assets.at("/public/images", "mens5.jfif")),format.raw/*46.63*/("""" width="250" height="180"/>
			<img src=""""),_display_(/*47.15*/routes/*47.21*/.Assets.at("/public/images", "mens6.jfif")),format.raw/*47.63*/("""" width="250" height="180"/>
			<img src=""""),_display_(/*48.15*/routes/*48.21*/.Assets.at("/public/images", "mens7.jfif")),format.raw/*48.63*/("""" width="250" height="180"/>
			<h3></h3>
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
                  DATE: Fri Mar 01 09:50:44 GMT 2019
                  SOURCE: /home/wdd/project/projectyr2/Year2-Project-ShoeShop/app/views/mens.scala.html
                  HASH: 0cc295e10ae7fcada8c49b6b66a2a59966601495
                  MATRIX: 1029->0|1309->254|1323->260|1389->306|1452->342|1480->343|1508->344|1600->409|1628->410|1662->417|1699->426|1728->427|1757->428|1833->476|1862->477|1896->484|1936->496|1965->497|1994->498|2041->517|2070->518|2104->525|2143->536|2172->537|2201->538|2285->594|2314->595|2348->602|2387->613|2416->614|2445->615|2507->649|2536->650|2570->657|2607->666|2636->667|2665->668|2720->695|2749->696|2779->699|3560->1453|3575->1459|3638->1501|3709->1545|3724->1551|3787->1593|3858->1637|3873->1643|3936->1685|4007->1729|4022->1735|4085->1777|4156->1821|4171->1827|4234->1869|4305->1913|4320->1919|4383->1961|4454->2005|4469->2011|4532->2053
                  LINES: 33->1|39->7|39->7|39->7|41->9|41->9|41->9|41->9|41->9|42->10|42->10|42->10|42->10|42->10|42->10|43->11|43->11|43->11|43->11|43->11|43->11|44->12|44->12|44->12|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|46->14|46->14|46->14|46->14|46->14|46->14|47->15|74->42|74->42|74->42|75->43|75->43|75->43|76->44|76->44|76->44|77->45|77->45|77->45|78->46|78->46|78->46|79->47|79->47|79->47|80->48|80->48|80->48
                  -- GENERATED --
              */
          