
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kueky
 */
public class Flight {
    private String departCode;
    private String destCode;

    public Flight(String departCode, String destCode) {
        this.departCode = departCode;
        this.destCode = destCode;
    }

    @Override
    public String toString() {
        return "(" + this.departCode + "-" + this.destCode + ")";
    }
    
    
    
}
