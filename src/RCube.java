public class RCube {
    private Side[] sides;

    public RCube(){
        sides = new Side[6];
        MyColor possibleColors[] = MyColor.values();

        for(int i = 0; i < 6; i++){
            sides[i] = new Side(possibleColors[i]);
        }
    }

    public MyColor getColor(int sideIndex, int i, int j){
        return sides[sideIndex].getColor(i,j);
    }

    public void clockwiseRTurn(){
        //ilyenkor a kettes oldal is fordul
        MyColor[] tempColor = new MyColor[3];
        // az oldal körülötti színek fordítása
        for (int i = 0; i < 3; i++){
            tempColor[i] = sides[0].getColor(i,2);
            sides[0].setColor(i,2, sides[1].getColor(i,2));
            sides[1].setColor(i,2, sides[5].getColor(i,2));
            sides[5].setColor(i,2, sides[3].getColor(i,2));
            sides[3].setColor(i,2,tempColor[i]);
        }

        //az oldalon lévő színek fordítása
        turnSideClockwise(2);
    }

    public void antiClockwiseRTurn(){
        for(int i = 0; i < 3; i++){
            clockwiseRTurn();
        }
    }

    public void clockwiseUTurn(){
        turnCubeClockwiseByZ();
        clockwiseRTurn();
        turnCubeAntiClockwiseByZ();
    }


    public void antiClockwiseUTurn(){
        turnCubeClockwiseByZ();
        antiClockwiseRTurn();
        turnCubeAntiClockwiseByZ();
    }

    public void clockwiseFTurn(){
        turnCubeAntiClockwiseByY();
        clockwiseRTurn();
        turnCubeClockwiseByY();
    }

    public void antiClockwiseFTurn(){
        turnCubeAntiClockwiseByY();
        antiClockwiseRTurn();
        turnCubeClockwiseByY();
    }

    public void clockwiseDTurn(){
        turnCubeAntiClockwiseByZ();
        clockwiseRTurn();
        turnCubeClockwiseByZ();
    }


    public void antiClockwiseDTurn(){
        turnCubeAntiClockwiseByZ();
        antiClockwiseRTurn();
        turnCubeClockwiseByZ();
    }

    public void clockwiseLTurn(){
        turnCubeClockwiseByZ();
        turnCubeClockwiseByZ();
        clockwiseRTurn();
        turnCubeClockwiseByZ();
        turnCubeClockwiseByZ();
    }


    public void antiClockwiseLTurn(){
        turnCubeClockwiseByZ();
        turnCubeClockwiseByZ();
        antiClockwiseRTurn();
        turnCubeClockwiseByZ();
        turnCubeClockwiseByZ();
    }

    public void clockwiseBTurn(){
        turnCubeClockwiseByY();
        clockwiseRTurn();
        turnCubeAntiClockwiseByY();
    }


    public void antiClockwiseBTurn() {
        turnCubeClockwiseByY();
        antiClockwiseRTurn();
        turnCubeAntiClockwiseByY();
    }

    public void clockwiseMTurn() {
        MyColor[] tempColor = new MyColor[3];

        for (int i = 0; i < 3; i++){
            tempColor[i] = sides[0].getColor(i,1);
            sides[0].setColor(i,1, sides[3].getColor(i,1));
            sides[3].setColor(i,1, sides[5].getColor(i,1));
            sides[5].setColor(i,1, sides[1].getColor(i,1));
            sides[1].setColor(i,1,tempColor[i]);
        }
    }

    public void antiClockwiseMTurn(){
        for(int i = 0; i < 3; i++){
            clockwiseMTurn();
        }
    }

    public void clockwiseETurn() {
        turnCubeClockwiseByZ();
        clockwiseMTurn();
        turnCubeAntiClockwiseByZ();
    }

    public void antiClockwiseETurn(){
        turnCubeClockwiseByZ();
        antiClockwiseMTurn();
        turnCubeAntiClockwiseByZ();
    }

    public void clockwiseSTurn() {
        turnCubeClockwiseByY();
        clockwiseMTurn();
        turnCubeAntiClockwiseByY();
    }

    public void antiClockwiseSTurn(){
        turnCubeClockwiseByY();
        antiClockwiseMTurn();
        turnCubeAntiClockwiseByY();
    }

    //ez csak az i-edik lapon lévő színeket forgatja, a lap mellettieket úgy hagyja
    private void turnSideClockwise(int i){

        //az első él és sarok mentése a másolások előtt
        MyColor tmpCornerColor = sides[i].getColor(0,0);
        MyColor tmpEdgeColor = sides[i].getColor(0,1);

        //sarkok
        sides[i].setColor(0,0, sides[i].getColor(2,0));
        sides[i].setColor(2,0, sides[i].getColor(2,2));
        sides[i].setColor(2,2, sides[i].getColor(0,2));
        sides[i].setColor(0,2, tmpCornerColor);

        //élek
        sides[i].setColor(0,1, sides[i].getColor(1,0));
        sides[i].setColor(1,0, sides[i].getColor(2,1));
        sides[i].setColor(2,1, sides[i].getColor(1,2));
        sides[i].setColor(1,2, tmpEdgeColor);
    }

    private void turnSideAntiClockwise(int i){
        for(int j = 0; j < 3; j++){
            turnSideClockwise(i);
        }
    }

    public void turnCubeClockwiseByX(){
        MyColor[][] tempColor = new MyColor[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                tempColor[i][j] = sides[0].getColor(i,j);
                sides[0].setColor(i, j, sides[1].getColor(i,j));
                sides[1].setColor(i, j, sides[5].getColor(i,j));
                sides[5].setColor(i, j, sides[3].getColor(i,j));
                sides[3].setColor(i, j, tempColor[i][j]);
            }
        }

        turnSideClockwise(2);
        turnSideAntiClockwise(4);
    }
//
    public void turnCubeAntiClockwiseByX(){
        for(int i = 0; i < 3; i++) {
            turnCubeClockwiseByX();
        }
    }

    public void turnCubeClockwiseByY(){
        turnCubeClockwiseByZ();
        turnCubeClockwiseByX();
        turnCubeAntiClockwiseByZ();
    }

    public void turnCubeAntiClockwiseByY(){
        turnCubeAntiClockwiseByZ();
        turnCubeClockwiseByX();
        turnCubeClockwiseByZ();
    }

    public void turnCubeClockwiseByZ(){
        MyColor[][] tempColor = new MyColor[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                tempColor[i][j] = sides[2].getColor(i,j);
                sides[2].setColor(i, j, sides[0].getColor(i,j));
                sides[0].setColor(i, j, sides[4].getColor(i,j));
                sides[4].setColor(i, j, sides[5].getColor(2 - i, 2 - j));
                sides[5].setColor(2 - i, 2 - j, tempColor[i][j]);
            }
        }

        turnSideClockwise(1);
        turnSideAntiClockwise(3);
    }

    public void turnCubeAntiClockwiseByZ(){
        for(int i = 0; i < 3; i++) {
            turnCubeClockwiseByZ();
        }
    }
}
