/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoaleatoriocongruencialmixto;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CRISTIAN
 */
public class tablas extends JFrame{
    
 /*   public tablas(){
        
        super("Mi tabla");
        DefaultTableModel modelo= new DefaultTableModel();
        modelo.addColumn("n");
         modelo.addColumn("Xn");
          modelo.addColumn("(aXn+c)/m");
           modelo.addColumn("Xn+1");
            modelo.addColumn("NUMEROS\nUNIFORMES");
            
    
    } */
    
  String xe,a,m,n;  

    public tablas(String xe, String a, String m, String n) {
        this.xe = xe;
        this.a = a;
        this.m = m;
        this.n = n;
    }

    public String getXe() {
        return xe;
    }

    public void setXe(String xe) {
        this.xe = xe;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    

       
}
