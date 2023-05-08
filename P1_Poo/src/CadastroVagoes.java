import java.util.*;
public class CadastroVagoes {

private ArrayList<Vagao> vagoes;

public CadastroVagoes (){
     vagoes = new ArrayList<>();
    }

public void cadastra(Vagao v){ 
    vagoes.add (v);
}

public int qtdade(){ 
    return vagoes.size(); 
}

public Vagao getPorPosicao(int pos) {
    if (pos >=0 && pos < vagoes.size()){ return vagoes.get(pos) ;} 
    else {return null;} 
    }

public Vagao getPorId(int id){
for (Vagao vagao: vagoes) {
if (vagao.getIdentificador() == id) {return vagao;}
    }
return null;
        }

    //Questao 4
       public List<Vagao> getVagoesPorPeso (int peso){
            ArrayList<Vagao> l = new ArrayList<>();
            for (Vagao  v : vagoes) {
                if(v.getCapacidadeCarga() >= peso){
                    l.add(v); 
                }
                
            }
            return l;
        }

}
