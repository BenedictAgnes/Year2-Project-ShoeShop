
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

object addUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.User],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[models.users.User],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.61*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add User",user)/*5.23*/{_display_(Seq[Any](format.raw/*5.24*/("""
    """),format.raw/*6.5*/("""<p class="lead">Add a new user</p>

    <!-- Use a views.html.helpers package method to create the form (instead of html)-->
    <!-- Note the arguments that are being passed to the scala function form (they are
         essentially instructions for constructing an HTML form element)-->
    """),_display_(/*11.6*/form(action=security.routes.LoginCtrl.addUserSubmit(), 'class -> "form-horizontal", 'role -> "form")/*11.106*/ {_display_(Seq[Any](format.raw/*11.108*/("""
        """),format.raw/*12.37*/("""
        """),format.raw/*13.99*/("""
        """),_display_(/*14.10*/CSRF/*14.14*/.formField),format.raw/*14.24*/("""

        """),format.raw/*16.9*/("""<!-- Use helper methods to add fields to the form -->
        <!-- Note that the form fields are related to the fields of the itemForm object -->
        <!-- Note the arguments that are being passed to the scala function inputText (they are 
             essentially instructions for constructing an HTML input element)-->
        <!-- Note the """),_display_(/*20.24*/select),format.raw/*20.30*/(""" """),format.raw/*20.31*/("""function's argument options. This needs to be a map of ids-to-names
             and this is provided by the method Category.options(), which we added to the Category
             class in the previous step. -->
            """),_display_(/*23.14*/inputText(userForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*23.88*/("""
            """),_display_(/*24.14*/inputText(userForm("role"), '_label -> "Role", 'class -> "form-control")),format.raw/*24.86*/("""
            """),_display_(/*25.14*/inputText(userForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*25.86*/("""
            """),_display_(/*26.14*/inputText(userForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*26.94*/("""

            """),_display_(/*28.14*/inputText(userForm("email"), '_label -> "", 'hidden -> "hidden")),format.raw/*28.78*/("""
            
            """),format.raw/*30.13*/("""<!-- We use the bootstrap actions class for the buttons at the bottom:
                1. The submit button for the form
                2. A button that allows the user to cancel without adding an item
            -->
            <div class="actions">
                <input type="submit" value="Add/Update user" class="btn btn-primary">
                <a href=""""),_display_(/*36.27*/security/*36.35*/.routes.LoginCtrl.users()),format.raw/*36.60*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
    """)))}),format.raw/*40.6*/(""" """),format.raw/*40.24*/("""
""")))}),format.raw/*41.2*/(""" """))
      }
    }
  }

  def render(userForm:Form[models.users.User],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(userForm,user)

  def f:((Form[models.users.User],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (userForm,user) => apply(userForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 23 14:06:25 IST 2019
                  SOURCE: /home/wdd/Year2-Project-ShoeShop/error/app/views/addUser.scala.html
                  HASH: 1a02ff8791e9822f79e039ff9082a88b3b376ec6
                  MATRIX: 985->1|1117->63|1162->60|1190->79|1217->81|1246->102|1284->103|1315->108|1634->401|1744->501|1785->503|1822->540|1859->639|1896->649|1909->653|1940->663|1977->673|2351->1020|2378->1026|2407->1027|2659->1252|2754->1326|2795->1340|2888->1412|2929->1426|3022->1498|3063->1512|3164->1592|3206->1607|3291->1671|3345->1697|3737->2062|3754->2070|3800->2095|3960->2225|3989->2243|4021->2245
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|43->11|43->11|43->11|44->12|45->13|46->14|46->14|46->14|48->16|52->20|52->20|52->20|55->23|55->23|56->24|56->24|57->25|57->25|58->26|58->26|60->28|60->28|62->30|68->36|68->36|68->36|72->40|72->40|73->41
                  -- GENERATED --
              */
          