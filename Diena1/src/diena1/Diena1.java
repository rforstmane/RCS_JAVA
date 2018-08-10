/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diena1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Diena1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*Calculation calc = new Calculation();
        calc.Izvade("Renda");
        calc.Izvade("Forstmane");*/
        //String input=calc.Izvade("hsjf");
        
        Calculation calc = new Calculation();
        Scanner sc = new Scanner(System.in);
        
        //calc.Izvade(" ");
        System.out.println("Ievadi pirmo skaitli");
        double sk1 = sc.nextDouble();
        
        System.out.println("Ievadi otro skaitli");
        double sk2 = sc.nextDouble();
        
        double Summa = calc.Saskaitisana(sk1, sk2);
        System.out.println("Summa ir: " + Summa);
        
        double Starpiba = calc.Atnemsana(sk1, sk2);
        System.out.println("Starpiba ir: " + Starpiba);
        
        
        
        
        
        
        
        
        /*Scanner sc = new Scanner(System.in); //scanner ir klase 
        
        System.out.println("Ievadi savu vārdu!");
        String  ievade = sc.nextLine();
        */
        
        /*
        String  ievade = sc.nextLine();
        int a,b = 3;
        a = sc.nextInt();
        ievade = String.valueOf(a); //no int uz string
        a = Integer.valueOf(ievade); // no string  uz integer
        */    
        
        /*
        String vecums = sc.nextLine();
        int a,b;
        System.out.println("Ievadi pašreizējo gadu");
        a = sc.nextInt();
        System.out.println("Ievadi dzimšanas gadu");
        b = sc.nextInt();
        
        vecums = String.valueOf(a-b);
        
        System.out.println("Tevi sauc " + ievade + " un Tev ir " + vecums + " gadi!");
*/
        
        
       
  }
    
}
