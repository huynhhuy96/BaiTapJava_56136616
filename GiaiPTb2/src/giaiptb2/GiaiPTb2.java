/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaiptb2;

/**
 *
 * @author Love
 */
public class GiaiPTb2 {

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public GiaiPTb2() {
    }

    public GiaiPTb2(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

   
   
        int a;
        int b;
        int c;
     
        
    //Trả về nghiệm x1 = x2 khi delta = 0
    public double Nghiemdelta0PTb2(int a,int b,int c)
    {
        
        return (double)(-b)/2*a;
    }
    //Trả về nghiêm x1
    public double Nghiem1PTb2(int a,int b,int c)
    {
        
        return (-b+Math.sqrt(b*b - 4*a*c))/2*a;
    }
    
    //Trả về nghiệm x2
    public double Nghiem2PTb2(int a,int b,int c)
    {
        
        return (-b-Math.sqrt(b*b - 4*a*c))/2*a;
    }
    
 
          
    
}
