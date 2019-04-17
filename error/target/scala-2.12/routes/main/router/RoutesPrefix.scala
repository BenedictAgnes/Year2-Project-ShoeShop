
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Year2-Project-ShoeShop/error/conf/routes
// @DATE:Wed Apr 17 14:37:34 IST 2019


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
