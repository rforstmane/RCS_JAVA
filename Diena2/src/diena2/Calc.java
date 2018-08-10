package diena2;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Calc {
    
    public void  izsaukums(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ievadi zími");
        String zime = sc.nextLine();
        
        double sk1, sk2;
        System.out.println("Ieraksti pirmo skaitli");
        sk1 = sc.nextDouble();
        
        System.out.println("Ieraksti otro skaitli");
        sk2 = sc.nextDouble();
        
        if (zime.equals("+")){
            System.out.println("Rezultāts ir " + sask(sk1, sk2)); 
        }
        else {
            if(zime.equals("-")){
                System.out.println("Rezultāts ir " + atnem(sk1, sk2));
            }
            else{
                System.out.println("Kļūdaina ievade");
            }
        }
    }
    
    private double sask(double a, double b){
        return a + b;
    }
    private double atnem(double a, double b){
        return a - b;
    }

}
