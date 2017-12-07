/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MatrixWorkers;

import Data.Matrix;
import Data.MatrixElement;
import Helpers.ResultEntities.MatrixResult;

/**
 * Multiplication class executable
 * @author Rodrigo Diaz M.
 */
public class Multiplicator {
    
    /**
     * Executes multiplications
     * @param firstMatrix - first multiplier
     * @param secondMatrix - second multiplier
     * @return result entity for matrices
     */
    public static MatrixResult execute(Matrix firstMatrix, Matrix secondMatrix){
        MatrixResult result = new MatrixResult();
        if (firstMatrix.getColumnCount() == secondMatrix.getRowCount()) {
            Matrix resultMatrix = new Matrix(firstMatrix.getRowCount(), secondMatrix.getColumnCount());
            int internalSizeCounter = firstMatrix.getRowCount();
            for (int columnIndex = 0; columnIndex < resultMatrix.getColumnCount(); columnIndex++){
                for (int rowIndex =0; rowIndex < resultMatrix.getRowCount(); rowIndex++){
                    MatrixElement newElement = new MatrixElement();
                    newElement.setRowIndex(rowIndex);
                    newElement.setColumnIndex(columnIndex);
                    double newValue = 0;
                    for (int internalIndex = 0; internalIndex < internalSizeCounter; internalIndex++) {
                        newValue += firstMatrix.getElement(rowIndex, internalIndex).getValue().doubleValue() * secondMatrix.getElement(internalIndex, columnIndex).getValue().doubleValue();
                    }

                    newElement.setValue(newValue);
                    resultMatrix.setElement(newElement);
                }
            }

            result.setIsSuccess(true);
            result.setResult(resultMatrix); 
        }
        else {
            result.setIsSuccess(false);
            result.setMessage("Amount of columns of the first matrix should equals to amount of rows of the second matrix");
        }
        
        return result;
    }   
}    

