/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MatrixWorkers;

import Data.Matrix;
import Helpers.Enums.MatrixOperations;
import Helpers.ResultEntities.BaseResult;
import Helpers.ResultEntities.MatrixResult;
import Helpers.ResultEntities.ValueResult;
import Helpers.Utils.ArrayUtil;

/**
 * Entity that performs matrices operations.
 * @author AlekseyKachan
 */
public class MatrixWorker {
    private static Matrix[] matrices;
    private static Number[] scalarValues;
    
    /**
     * Initializes matrix worker.
     */
    public static void initialize() {
        matrices = new Matrix[2];
        scalarValues = new Number[10];
    }
    
    /**
     * Gets matrices.
     * @return
     */
    public static Matrix[] getMatrices() {
        return matrices;
    }
    
    /**
     * Adds matrices.
     * @param matrix
     */
    public static void addMatrix(Matrix matrix) {
        matrices[ArrayUtil.getArraysLength(matrices)] = matrix;
    }
    
    /**
     * Adds scalar vales.
     * @param number
     */
    public static void addScalarValue(Number number) {
        scalarValues[ArrayUtil.getArraysLength(scalarValues)] = number;
    }
    
    /**
     * Executes operation.
     * @param operation
     * @return
     */
    public static ValueResult executeOperation(MatrixOperations operation) {
        switch(operation) {
            case SCALAR_MULTIPLICATION:
                Matrix resultMatrix = ScalarMultiplicator.execute(matrices[0], scalarValues[0].doubleValue());
                return new MatrixResult(true, "", resultMatrix);
        }
        return null;
    }
}
