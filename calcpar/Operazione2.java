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
public class Operazione2 extends Thread{
    Buffer dati;
    private double b;
    private double c=2;
    private double a=2;
    
    public Operazione2(Buffer d){
    dati=d;
    b=dati.b;
    }
    
    public void run(){
    dati.x=c*(b-a);
    System.out.println("Ho calcolato x:"+dati.x);
    }
}
