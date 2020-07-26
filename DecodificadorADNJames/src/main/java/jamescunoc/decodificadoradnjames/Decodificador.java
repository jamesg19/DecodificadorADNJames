/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jamescunoc.decodificadoradnjames;

import java.util.Scanner;

/**
 *
 * @author james
 */
public class Decodificador {
    Scanner entrada=new Scanner(System.in);
    public String SecuenciaADN1;
    public String SecuenciaADN2;
    int CantidadLetrasADN1;
    int CantidadLetrasADN2;
    
    
    
    public void pedirSecuencia1(){
        System.out.println("Ingresa la secuencia de ADN 1:");
        SecuenciaADN1=entrada.nextLine();
        pedirSecuencia2();
    }
    
    public void pedirSecuencia2(){
        System.out.println("Ingresa la secuencia de ADN 1:");
        SecuenciaADN2=entrada.nextLine();
    }
    
    public void Proceso(){
        CantidadLetrasADN1=SecuenciaADN1.length();
        CantidadLetrasADN2=SecuenciaADN2.length();
    }
    
    
}
