
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

object RegUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.UserPassword2],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

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
    """),_display_(/*18.6*/form(action=routes.security.LoginCtrl.registerUserSubmit(), 'class -> "form-horizontal", 'role -> "form")/*18.111*/ {_display_(Seq[Any](format.raw/*18.113*/("""
        """),format.raw/*19.37*/("""
        """),format.raw/*20.99*/("""
        """),_display_(/*21.10*/CSRF/*21.14*/.formField),format.raw/*21.24*/("""


            """),_display_(/*24.14*/inputText(regForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*24.87*/("""       
            """),_display_(/*25.14*/inputText(regForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*25.85*/("""
            """),_display_(/*26.14*/inputDate(regForm("dateOfBirth"), args = 'size -> 10, '_label -> "Date Of Birth", 'class -> "form-control")),format.raw/*26.121*/("""
            """),_display_(/*27.14*/inputText(regForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*27.93*/("""
            """),_display_(/*28.14*/inputText(regForm("password2"), '_label -> "Confirm Password", 'class -> "form-control")),format.raw/*28.102*/("""
            
            """),_display_(/*30.14*/inputText(regForm("role").copy(value=Some("customer")), '_label -> "",'hidden -> "hidden")),format.raw/*30.104*/("""
            """),_display_(/*31.14*/inputText(regForm("email"), '_label -> "", 'hidden -> "hidden")),format.raw/*31.77*/("""
            
            """),format.raw/*33.13*/("""<!-- We use the bootstrap actions class for the buttons at the bottom:
                1. The submit button for the form
                2. A button that allows the user to cancel without adding an item
            -->
            <div class="actions">
                <input type="submit" value="Register user" class="btn btn-primary">
                <a href=""""),_display_(/*39.27*/routes/*39.33*/.security.LoginCtrl.registerUser()),format.raw/*39.67*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
    """)))}),format.raw/*43.6*/(""" """),format.raw/*43.24*/("""
""")))}),format.raw/*44.2*/(""" """))
      }
    }
  }

  def render(regForm:Form[models.users.UserPassword2],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(regForm,user)

  def f:((Form[models.users.UserPassword2],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (regForm,user) => apply(regForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 05 13:26:22 IST 2019
                  SOURCE: /home/wdd/Year2-Project-ShoeShop/error/app/views/RegUser.scala.html
                  HASH: 113f9bb701e1adfb0dc5d034fa3f1404f5e6de5d
                  MATRIX: 994->1|1134->71|1179->68|1207->87|1234->89|1268->115|1306->116|1337->121|1404->213|1432->216|1470->246|1509->248|1539->251|1603->289|1617->294|1651->307|1681->310|1720->319|1753->325|2032->578|2147->683|2188->685|2225->722|2262->821|2299->831|2312->835|2343->845|2386->861|2480->934|2528->955|2620->1026|2661->1040|2790->1147|2831->1161|2931->1240|2972->1254|3082->1342|3136->1369|3248->1459|3289->1473|3373->1536|3427->1562|3817->1925|3832->1931|3887->1965|4047->2095|4076->2113|4108->2115
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|40->8|41->9|41->9|41->9|42->10|43->11|43->11|43->11|44->12|45->13|47->15|50->18|50->18|50->18|51->19|52->20|53->21|53->21|53->21|56->24|56->24|57->25|57->25|58->26|58->26|59->27|59->27|60->28|60->28|62->30|62->30|63->31|63->31|65->33|71->39|71->39|71->39|75->43|75->43|76->44
                  -- GENERATED --
              */
          