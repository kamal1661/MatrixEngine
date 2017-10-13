/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.List;
/**
 * Entity that represents the Matrix
 * @author Rodrigo Diaz M.
 */
public class Matrix {
    private int rowCount;
    private int columnCount;
    private List<MatrixElement> elements;

    /**
     * Creates empty alias of Matrix entity
     */    
    public Matrix() {}
    
    /**
     * Creates alias of Matrix entity with  2 fields:
     * @param rowCount
     * @param columnCount
     */
    public Matrix(int rowCount, int columnCount) {
        this.rowCount = rowCount;
        this.columnCount = columnCount;
    }
    
    /**
     * Creates alias of Matrix entity with  3 fields:
     * @param rowCount
     * @param columnCount
     * @param elements
     */
    public Matrix(int rowCount, int columnCount, List<MatrixElement> elements) {
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        this.elements = elements;
    }
    
    /**
     * Get the result of action
     * @return as the result of action
     */
    public int getRowCount() {
        return this.rowCount;    
    }
    
    /**
     * Set the result of action
     * @param rowCount as the result of action
     */
    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }
    
    /**
     * Get the result of action
     * @return as the result of action
     */
    public int getColumnCount() {
        return this.columnCount;
    }
    
    /**
     * Set the result of action
     * @param columnCount as the result of action
     */
    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }
    
    /**
     * Get the result of action
     * @return as the result of action
     */
    public List<MatrixElement> getElements() {
        return this.elements;
    }
    
    /**
     * Set the result of action
     * @param elements as the result of action
     */
    public void setElements(List<MatrixElement> elements) {
        this.elements = elements;
    }       
}