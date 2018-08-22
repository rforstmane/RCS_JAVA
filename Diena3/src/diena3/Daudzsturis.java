/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diena3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Daudzsturis {
    
    //globāls mainīgais un lokāls. Lokāls darbojas vienas f-jas ietvaros. Globāls pretēji
    
    public int maluSkaits;
    public double maluGarums;

    public double Perimetrs(){
        
        double perimetrs = maluSkaits * maluGarums;
        return perimetrs; 
    
    }
    
    public String KadaFigura(){
        String figura = "";
        
        switch (maluSkaits) {
            case 3:
                figura = "Figūra ir trijstūris";
                break;
            case 4:
                figura = "Figūra ir četrstūris";
                break;
            case 5:
                figura = "Figūra ir piecstūris";
                break;
            default:
                figura = "kluda";
                break;
        }
        
        return figura;
    }
}
