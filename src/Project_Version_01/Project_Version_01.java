/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Project_Version_01;

import java.sql.SQLException;

/**
 *
 * @author JuanCin20
 */
public class Project_Version_01 {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        MySQL_Connection.Function_Connection();
    }

    private byte byteVariable = 1;
    private short shortVariable = 10;
    private long longVariable = 10L;
    private int intVariable = 10;
    private double doubleVariable = 10.00;
    private float floatVariable = 10;
    private char charVariable = 'J';
    private String stringVariable = "Juan Carlos";
    private boolean booleanVariable = false;
}
