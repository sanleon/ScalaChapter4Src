/**
 * Created with IntelliJ IDEA.
 * User: sbjo
 * Date: 12/12/21
 * Time: 23:00
 * To change this template use File | Settings | File Templates.
 */
import ChecksumAccumulator.calculate

object FallWinterSpringSummer extends App {
  for (season <- List("fall", "winter", "spring"))
    println(season + ": " + calculate(season))
}
