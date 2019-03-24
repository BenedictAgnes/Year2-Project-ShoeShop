// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/p/Year2-Project-ShoeShop/conf/routes
// @DATE:Sun Mar 24 13:03:37 GMT 2019


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
