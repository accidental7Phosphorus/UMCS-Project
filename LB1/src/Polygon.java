public class Polygon {
    private Point[] points;
    private final int size;
    public Polygon(Point[] arr){
        this.size = arr.length;
        points = new Point[size];
        for(int i=0; i<size; i++){
            points[i] = new Point(arr[i].x, arr[i].y);
        }
    }
    //gleboka kopia
    public Polygon(Polygon polygon1){
        this.size = polygon1.points.length;
        this.points = new Point[size];
        for(int i=0; i<polygon1.points.length; i++){
            this.points[i] = new Point(polygon1.points[i].x, polygon1.points[i].y);
        }
    }
    public String toSvg() {
        String svg = "<polygon points=\"";
        for (int i = 0; i < size; i++) {
            svg += points[i].x + "," + points[i].y + " ";
        }
        svg += "\"style=\"fill:lime;stroke:purple;stroke-width:1\" />";
        return svg;
    }
}
