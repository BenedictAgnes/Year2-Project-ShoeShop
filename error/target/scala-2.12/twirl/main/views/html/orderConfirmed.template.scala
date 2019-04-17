
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

object orderConfirmed extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.users.User,models.shopping.ShopOrder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(User: models.users.User, order: models.shopping.ShopOrder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import play.api.Play.current
/*5.2*/import models.shopping._
/*6.2*/import models.products._


Seq[Any](format.raw/*1.61*/("""


"""),format.raw/*7.1*/("""
"""),format.raw/*8.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*9.2*/main("Order Confirmation", User)/*9.34*/ {_display_(Seq[Any](format.raw/*9.36*/("""


"""),format.raw/*12.1*/("""<div class="row">

	<div class="col-md-12">
		"""),_display_(/*15.4*/if(flash.containsKey("success"))/*15.36*/ {_display_(Seq[Any](format.raw/*15.38*/("""
			  """),format.raw/*16.6*/("""<div class="alert alert-success">
			      """),_display_(/*17.11*/flash/*17.16*/.get("success")),format.raw/*17.31*/("""
			  """),format.raw/*18.6*/("""</div>
		""")))}),format.raw/*19.4*/(""" 

		"""),format.raw/*21.3*/("""<table class="table table-bordered table-hover table-condensed">
			<thead>
			<!-- The header row-->
			<tr>
				<th>Name</th>
				<th>Description</th>
				<th>Item Price</th>
				<th>Quantity</th>
                <th>Total</th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*33.18*/if(order != null)/*33.35*/ {_display_(Seq[Any](format.raw/*33.37*/("""
                    """),format.raw/*34.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*35.22*/for(i <- order.getItems) yield /*35.46*/ {_display_(Seq[Any](format.raw/*35.48*/("""
                    """),format.raw/*36.21*/("""<tr>
                        <td>"""),_display_(/*37.30*/i/*37.31*/.getProduct.getName),format.raw/*37.50*/("""</td>
                        <td>"""),_display_(/*38.30*/i/*38.31*/.getProduct.getDescription),format.raw/*38.57*/("""</td>
                        <td>&euro; """),_display_(/*39.37*/("%.2f".format(i.getPrice))),format.raw/*39.64*/("""</td>
                        <td>"""),_display_(/*40.30*/i/*40.31*/.getQuantity()),format.raw/*40.45*/("""</td>
                        <td>&euro; """),_display_(/*41.37*/("%.2f".format(i.getItemTotal))),format.raw/*41.68*/("""</td>
                    </tr>
                    """)))}),format.raw/*43.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*44.16*/("""
			"""),format.raw/*45.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Order Total: &euro; """),_display_(/*49.68*/("%.2f".format(order.getOrderTotal))),format.raw/*49.104*/("""</strong></p>
            </div>  
        </div>
        </div>
</div>
""")))}))
      }
    }
  }

  def render(User:models.users.User,order:models.shopping.ShopOrder): play.twirl.api.HtmlFormat.Appendable = apply(User,order)

  def f:((models.users.User,models.shopping.ShopOrder) => play.twirl.api.HtmlFormat.Appendable) = (User,order) => apply(User,order)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 17 14:34:06 IST 2019
                  SOURCE: /home/wdd/Year2-Project-ShoeShop/error/app/views/orderConfirmed.scala.html
                  HASH: d5444b0ada9685968478ace4043eefe97c85b161
                  MATRIX: 994->1|1126->64|1162->94|1194->120|1248->60|1277->145|1304->146|1375->192|1415->224|1454->226|1484->229|1557->276|1598->308|1638->310|1671->316|1742->360|1756->365|1792->380|1825->386|1865->396|1897->401|2203->680|2229->697|2269->699|2318->720|2428->803|2468->827|2508->829|2557->850|2618->884|2628->885|2668->904|2730->939|2740->940|2787->966|2856->1008|2904->1035|2966->1070|2976->1071|3011->1085|3080->1127|3132->1158|3216->1211|3287->1251|3318->1255|3494->1404|3552->1440
                  LINES: 28->1|31->4|32->5|33->6|36->1|39->7|40->8|41->9|41->9|41->9|44->12|47->15|47->15|47->15|48->16|49->17|49->17|49->17|50->18|51->19|53->21|65->33|65->33|65->33|66->34|67->35|67->35|67->35|68->36|69->37|69->37|69->37|70->38|70->38|70->38|71->39|71->39|72->40|72->40|72->40|73->41|73->41|75->43|76->44|77->45|81->49|81->49
                  -- GENERATED --
              */
          