
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
                <li>
                    <a href=""""),_display_(/*45.31*/routes/*45.37*/.ShoppingCtrl.viewOrders),format.raw/*45.61*/("""">View Orders</a>
                </li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*56.18*/content),format.raw/*56.25*/("""
            """),format.raw/*57.13*/("""</div>
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
    <script src=""""),_display_(/*71.19*/routes/*71.25*/.Assets.versioned("javascripts/main.js")),format.raw/*71.65*/(""""></script>
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
                  DATE: Tue Mar 26 10:45:02 GMT 2019
                  SOURCE: /home/wdd/1/Year2-Project-ShoeShop/error/app/views/main.scala.html
                  HASH: 5b99bb5262de496981a624fa83a2edd11fde94d3
                  MATRIX: 970->1|1121->57|1149->59|1270->154|1295->159|1507->344|1522->350|1584->391|1815->595|1830->601|1870->620|1991->714|2022->736|2061->737|2107->752|2166->784|2181->790|2230->818|2362->923|2377->929|2421->952|2505->1009|2532->1027|2571->1028|2617->1043|2667->1066|2692->1082|2732->1084|2785->1109|2822->1119|2842->1130|2898->1165|2935->1175|2948->1179|2980->1189|3025->1216|3038->1221|3077->1222|3130->1247|3167->1257|3187->1268|3242->1302|3306->1335|3352->1353|3436->1410|3451->1416|3496->1440|3693->1610|3721->1617|3762->1630|4075->1916|4090->1922|4151->1962
                  LINES: 28->1|33->1|35->3|41->9|41->9|45->13|45->13|45->13|53->21|53->21|53->21|59->27|59->27|59->27|59->27|60->28|60->28|60->28|66->34|66->34|66->34|68->36|68->36|68->36|68->36|69->37|69->37|69->37|70->38|70->38|70->38|70->38|70->38|70->38|70->38|71->39|71->39|71->39|72->40|72->40|72->40|72->40|73->41|75->43|77->45|77->45|77->45|88->56|88->56|89->57|103->71|103->71|103->71
                  -- GENERATED --
              */
          