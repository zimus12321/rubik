import java.awt.*;

public class TopTile extends Tile {

    private Point[] rectPoints; // 0. topLeft, 1. topRight, 2. bottomLeft, 3. bottomRight
    private Point dirVector1;
    private Point dirVector2;

    public TopTile(int x, int y, int width, int height, Image image){
        super(x,y,width,height,image);

        rectPoints = new Point[4];

        rectPoints[0] = new Point(x + width / 2, y);
        rectPoints[1] = new Point(x + width, y + height / 2);
        rectPoints[2] = new Point(x,y + height / 2);
        rectPoints[3] = new Point(x + width / 2, y + height);

        dirVector1 = new Point(rectPoints[0].getX() - rectPoints[1].getX(), rectPoints[0].getY() - rectPoints[1].getY());
        dirVector2 = new Point(rectPoints[0].getX() - rectPoints[2].getX(), rectPoints[0].getY() - rectPoints[2].getY());
    }

    @Override
    public boolean isCoordinateInsideTile(int x, int y){
        boolean result = true;
        if(dirVector1.getY() * x - dirVector1.getX() * y + dirVector1.getX() * rectPoints[0].getY() - dirVector1.getY() * rectPoints[0].getX() < 0) result = false;
        if(dirVector1.getY() * x - dirVector1.getX() * y + dirVector1.getX() * rectPoints[2].getY() - dirVector1.getY() * rectPoints[2].getX() > 0) result = false;
        if(dirVector2.getY() * x - dirVector2.getX() * y + dirVector2.getX() * rectPoints[0].getY() - dirVector2.getY() * rectPoints[0].getX() > 0) result = false;
        if(dirVector2.getY() * x - dirVector2.getX() * y + dirVector2.getX() * rectPoints[1].getY() - dirVector2.getY() * rectPoints[1].getX() < 0) result = false;
        return result;
    }
}
