import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        Segment[] arr = new Segment[2];
        for(int i=0; i<2; i++){
            float x1, x2, y1, y2;
            float max = 5;
            float min = 1;
            x1 = (float)(Math.random() * (max - min)+ 1) + min;
            y1 = (float)(Math.random() * (max - min)+ 1) + min;
            System.out.println("x2: ");
            x2 = scanner.nextFloat();
            System.out.println("y2: ");
            y2 = scanner.nextFloat();

            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);
            arr[i] = new Segment(p1, p2);

            System.out.println("|AB| = " + String.format("%.2f", arr[i].distance()));
            System.out.println(arr[i].toSvg());
            Point p3 = new Point(2, 3);

            Segment[] segs = perpend(arr[i], p3);
            Segment[] segs2 = arr[i].perpend(p3);
            System.out.println("x=" + segs[0].getP2().x + " y=" + segs[0].getP2().y);
            System.out.println("x=" + segs[1].getP2().x + " y=" + segs[1].getP2().y);

            Point[] points = new Point[3];
            points[0] = new Point(1, 4);
            points[1] = p3;
            points[2] = new Point(5, 6);
            Polygon pol = new Polygon(points);
            Polygon copy = new Polygon(pol);
            System.out.println(copy.toSvg());
        }
    }
    public static Segment[] perpend(Segment segment, Point point){
        Segment[] segBoth = new Segment[2];
        Point p1 = segment.getP1();
        Point p2 = segment.getP2();
        // wspolczynnik kierunkowy segmentu
        float a = (p2.y-p1.y)/(p2.x-p1.x);
        // wspolczynnik kierunkowy odcinka prostopadlego
        float a2 = -1/a;
        float b2 = point.y - a2 * point.x;
        double d = segment.distance();

        float x1 = (float)((point.x+d)/Math.sqrt(1-a2*a2));
        float y1 = a2 * x1 + b2;
        float x2 = (float)((point.x-d)/Math.sqrt(1-a2*a2));
        float y2 = a2 * x2 + b2;

        Point pT1 = new Point(Math.round(x1), Math.round(y1));
        Point pT2 = new Point(Math.round(x2), Math.round(y2));
        segBoth[0] = new Segment(point, pT1);
        segBoth[1] = new Segment(point, pT2);
        return segBoth;
    }
}