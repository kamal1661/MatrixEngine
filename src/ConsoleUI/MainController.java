/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsoleUI;

import Data.Matrix;
import Data.MatrixElement;

/**
 *
 * @author AlekseyKachan
 */
public class MainController {
    public static Matrix matrix;
    public static MatrixElement matrixElement = new MatrixElement();
    
    public static MatrixElement commitElement() {
        matrix.setElement(matrixElement);
        MatrixElement returnItem = matrixElement;
        matrixElement = new MatrixElement();
        return returnItem;
    }
    
    public static void initializeMatrix(int rowCount, int columnCount) {
        matrix = new Matrix(rowCount, columnCount);
    }
    
    public static void setElement(int rowIndex, int columnIndex, Number value){
        matrixElement.setRowIndex(rowIndex);
        matrixElement.setColumnIndex(columnIndex);
        matrixElement.setValue(value);
    }
    
    public static void setMatrix(int rowCount, int columnCount) {
        initializeMatrix(rowCount, columnCount);
    }
}
