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

/**
 * Entity that performs matrices operations
 * @author AlekseyKachan
 */
public class MatrixWorker {
    private static Matrix[] matrices;
    private static Number[] scalarValues;
    
    /**
     * Initializes matrix worker
     */
    public static void initialize() {
        matrices = new Matrix[2];
        scalarValues = new Number[10];
    }
    
    /**
     * Gets matrices
     * @return array of matrices
     */
    public static Matrix[] getMatrices() {
        return matrices;
    }
    
    /**
     * Adds matrix to array
     * @param matrix to be added
     */
    public static void addMatrix(Matrix matrix) {
        matrices[ArrayUtil.getArraysLength(matrices)] = matrix;
    }
    
    /**
     * Adds scalar value to array
     * @param number to be added
     */
    public static void addScalarValue(Number number) {
        scalarValues[ArrayUtil.getArraysLength(scalarValues)] = number;
    }
    
    /**
     * Executes operation
     * @param operation to be executed
     * @return valued result entity
     */
    public static ValueResult executeOperation(MatrixOperations operation) {
        switch(operation) {
            case ELEVATE_MATRIX:
                break;
            case FIND_DETERMINANT:
                break;
            case CHECK_NOT_DEGENERTE:
                break;
            case FIND_INVERSE:
                break;
            case FIND_MINOR:
                break;
            case FIND_RANK:
                break;
            case DECOMPOSE:
                break;
            case SCALAR_MULTIPLICATION:
                return ScalarMultiplicator.execute(matrices[0], scalarValues[0].doubleValue());
            case GET_SUBMATRIX:
                break;
            case TRANSPOSE:
                return Transpositor.execute(matrices[0]);
            case MULTIPLICATION:
                return Multiplicator.execute(matrices[0], matrices[1]);
            case DIVISION:
                break;
            case ADDITION:
                break;
            case SUBSTRACTION:
                break;
            case CHECK_COMMUTATIVE:
                break;
            default:
                return new MatrixResult(false, "No such operation", null);
        }
        return null;
    }
}
