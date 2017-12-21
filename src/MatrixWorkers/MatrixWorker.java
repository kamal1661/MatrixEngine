/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MatrixWorkers;

import Data.Matrix;
import Helpers.Enums.MatrixOperations;
import Helpers.ResultEntities.MatrixResult;
import Helpers.ResultEntities.ValueResult;
import Helpers.Utils.ArrayUtil;
import MatrixWorkers.Factory.Abstract.Worker;
import MatrixWorkers.Factory.MatrixWorkerFactory;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Entity that performs matrices operations
 * @author AlekseyKachan
 */
public class MatrixWorker {
    private static Matrix[] matrixParameters;
    private static Number[] scalarParameters;
    
    /**
     * Initializes matrix worker
     */
    public static void initialize() {
        matrixParameters = new Matrix[2];
        scalarParameters = new Number[10];
    }
    
    /**
     * Gets matrices
     * @return array of matrices
     */
    public static Matrix[] getMatrices() {
        return matrixParameters;
    }
    
    /**
     * Adds matrix to array
     * @param matrix to be added
     */
    public static void addMatrix(Matrix matrix) {
        matrixParameters[ArrayUtil.getArraysLength(matrixParameters)] = matrix;
    }
    
    /**
     * Adds scalar value to array
     * @param number to be added
     */
    public static void addScalarValue(Number number) {
        scalarParameters[ArrayUtil.getArraysLength(scalarParameters)] = number;
    }
    
    /**
     * Executes operation
     * @param operation to be executed
     * @return valued result entity
     */
    public static ValueResult executeOperation(MatrixOperations operation) {
        Worker worker = MatrixWorkerFactory.getMatrixWorker(operation, new ArrayList<>(Arrays.asList(matrixParameters)), new ArrayList<>(Arrays.asList(scalarParameters)));
        if (worker != null) {
            return worker.execute();
        }
        else {
            return new MatrixResult(false, "No such operation", null);
        }
    }
}
