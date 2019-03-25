// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Year2Project-CarSales/CarSalesSite/conf/routes
// @DATE:Mon Mar 25 11:23:04 GMT 2019


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
