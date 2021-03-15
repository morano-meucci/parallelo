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
public class Operazione4 extends Thread{
      Buffer dati;
    private double a = 2;
        private double b = 3;
       private double c = 4;
        Buffer parziali2 = new Buffer(a,b,c);
   Operazione2 t2=new Operazione2(parziali2);
    Operazione3 t3=new Operazione3(parziali2);
    public Operazione4(Buffer d){
    dati=d;
    
    }
    
    public void run(){
    dati.x=t2.dati.x*t3.dati.x;
    System.out.println("Ho calcolato x:"+dati.x);
    }
}
