package figure_ops

import bootcamp_fraction.MyFraction
import org.scalatest.FlatSpec
import shapes._

class FigureOpsSpec extends FlatSpec {

  "Resizing a square" should "take a square and a fraction and apply a resize by the length" in {
    val sq = Square(60, (34.5, 12.4))
    val frac = MyFraction(1, 3)

    assert {
      val resized = FigureOps.resizeSquare(frac, sq)
      20 == resized.length
    }
  }

  it should "not change the origin point" in {
    val sq = Square(60, (34.5, 12.4))
    val frac = MyFraction(1, 3)

    val resized = FigureOps.resizeSquare(frac, sq)
    assertResult((34.5, 12.4))(resized.origin)
  }

  "Resizing a rectangle" should "take a rectangle and a fraction and apply a resize by the width and height" in {
    val rec = Rectangle(60, 52, (34.5, 12.4))
    val frac = MyFraction(2, 8)

    assert {
      val resized = FigureOps.resizeRectangle(frac, rec)
      15 == resized.width
      13 == resized.height
    }
  }

  it should "not change the origin point" in {
    val rec = Rectangle(60, 52, (34.5, 12.4))
    val frac = MyFraction(1, 3)

    val resized = FigureOps.resizeRectangle(frac, rec)
    assertResult((34.5, 12.4))(resized.origin)

  }

  "Resizing a ellipse" should "take a ellipse and a fraction and apply a resize by the vRadius and hRadius" in {
    val ell = Ellipse(60, 52, (34.5, 12.4))
    val frac = MyFraction(2, 8)

    assertResult(Ellipse(15, 13, (34.5, 12.4)))(FigureOps.resize(frac, ell))
  }

  it should "not change the origin point" in {
    val ell = Ellipse(60, 52, (34.5, 12.4))
    val frac = MyFraction(1, 3)

    val resized = FigureOps.resizeEllipse(frac, ell)
    assertResult((34.5, 12.4))(resized.origin)

  }

  "Resizing a circle" should "take a ellipse and a fraction and apply a resize by the radius" in {
    val circ = Circle(60, (34.5, 12.4))
    val frac = MyFraction(2, 8)

    assertResult(Circle(15, (34.5, 12.4)))(FigureOps.resize(frac, circ))
  }

  it should "not change the origin point" in {
    val circ = Circle(60, (34.5, 12.4))
    val frac = MyFraction(1, 3)

    val resized = FigureOps.resizeCircle(frac, circ)
    assertResult((34.5, 12.4))(resized.origin)
  }
}
