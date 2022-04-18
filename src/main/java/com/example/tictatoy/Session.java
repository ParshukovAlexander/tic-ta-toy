package com.example.tictatoy;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

import java.util.Arrays;
import java.util.Objects;

public class Session {
    private String[][] matrix = new String[3][3];
    private int row;
    private int column;

    public Session() {
        creatField();
    }

    public void creatField(){
        for (String[] ints : matrix) {
            Arrays.fill(ints, "+");
        }
    }

    public void putFigure(Button button){
        row = (GridPane.getRowIndex(button) == null) ? 0 : GridPane.getRowIndex(button);
        column = (GridPane.getColumnIndex(button) == null) ? 0 : GridPane.getColumnIndex(button);
        matrix[row][column]=button.getText();
        print();
    }


    public void print() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public boolean examSession(){
        String[] elements = {matrix[row][column],matrix[row][column],matrix[row][column]};
        String elementsJoin = String.join("",elements);

       String rowJoin = String.join("",matrix[row]);

       String[] columnMassive = {matrix[0][column],matrix[1][column],matrix[2][column]};
       String columnJoin = String.join("",columnMassive);

       String [] diagonalOne={matrix[0][0],matrix[1][1],matrix[2][2]};
       String [] diagonalTwo={matrix[0][2],matrix[1][1],matrix[2][0]};
        String diagonalOneJoin = String.join("",diagonalOne);
        String diagonalTwoJoin = String.join("",diagonalTwo);


       if (columnJoin.equals(elementsJoin) || rowJoin.equals(elementsJoin) ||
       diagonalOneJoin.equals(elementsJoin) || diagonalTwoJoin.equals(elementsJoin)) return true;
return false;
    }
    
}
