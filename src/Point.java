public class Point {
    public final float x;
    public final float y;
    public Point(float x, float y){
        this.x = x;
        this.y = y;

    }
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
}
