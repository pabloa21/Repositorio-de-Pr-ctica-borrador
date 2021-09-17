package reto_3;

/**
 *
 * @author PABLO ALEXANDER Q
 */
public class Gorila extends Animal {
    
    
//Metodo Constructor    
public Gorila (double peso, double altura ){
    super(peso, altura);
    //Reto 3 en Moodle requiere esta inicialización envés de super(peso,altura);
    /*this.peso=peso;
    this.altura=altura;*/
}    

public double getPesoAlims (){
    double contador=0;
    
    for (Alimento i : alimsIngeridos) {
  contador = contador + (int)i.getGramos();
}
    return contador;
}   
 
@Override
public double getIMC (){
    double conversion = getPesoAlims () / 1000;  
        return (peso + conversion )/(altura * altura);
    }
}
