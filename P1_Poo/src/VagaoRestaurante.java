//Questão 6
public class VagaoRestaurante extends Vagao{
    private Cardapio cardapio; 
   public VagaoRestaurante(String descr, int capCarga, Cardapio c){
        super(descr,capCarga);
        this.cardapio = c;
   }
   
   public Cardapio getCardapio(Vagao v){
        if(v instanceof VagaoRestaurante){
            return ((VagaoRestaurante)v).cardapio; 
        }
        return null;
   }
   public String toString(){
        return super.toString() + " " + cardapio.toString();
    }

}
