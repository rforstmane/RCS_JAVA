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
public class Diena3 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Scanner obj = new Scanner(System.in);
        Daudzsturis figura = new Daudzsturis();

        System.out.println("Ievadi malu skaitu");
        figura.maluSkaits = obj.nextInt();
        
        System.out.println("Ievadi malas garumu");
        figura.maluGarums = obj.nextDouble();
        
        if(figura.KadaFigura().equals("kluda")){
            System.out.println("Nepareiza ievade");
        }else{
            System.out.println("Figura ir " + figura.KadaFigura() + ", perimetrs ir " + figura.Perimetrs());
        }
    */
        
        /*for (int i = 0; i < 5; i++) {
            
        }
        
        for (int i = 5; i > 0; i++) {
            
        }
        
        int sk = 0;
        
        while(sk!=5){ //strādā kamēr cikls nebūs sasniedzis pieci 
            sk++;
        }  
        do  {
            sk++;
        }  while(sk!=5); *///vispirms izdara un tad pārbauda nosacījumu. šis ir bezgalīgais cikls
  
        
        /*Scanner obj = new Scanner(System.in);
        String zvaigzne = "";
        System.out.println("Ievadi zvaigznes");
        int rinda = obj.nextInt();
        for (int i = 0; i < rinda; i++ ) {
            zvaigzne = zvaigzne + "*";
            System.out.println(zvaigzne);
           
        }*/
        
        /*Scanner obj = new Scanner(System.in);
        System.out.println("Ievadi N");
        int N = obj.nextInt();
        for (int r = 0; r < N; r++){
            for (int a = 0; a < N - r; a++){
                System.out.print(" ");
            }
            for (int z = 0; z < 2*r-1; z++){
               System.out.print("*"); 
            }
            System.out.println();
        }  */

        Scanner obj = new Scanner(System.in);
        System.out.println("Ievadi N");
        int N = obj.nextInt();
        for (int i = 1;  i<= N; i++ ){
            System.out.print("*");
        }
        System.out.println();
        
            
        /*for (int i = 1;  i >= N; i--){
           
            for (int j = 1; j <= i; j++){
                System.out.print("");
            }
            System.out.println("*"); */
        
    }
 
}

