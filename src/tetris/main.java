package tetris;

public class main {
    public static void main(String[] args) {
        Shape shape = new Shape(5);
        char [][] board = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = '.';
            }
        }
        shape.x = 2; //setX(2)
        shape.y = 2; //setY(2)
        for (int i = 0; i < 4; i++) {
            int x = shape.x + shape.currentShape[i][0]; //getPosX(i)
            int y = shape.y + shape.currentShape[i][1]; //getPosY(i)
            board[y][x] = shape.currentTexture; //getTexture
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%c", board[i][j]);

            }
            System.out.println();

            }

//            for (int j = 0; j < ; j++) {

        }
    }
//}
