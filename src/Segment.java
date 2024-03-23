public class Segment {
    private Point p1, p2;

    public Segment(Point p1, Point p2){
        this.p1 = new Point(p1.x, p1.y);
        this.p2 = new Point(p2.x, p2.y);
    }
    public Point getP1(){
        return p1;
    }
    public Point getP2(){
        return p2;
    }

    public double distance(){
        double dx = p2.x - p1.x;
        double dy = p2.y - p1.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public String toSvg(){
        return "<line x1=\"" + this.p1.x + "\" y1=\"" + this.p1.y + "' x2=\"" + this.p2.x + "\" y2=\"" + this.p2.y +"\" style=\"stroke:red;stroke-width:2\" />";
    }
    public static Segment[] perpend(Segment s, Point point){
        float vecX = s.p2.x - s.p1.x;
        float vecY = s.p2.y - s.p1.y;
        float vecX1 = -vecX;
        float vecY1 = vecY;
        float vecX2 = vecX;
        float vecY2 = -vecY;
        float firstEndX = point.x - vecX1;
        float firstEndY = point.y - vecY1;
        float secondEndX = point.x - vecX2;
        float secondEndY = point.y - vecY2;
        Segment seg1 = new Segment(point, new Point(firstEndX, firstEndY));
        Segment seg2 = new Segment(point, new Point(secondEndX, secondEndY));
        return new Segment[]{seg1, seg2};
    }
    public static Segment[] perpend(Segment s, Point point, double len){
        float vecX = s.p2.x - s.p1.x;
        float vecY = s.p2.y - s.p1.y;
        float vecX1 = -vecX;
        float vecY1 = vecY;
        float vecX2 = vecX;
        float vecY2 = -vecY;
        float firstEndX = point.x - vecX1;
        float firstEndY = point.y - vecY1;
        float secondEndX = point.x - vecX2;
        float secondEndY = point.y - vecY2;
        Segment seg1 = new Segment(point, new Point(firstEndX, firstEndY));
        Segment seg2 = new Segment(point, new Point(secondEndX, secondEndY));
        return new Segment[]{seg1, seg2};
    }
}
