/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MatrixWorkers.Factory.Abstract;

import Data.Matrix;
import Helpers.ResultEntities.ValueResult;
import java.util.ArrayList;

public abstract class Worker {
    /**
     * The list of matrix parameters
     */
    private ArrayList<Matrix> matrixParameters;
    
    /**
     * The list of scalar parameters
     */
    private ArrayList<Number> scalarParameters;

    /**
     * Gets the list of matrix parameters
     * @return array list of matrix parameters
     */
    public ArrayList<Matrix> getMatrixParameters() {
        return matrixParameters;
    }

    /**
     * Sets the list of matrix parameters
     * @param matrixParameters. The list of matrix parameters
     */
    public void setMatrixParameters(ArrayList<Matrix> matrixParameters) {
        this.matrixParameters = matrixParameters;
    }

    /**
     * Gets the list of scalar parameters
     * @return array list of scalar parameters
     */
    public ArrayList<Number> getScalarParameters() {
        return scalarParameters;
    }


    /**
     * Sets the list of scalar parameters
     * @param scalarParameters. The list of scalar parameters
     */
    public void setScalarParameters(ArrayList<Number> scalarParameters) {
        this.scalarParameters = scalarParameters;
    }

    /**
     * Creates alias of Worker entity with two fields
     * @param matrixParameters. List of matrix parameters
     * @param scalarParameters. List of scalar parameters
     */
    public Worker(ArrayList<Matrix> matrixParameters, ArrayList<Number> scalarParameters) {
        this.matrixParameters = matrixParameters;
        this.scalarParameters = scalarParameters;
    }

    /**
     * Creates alias of Worker entity with one field
     * @param matrixParameters. List of matrix parameters
     */
    public Worker(ArrayList<Matrix> matrixParameters) {
        this.matrixParameters = matrixParameters;
    }
    
    /**
     * Performs main behavior of the worker
     * @return Result entity of execution
     */
    public abstract ValueResult execute();
}
