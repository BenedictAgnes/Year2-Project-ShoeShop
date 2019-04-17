
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

object user extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.users.User],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users: List[models.users.User],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""
"""),_display_(/*2.2*/main("Users",user)/*2.20*/{_display_(Seq[Any](format.raw/*2.21*/("""
    """),format.raw/*3.5*/("""<h1>Current Users</h1>


    """),format.raw/*6.71*/("""
	"""),_display_(/*7.3*/if(flash.containsKey("success"))/*7.35*/ {_display_(Seq[Any](format.raw/*7.37*/("""
		"""),format.raw/*8.3*/("""<div class="alert alert-success">
			"""),_display_(/*9.5*/flash/*9.10*/.get("success")),format.raw/*9.25*/("""
		"""),format.raw/*10.3*/("""</div>
""")))}),format.raw/*11.2*/("""

    """),format.raw/*13.5*/("""<div class="col-sm-9">
        <h4>Here are all the current users on the system.</h4>
        <table class="table table-bordered table-hover table-condensed">
            <thead>
        <!-- The header row-->
        <tr>
            <th>Email</th>
            <th>Role</th>
            <th>Name</th>
            <th>Password</th>
        </tr>
        </thead>
        <tbody>
        <!-- Product row(s) -->
       
            """),format.raw/*28.62*/("""
            """),_display_(/*29.14*/for(u<-users) yield /*29.27*/ {_display_(Seq[Any](format.raw/*29.29*/("""
               """),format.raw/*30.16*/("""<tr>
                  <td>"""),_display_(/*31.24*/u/*31.25*/.getEmail),format.raw/*31.34*/("""</td>
                  <td>"""),_display_(/*32.24*/u/*32.25*/.getRole),format.raw/*32.33*/("""</td>
                  <td>"""),_display_(/*33.24*/u/*33.25*/.getName),format.raw/*33.33*/("""</td>
                  <td>"""),_display_(/*34.24*/u/*34.25*/.getPassword),format.raw/*34.37*/("""</td>
                  <!-- Update button -->
						<td>
							<a href=""""),_display_(/*37.18*/security/*37.26*/.routes.LoginCtrl.updateUser(u.getEmail)),format.raw/*37.66*/("""" class="button-xs btn-danger">
								<span class="glyphicon glyphicon-pencil"></span>
							</a>
                        </td>
                  <!-- Delete button -->
						<td>
							<a href=""""),_display_(/*43.18*/security/*43.26*/.routes.LoginCtrl.deleteUser(u.getEmail)),format.raw/*43.66*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
								<span class="glyphicon glyphicon-trash"></span>
							</a>
                        </td>
               </tr>
            """)))}),format.raw/*48.14*/("""
        
        """),format.raw/*50.9*/("""</tbody>
    </table>

    <p>
        <a href=""""),_display_(/*54.19*/security/*54.27*/.routes.LoginCtrl.addUser()),format.raw/*54.54*/("""">
            <button class="btn btn-primary">Add a new User</button>
        </a>
    </p>
</div>
 """)))}))
      }
    }
  }

  def render(users:List[models.users.User],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(users,user)

  def f:((List[models.users.User],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (users,user) => apply(users,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 17 14:34:06 IST 2019
                  SOURCE: /home/wdd/Year2-Project-ShoeShop/error/app/views/user.scala.html
                  HASH: ce62a0a0a0df56334d0c423afd6f391e6f9b7535
                  MATRIX: 982->1|1133->57|1160->59|1186->77|1224->78|1255->83|1311->178|1339->181|1379->213|1418->215|1447->218|1510->256|1523->261|1558->276|1588->279|1626->287|1659->293|2118->773|2159->787|2188->800|2228->802|2272->818|2327->846|2337->847|2367->856|2423->885|2433->886|2462->894|2518->923|2528->924|2557->932|2613->961|2623->962|2656->974|2758->1049|2775->1057|2836->1097|3063->1297|3080->1305|3141->1345|3367->1540|3412->1558|3488->1607|3505->1615|3553->1642
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|38->6|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|45->13|60->28|61->29|61->29|61->29|62->30|63->31|63->31|63->31|64->32|64->32|64->32|65->33|65->33|65->33|66->34|66->34|66->34|69->37|69->37|69->37|75->43|75->43|75->43|80->48|82->50|86->54|86->54|86->54
                  -- GENERATED --
              */
          