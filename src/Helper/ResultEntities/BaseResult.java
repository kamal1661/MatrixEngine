/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper.ResultEntities;

/**
 * Entity that shows the result of some action
 * @author AlekseyKachan
 */
public class BaseResult {
    /*
     * Shows if the result action as successful
     */
    protected boolean p_isSuccess;
    /*
     * Shows the error message in case of unsuccessful action
     */
    protected String p_message; 
    
    /**
     * Creates alias of Result entity with fields
     * @param isSuccess. Shows if the result action as successful
     * @param message. Shows the error message in case of unsuccessful action 
     */
    public BaseResult(boolean isSuccess, String message)
    {
        this.p_isSuccess = isSuccess;
        this.p_message = message;
    }
    
    /**
     * Creates empty alias of Result entity
     */
    public BaseResult() { 
    }

    /**
     * Get the success of action
     * @return boolean value of result
     */
    public boolean isSuccess() {
        return p_isSuccess;
    }

    /**
     * Set the success of action
     * @param isSuccess. The success of action
     */
    public void setIsSuccess(boolean isSuccess) {
        this.p_isSuccess = isSuccess;
    }

    /**
     * Get the error message of action
     * @return error string of action
     */
    public String getMessage() {
        return p_message;
    }

    /**
     * Set the error message of action
     * @param message. Error string of action
     */
    public void setMessage(String message) {
        this.p_message = message;
    }
}