
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
                    <a href="/">Services</a>
                </li>

                <li>
                    <a href="#">Contact</a>
                </li>
                <li """),_display_(/*38.22*/if(title=="Login")/*38.40*/{_display_(Seq[Any](format.raw/*38.41*/("""class="active"""")))}),format.raw/*38.56*/(""">
                    """),_display_(/*39.22*/if(user != null)/*39.38*/ {_display_(Seq[Any](format.raw/*39.40*/("""
                        """),format.raw/*40.25*/("""<a href=""""),_display_(/*40.35*/controllers/*40.46*/.security.routes.LoginCtrl.logout()),format.raw/*40.81*/("""">Logout """),_display_(/*40.91*/user/*40.95*/.getName()),format.raw/*40.105*/("""</a>
                    """)))}/*41.23*/else/*41.28*/{_display_(Seq[Any](format.raw/*41.29*/("""
                        """),format.raw/*42.25*/("""<a href=""""),_display_(/*42.35*/controllers/*42.46*/.security.routes.LoginCtrl.login()),format.raw/*42.80*/("""">Login</a>
                    """)))}),format.raw/*43.22*/("""

                """),format.raw/*45.17*/("""</li>
                <li>
                    <a href=""""),_display_(/*47.31*/routes/*47.37*/.ShoppingCtrl.viewOrders),format.raw/*47.61*/("""">View Orders</a>
                </li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*58.18*/content),format.raw/*58.25*/("""
            """),format.raw/*59.13*/("""</div>
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
    <script src=""""),_display_(/*73.19*/routes/*73.25*/.Assets.versioned("javascripts/main.js")),format.raw/*73.65*/(""""></script>
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
                  DATE: Tue Mar 26 09:42:29 GMT 2019
                  SOURCE: /home/wdd/1/Year2-Project-ShoeShop/error/app/views/productAdmin/main.scala.html
                  HASH: 9a9fd4857b98f2446d4597b89a7a7e341c2584b1
                  MATRIX: 983->1|1134->57|1162->59|1283->154|1308->159|1520->344|1535->350|1597->391|1828->595|1843->601|1883->620|2004->714|2035->736|2074->737|2120->752|2179->784|2194->790|2243->818|2505->1053|2532->1071|2571->1072|2617->1087|2667->1110|2692->1126|2732->1128|2785->1153|2822->1163|2842->1174|2898->1209|2935->1219|2948->1223|2980->1233|3025->1260|3038->1265|3077->1266|3130->1291|3167->1301|3187->1312|3242->1346|3306->1379|3352->1397|3436->1454|3451->1460|3496->1484|3693->1654|3721->1661|3762->1674|4075->1960|4090->1966|4151->2006
                  LINES: 28->1|33->1|35->3|41->9|41->9|45->13|45->13|45->13|53->21|53->21|53->21|59->27|59->27|59->27|59->27|60->28|60->28|60->28|70->38|70->38|70->38|70->38|71->39|71->39|71->39|72->40|72->40|72->40|72->40|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|74->42|74->42|75->43|77->45|79->47|79->47|79->47|90->58|90->58|91->59|105->73|105->73|105->73
                  -- GENERATED --
              */
          