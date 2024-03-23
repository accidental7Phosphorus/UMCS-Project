import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        /*
        Segment[] arr = new Segment[2];
        for(int i=0; i<2; i++){
            float x1, x2, y1, y2;
            float max = 5;
            float min = 1;
            x1 = (int)(Math.random() * (max - min)+ 1) + min;
            y1 = (int)(Math.random() * (max - min)+ 1) + min;
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

            Segment[] segs = Segment.perpend(arr[i], p3);
            System.out.println(segs[0].toSvg());
            System.out.println(segs[1].toSvg());

            Point[] points = new Point[3];
            points[0] = new Point(1, 4);
            points[1] = p3;
            points[2] = new Point(5, 6);
            Polygon pol = new Polygon(points);
            System.out.println(pol.toSvg());
        }

         */
        Segment seg = new Segment(new Point(1, 6), new Point(5, 0));
        Polygon poly = Polygon.square(seg, new Style());
        System.out.println(poly.toSvg());

    }
}