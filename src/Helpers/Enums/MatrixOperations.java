/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers.Enums;

/**
 *
 * @author AlekseyKachan
 */
public enum MatrixOperations {

    /**
     *
     */
    NONE ("None"),
    
    /**
     *
     */
    ELEVATE_MATRIX ("Matrix Elevation"),

    /**
     *
     */
    FIND_DETERMINANT ("Find Determinant"),

    /**
     *
     */
    CHECK_NOT_DEGENERTE ("Check If Matrix Is NOT Degenerate"),

    /**
     *
     */
    FIND_INVERSE ("Find Inverse Matrix"),

    /**
     *
     */
    FIND_MINOR ("Find Minor"),

    /**
     *
     */
    FIND_RANK ("Find Rank"),

    /**
     *
     */
    DECOMPOSE ("Decomposition"),

    /**
     *
     */
    SCALAR_MULTIPLICATION ("Scalar Multiplication"),

    /**
     *
     */
    GET_SUBMATRIX ("Get Submatrix"),
    
    /**
     *
     */
    TRANSPOSE ("Transpose Matrix"),

    /**
     *
     */
    MULTIPLICATION ("Multiplication"),

    /**
     *
     */
    DIVISION ("Division"),

    /**
     *
     */
    ADDITION ("Addition"),

    /**
     *
     */
    SUBSTRACTION ("Substraction"),

    /**
     *
     */
    CHECK_COMMUTATIVE ("Check If Matrices are Commutative");

    private final String name;       

    private MatrixOperations(String name) {
        this.name = name;
    }

    public boolean equalsName(String otherName) {
        return name.equals(otherName);
    }

    public String toString() {
       return this.name;
    }

}
