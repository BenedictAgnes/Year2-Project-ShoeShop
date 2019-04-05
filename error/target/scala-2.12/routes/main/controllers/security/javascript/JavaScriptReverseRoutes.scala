
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Year2-Project-ShoeShop/error/conf/routes
// @DATE:Fri Apr 05 13:24:54 IST 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:13
package controllers.security.javascript {

  // @LINE:41
  class ReverseHomeCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:42
    def addCustomerSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.security.HomeCtrl.addCustomerSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addCustomerSubmit"})
        }
      """
    )
  
    // @LINE:41
    def addCustomer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.security.HomeCtrl.addCustomer",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addCustomer"})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseLoginCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def loginSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.security.LoginCtrl.loginSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:44
    def registerUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.security.LoginCtrl.registerUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "registerUser"})
        }
      """
    )
  
    // @LINE:15
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.security.LoginCtrl.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:45
    def registerUserSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.security.LoginCtrl.registerUserSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "registerUserSubmit"})
        }
      """
    )
  
    // @LINE:13
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.security.LoginCtrl.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }


}
