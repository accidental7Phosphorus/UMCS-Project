import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class svgScene {
    private ArrayList<Polygon> poly;
    private Shape[] shapes;
    public void addShape(Shape shape){
        Shape[] temp = new Shape[shapes.length+1];
        temp[shapes.length] = shape;
        shapes = new Shape[shapes.length+1];
        shapes = temp;
    }
    public void addPoly(Polygon p){
        poly.add(p);
    }
    public void save(String path){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            writer.write("<!DOCTYPE html>\n" + "<html>\n" + "<head>\n" + "<title>Page Title</title>\n" + "</head>\n" + "<body>");
            for(Polygon p : poly){
                writer.write(p.toSvg());
            }
            writer.write("</body>\n" + "</html>");
            writer.close();

        } catch (IOException e) {
            e.getMessage();
            throw new RuntimeException(e);
        }
    }
}
