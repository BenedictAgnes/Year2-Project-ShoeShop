
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/1/Year2-Project-ShoeShop/error/conf/routes
// @DATE:Tue Mar 26 10:23:42 GMT 2019

package controllers.security;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.security.ReverseLoginCtrl LoginCtrl = new controllers.security.ReverseLoginCtrl(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.security.javascript.ReverseLoginCtrl LoginCtrl = new controllers.security.javascript.ReverseLoginCtrl(RoutesPrefix.byNamePrefix());
  }

}
