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
 * Scalar Multiplication class executable.
 * @author Rodrigo Diaz M.
 */

public class ScalarMultiplicator {

    /**
     * Executes scalar multiplications.
     * @param matrix
     * @param scalarValue
     * @return
     */
    public static MatrixResult execute(Matrix matrix, double scalarValue){
        MatrixResult result = new MatrixResult();
        Matrix resultMatrix = new Matrix(matrix.getRowCount(), matrix.getColumnCount());
        for (int rowIndex = 0; rowIndex < matrix.getRowCount(); rowIndex++){
            for (int columnIndex =0; columnIndex < matrix.getColumnCount(); columnIndex++){
                MatrixElement newElement = new MatrixElement();
                newElement.setRowIndex(rowIndex);
                newElement.setColumnIndex(columnIndex);
                newElement.setValue(matrix.getElement(rowIndex, columnIndex).getValue().doubleValue() * scalarValue);
                resultMatrix.setElement(newElement);
            }
        }
        
        result.setIsSuccess(true);
        result.setResult(resultMatrix);
        return result;
    }   
}
