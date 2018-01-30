package figure_ops

import bootcamp_fraction.MyFraction
import shapes._

object FigureOps {

  def resizeRectangle(myFraction: MyFraction, rec: Rectangle): Rectangle = {
    new Rectangle(
      width = (myFraction * MyFraction(rec.width)).toDouble,
      height = (myFraction * MyFraction(rec.height)).toDouble,
      origin = rec.origin,
      strokeColor = rec.strokeColor,
      fillColor = rec.fillColor
    )
  }

  def resizeSquare(myFraction: MyFraction, sq: Square): Square = {
    new Square(
      length = (myFraction * MyFraction(sq.length)).toDouble,
      origin = sq.origin,
      strokeColor = sq.strokeColor,
      fillColor = sq.fillColor
    )
  }

  def resizeEllipse(myFraction: MyFraction, ell: Ellipse): Ellipse = {
    new Ellipse(
      hRadius = (myFraction * MyFraction(ell.hRadius)).toDouble,
      vRadius = (myFraction * MyFraction(ell.vRadius)).toDouble,
      origin = ell.origin,
      strokeColor = ell.strokeColor,
      fillColor = ell.fillColor
    )
  }

  def resizeCircle(myFraction: MyFraction, circ: Circle): Circle = {
    new Circle(
      radius = (myFraction * MyFraction(circ.radius)).toDouble,
      origin = circ.origin,
      strokeColor = circ.strokeColor,
      fillColor = circ.fillColor
    )
  }

//  def resize[F <: GeometricFigure](figure: F)(myFraction: MyFraction): F = figure match {
//    case rec: Rectangle => resizeRectangle(myFraction, rec)
//    case sq: Square => resizeSquare(myFraction, sq)
//    case ell: Ellipse => resizeEllipse(myFraction, ell)
//    case circ: Circle => resizeCircle(myFraction, circ)
//  }

}
