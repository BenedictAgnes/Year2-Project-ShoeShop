
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/ShoeShop/conf/routes
// @DATE:Tue Mar 05 10:32:52 GMT 2019


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
