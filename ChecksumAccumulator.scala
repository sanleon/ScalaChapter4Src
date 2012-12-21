/**
 * Created with IntelliJ IDEA.
 * User: sbjo
 * Date: 12/12/21
 * Time: 22:45
 * To change this template use File | Settings | File Templates.
 */
class ChecksumAccumulator {
  private var sum = 0;
  def add(b: Byte) { sum += b }
  def checksum(): Int = ~(sum & 0xFF) + 1
}

import scala.collection.mutable.Map
object ChecksumAccumulator {
  private val cache = Map[String, Int]()
  def calculate(s: String): Int =
    if (cache.contains(s))
      cache(s)
    else {
      val acc = new ChecksumAccumulator
      for (c <- s)
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }
}


