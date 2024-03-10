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
        String svg = "<line x1=\\" + p1.x + "\\ y1=\\" + p1.y + "\\ x2=\\" + p2.x + "\\ y2=\\" + p2.y + "\\style=stroke:green;stroke-width:6 />";
        return svg;
    }
    public Segment[] perpend(Point point){
        Segment[] segBoth = new Segment[2];
        float a = (p2.y-p1.y)/(p2.x-p1.x);
        float a2 = -1/a;
        float b2 = point.y - a2 * point.x;
        double d = distance();

        float x1 = (float)((point.x+d)/Math.sqrt(1-a2*a2));
        float y1 = a2 * x1 + b2;
        float x2 = (float)((point.x-d)/Math.sqrt(1-a2*a2));
        float y2 = a2 * x2 + b2;

        Point pT1 = new Point(x1, y1);
        Point pT2 = new Point(x2, y2);
        segBoth[0] = new Segment(point, pT1);
        segBoth[1] = new Segment(point, pT2);
        return segBoth;
    }
}
