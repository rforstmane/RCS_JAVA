/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diena4;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Uzdevums {
    
    public void interfeiss(){
  
        Scanner s = new Scanner(System.in);
        System.out.println("Ievadi skaitli, ko kāpināt ");
        int skaitlis = s.nextInt();
        
        System.out.println("Ievadi pakāpi, kurā vēlies kāpināt");
        int pakape = s.nextInt();  
        
        System.out.println("Rezultāts ir: " + kapinasana(skaitlis, pakape)); 
    }
    
    private int kapinasana(int skaitlis, int pakape){

        int rezultats = 1;
        
        for ( int i = 0 ; i < pakape; i++){
            rezultats = skaitlis * rezultats;
        }

        return rezultats;  
    }
    
    public void masivaIzvade(){
        
        Scanner s = new Scanner(System.in);

        int[] masivs = new int[5];
        
        for (int i = 0; i <masivs.length; i++){
            System.out.println("Ievadiet skaitli: ");
            masivs[i] = s.nextInt();
        }
        for (int i = 0; i < masivs.length; i++){
            System.out.println(masivs[i]);
        }
        /*int[] masivs = new int[5]; // masīvā ir piecas vietas jeb vieta piecām vērtībām
        masivs[0] = 4;
        masivs[1] = 3;
        masivs[2] = 2;
        masivs[3] = 7;
        masivs[4] = 99;
        
        System.out.println(masivs[0]);
        
        for (int i = 0; i <masivs.length; i++){ //ar lenght piekļūstam masīva garumam
            System.out.println(masivs[i]);  
        }
        */
    }
    
    public void zvaigznes(){

        String[] zv = new String[4];  

        for (int i = 0; i < zv.length; i++){
            if(i==0){
                zv[i] = "*"; 
            }else{
                zv[i] = zv[i-1] + "*";
            }
        }
        //izvada zvaigznes no masīva
        for(int i=0; i < zv.length; i++){
            System.out.println(zv[i]);
        }
        //izvada zvaigznes lejas daļu
        for(int i = zv.length - 1; i>=0; i--){
            System.out.println(zv[i]);
        }
   
        //un tad visu dimantu uztaisīt !!!
        
        
        /*System.out.println("Ievadi N");
        int N = obj.nextInt();
        for (int i = 1;  i <= N; i++){
           
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println(" "); 
        } 
        for (int i = N;  i >= 1; i--){
           
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println(" "); 
        }
*/
    }
    
    public static void skaitluVirkne(){
        /*
         12345
         1234
         123   
         12
         1
        */
        
        Scanner s = new Scanner(System.in);
        int[] masivs = new int[5];
        
        for (int i = 0; i < masivs.length; i++){
            masivs[i]= i+1;
        }
        
        for (int i = masivs.length-1 ; i >= 0 ; i--) {
            for (int j = 0; j< i+1; j++) {
                System.out.print(masivs[j]);
            }
            System.out.println();
        }
        
    }
    
//    public void writeSymbol (int n, String s) {
//        for (int i = 1; i <= n; i++){
//            System.out.print(s);
//        }
//    }
    
    public void writeTriangle (){
        int n = 5;
        for (int r = 1; r <= n; r++){

            for (int a = 1; a <= n-r; a++){
                System.out.print(" ");
            }
            
            for (int z = 1; z <= 2*r-1; z++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
    

}
