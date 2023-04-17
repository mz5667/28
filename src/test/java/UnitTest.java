import app.Point;
import app.Task;
import misc.CoordinateSystem2d;
import misc.Vector2d;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Класс тестирования
 */
public class UnitTest {

    /**
     * Тест
     *
     * @param points        список точек
     * @param crossedCoords мн-во пересечений
     * @param singleCoords  мн-во разности
     */
    private static void test(ArrayList<Point> points, Set<Vector2d> crossedCoords, Set<Vector2d> singleCoords) {
        Task task = new Task(new CoordinateSystem2d(10, 10, 20, 20), points);
        task.solve();
        // проверяем, что координат пересечения в два раза меньше, чем точек
        assert crossedCoords.size() == task.getCrossed().size() / 2;
        // проверяем, что координат разности столько же, сколько точек
        assert singleCoords.size() == task.getSingle().size();

        // проверяем, что все координаты всех точек пересечения содержатся в множестве координат
        for (Point p : task.getCrossed()) {
            assert crossedCoords.contains(p.getPos());
        }

        // проверяем, что все координаты всех точек разности содержатся в множестве координат
        for (Point p : task.getSingle()) {
            assert singleCoords.contains(p.getPos());
        }
    }


    /**
     * Первый тест
     */
    @Test
    public void test1() {
        ArrayList<Point> points = new ArrayList<>();


    }

    /**
     * Второй тест
     */
    @Test
    public void test2() {
        ArrayList<Point> points = new ArrayList<>();


    }

    /**
     * Третий тест
     */
    @Test
    public void test3() {
        ArrayList<Point> points = new ArrayList<>();


    }
}
