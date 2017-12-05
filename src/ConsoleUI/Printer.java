/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsoleUI;

import Data.Matrix;
import Helpers.Enums.MatrixOperations;
import Helpers.ResultEntities.ValueResult;

/**
 *
 * @author AlekseyKachan
 */
public class Printer {
    public static void displayWelcomeMessage() {
        System.out.println("Welcome message. Content TBD");
    }
    
    public static void displayPrimaryOptions() {
        System.out.println("Select one of the following options:");
        System.out.println("1 - Single matrix operations");
        System.out.println("2 - Multiple matrices operations");
        System.out.println("Exit - to exit the application");
        System.out.print("Your option: ");
    }
    
    public static void displayMatrix(Matrix matrix) {
        System.out.println("Rows: " + matrix.getRowCount());
        System.out.println("Columns: " + matrix.getColumnCount());
        for(int rowIndex = 0; rowIndex < matrix.getRowCount(); rowIndex++) {
            for(int columnIndex = 0; columnIndex < matrix.getColumnCount(); columnIndex++) {
                System.out.print(matrix.getElement(rowIndex, columnIndex).getValue() + " ");
            }
            System.out.println();
        }
    }
    
    public static void displayTask(MatrixOperations currentOperation) {
        System.out.println("The task to be solved. Content TBD");
    }
    
    public static void displayResult(ValueResult result) {
        System.out.println("Result of evaluations. Content TBD");
    }
    
    public static void displaySingleMatrixOperations() {
        System.out.println("Select one of the following single matrix opertations:");
        System.out.println("1 - Elevate matrix");
        System.out.println("2 - Find determinant of the matrix");
        System.out.println("3 - Check if matrix is NOT degenerate matrix");
        System.out.println("4 - Find inverse matrix");
        System.out.println("5 - Find minor of matrix");
        System.out.println("6 - Find rank of matrix");
        System.out.println("7 - Decompose matrix");
        System.out.println("8 - Scalar multiplication");
        System.out.println("9 - Get Submatrix");
        System.out.println("Reset - to return to the beginning");
        System.out.println("Exit - to exit the application");
        System.out.print("Your option: ");
    }
    
    public static void displayMultipleMatricesOperations() {
        System.out.println("Select on of the following multiple matrices operations:");
        System.out.println("1 - Multiply matrices");
        System.out.println("2 - Divide matrices");
        System.out.println("3 - Add matrices");
        System.out.println("4 - Subtract matrices");
        System.out.println("5 - Check if matrices are commutative (AB = BA)");
        System.out.println("Reset - to return to the beginning");
        System.out.println("Exit - to exit the application");
        System.out.print("Your option: ");
    }
    
    public static void displayMatrixDecompositionOptions(){
        System.out.println("Select one of the following matrix decomposition options:");
        System.out.println("1 - LU decomposition");
        System.out.println("2 - QR decomposition");
        System.out.println("3 - Rank decomposition");
        System.out.println("4 - RRQ decomposition");
        System.out.println("5 - Cholesky decomposition");
        System.out.println("6 - Interpolate decomposition");
        System.out.println("Reset - to return to the beginning");
        System.out.println("Exit - to exit the application");
        System.out.print("Your option: ");
    }
    
    public static void diplayMatrixCreationOptions(){
        System.out.println("Select the way matrix to be created:");
        System.out.println("1 - Enter size & each value");
        System.out.println("2 - Enter size & random [-99; 99] integer values");
        System.out.println("3 - Random [1; 5] & [-99; 99] integer size & values");
        System.out.println("Reset - to return to the beginning");
        System.out.println("Exit - to exit the application");
        System.out.print("Your option: ");
    }
    
    public static void displayEnterAmoutOfRows(){
        System.out.print("Enter the amout of rows: ");
    }
    
    public static void displayEnterAmoutOfColumns(){
        System.out.print("Enter the amout of columns: ");
    }
    
    public static void displayEnterValue(int rowNumber, int columnNumber){
        System.out.print("Enter the value of row " + rowNumber + " and column " + columnNumber + " element: ");
    }
}
