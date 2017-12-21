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
 * Transposition class executable.
 * @author AlekseyKachan
 */
public class Transpositor extends Worker {

    /**
     * Creates alias of Transpositor entity
     * @param matrixParameters. List of matrix parameters
     */
    public Transpositor(ArrayList<Matrix> matrixParameters) {
        super(matrixParameters);
    }
    
    /**
     * Executes matrix transposition
     * @return result entity for matrices
     */
    @Override
    public MatrixResult execute() {
        Matrix matrix = this.getMatrixParameters().get(0);
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
