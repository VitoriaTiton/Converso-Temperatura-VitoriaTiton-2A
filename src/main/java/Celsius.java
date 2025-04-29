//CLASSE FILHA
public class Celsius extends Temperatura {
    
    public Celsius(double valorGraus) {
        //O SUPER SE REFERE A CLASSE PAI
        super(valorGraus);
    }
    
    //CRIANDO OS MÉTODOS PARA CONVERTER
    public double paraFahrenheit(){
        return (getGraus()*9/5)+32;
    }  
    
    public double paraKelvin(){
        return getGraus()+273; 
    }
    
}
