// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Year2Project-CarSales/CarSalesSite/conf/routes
// @DATE:Tue Mar 26 17:06:00 GMT 2019


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
