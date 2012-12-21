/**
 * Created with IntelliJ IDEA.
 * User: sbjo
 * Date: 12/12/21
 * Time: 22:53
 * To change this template use File | Settings | File Templates.
 */
import ChecksumAccumulator.calculate

object Summer {
  def main(args: Array[String]) {
    for (arg <- args)
      println(arg + ": " + calculate(arg))
  }
}

