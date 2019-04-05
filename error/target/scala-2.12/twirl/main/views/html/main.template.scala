
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
                    <a href=""""),_display_(/*34.31*/routes/*34.37*/.ProductCtrl.contacts()),format.raw/*34.60*/("""">Contact</a>
                </li>
                <li """),_display_(/*36.22*/if(title=="Login")/*36.40*/{_display_(Seq[Any](format.raw/*36.41*/("""class="active"""")))}),format.raw/*36.56*/(""">
                    """),_display_(/*37.22*/if(user != null)/*37.38*/ {_display_(Seq[Any](format.raw/*37.40*/("""
                        """),format.raw/*38.25*/("""<a href=""""),_display_(/*38.35*/controllers/*38.46*/.security.routes.LoginCtrl.logout()),format.raw/*38.81*/("""">Logout """),_display_(/*38.91*/user/*38.95*/.getName()),format.raw/*38.105*/("""</a>
                    """)))}/*39.23*/else/*39.28*/{_display_(Seq[Any](format.raw/*39.29*/("""
                        """),format.raw/*40.25*/("""<a href=""""),_display_(/*40.35*/controllers/*40.46*/.security.routes.LoginCtrl.login()),format.raw/*40.80*/("""">Login</a>
                    """)))}),format.raw/*41.22*/("""

                """),format.raw/*43.17*/("""</li>
                <li """),_display_(/*44.22*/if(title=="Register" )/*44.44*/{_display_(Seq[Any](format.raw/*44.45*/("""class="active"""")))}),format.raw/*44.60*/(""">
                    <a href=""""),_display_(/*45.31*/controllers/*45.42*/.security.routes.LoginCtrl.registerUser),format.raw/*45.81*/("""">Register</a>
                </li>
                <li>
                    <a href=""""),_display_(/*48.31*/routes/*48.37*/.ShoppingCtrl.viewOrders),format.raw/*48.61*/("""">View Orders</a>
                </li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*59.18*/content),format.raw/*59.25*/("""
            """),format.raw/*60.13*/("""</div>
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
    <script src=""""),_display_(/*74.19*/routes/*74.25*/.Assets.versioned("javascripts/main.js")),format.raw/*74.65*/(""""></script>
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
                  DATE: Fri Apr 05 17:49:07 IST 2019
                  SOURCE: /home/wdd/Year2-Project-ShoeShop/error/app/views/main.scala.html
                  HASH: 63b27d65fb7060fc3f6a31a7a1af2f7f536adedd
                  MATRIX: 970->1|1121->57|1149->59|1270->154|1295->159|1507->344|1522->350|1584->391|1815->595|1830->601|1870->620|1991->714|2022->736|2061->737|2107->752|2166->784|2181->790|2230->818|2362->923|2377->929|2421->952|2505->1009|2532->1027|2571->1028|2617->1043|2667->1066|2692->1082|2732->1084|2785->1109|2822->1119|2842->1130|2898->1165|2935->1175|2948->1179|2980->1189|3025->1216|3038->1221|3077->1222|3130->1247|3167->1257|3187->1268|3242->1302|3306->1335|3352->1353|3406->1380|3437->1402|3476->1403|3522->1418|3581->1450|3601->1461|3661->1500|3776->1588|3791->1594|3836->1618|4033->1788|4061->1795|4102->1808|4415->2094|4430->2100|4491->2140
                  LINES: 28->1|33->1|35->3|41->9|41->9|45->13|45->13|45->13|53->21|53->21|53->21|59->27|59->27|59->27|59->27|60->28|60->28|60->28|66->34|66->34|66->34|68->36|68->36|68->36|68->36|69->37|69->37|69->37|70->38|70->38|70->38|70->38|70->38|70->38|70->38|71->39|71->39|71->39|72->40|72->40|72->40|72->40|73->41|75->43|76->44|76->44|76->44|76->44|77->45|77->45|77->45|80->48|80->48|80->48|91->59|91->59|92->60|106->74|106->74|106->74
                  -- GENERATED --
              */
          