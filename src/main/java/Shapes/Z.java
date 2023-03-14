package Shapes;

public class Z extends Tetrimino{

    public Z(){
                matrix = new byte[][][]
                {
                        {{0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 1, 1, 0, 0, 0},
                         {0, 0, 0, 1, 1, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0}},

                        {{0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 1, 0, 0},
                         {0, 0, 0, 1, 1, 0, 0},
                         {0, 0, 0, 1, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0}},

                        {{0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 1, 1, 0, 0, 0},
                         {0, 0, 0, 1, 1, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0}},

                        {{0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 1, 0, 0},
                         {0, 0, 0, 1, 1, 0, 0},
                         {0, 0, 0, 1, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0}},
                };

    }

    @Override
    public int getIdentifier() {
        return 7;
    }

    @Override
    public Coordinates[] spawn() {
        offsetX = 2;
        offsetY = 22;
        orientation = Orientation.SOUTH;
        return getCoordinates(0,0, orientation);
    }
}
