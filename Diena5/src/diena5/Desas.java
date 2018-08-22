/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diena5;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Desas {
    // Uztaisīt funkciju, kas zīmē laukumu - divdimensiju masīv, ja nav aizpildīts, zīmējam strīpiņu
    // Uztaisīt tā, lai mainītos spēlētājs, kas ievada X vai 0
    // Ja ievada kaut ko citu, tad paprasīt vēlreiz
    // Pārbaudīt uzvaras nosacījumus un beigt spēli, ja masīvs ir aizpildīts
    // Drīkst izpildīt gājienu tikai brīvajā vietā
    
    Scanner s = new Scanner(System.in);
    char rezgis[][]= new char[3][3];
    char speletajs = 'X';
    
    public void Spele(){
        Laukums();
        
    } 
    
    private void Laukums(){

        for (int i = 0; i <  3; i++){
            for (int j = 0; j < 3; j++){
                rezgis[i][j] = '-';
                System.out.print(rezgis[i][j] + " ");
            }
            System.out.println("");
        } 
        System.out.println("");
        
    }
    
    public void Ievade(){
        System.out.println("Ievadi rindas un kolonnas skaitli: ");
        
        int rinda = s.nextInt();
        int kolonna = s.nextInt();
        rezgis[rinda][kolonna] = 'x';

        for (int i = 0; i <  3; i++){
            for (int j = 0; j < 3; j++){
              
                System.out.print(rezgis[i][j] + " ");
            }
            System.out.println("");
        } 
    }
    
    public boolean Aizpildits(){
        boolean irAizpildits = true;
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                if (rezgis[i][j] == '-'){
                    irAizpildits = false;
                } 
            }
        }
        return irAizpildits;
    }
    
    public void SpeletajuMaina(){
        if (speletajs == 'X'){
            speletajs = 'O';
        } else{
            speletajs = 'X';
        }
    }
    
    public boolean Rindas(){
        for (int i=0; i<3; i++){
            if(rezgis[i][0], rezgis[i][1], rezgis[i][2] == true){
                return = true;
            }
        }
        return false;
    }
        
      
        
                /*for (int i=0; i<3; i++){
            if ((rezgis[0][j]) && (rezgis[1][j]) && (rezgis[2][j]) == true)
        }*/
        
    

        

    
}
