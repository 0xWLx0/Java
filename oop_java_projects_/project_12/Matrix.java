package project_12;

import java.util.Arrays;

public class Matrix {
    
    private int rows, columns;
    private int[][] matrix2D;


    public Matrix(int rows, int columns) {

        this.rows = rows;
        this.columns = columns;

        matrix2D = new int[rows][columns];

    }

    public int getRows() {

        return rows;

    }

    public int getColumns() {

        return columns;

    }

    public void setElement(int element, int row, int column) {

        this.matrix2D[row][column] = element;

    }

    public int getElement(int row, int column) {

        return this.matrix2D[row][column];

    }

    @Override
    public String toString() {

        String matrix = "\n";

        for(int[] row: matrix2D)
            matrix += Arrays.toString(row) + "\n";

        return matrix;

    }

}
