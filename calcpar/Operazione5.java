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
public class Operazione5 extends Thread{
      Buffer dati;
    private double a = 2;
        private double b = 3;
       private double c = 4;
        Buffer parziali2 = new Buffer(a,b,c);
   Operazione1 t1=new Operazione1(parziali2);
    Operazione4 t4=new Operazione4(parziali2);
    public Operazione5(Buffer d){
    dati=d;
    
    }
    
    public void run(){
    dati.x=t1.dati.x*t4.dati.x;
    System.out.println("Ho calcolato x:"+dati.x);
    }
}
