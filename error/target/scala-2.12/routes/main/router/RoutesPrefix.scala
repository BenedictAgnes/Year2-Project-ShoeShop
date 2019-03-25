
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/proj/Year2-Project-ShoeShop/error/conf/routes
// @DATE:Mon Mar 25 15:20:32 GMT 2019


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
