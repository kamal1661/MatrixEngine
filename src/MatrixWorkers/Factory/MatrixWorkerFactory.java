/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MatrixWorkers.Factory;

import Data.Matrix;
import Helpers.Enums.MatrixOperations;
import MatrixWorkers.Factory.Abstract.Worker;
import MatrixWorkers.Factory.Impl.Multiplicator;
import MatrixWorkers.Factory.Impl.ScalarMultiplicator;
import MatrixWorkers.Factory.Impl.Transpositor;
import java.util.ArrayList;

/**
 *
 * @author AlekseyKachan
 */
public class MatrixWorkerFactory {
    public static Worker getMatrixWorker(MatrixOperations operation, ArrayList<Matrix> matrixParameters, ArrayList<Number> scalarParameters) {
        switch(operation) {
            case ELEVATE_MATRIX:
                return null;
            case FIND_DETERMINANT:
                return null;
            case CHECK_NOT_DEGENERTE:
                return null;
            case FIND_INVERSE:
                return null;
            case FIND_MINOR:
                return null;
            case FIND_RANK:
                return null;
            case DECOMPOSE:
                return null;
            case SCALAR_MULTIPLICATION:
                return new ScalarMultiplicator(matrixParameters, scalarParameters);
            case GET_SUBMATRIX:
                return null;
            case TRANSPOSE:
                return new Transpositor(matrixParameters);
            case MULTIPLICATION:
                return new Multiplicator(matrixParameters);
            case DIVISION:
                return null;
            case ADDITION:
                return null;
            case SUBSTRACTION:
                return null;
            case CHECK_COMMUTATIVE:
                return null;
            default:
                return null;
        }
    }
}
