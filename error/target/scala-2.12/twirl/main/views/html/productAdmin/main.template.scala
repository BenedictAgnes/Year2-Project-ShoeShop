
package views.html.productAdmin

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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User )(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">

<head>
    <meta charset="utf-8">
    <title>Online Shop - """),_display_(/*9.27*/title),format.raw/*9.32*/("""</title>
    <!-- Bootstrap Core CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />
    <!-- Custom CSS -->
    <link href=""""),_display_(/*13.18*/routes/*13.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*13.65*/("""" rel="stylesheet" />
</head>

<body>

    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href=""""),_display_(/*21.48*/routes/*21.54*/.ProductCtrl.home()),format.raw/*21.73*/("""">Home</a>
            </div>


            <ul class="nav navbar-nav">

                <li """),_display_(/*27.22*/if(title=="Products" )/*27.44*/{_display_(Seq[Any](format.raw/*27.45*/("""class="active"""")))}),format.raw/*27.60*/(""">
                    <a href=""""),_display_(/*28.31*/routes/*28.37*/.ProductCtrl.listProducts(0)),format.raw/*28.65*/("""">Products</a>
                </li>


                <li>
                    <a href=""""),_display_(/*33.31*/routes/*33.37*/.ProductCtrl.contacts()),format.raw/*33.60*/("""">Contact</a>
                </li>
                <li """),_display_(/*35.22*/if(title=="Login")/*35.40*/{_display_(Seq[Any](format.raw/*35.41*/("""class="active"""")))}),format.raw/*35.56*/(""">
                    """),_display_(/*36.22*/if(user != null)/*36.38*/ {_display_(Seq[Any](format.raw/*36.40*/("""
                        """),format.raw/*37.25*/("""<a href=""""),_display_(/*37.35*/controllers/*37.46*/.security.routes.LoginCtrl.logout()),format.raw/*37.81*/("""">Logout """),_display_(/*37.91*/user/*37.95*/.getName()),format.raw/*37.105*/("""</a>
                    """)))}/*38.23*/else/*38.28*/{_display_(Seq[Any](format.raw/*38.29*/("""
                        """),format.raw/*39.25*/("""<a href=""""),_display_(/*39.35*/controllers/*39.46*/.security.routes.LoginCtrl.login()),format.raw/*39.80*/("""">Login</a>
                    """)))}),format.raw/*40.22*/("""

                """),format.raw/*42.17*/("""</li>
                <li>
                        """),_display_(/*44.26*/if((user !=null) && ("customer".equals(user.getRole())))/*44.82*/ {_display_(Seq[Any](format.raw/*44.84*/(""" 
                    """),format.raw/*45.21*/("""<a href=""""),_display_(/*45.31*/routes/*45.37*/.ShoppingCtrl.viewOrders),format.raw/*45.61*/("""">View Orders</a>
                        """)))}),format.raw/*46.26*/("""
                """),format.raw/*47.17*/("""</li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*57.18*/content),format.raw/*57.25*/("""
            """),format.raw/*58.13*/("""</div>
        </row>
    </container>
<br>
    <container>
        <footer>
        <row>
            <div class="col-md-12">
                Copyright
                <strong>Online Shoe Shop</strong>
            </div>
        </row>
    </footer>
    </container>
    <script src=""""),_display_(/*72.19*/routes/*72.25*/.Assets.versioned("javascripts/main.js")),format.raw/*72.65*/(""""></script>
</body>

</html>"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 23 14:06:25 IST 2019
                  SOURCE: /home/wdd/Year2-Project-ShoeShop/error/app/views/productAdmin/main.scala.html
                  HASH: a07e1a8cc16be98c3a29bc2f81f668bdf407796c
                  MATRIX: 983->1|1134->57|1162->59|1283->154|1308->159|1520->344|1535->350|1597->391|1828->595|1843->601|1883->620|2004->714|2035->736|2074->737|2120->752|2179->784|2194->790|2243->818|2360->908|2375->914|2419->937|2503->994|2530->1012|2569->1013|2615->1028|2665->1051|2690->1067|2730->1069|2783->1094|2820->1104|2840->1115|2896->1150|2933->1160|2946->1164|2978->1174|3023->1201|3036->1206|3075->1207|3128->1232|3165->1242|3185->1253|3240->1287|3304->1320|3350->1338|3429->1390|3494->1446|3534->1448|3584->1470|3621->1480|3636->1486|3681->1510|3755->1553|3800->1570|3963->1706|3991->1713|4032->1726|4345->2012|4360->2018|4421->2058
                  LINES: 28->1|33->1|35->3|41->9|41->9|45->13|45->13|45->13|53->21|53->21|53->21|59->27|59->27|59->27|59->27|60->28|60->28|60->28|65->33|65->33|65->33|67->35|67->35|67->35|67->35|68->36|68->36|68->36|69->37|69->37|69->37|69->37|69->37|69->37|69->37|70->38|70->38|70->38|71->39|71->39|71->39|71->39|72->40|74->42|76->44|76->44|76->44|77->45|77->45|77->45|77->45|78->46|79->47|89->57|89->57|90->58|104->72|104->72|104->72
                  -- GENERATED --
              */
          