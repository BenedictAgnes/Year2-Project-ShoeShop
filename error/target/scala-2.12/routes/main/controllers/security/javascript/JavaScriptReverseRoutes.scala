
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Year2-Project-ShoeShop/error/conf/routes
// @DATE:Wed Apr 17 14:37:34 IST 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:13
package controllers.security.javascript {

  // @LINE:13
  class ReverseLoginCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:44
    def updateUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.security.LoginCtrl.updateUser",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateUser/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:28
    def addUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.security.LoginCtrl.addUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addUser"})
        }
      """
    )
  
    // @LINE:14
    def loginSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.security.LoginCtrl.loginSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "loginSubmit"})
        }
      """
    )
  
    // @LINE:48
    def registerUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.security.LoginCtrl.registerUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "registerUser"})
        }
      """
    )
  
    // @LINE:29
    def addUserSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.security.LoginCtrl.addUserSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addUserSubmit"})
        }
      """
    )
  
    // @LINE:27
    def users: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.security.LoginCtrl.users",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
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
  
    // @LINE:49
    def registerUserSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.security.LoginCtrl.registerUserSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "registerUserSubmit"})
        }
      """
    )
  
    // @LINE:43
    def deleteUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.security.LoginCtrl.deleteUser",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteUser/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
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
