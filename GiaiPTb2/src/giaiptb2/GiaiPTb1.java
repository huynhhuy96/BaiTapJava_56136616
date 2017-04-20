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
class GiaiPTb1 {

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

    public GiaiPTb1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public GiaiPTb1() {
    }
    int a;
    int b;
     public double NghiemPTb1(int a,int b)
    {            
         return -((double)this.b/this.a);
    }   
    
}
