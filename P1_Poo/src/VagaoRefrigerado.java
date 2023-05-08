//Questão 3
public class VagaoRefrigerado extends Vagao{

private int temp;

    public VagaoRefrigerado (String descr, int capCarga, int temp) {
        super(descr, capCarga);
        this.temp = temp;
    }
    
    public int getTemperatura(){ 
     return temp;
    } 
    
    @Override
    public String tostring(){ 
        return super.toString() + ", " + "temperatura=" + temp;
     }
    
}

