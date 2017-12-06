/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MatrixWorker;

import Data.Matrix;
import Data.MatrixElement;

/**
 * Multiplication class executable
 * @author Rodrigo Diaz M
 */
public class Multiplicator {
    
    /*
     * Gets values for rows and columns and performs matrices multiplications.
     * Returns result
     */

    /**
     *
     * @param firstMatrix
     * @param secondMatrix
     * @return
     */

    public Matrix executeMultiplication(Matrix firstMatrix, Matrix secondMatrix){
        Matrix resultMatrix = new Matrix();
        resultMatrix.setRowCount(secondMatrix.getRowCount());
        resultMatrix.setColumnCount(firstMatrix.getColumnCount());
        for (int columnIndex = 0; columnIndex < resultMatrix.getColumnCount(); columnIndex++){
            for (int rowIndex =0; rowIndex < resultMatrix.getRowCount(); rowIndex++){
                MatrixElement newElement = new MatrixElement();
                newElement.setRowIndex(rowIndex);
                newElement.setColumnIndex(columnIndex);
                double value1 = firstMatrix.getElement(rowIndex, columnIndex).getValue().doubleValue();
                double value2 = secondMatrix.getElement(rowIndex, columnIndex).getValue().doubleValue();
                double value3 = firstMatrix.getElement(rowIndex + 1, columnIndex).getValue().doubleValue();
                double value4 = secondMatrix.getElement(rowIndex, columnIndex +1).getValue().doubleValue();
                double newValue = value1 * value2 + value3 * value4;
                newElement.setValue(newValue);
                resultMatrix.setElement(newElement);
            }
        }
        
        return resultMatrix;
    }   
}  


