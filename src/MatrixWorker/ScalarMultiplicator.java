/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MatrixWorker;

import Data.Matrix;
import Data.MatrixElement;

/**
 * Scalar Multiplication class executable
 * @author v2049
 */

public class ScalarMultiplicator {

    public Matrix executeScalarMultiplication(Matrix matrix, double scalarValue){
        Matrix resultMatrix = new Matrix();
        resultMatrix.setRowCount(matrix.getRowCount());
        resultMatrix.setColumnCount(matrix.getColumnCount());
        for (int rowIndex = 0; rowIndex < matrix.getRowCount(); rowIndex++){
            for (int columnIndex =0; columnIndex < matrix.getColumnCount(); columnIndex++){
                MatrixElement newElement = new MatrixElement();
                newElement.setRowIndex(rowIndex);
                newElement.setColumnIndex(columnIndex);
                newElement.setValue(matrix.getElement(rowIndex, columnIndex).getValue().doubleValue() * scalarValue);
                resultMatrix.setElement(newElement);
            }
        }
        
        return resultMatrix;
    }   
}
