/**
  * Created by RZarzecki on 5/24/2016.
  */
case class Point(xc: Int, yc: Int) {
  def move(dx: Int, dy: Int) = {
    new Point(xc + dx, yc + dy)
  }
}

object Main extends App {
  println(new Point(1, 2).move(2, 1))
}