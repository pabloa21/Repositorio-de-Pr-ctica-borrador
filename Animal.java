/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_3;

/**
 *
 * @author PABLO ALEXANDER Q
 */
public class Animal {
    protected double peso;
    protected double altura;
    protected Alimento alimsIngeridos [];

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Alimento[] getAlimsIngeridos() {
        return alimsIngeridos;
    }

    public void setAlimsIngeridos(Alimento[] alimsIngeridos) {
        this.alimsIngeridos = alimsIngeridos;
    }
    
    public Animal (double peso, double altura) {
        this.peso=peso;
        this.altura=altura;
    }
    
    public double getIMC (){
        return peso/(altura * altura);
    }
    
    
    
    
    
}
