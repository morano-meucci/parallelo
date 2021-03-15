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
public class CalcPar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a, b, c;
        a = 2;
        b = 3;
        c = 4;
        System.out.println("Devo calcolare:3*(a-1)+2*(b-2)+3*(c-3)");
        Buffer parziali = new Buffer(a,b,c);
        Operazione1 thr1 = new Operazione1(parziali);
        Operazione2 thr2 = new Operazione2(parziali);
        Operazione3 thr3 = new Operazione3(parziali);
        Operazione4 thr4= new Operazione4(parziali);
        Operazione5 thr5 = new Operazione5(parziali);
      thr1.start();
      thr2.start();
      thr3.start();
      thr4.start();
      thr5.start();
      
        
    }

}
