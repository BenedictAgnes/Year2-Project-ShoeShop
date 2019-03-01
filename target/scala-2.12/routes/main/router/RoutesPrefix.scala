// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/project/projectyr2/Year2-Project-ShoeShop/conf/routes
// @DATE:Fri Mar 01 09:50:45 GMT 2019


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
