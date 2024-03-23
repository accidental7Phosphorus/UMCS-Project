public class Ellipse extends Shape{
    private Point center;
    private Style style;
    private float radius;
    @Override
    public String toSvg() {
        return "<ellipse rx=\"" + radius + "\" ry=\"" + radius + "\" cx=\"" + center.x + "\" cy=\"" + center.y + "\" " + style.toSvg();
    }
}
