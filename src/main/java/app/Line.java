package app;
import java.util.Objects;
public class Line {
   Point pointA;
   Point pointB;
   double a;
   double b;
   double c;
   public Line(Point pointA, Point pointB) {
      this.pointA = pointA;
      this.pointB = pointB;
      a = this.pointB.pos.y-this.pointA.pos.y;
      b = this.pointA.pos.x-this.pointB.pos.x;
      c = this.pointA.pos.y*this.pointB.pos.x-this.pointB.pos.y*this.pointA.pos.x;
   }
   @Override
   public boolean equals(Object o) {
      // если объект сравнивается сам с собой, тогда объекты равны
      if (this == o) return true;
      // если в аргументе передан null или классы не совпадают, тогда объекты не равны
      if (o == null || getClass() != o.getClass()) return false;
      // приводим переданный в параметрах объект к текущему классу
      Line line=(Line) o;
      return Objects.equals(pointA, line.pointA) && Objects.equals(pointB, line.pointB);
   }
   @Override
   public int hashCode() {
      return Objects.hash(pointA, pointB);
   }
}

