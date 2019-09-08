public class Side {
    private MyColor[][] colors;

    public Side(MyColor color) {
        colors = new MyColor[3][3];
        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                colors[i][j] = color;
            }
        }
    }

    public Side(MyColor[][] colors) {
        if(colors.length == 3 && colors[0].length == 3 &&
           colors[1].length == 3 && colors[2].length == 3){
            this.colors = colors;
        } else {
            System.out.println("hiba... ide valami exception kell");
        }
    }

    public void setColor(int i, int j, MyColor color){
        colors[i][j] = color;
    }

    public MyColor getColor(int i, int j){
        return colors[i][j];
    }
}
