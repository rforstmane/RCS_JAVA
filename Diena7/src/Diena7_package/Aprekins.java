/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diena7_package;

/**
 *
 * @author ASUS
 */
public class Aprekins {
    
    public String Aprekinat(int a, int b, String darbiba){
        String rezultats = "";
        
        if(darbiba.equals("+")){
            rezultats = String.valueOf(a+b); // skaitlis konvertējas string formātā
        }
        if(darbiba.equals("-")){
            rezultats = String.valueOf(a-b); // skaitlis konvertējas string formātā
        }
        
        if (darbiba.equals("^")){
            
            int kapinasana = 1;
            for (int i=0; i<b; i++ ){
                kapinasana = a * kapinasana;
            }
            rezultats = String.valueOf(kapinasana);
        }
        return rezultats;
    }
    
    
    
}
