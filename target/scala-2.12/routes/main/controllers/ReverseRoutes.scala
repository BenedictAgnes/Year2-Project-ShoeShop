// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/p/Year2-Project-ShoeShop/conf/routes
// @DATE:Sun Mar 24 13:03:37 GMT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:13
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def at(path:String, file:String): Call = {
    
      (path: @unchecked, file: @unchecked) match {
      
        // @LINE:20
        case (path, file) if path == "/public/javascripts" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public/javascripts"))); _rrc
          Call("GET", _prefix + { _defaultPrefix } + "javascripts/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
      
        // @LINE:21
        case (path, file) if path == "/public/images" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public/images"))); _rrc
          Call("GET", _prefix + { _defaultPrefix } + "images/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
      
      }
    
    }
  
    // @LINE:13
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:8
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def womens(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "womens")
    }
  
    // @LINE:17
    def mens(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "mens")
    }
  
    // @LINE:19
    def sales(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "sales")
    }
  
    // @LINE:22
    def kids(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "kids")
    }
  
    // @LINE:16
    def aboutus(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "aboutus")
    }
  
    // @LINE:6
    def index(): Call = {
    
      () match {
      
        // @LINE:6
        case ()  =>
          
          Call("GET", _prefix)
      
      }
    
    }
  
  }

  // @LINE:10
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:23
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def loginSubmit(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "loginSubmit")
    }
  
    // @LINE:23
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }


}
