
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

object registerUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.UserPassword2],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(regForm: Form[models.users.UserPassword2],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.69*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Register User",user)/*5.28*/{_display_(Seq[Any](format.raw/*5.29*/("""
    """),format.raw/*6.5*/("""<p class="lead">Add a new user</p>

    """),format.raw/*8.57*/("""
	"""),_display_(/*9.3*/if(flash.containsKey("error"))/*9.33*/ {_display_(Seq[Any](format.raw/*9.35*/("""
		"""),format.raw/*10.3*/("""<div class="alert alert-success">
			"""),_display_(/*11.5*/flash/*11.10*/.get("error")),format.raw/*11.23*/("""
		"""),format.raw/*12.3*/("""</div>
	""")))}),format.raw/*13.3*/("""

    """),format.raw/*15.5*/("""<!-- Use a views.html.helpers package method to create the form (instead of html)-->
    <!-- Note the arguments that are being passed to the scala function form (they are
         essentially instructions for constructing an HTML form element)-->
    """),_display_(/*18.6*/form(action=security.routes.LoginCtrl.registerUserSubmit(), 'class -> "form-horizontal", 'role -> "form")/*18.111*/ {_display_(Seq[Any](format.raw/*18.113*/("""
        """),format.raw/*19.37*/("""
        """),format.raw/*20.99*/("""
        """),_display_(/*21.10*/CSRF/*21.14*/.formField),format.raw/*21.24*/("""


            """),_display_(/*24.14*/inputText(regForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*24.87*/("""       
            """),_display_(/*25.14*/inputText(regForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*25.85*/("""
            """),_display_(/*26.14*/inputText(regForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*26.93*/("""
            """),_display_(/*27.14*/inputText(regForm("password2"), '_label -> "Confirm Password", 'class -> "form-control")),format.raw/*27.102*/("""
            
            """),_display_(/*29.14*/inputText(regForm("role").copy(value=Some("customer")), '_label -> "",'hidden -> "hidden")),format.raw/*29.104*/("""
            """),_display_(/*30.14*/inputText(regForm("email"), '_label -> "", 'hidden -> "hidden")),format.raw/*30.77*/(""" 
            
            """),format.raw/*32.13*/("""<!-- We use the bootstrap actions class for the buttons at the bottom:
                1. The submit button for the form
                2. A button that allows the user to cancel without adding an item
            -->
            <div class="actions">
                <input type="submit" value="Register user" class="btn btn-primary">
                <a href=""""),_display_(/*38.27*/security/*38.35*/.routes.LoginCtrl.registerUser()),format.raw/*38.67*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
    """)))}),format.raw/*42.6*/(""" """),format.raw/*42.24*/("""
""")))}),format.raw/*43.2*/(""" """))
      }
    }
  }

  def render(regForm:Form[models.users.UserPassword2],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(regForm,user)

  def f:((Form[models.users.UserPassword2],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (regForm,user) => apply(regForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 08 10:50:42 IST 2019
                  SOURCE: /home/wdd/Year2-Project-ShoeShop/error/app/views/registerUser.scala.html
                  HASH: 8dd615e0d88de58bfcde55eb604c24edb9d024d3
                  MATRIX: 999->1|1139->71|1184->68|1212->87|1239->89|1273->115|1311->116|1342->121|1409->213|1437->216|1475->246|1514->248|1544->251|1608->289|1622->294|1656->307|1686->310|1725->319|1758->325|2037->578|2152->683|2193->685|2230->722|2267->821|2304->831|2317->835|2348->845|2391->861|2485->934|2533->955|2625->1026|2666->1040|2766->1119|2807->1133|2917->1221|2971->1248|3083->1338|3124->1352|3208->1415|3263->1442|3653->1805|3670->1813|3723->1845|3883->1975|3912->1993|3944->1995
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|40->8|41->9|41->9|41->9|42->10|43->11|43->11|43->11|44->12|45->13|47->15|50->18|50->18|50->18|51->19|52->20|53->21|53->21|53->21|56->24|56->24|57->25|57->25|58->26|58->26|59->27|59->27|61->29|61->29|62->30|62->30|64->32|70->38|70->38|70->38|74->42|74->42|75->43
                  -- GENERATED --
              */
          