/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers.ResultEntities;

/**
 * Entity that shows the result of some action with some returning numeric value
 * @author AlekseyKachan
 */
public class NumberResult extends ValueResult<Number> {

    /**
     * Creates alias of NumberResult entity with fields
     * @param isSuccess. Shows if the result action as successful
     * @param message. Shows the error message in case of unsuccessful action 
     * @param result. The returning result of action
     */
    public NumberResult(boolean isSuccess, String message, Number result) {
        super(isSuccess, message, result);
    }
    
    /**
     * Creates empty alias of NumberResult entity
     */
    public NumberResult() {}
}
