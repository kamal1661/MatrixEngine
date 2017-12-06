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
 *
 * @author AlekseyKachan
 */
public class MatrixWorker {
    private static Matrix[] matrices;
    private static Number[] scalarValues;
    
    /**
     *
     */
    public static void initialize() {
        matrices = new Matrix[2];
        scalarValues = new Number[10];
    }
    
    /**
     *
     * @return
     */
    public static Matrix[] getMatrices() {
        return matrices;
    }
    
    /**
     *
     * @param matrix
     */
    public static void addMatrix(Matrix matrix) {
        matrices[ArrayUtil.getArraysLength(matrices)] = matrix;
    }
    
    /**
     *
     * @param number
     */
    public static void addScalarValue(Number number) {
        scalarValues[ArrayUtil.getArraysLength(scalarValues)] = number;
    }
    
    /**
     *
     * @param operation
     * @return
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
