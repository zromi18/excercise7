import org.scalatest._

/**
  * Created by RZarzecki on 5/24/2016.
  */
class PointSpec extends FlatSpec with Matchers {

  "A Stack" should "pop values in last-in-first-out order" in {
    val point = Point(1, 2).move(2, 1)

    val g: Int = 1
    (g + 2) should be (3)
    assert(point == Point(3, 3))
  }
}