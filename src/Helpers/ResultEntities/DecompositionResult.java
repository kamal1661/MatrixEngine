/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers.ResultEntities;

import Data.Matrix;
import java.util.Dictionary;

/**
 * Entity that shows the result of some action with returning set of matrices
 * @author AlekseyKachan
 */
public class DecompositionResult extends ValueResult<Dictionary<String, Matrix>> {

    /**
     * Creates alias of DecompositionResult entity with fields
     * @param isSuccess. Shows if the result action as successful
     * @param message. Shows the error message in case of unsuccessful action 
     * @param result. The returning result of action
     */
    public DecompositionResult(boolean isSuccess, String message, Dictionary<String, Matrix> result) {
        super(isSuccess, message, result);
    }
    
    /**
     * Creates empty alias of DecompositionResult entity
     */
    public DecompositionResult() {}
    
    /**
     * Gets the matrix from the result set by its name
     * @param matrixName - the name of the matrix in set
     * @return matrix by its name
     */
    public Matrix getMatrix(String matrixName){
        return this.getResult().get(matrixName);
    }
}