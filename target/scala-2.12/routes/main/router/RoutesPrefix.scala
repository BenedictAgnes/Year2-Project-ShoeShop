// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Project1/Year2-Project-ShoeShop/conf/routes
// @DATE:Wed Feb 27 16:29:51 GMT 2019


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
