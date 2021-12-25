public class Picture {

    public final VerticalParabola verticalParabola;
    public final Circle circle;
    public final Line line;

    public Picture(VerticalParabola verticalParabola, Circle circle, Line line) {
        this.verticalParabola = verticalParabola;
        this.circle = circle;
        this.line = line;
    }

    public SimpleColor getColor(double x, double y) {

        if ((line.isPointAboveLine(x, y) && !circle.isPointInCircle(x, y) && !verticalParabola.isPointBelowOfParabola(x, y)) || (verticalParabola.isPointBelowOfParabola(x, y) && !line.isPointAboveLine(x, y)))
            return SimpleColor.BLUE;

        else if (!line.isPointAboveLine(x, y) && !circle.isPointInCircle(x, y))
            return SimpleColor.GREEN;

        else if (circle.isPointInCircle(x, y) && line.isPointAboveLine(x, y))
            return SimpleColor.GREY;

        else return SimpleColor.WHITE;

    }
}