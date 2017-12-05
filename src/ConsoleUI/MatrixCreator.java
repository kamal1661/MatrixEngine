/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsoleUI;

import Data.Matrix;
import Data.MatrixElement;
import Helpers.Enums.MatrixCreationTypes;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author AlekseyKachan
 */
public class MatrixCreator {
    public static MatrixCreationTypes creationType = MatrixCreationTypes.NONE;
    
    public static Matrix createMatrix() {
        getCreationType();
        Matrix matrix = getMatrixSize();
        getMatrixValues(matrix);
        return matrix;
    }
    
    private static void getCreationType() {
        Scanner sc = new Scanner(System.in);
        Printer.diplayMatrixCreationOptions();
        String option = sc.nextLine();
        switch(option) {
            case "1":
                creationType = MatrixCreationTypes.COMPLETE_USER_INPUT;
                break;
            case "2":
                creationType = MatrixCreationTypes.SIZE_USER_INPUT;
                break;
            case "3":
                creationType = MatrixCreationTypes.NO_USER_INPUT;
                break;
            default:
                creationType = MatrixCreationTypes.NONE;
                DefaultOptionUtil.execute(option);
                break;
        }
    }
    
    private static Matrix getMatrixSize() {
        switch (creationType) {
            case COMPLETE_USER_INPUT:
                return getUserMatrixSize();
            case SIZE_USER_INPUT:
                return getUserMatrixSize();
            case NO_USER_INPUT:
                return getRandomMatrixSize();
            default:
                return null;
        }
    }
    
    private static Matrix getUserMatrixSize() {
        Scanner sc = new Scanner(System.in);
        Printer.displayEnterAmoutOfRows();
        int rowsAmount = sc.nextInt();
        Printer.displayEnterAmoutOfColumns();
        int columnsAmount = sc.nextInt();
        return new Matrix(rowsAmount, columnsAmount);
    }
    
    private static Matrix getRandomMatrixSize() {
        Printer.displayEnterAmoutOfRows();
        int rowsAmount = ThreadLocalRandom.current().nextInt(1, 6);
        Printer.displayEnterAmoutOfColumns();
        int columnsAmount = ThreadLocalRandom.current().nextInt(1, 6);
        return new Matrix(rowsAmount, columnsAmount);
    }
    
    private static void getMatrixValues(Matrix matrix) {
        for (int rowIndex = 0; rowIndex < matrix.getRowCount(); rowIndex++) {
            for (int columnIndex = 0; columnIndex < matrix.getColumnCount(); columnIndex++) {
                matrix.setElement(getMatrixElement(rowIndex, columnIndex));
            }
        }
    }
    
    private static MatrixElement getMatrixElement(int rowIndex, int columnIndex) {
        switch (creationType) {
            case COMPLETE_USER_INPUT:
                return getUserMatrixElement(rowIndex, columnIndex);
            case SIZE_USER_INPUT:
                return getRandomMatrixElement(rowIndex, columnIndex);
            case NO_USER_INPUT:
                return getRandomMatrixElement(rowIndex, columnIndex);
            default:
                return null;
        }
    }
    
    private static MatrixElement getUserMatrixElement(int rowIndex, int columnIndex) {
        MatrixElement element = new MatrixElement(rowIndex, columnIndex);
        Scanner sc = new Scanner(System.in);
        Printer.displayEnterValue(rowIndex, columnIndex);
        element.setValue(sc.nextInt());
        return element;
    }
    
    private static MatrixElement getRandomMatrixElement(int rowIndex, int columnIndex) {
        MatrixElement element = new MatrixElement(rowIndex, columnIndex);
        element.setValue(ThreadLocalRandom.current().nextInt(-99, 100));
        return element;
    }    
}
