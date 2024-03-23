public abstract class Shape {

    public Shape() {
    }

    protected Style style;
    public Shape(Style style) {
        this.style = style;
    }
    public abstract String toSvg();
}
