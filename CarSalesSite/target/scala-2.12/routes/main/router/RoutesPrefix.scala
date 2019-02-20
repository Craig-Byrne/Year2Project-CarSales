// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Documents/Year2Project-CarSales/CarSalesSite/conf/routes
// @DATE:Wed Feb 20 16:11:30 GMT 2019


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
