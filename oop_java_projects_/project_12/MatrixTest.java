package project_12;

import java.security.SecureRandom;

public class MatrixTest {

    public static void main(String[] args) {

        SecureRandom randomNumber = new SecureRandom();

        Matrix matrix_1 = new Matrix(3, 2);
        Matrix matrix_2 = new Matrix(3, 2);

        // set matrix 1
        for(int row = 0; row < matrix_1.getRows(); row++) {

            for(int column = 0; column < matrix_1.getColumns(); column++)
                matrix_1.setElement(randomNumber.nextInt(50) + 1, row, column);

        }

        System.out.println("Matrix 1: " + matrix_1);

        // set matrix 2

        for(int row = 0; row < matrix_2.getRows(); row++) {

            for(int column = 0; column < matrix_2.getColumns(); column++) 
                matrix_2.setElement(randomNumber.nextInt(50) + 1, row, column);

        }

        System.out.println("Matrix 2: " + matrix_2);

        System.out.println();

        Matrix newMatrix = addTwoMatrix(matrix_1, matrix_2);

        if(newMatrix == null)
            System.out.println("Matrix can't be added");

        else 
            System.out.println("Matrix after adding: " + newMatrix);
 
        Matrix newMatrix2 = multiplyTwoMatrix(matrix_1, matrix_2);

        if(newMatrix2 == null)
            System.out.println("Matrix can't be multiplied");

        else 
            System.out.println("Matrix after multiplying: " + newMatrix2);        

    }

    public static Matrix addTwoMatrix(Matrix matrix1, Matrix matrix2) {

        if (matrix1.getRows() != matrix2.getRows())
            return null;

        int rows = matrix1.getRows();
        int columns = matrix1.getColumns();

        Matrix newMatrix = new Matrix(rows, columns);

        for(int row = 0; row < rows; row++)  {

            for(int column = 0; column < columns; column++) {

                newMatrix.setElement(matrix1.getElement(row, column) + matrix2.getElement(row, column), row, column);

            }

        }

        return newMatrix;

    }


    public static Matrix multiplyTwoMatrix(Matrix matrix1, Matrix matrix2) {

        if ((matrix1.getRows() != matrix2.getRows()) && (matrix1.getColumns() != matrix2.getColumns()))
            return null;

        int rows = matrix1.getRows();
        int columns = matrix1.getColumns();

        Matrix newMatrix = new Matrix(rows, columns);

        for(int row = 0; row < rows; row++)  {

            for(int column = 0; column < columns; column++) {

                newMatrix.setElement(matrix1.getElement(row, column) * matrix2.getElement(row, column), row, column);

            }

        }

        return newMatrix;

    }
    
}
