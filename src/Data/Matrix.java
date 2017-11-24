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
 * @author AlekseyKachan
 */
public class Matrix {
    /*
     * The amount of rows in the matrix
     */
    private int rowCount;
    
    /*
     * The amount of columns in the matrix
     */
    private int columnCount;
    
    /*
     * List of the elements of the matrix
     */
    private List<MatrixElement> elements;

    /**
     * Creates empty alias of Matrix entity
     */    
    public Matrix() {}
    
    /**
     * Creates alias of Matrix entity with 2 fields:
     * @param rowCount
     * @param columnCount
     */
    public Matrix(int rowCount, int columnCount) {
        this.rowCount = rowCount;
        this.columnCount = columnCount;
    }
    
    /**
     * Creates alias of Matrix entity with 3 fields:
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
     * Get the amount of rows in matrix
     * @return the amount of rows in matrix
     */
    public int getRowCount() {
        return this.rowCount;    
    }
    
    /**
     * Set the amount of rows in matrix
     * @param rowCount the amount of rows in matrix
     */
    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }
    
    /**
     * Get the amount of columns in matrix
     * @return the amount of columns in matrix
     */
    public int getColumnCount() {
        return this.columnCount;
    }
    
    /**
     * Set the amount of columns in matrix
     * @param columnCount the amount of columns in matrix
     */
    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }
    
    /**
     * Get the list of the elements of the matrix
     * @return the list of the elements of the matrix
     */
    public List<MatrixElement> getElements() {
        return this.elements;
    }
    
    /**
     * Set the list of the elements of the matrix
     * @param elements the new list of the elements of the matrix
     */
    public void setElements(List<MatrixElement> elements) {
        this.elements = elements;
    }       
}