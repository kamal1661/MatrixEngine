/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers.ResultEntities;

import Data.Matrix;

/**
 * Entity that shows the result of some action with some returning matrix value
 * @author AlekseyKachan
 */
public class MatrixResult extends ValueResult<Matrix> {

    /**
     * Creates alias of MatrixResult entity with fields
     * @param isSuccess. Shows if the result action as successful
     * @param message. Shows the error message in case of unsuccessful action 
     * @param result. The returning result of action
     */
    public MatrixResult(boolean isSuccess, String message, Matrix result) {
        super(isSuccess, message, result);
    }
    
    /**
     * Creates empty alias of MatrixResult entity
     */
    public MatrixResult() {}
}