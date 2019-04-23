
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
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />
    <!-- Custom CSS -->
    <link href=""""),_display_(/*17.18*/routes/*17.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*17.65*/("""" rel="stylesheet" />
</head>

<body>

    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href=""""),_display_(/*25.48*/routes/*25.54*/.ProductCtrl.home()),format.raw/*25.73*/("""">Home</a>
            </div>


            <ul class="nav navbar-nav">

                <li """),_display_(/*31.22*/if(title=="Products" )/*31.44*/{_display_(Seq[Any](format.raw/*31.45*/("""class="active"""")))}),format.raw/*31.60*/(""">
                    <a href=""""),_display_(/*32.31*/routes/*32.37*/.ProductCtrl.listProducts(0)),format.raw/*32.65*/("""">Products</a>
                </li>

              

                <li>
                    <a href=""""),_display_(/*38.31*/routes/*38.37*/.ProductCtrl.contacts()),format.raw/*38.60*/("""">Contact</a>
                </li>
                <li """),_display_(/*40.22*/if(title=="Login")/*40.40*/{_display_(Seq[Any](format.raw/*40.41*/("""class="active"""")))}),format.raw/*40.56*/(""">
                    """),_display_(/*41.22*/if(user != null)/*41.38*/ {_display_(Seq[Any](format.raw/*41.40*/("""
                        """),format.raw/*42.25*/("""<a href=""""),_display_(/*42.35*/controllers/*42.46*/.security.routes.LoginCtrl.logout()),format.raw/*42.81*/("""">Logout """),_display_(/*42.91*/user/*42.95*/.getName()),format.raw/*42.105*/("""</a>
                    """)))}/*43.23*/else/*43.28*/{_display_(Seq[Any](format.raw/*43.29*/("""
                        """),format.raw/*44.25*/("""<a href=""""),_display_(/*44.35*/controllers/*44.46*/.security.routes.LoginCtrl.login()),format.raw/*44.80*/("""">Login</a>
                    """)))}),format.raw/*45.22*/("""

                """),format.raw/*47.17*/("""</li>
                <li """),_display_(/*48.22*/if(title=="Register" )/*48.44*/{_display_(Seq[Any](format.raw/*48.45*/("""class="active"""")))}),format.raw/*48.60*/(""">
                        """),_display_(/*49.26*/if(user ==null)/*49.41*/{_display_(Seq[Any](format.raw/*49.42*/(""" 
                    """),format.raw/*50.21*/("""<a href=""""),_display_(/*50.31*/controllers/*50.42*/.security.routes.LoginCtrl.registerUser),format.raw/*50.81*/("""">Register</a>
                        """)))}),format.raw/*51.26*/("""
                """),format.raw/*52.17*/("""</li>
                <li>
                    """),_display_(/*54.22*/if((user !=null) && ("customer".equals(user.getRole())))/*54.78*/ {_display_(Seq[Any](format.raw/*54.80*/("""
                    """),format.raw/*55.21*/("""<a href=""""),_display_(/*55.31*/routes/*55.37*/.ShoppingCtrl.viewOrders),format.raw/*55.61*/("""">View Orders</a>
                    """)))}),format.raw/*56.22*/("""
                """),format.raw/*57.17*/("""</li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-24">
                """),_display_(/*67.18*/content),format.raw/*67.25*/("""
            """),format.raw/*68.13*/("""</div>
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
    <script src=""""),_display_(/*82.19*/routes/*82.25*/.Assets.versioned("javascripts/main.js")),format.raw/*82.65*/(""""></script>
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
                  DATE: Tue Apr 23 14:33:27 IST 2019
                  SOURCE: /home/wdd/Year2-Project-ShoeShop/error/app/views/main.scala.html
                  HASH: a95de01e02ce10f4d11b81e6b9c4df45a1284c37
                  MATRIX: 970->1|1121->57|1149->59|1270->154|1295->159|1869->706|1884->712|1946->753|2177->957|2192->963|2232->982|2353->1076|2384->1098|2423->1099|2469->1114|2528->1146|2543->1152|2592->1180|2724->1285|2739->1291|2783->1314|2867->1371|2894->1389|2933->1390|2979->1405|3029->1428|3054->1444|3094->1446|3147->1471|3184->1481|3204->1492|3260->1527|3297->1537|3310->1541|3342->1551|3387->1578|3400->1583|3439->1584|3492->1609|3529->1619|3549->1630|3604->1664|3668->1697|3714->1715|3768->1742|3799->1764|3838->1765|3884->1780|3938->1807|3962->1822|4001->1823|4051->1845|4088->1855|4108->1866|4168->1905|4239->1945|4284->1962|4359->2010|4424->2066|4464->2068|4513->2089|4550->2099|4565->2105|4610->2129|4680->2168|4725->2185|4888->2321|4916->2328|4957->2341|5270->2627|5285->2633|5346->2673
                  LINES: 28->1|33->1|35->3|41->9|41->9|49->17|49->17|49->17|57->25|57->25|57->25|63->31|63->31|63->31|63->31|64->32|64->32|64->32|70->38|70->38|70->38|72->40|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|74->42|74->42|74->42|74->42|74->42|75->43|75->43|75->43|76->44|76->44|76->44|76->44|77->45|79->47|80->48|80->48|80->48|80->48|81->49|81->49|81->49|82->50|82->50|82->50|82->50|83->51|84->52|86->54|86->54|86->54|87->55|87->55|87->55|87->55|88->56|89->57|99->67|99->67|100->68|114->82|114->82|114->82
                  -- GENERATED --
              */
          