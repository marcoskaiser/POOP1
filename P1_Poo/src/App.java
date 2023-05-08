import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
       Vagao v1 = new Vagao("Vagao 4", 500);
       Vagao v2 = new Vagao("Vagao 3", 5000);
       Vagao v3 = new Vagao("Vagao 1", 2500);
       CadastroVagoes c = new CadastroVagoes();
       c.cadastra(v1);
       c.cadastra(v2);
       c.cadastra(v3);

       VagaoRefrigerado vr = new VagaoRefrigerado("bobin", 1231, 100);
       

       //Questão 5: 
       // Sim, é possivel adicionar por causa do polimorfismo.  

       System.out.println(c.getVagoesPorPeso(6000));

       //Questão 7:
       ArrayList<Vagao> l = (ArrayList<Vagao>) c.getVagoesPorPeso(0); 
       l.stream().sorted(Comparator.comparing(Vagao::getDescricao)).map(v -> v.getDescricao()).forEachOrdered(System.out::println);;

       //Questão 8:
       // A) HERANÇA - Obreservada na classe "Vagao" e suas filhas (VagaoRestaurante e VagaoRefrigerado).
       // As duas classes filhas herdam da classe pai
       // B) POLIMORFISMO - O polimorfismo pode ser observado qunado colocamos um objeto do tipo VagaoRefrigerado em um array de Vagão.
       // C) SOBRECARGA - Pode ser observada na classe Vagao, onde foi criados metodos sem nenhuma instancia. 
       // D) SOBREESCRITA - Utilizada pelo toString da classe VagaoRefrigerado.
       // E) INTERFACE - Utilizada na ordenação na questão 7(Comparator).

    }
}
