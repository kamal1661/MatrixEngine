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
 * Transposition class executer
 * @author AlekseyKachan
 */
public class Transpositor {
    
    /**
     * Transposes the matrix
     * @param matrix - matrix to be transposed
     * @return transposed matrix
     */
    public static MatrixResult execute(Matrix matrix) {
        MatrixResult result = new MatrixResult();
        Matrix resultMatrix = new Matrix(matrix.getColumnCount(), matrix.getRowCount());
        for(int rowIndex = 0; rowIndex < resultMatrix.getRowCount(); rowIndex++) {
            for(int columnIndex = 0; columnIndex < resultMatrix.getColumnCount(); columnIndex++) {
                MatrixElement newElement = new MatrixElement();
                newElement.setRowIndex(rowIndex);
                newElement.setColumnIndex(columnIndex);
                newElement.setValue(matrix.getElement(columnIndex, rowIndex).getValue());
                resultMatrix.setElement(newElement);
            }
        }
        
        result.setIsSuccess(true);
        result.setResult(resultMatrix);
        return result;
    }
}
