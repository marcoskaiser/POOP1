import java.util.ArrayList;

//Questão 6 
public class Cardapio {
    private ArrayList <String> alimentos; 
    public Cardapio(){
        alimentos = new ArrayList<String>();
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (String a : alimentos) {
            sb.append("Alimento: ");
            sb.append(a+"\n");
        }
        return sb.toString();
    }
}
