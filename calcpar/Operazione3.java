/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcpar;

/**
 *
 * @author 39334
 */
public class Operazione3 extends Thread{
    Buffer dati;
    private double b=3;
    private double c;
    private double a=3;
    
    public Operazione3(Buffer d){
    dati=d;
    c=dati.c;
    }
    
    public void run(){
    dati.x=a*(c-b);
    System.out.println("Ho calcolato x:"+dati.x);
    }
}
