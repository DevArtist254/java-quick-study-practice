package GeneMap;

import java.util.ArrayList;

public class Layer {
    private ArrayList<Point> points;

    public Layer(){
        this.points = new ArrayList<>();
    }

    public void addElements(Point point){
        points.add(point);
    }

    public void printPoints(){
        //System.out.println(points);

        for (Point p : points){
            System.out.println(p.render());
        }
    }
}
