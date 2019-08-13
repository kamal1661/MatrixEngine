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
 * Multiplication class executable
 * @author Rodrigo Diaz M.
 */
public class Multiplicator extends Worker {

    /**
     * Creates alias of Multiplicator entity
     * @param matrixParameters. List of matrix parameters
     */
    public Multiplicator(ArrayList<Matrix> matrixParameters) {
        super(matrixParameters);
    }
    
    /**
     * Executes multiplications
     * @return result entity for matrices
     */
    @Override
    public MatrixResult execute(){
        Matrix firstMatrix = this.getMatrixParameters().get(0);
        Matrix secondMatrix = this.getMatrixParameters().get(1);
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

