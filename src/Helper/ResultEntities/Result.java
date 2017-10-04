/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper.ResultEntities;

/**
 * Entity that shows the result of some action with some returning value(s)
 * @author AlekseyKachan
 * @param <ResultType>. Data type of the returning value
 */
public class Result<ResultType> extends BaseResult {

    /**
     * Returning action result
     */
    protected ResultType p_result;

    /**
     * Creates alias of Result entity with fields
     * @param isSuccess. Shows if the result action as successful
     * @param message. Shows the error message in case of unsuccessful action 
     * @param result. The returning result of action
     */
    public Result(boolean isSuccess, String message, ResultType result) {
        super(isSuccess, message);
        this.p_result = result;
    }
    
    /**
     * Creates empty alias of Result entity
     */
    public Result() {}

    /**
     * Get the result of action
     * @return the result of action
     */
    public ResultType getResult() {
        return p_result;
    }

    /**
     * Set the result of action
     * @param result. Returning result of action
     */
    public void setResult(ResultType result) {
        this.p_result = result;
    }
}