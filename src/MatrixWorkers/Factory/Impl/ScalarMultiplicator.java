/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MatrixWorkers.Factory.Impl;

import Data.Matrix;
import Data.MatrixElement;
import Helpers.ResultEntities.MatrixResult;
import MatrixWorkers.Factory.Abstract.Worker;
import java.util.ArrayList;

/**
 * Scalar Multiplication class executable
 * @author Rodrigo Diaz M.
 */

public class ScalarMultiplicator extends Worker {

    /**
     * Creates alias of ScalarMultiplicator entity
     * @param matrixParameters. List of matrix parameters
     * @param scalarParameters. List of scalar parameters
     */
    public ScalarMultiplicator(ArrayList<Matrix> matrixParameters, ArrayList<Number> scalarParameters) {
        super(matrixParameters, scalarParameters);
    }

    /**
     * Executes scalar multiplications
     * @return result entity for matrices
     */
    @Override
    public MatrixResult execute(){
        Matrix matrix = this.getMatrixParameters().get(0);
        double scalarValue = this.getScalarParameters().get(0).doubleValue();
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
