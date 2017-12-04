/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MatrixWorker;

import Data.Matrix;
import Data.MatrixElement;

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
    public Matrix transpose(Matrix matrix) {
        Matrix resultMatrix = new Matrix(matrix.getRowCount(), matrix.getColumnCount());
        for(int rowIndex = 0; rowIndex < resultMatrix.getRowCount(); rowIndex++) {
            for(int columnIndex = 0; columnIndex < resultMatrix.getColumnCount(); columnIndex++) {
                MatrixElement newElement = new MatrixElement();
                newElement.setRowIndex(rowIndex);
                newElement.setColumnIndex(columnIndex);
                newElement.setValue(matrix.getElement(columnIndex, rowIndex).getValue());
            }
        }
        
        return resultMatrix;
    }
}
