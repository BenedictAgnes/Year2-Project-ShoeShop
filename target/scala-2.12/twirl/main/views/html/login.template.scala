
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.users.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Login")/*4.15*/ {_display_(Seq[Any](format.raw/*4.17*/("""
        """),format.raw/*5.9*/("""<h3>Sign in</h3>
        """),_display_(/*6.10*/if(loginForm.hasGlobalErrors)/*6.39*/ {_display_(Seq[Any](format.raw/*6.41*/("""
            """),format.raw/*7.13*/("""<p class="alert alert-warning">
                """),_display_(/*8.18*/for(e <- loginForm.globalErrors) yield /*8.50*/ {_display_(Seq[Any](format.raw/*8.52*/("""
                    """),_display_(/*9.22*/e/*9.23*/.message),format.raw/*9.31*/("""<br/>
                """)))}),format.raw/*10.18*/("""
            """),format.raw/*11.13*/("""</p>
        """)))}),format.raw/*12.10*/("""

        """),_display_(/*14.10*/if(flash.containsKey("error"))/*14.40*/ {_display_(Seq[Any](format.raw/*14.42*/("""
            """),format.raw/*15.13*/("""<p class="alert alert-warning">
                """),_display_(/*16.18*/flash/*16.23*/.get("loginRequired")),format.raw/*16.44*/("""
            """),format.raw/*17.13*/("""</p>
        """)))}),format.raw/*18.10*/("""


        """),_display_(/*21.10*/helper/*21.16*/.form(action = controllers.routes.LoginController.loginSubmit())/*21.80*/ {_display_(Seq[Any](format.raw/*21.82*/("""
            """),_display_(/*22.14*/CSRF/*22.18*/.formField),format.raw/*22.28*/("""

            """),format.raw/*24.13*/("""<div class="form-group">
                """),_display_(/*25.18*/inputText(loginForm("email"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*26.76*/("""
            """),format.raw/*27.13*/("""</div>
            <div class="form-group">
                """),_display_(/*29.18*/inputPassword(loginForm("password"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*30.79*/("""
            """),format.raw/*31.13*/("""</div>
            <div class="form-group">
                <input type="submit" value="Sign In" class="btn btn-primary">
            </div>
        """)))}),format.raw/*35.10*/("""

""")))}))
      }
    }
  }

  def render(loginForm:Form[models.users.Login]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((Form[models.users.Login]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 03 16:01:57 GMT 2019
                  SOURCE: /home/wdd/project2/Year2-Project-ShoeShop/app/views/login.scala.html
                  HASH: 5006ba99af1c58017c90faaa0386bc15ea0f10e3
                  MATRIX: 966->1|1076->40|1120->56|1147->58|1168->71|1207->73|1242->82|1294->108|1331->137|1370->139|1410->152|1485->201|1532->233|1571->235|1619->257|1628->258|1656->266|1710->289|1751->302|1796->316|1834->327|1873->357|1913->359|1954->372|2030->421|2044->426|2086->447|2127->460|2172->474|2211->486|2226->492|2299->556|2339->558|2380->572|2393->576|2424->586|2466->600|2535->642|2677->763|2718->776|2806->837|2958->968|2999->981|3180->1131
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|36->5|37->6|37->6|37->6|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|42->11|43->12|45->14|45->14|45->14|46->15|47->16|47->16|47->16|48->17|49->18|52->21|52->21|52->21|52->21|53->22|53->22|53->22|55->24|56->25|57->26|58->27|60->29|61->30|62->31|66->35
                  -- GENERATED --
              */
          