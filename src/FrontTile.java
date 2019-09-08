import java.awt.*;

public class FrontTile extends Tile {

    private Point[] rectPoints; // 0. topLeft, 1. topRight, 2. bottomLeft, 3. bottomRight
    private Point dirVector;

    public FrontTile(int x, int y, int width, int height, Image image){
        super(x,y,width,height,image);

        rectPoints = new Point[4];
        int rectSideLength = Math.round((float)((Math.pow(height, 2) - Math.pow(width,2))/(height*2)));

        rectPoints[0] = new Point(x, y);
        rectPoints[1] = new Point(x + width, y + rectSideLength);
        rectPoints[2] = new Point(x,y + height - rectSideLength);
        rectPoints[3] = new Point(x + width, y + height);

        dirVector = new Point(rectPoints[0].getX() - rectPoints[1].getX(), rectPoints[0].getY() - rectPoints[1].getY());
    }

    @Override
    public boolean isCoordinateInsideTile(int x, int y){
        boolean result = true;
        if(x < getX() || x > getX() + getWidth()) result = false;
        if(dirVector.getY() * x - dirVector.getX() * y + dirVector.getX() * getY() - dirVector.getY() * getX() < 0) result = false;
        if(dirVector.getY() * x - dirVector.getX() * y + dirVector.getX() * rectPoints[2].getY() - dirVector.getY() * rectPoints[2].getX() > 0) result = false;

        return result;
    }
}
