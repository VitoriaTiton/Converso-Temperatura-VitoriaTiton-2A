//CLASSE PAI - AS OUTRAS VÃO HERDAR
public class Temperatura {
    //Atriburto
    private double graus;
    
    //Construtor
    public Temperatura(double valorGraus){
        this.graus = valorGraus;
        
    }
    
    //GETTER DO GARAU
    public double getGraus(){
        
        return graus;
        
    }
    //SETTER DO GRAUS
    public void setGraus(double novoGraus){
        this.graus = novoGraus;
    }
}
