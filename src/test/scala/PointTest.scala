import org.specs2.matcher.Matchers
import org.scalatest._

/**
  * Created by RZarzecki on 5/24/2016.
  */
class PointSpec extends FlatSpec with Matchers {

  "A Stack" should "pop values in last-in-first-out order" in {
    val point = Point(1, 2).move(2, 1)

    assert((1 + 2) == 3)
    assert(point == Point(3, 3))
  }
}