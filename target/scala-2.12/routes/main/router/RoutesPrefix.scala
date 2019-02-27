// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Year2/Year2-Project-ShoeShop/conf/routes
// @DATE:Wed Feb 27 09:52:48 GMT 2019


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
