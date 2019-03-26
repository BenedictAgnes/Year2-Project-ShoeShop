
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/1/Year2-Project-ShoeShop/error/conf/routes
// @DATE:Tue Mar 26 10:23:42 GMT 2019


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
