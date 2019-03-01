// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/yr2/Year2-Project-ShoeShop/conf/routes
// @DATE:Fri Mar 01 12:29:49 GMT 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
