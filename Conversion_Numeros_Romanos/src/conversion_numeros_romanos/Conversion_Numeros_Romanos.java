/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversion_numeros_romanos;

/**
 *
 * @author neftali
 */
import java.util.Scanner;
public class Conversion_Numeros_Romanos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int decimal, uni, dec, cen, mil;
        String unidades, decenas, centenas, millar;
        Scanner entrada = new Scanner(System.in);
        System.out.println("BIENVENIDO AL PROGRAMA PARA CONVERTIR DECIMAL A ROMANO \nIngrese un número entero entre 1 y 1000 que desea convertir:");
        decimal = entrada.nextInt();
        
        //Descomponer # a M-C-D-U
        uni= (decimal%10);
        dec = (decimal/10)%10;
        cen = (decimal/100)%10;
        mil = (decimal/1000);
        
        switch(uni){
            case 1: unidades = "I";
                break;
            case 2: unidades = "II";
                break;
            case 3: unidades = "III";
                break;
            case 4: unidades = "IV";
                break;
            case 5: unidades = "V";
                break;
            case 6: unidades = "VI";
                break;
            case 7: unidades = "VII";
                break;
            case 8: unidades = "VIII";
                break;
            case 9: unidades = "IX";
                break;
            default: 
                unidades = "";
                break;
        }
        
        switch (dec){
            case 1: decenas = "X";
                break;
            case 2: decenas = "XX";
                break;
            case 3: decenas = "XXX";
                break;
            case 4: decenas = "XL";
                break;
            case 5: decenas = "L";
                break;
            case 6: decenas = "LX";
                break;
            case 7: decenas = "LXX";
                break;
            case 8: decenas = "LXXX";
                break;
            case 9: decenas = "XC";
                break;
            default: 
                decenas = "";
                break;
        }
        
        switch (cen){
            case 1: centenas = "C";
                break;
            case 2: centenas = "CC";
                break;
            case 3: centenas = "CCC";
                break;
            case 4: centenas = "CD";
                break;
            case 5: centenas = "D";
                break;
            case 6: centenas = "DC";
                break;
            case 7: centenas = "DCC";
                break;
            case 8: centenas = "DCCC";
                break;
            case 9: centenas = "CM";
                break;
            default: 
                centenas = "";
                break;
        }
        
        switch (mil){
            case 1:
                millar = "M";
                break;
            case 2:    
                millar = "MM";
                break;
            case 3:
                millar ="MMM";
                break;
            default:
                millar="";
                break;
        }
        
        if (decimal >= 1 && decimal <=1000) {    
            System.out.println("El número " + decimal +" en romano es igual a: "+millar + centenas + decenas + unidades);
        } else{
            System.out.println("Ingresa un numero entre 1 y 1000");
            Conversion_Numeros_Romanos.main(null);
                }
    }
    
}
