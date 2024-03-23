public class Polygon extends Shape{
    private Point[] points;
    public Style style;
    public Polygon(Point[] arr, Style s){
        super(s);
        points = new Point[arr.length];
        for(int i=0; i<arr.length; i++){
            points[i] = new Point(arr[i].x, arr[i].y);
        }
        this.style = new Style(s.fillColor, s.strokeColor, s.strokeWidth);
    }
    public Polygon(Point[] arr){
        points = new Point[arr.length];
        for(int i=0; i<arr.length; i++){
            points[i] = new Point(arr[i].x, arr[i].y);
        }
    }
    public Polygon(Polygon polygon1){
        this.points = new Point[polygon1.points.length];
        for(int i=0; i<polygon1.points.length; i++){
            this.points[i] = new Point(polygon1.points[i].x, polygon1.points[i].y);
        }
        this.style = new Style(polygon1.style.fillColor, polygon1.style.strokeColor, polygon1.style.strokeWidth);
    }
    public String toSvg(){
        StringBuilder svg = new StringBuilder();
        svg.append("<polygon points=\"");
        for(Point point : points){
            svg.append(point.x).append(",").append(point.y).append(" ");
        }
        svg.append("\" ");
        if(style != null){
            svg.append(style.toSvg());
        }
        else{
            svg.append("style=\"fill:lime;fill-opacity:0;stroke:black;stroke-width:1\" />");
        }

        return svg.toString();
    }
    public static Polygon square(Segment s, Style style){
        float vecX = (s.getP2().x + s.getP1().x)/2;
        float vecY = (s.getP2().y + s.getP1().y)/2;
        System.out.println(vecX + " " + vecY);
        Segment half = new Segment(s.getP1(), new Point(vecX, vecY));
        Segment[] diag2 = Segment.perpend(half, new Point(vecX, vecY));
        Point b = new Point(diag2[0].getP2());
        Point d = new Point(diag2[1].getP2());
        Point a = new Point(s.getP1());
        Point c = new Point(s.getP2());
        Point[] points = new Point[]{a, b, c, d};
        return new Polygon(points);
    }
}
