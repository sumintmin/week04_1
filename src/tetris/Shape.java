package tetris;
public class Shape {
    int[][] currentShape;
    char currentTexture; // '■', '□', '▤', '▥', '▨', '▧', '▦'
    int x,y ;
    public Shape(int shapeNo){
        char[] shapeTexture = new char[] {'■', '□', '▤', '▥', '▨', '▧', '▦'};
        int [] [] [] shapeTable = new int[][][]{
                //2, 5, 6
                {{0,0}, {0,0}, {0,0},{0,0}}, //의미x?
                {{0,-1},{0,0},{0,1},{0,2}}, //1번 I
                {{0,-1}, {0,1}, {0,0},{-1,1}}, //  J-shape(2번)
                {{0,-1},{0,0},{0,1},{1,1}},//L-shape
                {{-1,-1},{0,-1},{-1,0},{0,0}},
                {{1,0}, {1,-1}, {2,-1},{0,0}},//S-shape
                {{1,0}, {0,1}, {-1,0},{0,0}},//T-shape
                {{-1,0},{0,0},{0,1},{1,1}},
                {{0,0}, {0,0}, {0,0},{0,0}}
        };
        currentShape = new int[shapeTable[shapeNo].length][shapeTable[shapeNo][0].length];
        for (int i = 0; i < currentShape.length; i++) {
            for (int j = 0; j < currentShape[0].length ; j++) {
                currentShape[i][j] = shapeTable[shapeNo][i][j];
            }
        }
        currentTexture = shapeTexture[shapeNo];
        x = 0;
        y = 0;
    }
}
