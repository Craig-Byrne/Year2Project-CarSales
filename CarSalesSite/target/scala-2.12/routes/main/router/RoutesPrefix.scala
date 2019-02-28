// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Year2Project/Year2Project-CarSales/CarSalesSite/conf/routes
// @DATE:Thu Feb 28 11:58:07 GMT 2019


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
