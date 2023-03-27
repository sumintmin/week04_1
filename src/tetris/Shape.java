package tetris;

public class Shape {
    int[][] currentShape;
    char currentTexture; // '■', '□', '▤', '▥', '▨', '▧', '▦'
    int x,y ;

    public Shape(int shapeNo){
        char[] shapeTexture = new char[] {'■', '□', '▤', '▥', '▨', '▧', '▦'};
        int [] [] [] shapeTable = new int[][][]{
                //2, 5, 6
                {{0,0}, {0,0}, {0,0},{0,0}},
                {{0,-1},{0,0},{0,1},{0,2}},
                {{0,0}, {0,0}, {0,0},{0,0}}, // L-shape
                {{0,-1},{0,0},{0,1},{1,1}},
                {{-1,-1},{0,-1},{-1,0},{0,0}},
                {{0,0}, {0,0}, {0,0},{0,0}},
                {{0,0}, {0,0}, {0,0},{0,0}},
                {{-1,0},{0,0},{0,1},{1,1}}
        };
        currentShape = new int[shapeTable[shapeNo].length][shapeTable[shapeNo][0].length];
        for (int i = 0; i < currentShape.length; i++) {
            for (int j = 0; j < currentShape[0].length ; j++) {


            }
        }
        currentTexture = shapeTexture[shapeNo];
        x = 0;
        y = 0;
    }
}
