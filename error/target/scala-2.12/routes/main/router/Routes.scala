
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Year2-Project-ShoeShop/error/conf/routes
// @DATE:Wed Apr 17 14:37:34 IST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:4
  ProductCtrl_0: controllers.ProductCtrl,
  // @LINE:13
  LoginCtrl_3: controllers.security.LoginCtrl,
  // @LINE:18
  ShoppingCtrl_1: controllers.ShoppingCtrl,
  // @LINE:32
  AdminProductCtrl_2: controllers.AdminProductCtrl,
  // @LINE:53
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:4
    ProductCtrl_0: controllers.ProductCtrl,
    // @LINE:13
    LoginCtrl_3: controllers.security.LoginCtrl,
    // @LINE:18
    ShoppingCtrl_1: controllers.ShoppingCtrl,
    // @LINE:32
    AdminProductCtrl_2: controllers.AdminProductCtrl,
    // @LINE:53
    Assets_4: controllers.Assets
  ) = this(errorHandler, ProductCtrl_0, LoginCtrl_3, ShoppingCtrl_1, AdminProductCtrl_2, Assets_4, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ProductCtrl_0, LoginCtrl_3, ShoppingCtrl_1, AdminProductCtrl_2, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.ProductCtrl.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.ProductCtrl.home()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contacts""", """controllers.ProductCtrl.contacts()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listProducts""", """controllers.ProductCtrl.listProducts(cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productDetails/""" + "$" + """id<[^/]+>""", """controllers.ProductCtrl.productDetails(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.security.LoginCtrl.login()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.security.LoginCtrl.loginSubmit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.security.LoginCtrl.logout()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showBasket""", """controllers.ShoppingCtrl.showBasket()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addToBasket/""" + "$" + """id<[^/]+>""", """controllers.ShoppingCtrl.addToBasket(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addOne/""" + "$" + """itemId<[^/]+>""", """controllers.ShoppingCtrl.addOne(itemId:Long, pid:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeOne/""" + "$" + """itemId<[^/]+>""", """controllers.ShoppingCtrl.removeOne(itemId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """emptyBasket""", """controllers.ShoppingCtrl.emptyBasket()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """placeOrder""", """controllers.ShoppingCtrl.placeOrder()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cancelOrder""", """controllers.ShoppingCtrl.cancelOrder(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewOrders""", """controllers.ShoppingCtrl.viewOrders()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.security.LoginCtrl.users"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addUser""", """controllers.security.LoginCtrl.addUser"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addUserSubmit""", """controllers.security.LoginCtrl.addUserSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin""", """controllers.AdminProductCtrl.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/listProducts""", """controllers.AdminProductCtrl.listProducts(cat:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/listProducts/""" + "$" + """cat<[^/]+>""", """controllers.AdminProductCtrl.listProducts(cat:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/addProduct""", """controllers.AdminProductCtrl.addProduct()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/addProductSubmit""", """controllers.AdminProductCtrl.addProductSubmit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/updateProduct/""" + "$" + """id<[^/]+>""", """controllers.AdminProductCtrl.updateProduct(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/updateProductSubmit/""" + "$" + """id<[^/]+>""", """controllers.AdminProductCtrl.updateProductSubmit(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteUser/""" + "$" + """id<[^/]+>""", """controllers.security.LoginCtrl.deleteUser(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateUser/""" + "$" + """id<[^/]+>""", """controllers.security.LoginCtrl.updateUser(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registerUser""", """controllers.security.LoginCtrl.registerUser"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registerUserSubmit""", """controllers.security.LoginCtrl.registerUserSubmit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/deleteProduct/""" + "$" + """id<[^/]+>""", """controllers.AdminProductCtrl.deleteProduct(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """javascripts/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public/javascripts", file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """images/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public/images", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:4
  private[this] lazy val controllers_ProductCtrl_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_ProductCtrl_index0_invoker = createInvoker(
    ProductCtrl_0.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCtrl",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:5
  private[this] lazy val controllers_ProductCtrl_home1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val controllers_ProductCtrl_home1_invoker = createInvoker(
    ProductCtrl_0.home(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCtrl",
      "home",
      Nil,
      "GET",
      this.prefix + """home""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_ProductCtrl_contacts2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contacts")))
  )
  private[this] lazy val controllers_ProductCtrl_contacts2_invoker = createInvoker(
    ProductCtrl_0.contacts(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCtrl",
      "contacts",
      Nil,
      "GET",
      this.prefix + """contacts""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_ProductCtrl_listProducts3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listProducts")))
  )
  private[this] lazy val controllers_ProductCtrl_listProducts3_invoker = createInvoker(
    ProductCtrl_0.listProducts(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCtrl",
      "listProducts",
      Seq(classOf[Long], classOf[String]),
      "GET",
      this.prefix + """listProducts""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_ProductCtrl_productDetails4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productDetails/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductCtrl_productDetails4_invoker = createInvoker(
    ProductCtrl_0.productDetails(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCtrl",
      "productDetails",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """productDetails/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_security_LoginCtrl_login5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_security_LoginCtrl_login5_invoker = createInvoker(
    LoginCtrl_3.login(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginCtrl",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """ Login""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_security_LoginCtrl_loginSubmit6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_security_LoginCtrl_loginSubmit6_invoker = createInvoker(
    LoginCtrl_3.loginSubmit(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginCtrl",
      "loginSubmit",
      Nil,
      "POST",
      this.prefix + """loginSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_security_LoginCtrl_logout7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_security_LoginCtrl_logout7_invoker = createInvoker(
    LoginCtrl_3.logout(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginCtrl",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_ShoppingCtrl_showBasket8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showBasket")))
  )
  private[this] lazy val controllers_ShoppingCtrl_showBasket8_invoker = createInvoker(
    ShoppingCtrl_1.showBasket(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "showBasket",
      Nil,
      "GET",
      this.prefix + """showBasket""",
      """ Shopping""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_ShoppingCtrl_addToBasket9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addToBasket/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_addToBasket9_invoker = createInvoker(
    ShoppingCtrl_1.addToBasket(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "addToBasket",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """addToBasket/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_ShoppingCtrl_addOne10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_addOne10_invoker = createInvoker(
    ShoppingCtrl_1.addOne(fakeValue[Long], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "addOne",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      this.prefix + """addOne/""" + "$" + """itemId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_ShoppingCtrl_removeOne11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_removeOne11_invoker = createInvoker(
    ShoppingCtrl_1.removeOne(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "removeOne",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """removeOne/""" + "$" + """itemId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_ShoppingCtrl_emptyBasket12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emptyBasket")))
  )
  private[this] lazy val controllers_ShoppingCtrl_emptyBasket12_invoker = createInvoker(
    ShoppingCtrl_1.emptyBasket(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "emptyBasket",
      Nil,
      "GET",
      this.prefix + """emptyBasket""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_ShoppingCtrl_placeOrder13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("placeOrder")))
  )
  private[this] lazy val controllers_ShoppingCtrl_placeOrder13_invoker = createInvoker(
    ShoppingCtrl_1.placeOrder(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "placeOrder",
      Nil,
      "GET",
      this.prefix + """placeOrder""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_ShoppingCtrl_cancelOrder14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cancelOrder")))
  )
  private[this] lazy val controllers_ShoppingCtrl_cancelOrder14_invoker = createInvoker(
    ShoppingCtrl_1.cancelOrder(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "cancelOrder",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """cancelOrder""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_ShoppingCtrl_viewOrders15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewOrders")))
  )
  private[this] lazy val controllers_ShoppingCtrl_viewOrders15_invoker = createInvoker(
    ShoppingCtrl_1.viewOrders(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "viewOrders",
      Nil,
      "GET",
      this.prefix + """viewOrders""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_security_LoginCtrl_users16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_security_LoginCtrl_users16_invoker = createInvoker(
    LoginCtrl_3.users,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginCtrl",
      "users",
      Nil,
      "GET",
      this.prefix + """users""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_security_LoginCtrl_addUser17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addUser")))
  )
  private[this] lazy val controllers_security_LoginCtrl_addUser17_invoker = createInvoker(
    LoginCtrl_3.addUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginCtrl",
      "addUser",
      Nil,
      "GET",
      this.prefix + """addUser""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_security_LoginCtrl_addUserSubmit18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addUserSubmit")))
  )
  private[this] lazy val controllers_security_LoginCtrl_addUserSubmit18_invoker = createInvoker(
    LoginCtrl_3.addUserSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginCtrl",
      "addUserSubmit",
      Nil,
      "POST",
      this.prefix + """addUserSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_AdminProductCtrl_index19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin")))
  )
  private[this] lazy val controllers_AdminProductCtrl_index19_invoker = createInvoker(
    AdminProductCtrl_2.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "index",
      Nil,
      "GET",
      this.prefix + """Admin""",
      """ Product Administration""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_AdminProductCtrl_listProducts20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/listProducts")))
  )
  private[this] lazy val controllers_AdminProductCtrl_listProducts20_invoker = createInvoker(
    AdminProductCtrl_2.listProducts(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "listProducts",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """Admin/listProducts""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_AdminProductCtrl_listProducts21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/listProducts/"), DynamicPart("cat", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProductCtrl_listProducts21_invoker = createInvoker(
    AdminProductCtrl_2.listProducts(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "listProducts",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """Admin/listProducts/""" + "$" + """cat<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_AdminProductCtrl_addProduct22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/addProduct")))
  )
  private[this] lazy val controllers_AdminProductCtrl_addProduct22_invoker = createInvoker(
    AdminProductCtrl_2.addProduct(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "addProduct",
      Nil,
      "GET",
      this.prefix + """Admin/addProduct""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_AdminProductCtrl_addProductSubmit23_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/addProductSubmit")))
  )
  private[this] lazy val controllers_AdminProductCtrl_addProductSubmit23_invoker = createInvoker(
    AdminProductCtrl_2.addProductSubmit(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "addProductSubmit",
      Nil,
      "POST",
      this.prefix + """Admin/addProductSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_AdminProductCtrl_updateProduct24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/updateProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProductCtrl_updateProduct24_invoker = createInvoker(
    AdminProductCtrl_2.updateProduct(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "updateProduct",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """Admin/updateProduct/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_AdminProductCtrl_updateProductSubmit25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/updateProductSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProductCtrl_updateProductSubmit25_invoker = createInvoker(
    AdminProductCtrl_2.updateProductSubmit(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "updateProductSubmit",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """Admin/updateProductSubmit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_security_LoginCtrl_deleteUser26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteUser/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_security_LoginCtrl_deleteUser26_invoker = createInvoker(
    LoginCtrl_3.deleteUser(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginCtrl",
      "deleteUser",
      Seq(classOf[String]),
      "GET",
      this.prefix + """deleteUser/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_security_LoginCtrl_updateUser27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateUser/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_security_LoginCtrl_updateUser27_invoker = createInvoker(
    LoginCtrl_3.updateUser(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginCtrl",
      "updateUser",
      Seq(classOf[String]),
      "GET",
      this.prefix + """updateUser/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:48
  private[this] lazy val controllers_security_LoginCtrl_registerUser28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registerUser")))
  )
  private[this] lazy val controllers_security_LoginCtrl_registerUser28_invoker = createInvoker(
    LoginCtrl_3.registerUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginCtrl",
      "registerUser",
      Nil,
      "GET",
      this.prefix + """registerUser""",
      """""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val controllers_security_LoginCtrl_registerUserSubmit29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registerUserSubmit")))
  )
  private[this] lazy val controllers_security_LoginCtrl_registerUserSubmit29_invoker = createInvoker(
    LoginCtrl_3.registerUserSubmit(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginCtrl",
      "registerUserSubmit",
      Nil,
      "POST",
      this.prefix + """registerUserSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:51
  private[this] lazy val controllers_AdminProductCtrl_deleteProduct30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/deleteProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProductCtrl_deleteProduct30_invoker = createInvoker(
    AdminProductCtrl_2.deleteProduct(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "deleteProduct",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """Admin/deleteProduct/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:53
  private[this] lazy val controllers_Assets_versioned31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned31_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:54
  private[this] lazy val controllers_Assets_at32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("javascripts/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at32_invoker = createInvoker(
    Assets_4.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """javascripts/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )

  // @LINE:55
  private[this] lazy val controllers_Assets_at33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("images/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at33_invoker = createInvoker(
    Assets_4.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """images/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:4
    case controllers_ProductCtrl_index0_route(params@_) =>
      call { 
        controllers_ProductCtrl_index0_invoker.call(ProductCtrl_0.index())
      }
  
    // @LINE:5
    case controllers_ProductCtrl_home1_route(params@_) =>
      call { 
        controllers_ProductCtrl_home1_invoker.call(ProductCtrl_0.home())
      }
  
    // @LINE:6
    case controllers_ProductCtrl_contacts2_route(params@_) =>
      call { 
        controllers_ProductCtrl_contacts2_invoker.call(ProductCtrl_0.contacts())
      }
  
    // @LINE:9
    case controllers_ProductCtrl_listProducts3_route(params@_) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_ProductCtrl_listProducts3_invoker.call(ProductCtrl_0.listProducts(cat, filter))
      }
  
    // @LINE:10
    case controllers_ProductCtrl_productDetails4_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProductCtrl_productDetails4_invoker.call(ProductCtrl_0.productDetails(id))
      }
  
    // @LINE:13
    case controllers_security_LoginCtrl_login5_route(params@_) =>
      call { 
        controllers_security_LoginCtrl_login5_invoker.call(LoginCtrl_3.login())
      }
  
    // @LINE:14
    case controllers_security_LoginCtrl_loginSubmit6_route(params@_) =>
      call { 
        controllers_security_LoginCtrl_loginSubmit6_invoker.call(LoginCtrl_3.loginSubmit())
      }
  
    // @LINE:15
    case controllers_security_LoginCtrl_logout7_route(params@_) =>
      call { 
        controllers_security_LoginCtrl_logout7_invoker.call(LoginCtrl_3.logout())
      }
  
    // @LINE:18
    case controllers_ShoppingCtrl_showBasket8_route(params@_) =>
      call { 
        controllers_ShoppingCtrl_showBasket8_invoker.call(ShoppingCtrl_1.showBasket())
      }
  
    // @LINE:19
    case controllers_ShoppingCtrl_addToBasket9_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShoppingCtrl_addToBasket9_invoker.call(ShoppingCtrl_1.addToBasket(id))
      }
  
    // @LINE:20
    case controllers_ShoppingCtrl_addOne10_route(params@_) =>
      call(params.fromPath[Long]("itemId", None), params.fromQuery[Long]("pid", None)) { (itemId, pid) =>
        controllers_ShoppingCtrl_addOne10_invoker.call(ShoppingCtrl_1.addOne(itemId, pid))
      }
  
    // @LINE:21
    case controllers_ShoppingCtrl_removeOne11_route(params@_) =>
      call(params.fromPath[Long]("itemId", None)) { (itemId) =>
        controllers_ShoppingCtrl_removeOne11_invoker.call(ShoppingCtrl_1.removeOne(itemId))
      }
  
    // @LINE:22
    case controllers_ShoppingCtrl_emptyBasket12_route(params@_) =>
      call { 
        controllers_ShoppingCtrl_emptyBasket12_invoker.call(ShoppingCtrl_1.emptyBasket())
      }
  
    // @LINE:23
    case controllers_ShoppingCtrl_placeOrder13_route(params@_) =>
      call { 
        controllers_ShoppingCtrl_placeOrder13_invoker.call(ShoppingCtrl_1.placeOrder())
      }
  
    // @LINE:24
    case controllers_ShoppingCtrl_cancelOrder14_route(params@_) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_ShoppingCtrl_cancelOrder14_invoker.call(ShoppingCtrl_1.cancelOrder(id))
      }
  
    // @LINE:25
    case controllers_ShoppingCtrl_viewOrders15_route(params@_) =>
      call { 
        controllers_ShoppingCtrl_viewOrders15_invoker.call(ShoppingCtrl_1.viewOrders())
      }
  
    // @LINE:27
    case controllers_security_LoginCtrl_users16_route(params@_) =>
      call { 
        controllers_security_LoginCtrl_users16_invoker.call(LoginCtrl_3.users)
      }
  
    // @LINE:28
    case controllers_security_LoginCtrl_addUser17_route(params@_) =>
      call { 
        controllers_security_LoginCtrl_addUser17_invoker.call(LoginCtrl_3.addUser)
      }
  
    // @LINE:29
    case controllers_security_LoginCtrl_addUserSubmit18_route(params@_) =>
      call { 
        controllers_security_LoginCtrl_addUserSubmit18_invoker.call(LoginCtrl_3.addUserSubmit)
      }
  
    // @LINE:32
    case controllers_AdminProductCtrl_index19_route(params@_) =>
      call { 
        controllers_AdminProductCtrl_index19_invoker.call(AdminProductCtrl_2.index())
      }
  
    // @LINE:34
    case controllers_AdminProductCtrl_listProducts20_route(params@_) =>
      call(params.fromQuery[Long]("cat", Some(0L))) { (cat) =>
        controllers_AdminProductCtrl_listProducts20_invoker.call(AdminProductCtrl_2.listProducts(cat))
      }
  
    // @LINE:35
    case controllers_AdminProductCtrl_listProducts21_route(params@_) =>
      call(params.fromPath[Long]("cat", None)) { (cat) =>
        controllers_AdminProductCtrl_listProducts21_invoker.call(AdminProductCtrl_2.listProducts(cat))
      }
  
    // @LINE:37
    case controllers_AdminProductCtrl_addProduct22_route(params@_) =>
      call { 
        controllers_AdminProductCtrl_addProduct22_invoker.call(AdminProductCtrl_2.addProduct())
      }
  
    // @LINE:38
    case controllers_AdminProductCtrl_addProductSubmit23_route(params@_) =>
      call { 
        controllers_AdminProductCtrl_addProductSubmit23_invoker.call(AdminProductCtrl_2.addProductSubmit())
      }
  
    // @LINE:40
    case controllers_AdminProductCtrl_updateProduct24_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminProductCtrl_updateProduct24_invoker.call(AdminProductCtrl_2.updateProduct(id))
      }
  
    // @LINE:41
    case controllers_AdminProductCtrl_updateProductSubmit25_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminProductCtrl_updateProductSubmit25_invoker.call(AdminProductCtrl_2.updateProductSubmit(id))
      }
  
    // @LINE:43
    case controllers_security_LoginCtrl_deleteUser26_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_security_LoginCtrl_deleteUser26_invoker.call(LoginCtrl_3.deleteUser(id))
      }
  
    // @LINE:44
    case controllers_security_LoginCtrl_updateUser27_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_security_LoginCtrl_updateUser27_invoker.call(LoginCtrl_3.updateUser(id))
      }
  
    // @LINE:48
    case controllers_security_LoginCtrl_registerUser28_route(params@_) =>
      call { 
        controllers_security_LoginCtrl_registerUser28_invoker.call(LoginCtrl_3.registerUser)
      }
  
    // @LINE:49
    case controllers_security_LoginCtrl_registerUserSubmit29_route(params@_) =>
      call { 
        controllers_security_LoginCtrl_registerUserSubmit29_invoker.call(LoginCtrl_3.registerUserSubmit())
      }
  
    // @LINE:51
    case controllers_AdminProductCtrl_deleteProduct30_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminProductCtrl_deleteProduct30_invoker.call(AdminProductCtrl_2.deleteProduct(id))
      }
  
    // @LINE:53
    case controllers_Assets_versioned31_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned31_invoker.call(Assets_4.versioned(path, file))
      }
  
    // @LINE:54
    case controllers_Assets_at32_route(params@_) =>
      call(Param[String]("path", Right("/public/javascripts")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at32_invoker.call(Assets_4.at(path, file))
      }
  
    // @LINE:55
    case controllers_Assets_at33_route(params@_) =>
      call(Param[String]("path", Right("/public/images")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at33_invoker.call(Assets_4.at(path, file))
      }
  }
}
