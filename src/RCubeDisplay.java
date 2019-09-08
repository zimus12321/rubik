import javax.swing.*;
import java.awt.*;

public class RCubeDisplay {
    //private Tile[][] topTiles;
    //private FrontTile[][] frontTiles;
    //private Tile[][] rightTiles;
    private Tile[][][] tiles;
    private RCube rCube;
    private Image[][] tileImages;
    private static int TOP_TILE_WIDTH = 53;
    private static int TOP_TILE_HEIGHT = 31;
    private static int SIDE_TILE_WIDTH = 27;
    private static int SIDE_TILE_HEIGHT = 46;
    private static int X;
    private static int Y;

    public RCubeDisplay(RCube rCube, int x, int y) {
        this.rCube = rCube;
        this.X = x;
        this.Y = y;

        tileImages = new Image[3][6];

        //topTiles = new TopTile[3][3];
        //frontTiles = new FrontTile[3][3];
        //rightTiles = new RightTile[3][3];

        tiles = new Tile[3][3][3];

        for (int j = 0; j < 6; j++){
            tileImages[0][j] = new ImageIcon("data/top_tile_" + MyColor.values()[j].toString().toLowerCase() + ".png").getImage();
            tileImages[1][j] = new ImageIcon("data/front_tile_" + MyColor.values()[j].toString().toLowerCase() + ".png").getImage();
            tileImages[2][j] = new ImageIcon("data/right_tile_" + MyColor.values()[j].toString().toLowerCase() + ".png").getImage();
        }
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tiles[0][i][j] = new TopTile((2 - i + j) * (TOP_TILE_WIDTH / 2 + 2) + X, (i + j) * (TOP_TILE_HEIGHT / 2 + 1) + Y,
                        TOP_TILE_WIDTH, TOP_TILE_HEIGHT, tileImages[0][rCube.getColor(0, i, j).ordinal()]);

                tiles[1][i][j] = new FrontTile(j * (SIDE_TILE_WIDTH + 1) + X - 1, (i * 2 + j) * 16 + (Y + TOP_TILE_HEIGHT * 3 / 2 + 4), // a 16 az így jön ki: (SIDE_TILE_HEIGHT^2 - SIDE_TILE_WIDTH^2)/(SIDE_TILE_HEIGHT*2)
                        SIDE_TILE_WIDTH, SIDE_TILE_HEIGHT, tileImages[1][rCube.getColor(1, i, j).ordinal()]);

                tiles[2][i][j] = new RightTile((3 + j) * (SIDE_TILE_WIDTH + 1) + X - 1, (i * 2 + 2 - j) * 16 + (Y + TOP_TILE_HEIGHT * 3 / 2 + 4),
                        SIDE_TILE_WIDTH, SIDE_TILE_HEIGHT, tileImages[2][rCube.getColor(2, i, j).ordinal()]);
            }
        }
    }

    public void update(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                tiles[0][i][j].setImage(tileImages[0][rCube.getColor(0, i, j).ordinal()]);
                tiles[1][i][j].setImage(tileImages[1][rCube.getColor(1, i, j).ordinal()]);
                tiles[2][i][j].setImage(tileImages[2][rCube.getColor(2, 2 - j, i).ordinal()]); // itt meg van cserélve az i és a j
            }
        }
    }

    public void draw(Graphics g) {
        for (int i = 0; i < 3; i++){
            for(int j = 0; j  < 3; j++){
                for (int k = 0; k < 3; k++) {
                    tiles[i][j][k].draw(g);
                }
            }
        }
    }

    public int[] getTileByCoordinates(int x, int y){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                for (int k = 0; k < 3; k++) {
                    if(tiles[i][j][k].isCoordinateInsideTile(x,y)){
                        if(i == 2){
                            return new int[]{i,2-k,j};
                        } else {
                            return new int[]{i,j,k};
                        }
                    }
                }
            }
        }
        return new int[]{-1,-1,-1};
    }
}
