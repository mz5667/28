package app;
import java.util.Objects;
public class Triangle {
    Point A;
    Point B;
    Point C;
    double a1;
    double b1;
    double c1;
    double a2;
    double b2;
    double c2;
    double a3;
    double b3;
    double c3;
    public Triangle (Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;
        a1 = this.B.pos.y-this.A.pos.y;
        b1 = this.A.pos.x-this.B.pos.x;
        c1 = this.A.pos.y*this.B.pos.x-this.B.pos.y*this.A.pos.x;

        a2 = this.C.pos.y-this.B.pos.y;
        b2 = this.B.pos.x-this.C.pos.x;
        c2 = this.B.pos.y*this.C.pos.x-this.C.pos.y*this.B.pos.x;

        a3 = this.A.pos.y-this.C.pos.y;
        b3 = this.C.pos.x-this.A.pos.x;
        c3 = this.C.pos.y*this.A.pos.x-this.A.pos.y*this.C.pos.x;
    }
    @Override
    public boolean equals(Object o) {
        // если объект сравнивается сам с собой, тогда объекты равны
        if (this == o) return true;
        // если в аргументе передан null или классы не совпадают, тогда объекты не равны
        if (o == null || getClass() != o.getClass()) return false;
        // приводим переданный в параметрах объект к текущему классу
        Triangle triangle=(Triangle) o;
        return Objects.equals(A, triangle.A) && Objects.equals(B, triangle.B) && Objects.equals(C, triangle.C);
    }
    @Override
    public int hashCode() {
        return Objects.hash(A, B, C);
    }
}

