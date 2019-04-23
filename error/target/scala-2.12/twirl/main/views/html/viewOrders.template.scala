
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

object viewOrders extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(User: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import play.api.Play.current
/*5.2*/import models.shopping._
/*6.2*/import models.products._


Seq[Any](format.raw/*1.27*/("""


"""),format.raw/*7.1*/("""
"""),format.raw/*8.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*9.2*/main("View Orders", User)/*9.27*/ {_display_(Seq[Any](format.raw/*9.29*/("""


	"""),format.raw/*12.2*/("""<div class="col-md-12">
		"""),_display_(/*13.4*/if(flash.containsKey("success"))/*13.36*/ {_display_(Seq[Any](format.raw/*13.38*/("""
			  """),format.raw/*14.6*/("""<div class="alert alert-success">
			      """),_display_(/*15.11*/flash/*15.16*/.get("success")),format.raw/*15.31*/("""
			  """),format.raw/*16.6*/("""</div>
		""")))}),format.raw/*17.4*/(""" 

		
               
                    """),format.raw/*21.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*22.22*/for(o <- User.getOrders()) yield /*22.48*/ {_display_(Seq[Any](format.raw/*22.50*/("""

                        """),format.raw/*24.25*/("""<p>Order Number: """),_display_(/*24.43*/o/*24.44*/.getId()),format.raw/*24.52*/("""</p>
                        <p>Order Date: """),_display_(/*25.41*/o/*25.42*/.getOrderDateString()),format.raw/*25.63*/("""</p>
                        <table class="table table-bordered table-hover table-condensed">
                        
                            <thead>
                            <!-- The header row-->
                            <tr>
                                <th>Id</th>
                                <th>Name</th>
                                <th>Quantity</th>
                                <th>Price</th>
                                <th>Total</th>
                            </tr>
                            </thead>
                            <tbody>
                        """),_display_(/*39.26*/for(i <- o.getItems()) yield /*39.48*/ {_display_(Seq[Any](format.raw/*39.50*/("""

                        """),format.raw/*41.25*/("""<tr>
                        <td>"""),_display_(/*42.30*/i/*42.31*/.getId),format.raw/*42.37*/("""</td>
                        <td>"""),_display_(/*43.30*/i/*43.31*/.getProduct.getName()),format.raw/*43.52*/("""</td>
                        <td>"""),_display_(/*44.30*/i/*44.31*/.getQuantity()),format.raw/*44.45*/("""</td>
                        <td>&euro; """),_display_(/*45.37*/("%.2f".format(i.getPrice()))),format.raw/*45.66*/("""</td>
                        <td>&euro; """),_display_(/*46.37*/("%.2f".format(i.getItemTotal))),format.raw/*46.68*/("""</td>
                        
                    </tr>
                    """)))}),format.raw/*49.22*/("""<!-- End of For loop -->
                    
			</tbody>
        </table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Order Total: &euro; """),_display_(/*55.68*/("%.2f".format(o.getOrderTotal))),format.raw/*55.100*/("""</strong></p>
            </div>  
        </div>
        <p>
            <a href=""""),_display_(/*59.23*/routes/*59.29*/.ShoppingCtrl.cancelOrder(o.getId())),format.raw/*59.65*/("""">
              <button class="btn btn-primary">Cancel Order</button>
            </a>
          </p>
         """)))}),format.raw/*63.11*/("""<!-- End of For loop -->
       
        </div>



""")))}))
      }
    }
  }

  def render(User:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(User)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (User) => apply(User)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 23 14:06:25 IST 2019
                  SOURCE: /home/wdd/Year2-Project-ShoeShop/error/app/views/viewOrders.scala.html
                  HASH: 4eef08058fff6300b16edf8c7c552bf452ff06f3
                  MATRIX: 964->1|1062->30|1098->60|1130->86|1184->26|1213->111|1240->112|1311->158|1344->183|1383->185|1414->189|1467->216|1508->248|1548->250|1581->256|1652->300|1666->305|1702->320|1735->326|1775->336|1845->378|1955->461|1997->487|2037->489|2091->515|2136->533|2146->534|2175->542|2247->587|2257->588|2299->609|2931->1214|2969->1236|3009->1238|3063->1264|3124->1298|3134->1299|3161->1305|3223->1340|3233->1341|3275->1362|3337->1397|3347->1398|3382->1412|3451->1454|3501->1483|3570->1525|3622->1556|3731->1634|3962->1838|4016->1870|4127->1954|4142->1960|4199->1996|4343->2109
                  LINES: 28->1|31->4|32->5|33->6|36->1|39->7|40->8|41->9|41->9|41->9|44->12|45->13|45->13|45->13|46->14|47->15|47->15|47->15|48->16|49->17|53->21|54->22|54->22|54->22|56->24|56->24|56->24|56->24|57->25|57->25|57->25|71->39|71->39|71->39|73->41|74->42|74->42|74->42|75->43|75->43|75->43|76->44|76->44|76->44|77->45|77->45|78->46|78->46|81->49|87->55|87->55|91->59|91->59|91->59|95->63
                  -- GENERATED --
              */
          