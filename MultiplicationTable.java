/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicationtable;

/**
 *
 * @author VAIO
 */
public class MultiplicationTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("                  Multiplication Table");
        System.out.println("       ");
        for(int j=1;j<=9;j++)
            System.out.printf("%7d",j);
        System.out.println("\n--------------------------------------------------------------------");
        for(int a=1;a<=9;a++){
            System.out.print(a+"|");   
                for(int j=1;j<=9;j++){
                    System.out.printf("%7d",a*j);
        // TODO code application logic here
    }
            System.out.println();
}
    }
}
