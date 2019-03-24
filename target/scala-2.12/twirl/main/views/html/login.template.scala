
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


        """),_display_(/*15.10*/helper/*15.16*/.form(action = controllers.routes.LoginController.loginSubmit())/*15.80*/ {_display_(Seq[Any](format.raw/*15.82*/("""
            """),_display_(/*16.14*/CSRF/*16.18*/.formField),format.raw/*16.28*/("""

            """),format.raw/*18.13*/("""<div class="form-group">
                """),_display_(/*19.18*/inputText(loginForm("email"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*20.76*/("""
            """),format.raw/*21.13*/("""</div>
            <div class="form-group">
                """),_display_(/*23.18*/inputPassword(loginForm("password"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*24.79*/("""
            """),format.raw/*25.13*/("""</div>
            <div class="form-group">
                <input type="submit" value="Sign In" class="btn btn-primary">
            </div>
        """)))}),format.raw/*29.10*/("""

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
                  DATE: Sun Mar 24 13:03:41 GMT 2019
                  SOURCE: /home/wdd/p/Year2-Project-ShoeShop/app/views/login.scala.html
                  HASH: 2554bbebd69ea00996c3fe41a56e89f531725c6e
                  MATRIX: 966->1|1076->40|1120->56|1147->58|1168->71|1207->73|1242->82|1294->108|1331->137|1370->139|1410->152|1485->201|1532->233|1571->235|1619->257|1628->258|1656->266|1710->289|1751->302|1796->316|1835->328|1850->334|1923->398|1963->400|2004->414|2017->418|2048->428|2090->442|2159->484|2301->605|2342->618|2430->679|2582->810|2623->823|2804->973
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|36->5|37->6|37->6|37->6|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|42->11|43->12|46->15|46->15|46->15|46->15|47->16|47->16|47->16|49->18|50->19|51->20|52->21|54->23|55->24|56->25|60->29
                  -- GENERATED --
              */
          